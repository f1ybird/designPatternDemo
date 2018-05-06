package design.factory;

/**
 * @Description:需求：商城打8折，满300返100，正常收费，如何设计实现收费？如果增加满100可以积分10个，用积分可以兑换礼品，怎么扩展？ 解决方案：使用简单工厂实现。根据工厂方法创建对应的打折对象进行收费。
 * <p>
 * 版本2.0
 * @Author: kevin
 * @Date 15:55 2018/5/6
 */
public class CashContext {

    CashSuper cashSuper;

    public CashContext(String type) {

        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "打八折":
                cashSuper = new CashRebate(0.8);
                break;
            case "满300减100":
                cashSuper = new CashReturn(300, 100);
                break;
            default:
                break;
        }
    }


    public void cashContextInterface(double money) {
        double cost = cashSuper.acceptCash(money);
        System.out.println(cost);
    }

    /**
     * 使用context上下文类实现策略模式，从而使得客户端只需要知道CashContext即可，而不需要知道CashSuper和CashFactory两个类，从而降低了耦合度
     *
     * @param args
     */
    public static void main(String[] args) {
        CashContext cashContext;

        cashContext = new CashContext("正常收费");
        //1000.0

        cashContext = new CashContext("打八折");
        //800.0

        cashContext = new CashContext("满300减100");
        //700

        cashContext.cashContextInterface(1000);
    }

}