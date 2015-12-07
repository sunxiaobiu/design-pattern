package strategypattern;

/**
 * Created by sun on 15/12/7.
 */
public class CashContext {

    private CashSuper cashSuper;

    //传入具体的收费策略
    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }

}
