package observerPattern;

/**
 * Created by sun on 16/2/24.
 */
public class Observer1 implements Observer {
    @Override
    public void update(){
        System.out.println("observer1 has received!");
    }
}
