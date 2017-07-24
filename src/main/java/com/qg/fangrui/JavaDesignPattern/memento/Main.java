package com.qg.fangrui.JavaDesignPattern.memento;

import java.util.LinkedList;

/**
 * 备忘录模式
 * Created by FunriLy on 2017/7/23.
 * From small beginnings comes great things.
 */
public class Main {
    public static void main(String[] args) {
        //使用这个文本编辑器
        TextEditor editor = new TextEditor("这里是初始文本，可能为文件中读取的值。");
        System.out.println("当前的文本 : " + editor.text.toString());
        System.out.println("开始修改文本 : ");
        editor.append("添加文字1");
        editor.delWords();		//删除最后一个
        System.out.println("开始恢复 : ");
        for(int i=0;i<10;i++) editor.recoverMemento();//恢复大于实际修改的次数不会出错，只会将文本设为o初始化状态
        System.out.println("开始重做 : ");
        for(int i=0;i<10;i++) editor.redo();		//重做大于实际恢复的次数不会出错，只会将文本设为最后状态
        System.out.println("再次恢复 : ");
        for(int i=0;i<10;i++) editor.recoverMemento();//恢复大于实际修改的次数不会出错，只会将文本设为o初始化状态
        System.out.println("再次重做 : ");
        for(int i=0;i<10;i++) editor.redo();		//重做大于实际恢复的次数不会出错，只会将文本设为最后状态
        System.out.println("再次恢复 : ");
        for(int i=0;i<10;i++) editor.recoverMemento();//恢复大于实际修改的次数不会出错，只会将文本设为o初始化状态
        editor.append("添加文字2");
        System.out.println("再次重做 : ");
        for(int i=0;i<10;i++) editor.redo();		//重做大于实际恢复的次数不会出错，只会将文本设为最后状态
    }
}
interface IMemento{}
//发起人兼负责人
class TextEditor {
    public StringBuffer text;
    private LinkedList<IMemento> mementos;  //保存快照
    private LinkedList<IMemento> undos;     //保存撤销操作
    public TextEditor(){
        this("");
    }
    public TextEditor(String defaultStr){
        text = new StringBuffer(defaultStr);
        mementos = new LinkedList<>();
        undos = new LinkedList<>();
    }
    public void clearHistory(){
        mementos.clear();
        undos.clear();
    }
    public void append(String appendStr){
        if(appendStr==null||appendStr.length()==0) return;
        createMemento();
        text.append(appendStr);
        print();
        undos.clear();
    }
    //新的快照
    public void createMemento(){
        mementos.push(new Memento(this));
    }
    //删除最后一个
    public void delWords(){
        delWords(1);
    }
    //删除最后n个
    public void delWords(int n){
        if(n<1||n>text.length()) return;
        delWords(text.length()-n+1,text.length());
    }
    //删除中间start到end的字符,第一个文字为第一个(而不是0)
    public void delWords(int start,int end){
        if(start<1 || end>text.length()+1) return;
        createMemento();
        text = text.delete(start-1, end);
        print();
    }
    //恢复状态
    public boolean recoverMemento(){
        Memento memento = (Memento) mementos.poll();
        if (null == memento) return false;
        undos.push(new Memento(this));
        reset(memento.state);
        print();
        return true;
    }
    public void reset(String text){
        this.text = new StringBuffer(text);
    }
    //redo
    public boolean redo(){
        Memento memento = (Memento) undos.poll();
        if(memento==null) return false;
        createMemento();
        reset(memento.state);
        print();
        return true;
    }
    //内部实现
    private class Memento implements IMemento {
        private String state;
        private Memento(TextEditor editor) {
            this.state = editor.text.toString();
        }
    }
    void print(){
        System.out.println("当前的文本 : " + text);
    }
}
