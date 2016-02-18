package SingletonPattern;

/**
 * Created by sun on 16/1/4.
 */
//枚举类型[极推荐],不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。但是失去了类的一些特性，没有延迟加载
public enum MaYun_Enum {
    himself; //定义一个枚举的元素，就代表MaYun的一个实例

    private String anotherField;

    public void splitAlipay() {
        System.out.println("我是马云~");
    }
}
