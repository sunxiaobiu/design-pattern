package mediatorpattern;

/**
 * Created by sun on 16/3/5.
 */
public class test {

    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }

}
