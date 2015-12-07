package combination.factory.strategy.pattern;

/**
 * Created by sun on 15/12/6.
 */
public class CashReturn extends CashSuper {

    private double moneyCondition = 0.0;

    private double moneyReturn = 0.0;

    public CashReturn(String moneyCondition, String moneyReturn){
        this.moneyCondition = Double.valueOf(moneyCondition);
        this.moneyReturn = Double.valueOf(moneyReturn);
    }

    public double acceptCash(double money){
        double result = money;
        if(money >= moneyCondition){
            result = money - (money/moneyCondition)*moneyReturn;
        }
        return result;
    }

}
