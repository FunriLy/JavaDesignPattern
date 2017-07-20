package com.qg.fangrui.JavaDesignPattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by FunriLy on 2017/7/20.
 * From small beginnings comes great things.
 */
public class FileFindVisitor extends Visitor {

    private String filetype;
    private ArrayList found = new ArrayList();

    public FileFindVisitor(String filetype) {
        this.filetype = filetype;
    }

    public Iterator getFoundFiles(){
        return found.iterator();
    }


    @Override
    public void visit(File file) {
        if (file.getName().endsWith(filetype)){
            found.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
    }
}
