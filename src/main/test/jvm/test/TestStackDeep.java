package jvm.test;

/**
 * 模拟栈溢出
 * Created by FunriLy on 2017/7/22.
 * From small beginnings comes great things.
 */
public class TestStackDeep {
    private static int count = 0;
    public static void recursion() {
        count++;
        recursion();
    }
    public static void main(String[] args) {
        try {
            recursion();
        } catch (Throwable e){
            System.out.println("deep of calling = " + count);
            e.printStackTrace();
        }
    }
}
