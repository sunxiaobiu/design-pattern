package combination.factory.strategy.pattern;

/**
 * Created by sun on 15/12/6.
 */
public class CashNomal extends CashSuper {

    @Override
    public double acceptCash(double money){
        return money;
    }

}
