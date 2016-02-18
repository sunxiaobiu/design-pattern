package SingletonPattern;

/**
 * Created by sun on 16/1/4.
 */
//饿汉模式，类加载时会创建实例；可以通过反射机制攻击；线程安全[多个类加载器除外]，但是由于类加载过程中会创建实例，所以加载速度慢。
//public class MaYun_Hungry {
//
//    public static final MaYun_Hungry instance = new MaYun_Hungry(); //静态+final
//    private MaYun_Hungry() {
//    }
//    public void splitAlipay() {
//        System.out.println("我是马云~");
//    }
//}

//饿汉模式变种1[推荐]
//public class MaYun_Hungry {
//    private static MaYun_Hungry instance = new MaYun_Hungry();
//
//    private static MaYun_Hungry getInstance() {
//        return instance;
//    }
//    private MaYun_Hungry() {
//    }
//    public void splitAlipay() {
//        System.out.println("我是马云~");
//    }
//}

//饿汉变种2(类初始化的时候实例化instance)
public class MaYun_Hungry {
    private static MaYun_Hungry instance = null;
    static {
        instance = new MaYun_Hungry();
    }
    private MaYun_Hungry() {
    }
    public static MaYun_Hungry getInstance() {
        return instance;
    }
    public void splitAlipay() {
        System.out.println("我是马云~");
    }
}