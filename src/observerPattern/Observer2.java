package observerPattern;

/**
 * Created by sun on 16/2/24.
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
