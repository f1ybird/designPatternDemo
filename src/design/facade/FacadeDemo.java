package design.facade;

/**
  * @Description: 门面模式（外观模式）
  *
  * @Author: kevin
  *
  * @Date 21:34 2018/5/9
  */
public class FacadeDemo {

    public static void main(String[] args){
        // 创建门面类
        Facade facade = new Facade();

        // 通过门面类调用子系统，降低耦合度，符合依赖倒转原则和迪米特原则
        System.out.println("-----子系统组1---------");
        facade.methodA();
        System.out.println("-----子系统组2---------");
        facade.methodB();
        System.out.println("-----子系统组3---------");
        facade.methodC();

//        -----子系统组1---------
//        子系统一
//        子系统二
//        子系统三
//        子系统四
//        -----子系统组2---------
//        子系统一
//        子系统三
//        -----子系统组3---------
//         子系统二
//        子系统四
    }


}

/**
 * 门面类：维护其他子系统的引用
 */
class Facade {

    private SubSysOne subSysOne;
    private SubSysTwo subSysTwo;
    private SubSysThree subSysThree;
    private SubSysFour subSysFour;

    public Facade(){
        subSysOne = new SubSysOne();
        subSysTwo = new SubSysTwo();
        subSysThree = new SubSysThree();
        subSysFour = new SubSysFour();
    }

    /**
     * 调用1
     */
    public void methodA(){
        subSysOne.methodOne();
        subSysTwo.methodTwo();
        subSysThree.methodThree();
        subSysFour.methodFour();
    }

    /**
     * 调用2
     */
    public void methodB(){
        subSysOne.methodOne();
        subSysThree.methodThree();
    }

    /**
     * 调用3
     */
    public void methodC(){
        subSysTwo.methodTwo();
        subSysFour.methodFour();
    }
}

/**
 * 子系统1
 */
class SubSysOne {

    public void methodOne(){
        System.out.println("子系统一");
    }
}

/**
 * 子系统2
 */
class SubSysTwo {

    public void methodTwo(){
        System.out.println("子系统二");
    }
}

/**
 * 子系统3
 */
class SubSysThree{
    public void methodThree(){
        System.out.println("子系统三");
    }

}
/**
 * 子系统4
 */
class SubSysFour{
    public void methodFour(){
        System.out.println("子系统四");
    }
}
