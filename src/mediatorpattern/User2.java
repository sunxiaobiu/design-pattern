package mediatorpattern;

/**
 * Created by sun on 16/3/5.
 */
public class User2 extends User{

    public User2(Mediator mediator) {
        super(mediator);
    }

    public void work() {
        System.out.println("user2 working!");
    }


}
