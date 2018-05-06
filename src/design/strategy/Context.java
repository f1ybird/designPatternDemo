package design.strategy;

/**
  * @Description:策略模式
  *
  * @Author: kevin
  *
  * @Date 16:31 2018/5/6
  */

/**
 * 上下文类，维护一个策略类的引用，调用上下文接口实现具体的算法
 */
public class Context{

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }
}

/**
 * 策略抽象类，定义算法的公共接口
 */
abstract class Strategy {

    public abstract void algorithmInterface();
}

/**
 * ConcreteStrategyA算法
 */
class ConcreteStrategyA extends Strategy{

    @Override
    public void algorithmInterface() {
        System.out.println("ConcreteStrategyA 算法");
    }
}

/**
 * ConcreteStrategyB算法
 */
class ConcreteStrategyB extends Strategy{

    @Override
    public void algorithmInterface() {
        System.out.println("ConcreteStrategyB 算法");
    }
}

/**
 * ConcreteStrategyA算法
 */
class ConcreteStrategyC extends Strategy{

    @Override
    public void algorithmInterface() {
        System.out.println("ConcreteStrategyC 算法");
    }
}
