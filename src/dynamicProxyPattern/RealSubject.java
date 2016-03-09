package dynamicProxyPattern;

/**
 * Created by sun on 16/3/9.
 */
public class RealSubject implements Subject {

    @Override
    public void rent()
    {
        System.out.println("I want to rent my house");
    }

    @Override
    public void hello(String str)
    {
        System.out.println("hello: " + str);
    }
}
