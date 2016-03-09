package commandpattern;

/**
 * Created by sun on 16/3/4.
 */
public class test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
