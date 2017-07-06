package com.qg.fangrui.JavaDesignPattern.iterator;

import com.qg.fangrui.JavaDesignPattern.iterator.list.MyArrayList;
import com.qg.fangrui.JavaDesignPattern.iterator.list.MyList;

/**
 *
 * 测试程序行为类
 * Created by FunriLy on 2017/7/6.
 * From small beginnings comes great things.
 */
public class Main {

    public static void main(String[] args) {

        /**
         * 简单实验迭代模式
         */
//        BookShelf bookShelf = new BookShelf(4);
//        bookShelf.appendBook(new Book("test1"));
//        bookShelf.appendBook(new Book("test2"));
//        bookShelf.appendBook(new Book("test3"));
//        bookShelf.appendBook(new Book("test4"));
//
//        MyIterator iterator = bookShelf.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(((Book)iterator.next()).getName());
//        }

        /**
         * 模拟ArrayList的实现
         */
        MyList<String> array = new MyArrayList<String>();
        for (int i=0; i<10; i++){
            array.add(String.valueOf(i));
        }
        //数组操作
        System.out.println(array.remove());
        System.out.println(array.get(5));
        System.out.println(array.remove(5));
        System.out.println(array.get(5));
        System.out.println(array.remove("7"));
        System.out.println(array.set(0, "00"));
        //使用迭代器
        MyIterator<String> arrayIterator = array.iterator();
        while (arrayIterator.hasNext()){
            System.out.println(arrayIterator.next() + " ");
        }

    }
}
