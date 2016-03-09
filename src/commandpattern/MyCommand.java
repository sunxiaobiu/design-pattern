package commandpattern;

/**
 * Created by sun on 16/3/4.
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver rec){
        this.receiver = rec;
    }

    @Override
    public void exe(){
        receiver.action();
    }
}
