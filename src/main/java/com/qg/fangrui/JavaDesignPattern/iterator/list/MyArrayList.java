package com.qg.fangrui.JavaDesignPattern.iterator.list;

import com.qg.fangrui.JavaDesignPattern.iterator.MyIterator;

import java.util.Arrays;

/**
 * 用数组来实现模拟ArrayList
 * Created by FunriLy on 2017/7/6.
 * From small beginnings comes great things.
 */
public class MyArrayList<T> implements MyList<T> {

    private int size;                               //元素个数
    private Object[] defaultList;                   //存储数组
    private static final int defaultLength = 10;    //默认长度

    //构造器
    public MyArrayList(){
        defaultList = new Object[defaultLength];
    }

    @Override
    public MyIterator<T> iterator() {
        return new Iterator();
    }

    @Override
    public boolean add(T t) {
        //选择性安全扩大
        ensureCapacity(size + 1);
        defaultList[size++] = t;
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        if(index<0 || index>=size)
            return null;
        return (T) defaultList[index];
    }

    @Override
    public T remove() {
        return remove(size-1);
    }

    @Override
    public boolean remove(T t) {
        if (t == null){
            for (int i=0; i<size; i++) {
                if (defaultList[i] == null) {
                    System.arraycopy(defaultList, i+1, defaultList, i, size-i-1);
                    size--;
                    return true;
                }
            }
        } else {
            for (int i=0; i<size; i++){
                if (defaultList[i].equals(t)){
                    System.arraycopy(defaultList, i+1, defaultList, i, size-i-1);
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T remove(int index) {
        if (index<0 || index>=size)
            return null;
        T t = (T) defaultList[index];
        if (index != size-1)
            System.arraycopy(defaultList, index+1, defaultList, index,size-index-1);
        size--;
        return t;
    }

    @Override
    public boolean set(int index, T t) {
        if (index<0 || index>=size)
            return false;
        defaultList[index] = t;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * 实现增加时越界安全增加
     * @param capacity
     */
    private void ensureCapacity(int capacity) {
        int nowLength = defaultList.length;
        //如果此时增加的个数超出数组范围，实现数组扩大
        if (capacity >= nowLength) {
            nowLength = nowLength + (nowLength>>1);
            if (nowLength < 0) //溢出可能
                nowLength = Integer.MAX_VALUE;
            //安全扩大数组
            defaultList = Arrays.copyOf(defaultList, nowLength);
        }

    }

    private class Iterator implements MyIterator<T>{

        private int next;

        @Override
        public boolean hasNext() {
            return next < size;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T next() {
            return (T) defaultList[next++];
        }

        @Override
        public T remove() {
            //TODO:add remove
            return null;
        }
    }
}
