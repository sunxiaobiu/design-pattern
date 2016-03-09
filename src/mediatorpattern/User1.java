package mediatorpattern;

/**
 * Created by sun on 16/3/5.
 */
public class User1 extends User {

    public User1(Mediator mediator) {
        super(mediator);
    }

    public void work() {
        System.out.println("user1 working!");
    }

}
