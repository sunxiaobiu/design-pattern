package combination.factory.strategy.pattern;

/**
 * Created by sun on 15/12/7.
 */
public class CashContext {

    private CashSuper cashSuper;

//    //传入具体的收费策略
//    public CashContext(CashSuper cashSuper) {
//        this.cashSuper = cashSuper;
//    }

    //传入String格式的收费类型，而不是收费策略
    public CashContext(String type){
        switch (type){
            case "打8折":
                cashSuper = new CashRebate("0.8");
                break;
            case "满300返100":
                cashSuper = new CashReturn("300", "100");
                break;
            case "正常收费":
                cashSuper = new CashNomal();
                break;
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }

}
