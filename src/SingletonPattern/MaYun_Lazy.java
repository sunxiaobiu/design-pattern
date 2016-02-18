package SingletonPattern;

/**
 * Created by sun on 16/1/4.
 */

//懒汉模式:延时加载；线程不安全（在类第一次实例化的时候，有多个线程同时调用getInstance方法），多线程下不能正常工作；需要额外的工作(Serializable、transient、readResolve())来实现序列化。
//public class MaYun_Lazy {
//    private static MaYun_Lazy instance = null;
//    private MaYun_Lazy() {
//    }
//    public static MaYun_Lazy getInstance() {
//        if (instance == null) {
//            instance = new MaYun_Lazy();
//        }
//        return instance;
//    }
//    public void splitAlipay() {
//        System.out.println("我是马云~");
//    }
//}


//懒汉式变种:Feature:线程安全；效率比较低，因为在多线程环境中，时间消耗很大。
public class MaYun_Lazy {
    private static MaYun_Lazy instance = null;
    private MaYun_Lazy() {
    }
    public static synchronized MaYun_Lazy getInstance() {
        if (instance == null) {
            instance = new MaYun_Lazy();
        }
        return instance;
    }
    public void splitAlipay() {
        System.out.println("我是马云~");
    }
}















