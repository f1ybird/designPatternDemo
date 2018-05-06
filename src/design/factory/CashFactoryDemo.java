package design.factory;

/**
 * @Description: 简单工厂模式
 *
 * 需求：商城打8折，满300返100，正常收费，如何设计实现收费？ 解决方案：使用简单工厂实现。根据工厂方法创建对应的打折对象进行收费。
 * <p>
 * 版本1.0
 * @Author: kevin
 * @Date 15:55 2018/5/6
 */
public class CashFactoryDemo {

    public static void main(String[] args) {
//        CashSuper cashSuper = CashFactory.createCashFactory("正常收费");
//        double cost = cashSuper.acceptCash(1000);
//        System.out.println(cost);

//        CashSuper cashSuper = CashFactory.createCashFactory("打八折");
//        double cost = cashSuper.acceptCash(1000);
//        System.out.println(cost);

//        CashSuper cashSuper = CashFactory.createCashFactory("满300减100");
//        double cost = cashSuper.acceptCash(200);
//        System.out.println(cost);
    }
}

/**
 * 简单收费工厂类
 */
//class CashFactory {
//
//    public static CashSuper createCashFactory(String type) {
//        CashSuper cashSuper = null;
//        switch (type) {
//            case "正常收费":
//                cashSuper = new CashNormal();
//                break;
//            case "打八折":
////                cashSuper = new CashRebate(0.8);
//                break;
//            case "满300减100":
////                cashSuper = new CashReturn(300, 100);
//                break;
//            default:
//                break;
//        }
//        return cashSuper;
//    }
//}

/**
 * 现金收费抽象类
 */
abstract class CashSuper {

    public abstract double acceptCash(double money);
}

/**
 * 正常收费
 */
class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}

/**
 * 打折收费
 */
class CashRebate extends CashSuper {

    private double moneyRebate = 1d;//折扣

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}

/**
 * 满减收费
 */
class CashReturn extends CashSuper {

    private int moneyCondition;//满减条件
    private int moneyReturn;   //满减返利

    public CashReturn(int moneyCondition, int moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        if (money > moneyCondition) {
            return money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return money;
    }
}
