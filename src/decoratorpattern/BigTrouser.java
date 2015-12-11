package decoratorpattern;

/**
 * Created by sun on 15/12/10.
 */
public class BigTrouser extends Finery {

    @Override
    public void show(){
        System.out.println("垮裤");
        super.show();
    }
}
