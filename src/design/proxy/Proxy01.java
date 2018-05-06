package design.proxy;

/**
 * @Description:代理模式
 * @Author: kevin
 * @Date 0:37 2018/5/7
 */
public class Proxy01 {

    public static void main(String[] args){
        Proxy proxy = new Proxy();
        proxy.request();//真实的请求
    }

}

/**
 * realSubject和Proxy的公共接口
 */
interface Subject {

    void request();

}

class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}

class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (null == realSubject)
            realSubject = new RealSubject();
        realSubject.request();
    }
}
