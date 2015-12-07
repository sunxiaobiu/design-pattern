package strategypattern;

/**
 * Created by sun on 15/12/6.
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1.0;

    public CashRebate(String moneyRebate){
        this.moneyRebate = Double.valueOf(moneyRebate);
    }

    @Override
    public double acceptCash(double money){
        return money * moneyRebate;
    }

}
