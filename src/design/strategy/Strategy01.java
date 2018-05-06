package design.strategy;

/**
  * @Description:调用策略模式类
  *
  * @Author: kevin
  *
  * @Date 17:17 2018/5/6
  */
public class Strategy01 {

    public static void main(String[] args){
        Context context;

        context = new Context(new ConcreteStrategyA());
        //ConcreteStrategyA 算法

        context = new Context(new ConcreteStrategyB());
        //ConcreteStrategyB 算法

        context = new Context(new ConcreteStrategyC());
        //ConcreteStrategyC 算法

        context.contextInterface();

    }
}
