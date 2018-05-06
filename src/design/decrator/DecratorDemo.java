package design.decrator;


/**
  * @Description: 装饰器模式
  *
  * @Author: kevin
  *
  * @Date 23:45 2018/5/6
  */
public class DecratorDemo {
    
    public static void main(String[] args){
        Person person = new Person("小菜");

        TShirts tShirts = new TShirts();
        BigThouser bigThouser = new BigThouser();
        Shoes shoes = new Shoes();
        Briefs briefs = new Briefs();

        tShirts.decrator(person);
        bigThouser.decrator(tShirts);
        shoes.decrator(bigThouser);
        briefs.decrator(shoes);
        briefs.show();

        //超人内裤
        //破球鞋
        //大垮裤
        //T恤
        //这是小菜的装饰
    }
    
}

/**
 * concreteComponent高层组件具体类
 */
class Person{
    
    private String name;

    public Person() {
    }

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("这是" + name + "的装饰");
    }
}

/**
 * 服饰抽象类 Decrator
 */
class Finery extends Person{

    private Person component;

    public void show() {
       if(null != component)
           component.show();
    }


    /**
     * 打扮
     * @param component
     */
    public void decrator(Person component){
        this.component = component;
    }
}

class TShirts extends Finery{

    @Override
    public void show() {
        System.out.println("T恤");
        super.show();
    }
}

class BigThouser extends Finery{

    @Override
    public void show() {
        System.out.println("大垮裤");
        super.show();
    }
}

class Shoes extends Finery{

    @Override
    public void show() {
        System.out.println("破球鞋");
        super.show();
    }
}

class Briefs extends Finery{

    @Override
    public void show() {
        System.out.println("超人内裤");
        super.show();
    }
}
