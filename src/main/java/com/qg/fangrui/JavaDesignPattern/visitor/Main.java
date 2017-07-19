package com.qg.fangrui.JavaDesignPattern.visitor;

/**
 * Created by FunriLy on 2017/7/19.
 * From small beginnings comes great things.
 */
public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Making root entries ……");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 1000));
            bindir.add(new File("latex", 2000));
            rootdir.accept(new ListVisitor());

            System.out.println("");

            System.out.println("Making usr entries ……");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("composite.java", 200));
            hanako.add(new File("memo.tex", 300));
            tomura.add(new File("game.doo", 400));
            tomura.add(new File("iunk.mail", 500));
            rootdir.accept(new ListVisitor());
        } catch (FileTreatmentException e){
            e.printStackTrace();
        }
    }
}
