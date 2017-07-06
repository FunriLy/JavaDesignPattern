package com.qg.fangrui.JavaDesignPattern.iterator;

/**
 * Created by FunriLy on 2017/7/6.
 * From small beginnings comes great things.
 */
public class BookShelfIterator implements MyIterator<Book> {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()){
            return true;
        }
        return false;
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }

    @Override
    public Book remove() {
        /**
         * 由于BookShelf是采用数组实现的
         * 所以其remove较麻烦，不考虑其实现
         */
        return null;
    }
}
