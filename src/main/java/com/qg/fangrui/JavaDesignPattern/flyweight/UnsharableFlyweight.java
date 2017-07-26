package com.qg.fangrui.JavaDesignPattern.flyweight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by funrily on 17-7-26
 * 复合享元模式
 * @version 1.0.0
 */
public class UnsharableFlyweight {

    public static void main(String[] args) {
        //创建一个享元工厂
        UnsharableFlyweightFactory factory = new UnsharableFlyweightFactory();
        //获得一组共享单元
        AbstractFlyweight fly = factory.factory("bcb");
        //传入外部状态
        fly.operation("Composite Call");
        //检查对象个数
        factory.check();
    }
}
//抽象享元:规定需要实现的公共接口,但是并不强制子类实行共享.
abstract class AbstractFlyweight{
    public abstract void operation(String state);
}

//具体享元:实现抽象享元角色所规定的接口
class ConcreteFlyweight extends AbstractFlyweight {
    //自拥有的属性
    private Character intrinsicState = null;
    public ConcreteFlyweight(Character intrinsicState) {
        this.intrinsicState = intrinsicState;
    }
    //外部状态作为参数传入，不会改变对象的内部状态
    @Override
    public void operation(String state) {
        System.out.println("Intrinsic State = " + intrinsicState + ",Extrinsic State = " + state);
    }
}

//复合享元：复合享元角色所代表的对象是不可以共享的，但是一个复合享元对象可以分解成为多个本身是单纯享元对象的组合。
class ConcreteCompositeFlyweight extends AbstractFlyweight {

    private Map<Character,  AbstractFlyweight> files = new HashMap<>(10);
    private AbstractFlyweight flyweight;
    //空构造器
    public ConcreteCompositeFlyweight() {
    }
    public void add(Character key, AbstractFlyweight value){
        files.put(key, value);
    }
    @Override
    public void operation(String state) {
        AbstractFlyweight fly = null;
        for (Iterator it =files.entrySet().iterator();it.hasNext(); ){
            Map.Entry entry = (Map.Entry)it.next();
            fly = (AbstractFlyweight)entry.getValue();
            fly.operation(state);
        }
    }
}

//享元工厂：负责创建和管理享元对象
class UnsharableFlyweightFactory{
    private Map<Character, AbstractFlyweight> files = new HashMap<>();
    private AbstractFlyweight lnkFlyweight;
    //空构造器
    public UnsharableFlyweightFactory() {
    }
    public AbstractFlyweight factory(Character state) {
        if (files.containsKey(state)){
            return files.get(state);
        } else {
            //将一组共享单元对象确立好
            AbstractFlyweight flyweight = new ConcreteFlyweight(state);
            files.put(state, flyweight);
            return flyweight;
        }
    }
    //重载工厂方法
    public AbstractFlyweight factory(String compositeState) {
        ConcreteCompositeFlyweight compositeFiy = new ConcreteCompositeFlyweight();
        int length = compositeState.length();
        Character state = null;
        for (int i=0; i<length; i++){
            state = new Character(compositeState.charAt(i));
            System.out.println("factory (" + state + ")");
            compositeFiy.add(state, this.factory(state));
        }
        return compositeFiy;
    }
    //辅助方法
    public void check(){
        AbstractFlyweight flyweight;
        int i=0;
        System.out.println("\n======checkFlyweight()======begin");
        for (Iterator it = files.entrySet().iterator(); it.hasNext(); ){
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println("Item " + (++i) + ":" + entry.getKey());
        }
        System.out.println("======checkFlyweight()======end");
    }
}