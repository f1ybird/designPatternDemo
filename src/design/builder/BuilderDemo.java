package design.builder;

import com.sun.media.jfxmedia.events.BufferListener;

/**
  * @Description:建造者模式 builder
  *
  * @Author: kevin
  *
  * @Date 22:05 2018/5/9
  */
public class BuilderDemo {

    public static void main(String[] args){
        Director director = new Director();
        director.construct(new ConcreteBulderA());// 构造A
    }
}

abstract class Builder{

    public abstract void buildA();
    public abstract void buildB();
}

class Director{

    public void construct(Builder builder){
        builder.buildA();
        builder.buildB();
    }
}

class ConcreteBulderA extends Builder{

    @Override
    public void buildA() {
        System.out.println("ConcreteBulderA 1");
    }

    @Override
    public void buildB() {
        System.out.println("ConcreteBulderA 2");
    }
}

class ConcreteBulderB extends Builder{

    @Override
    public void buildA() {
        System.out.println("ConcreteBulderB 1");
    }

    @Override
    public void buildB() {
        System.out.println("ConcreteBulderB 2");
    }
}

