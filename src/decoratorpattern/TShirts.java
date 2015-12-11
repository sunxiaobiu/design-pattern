package decoratorpattern;

/**
 * Created by sun on 15/12/10.
 */
public class TShirts extends Finery{

    @Override
    public void show(){
        System.out.println("穿T恤");
        super.show();
    }
}
