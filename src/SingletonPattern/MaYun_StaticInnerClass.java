package SingletonPattern;

/**
 * Created by sun on 16/1/4.
 */
//静态内部类:线程安全；延迟加载。
public class MaYun_StaticInnerClass {

    private static class SigletonHolder {
        private static final MaYun_StaticInnerClass instance = new MaYun_StaticInnerClass();
    }

    public static final MaYun_StaticInnerClass getInstance() {
        return SigletonHolder.instance;
    }

    private MaYun_StaticInnerClass() {
    }

    public void splitAlipay() {
        System.out.println("我是马云~");
    }
}
