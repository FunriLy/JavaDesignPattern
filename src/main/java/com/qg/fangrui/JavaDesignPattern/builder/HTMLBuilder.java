package com.qg.fangrui.JavaDesignPattern.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

/**
 * 建造者模式：具体的建造者
 * Created by FunriLy on 2017/7/9.
 * From small beginnings comes great things.
 */
public class HTMLBuilder extends Builder {

    private String filename;
    private PrintWriter writer;

    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e){
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        //输出标题
        writer.println("<h1>" + title + "</h1>");
    }

    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (int i=0; i<items.length; i++){
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult(){
        return filename;
    }
}
