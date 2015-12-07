package combination.factory.strategy.pattern;

/**
 * Created by sun on 15/12/7.
 */
public class BootStrap {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext("正常收费");
        double totalPrices = 0.0;
        totalPrices = cashContext.getResult(500);
        System.out.println(totalPrices);
    }
}
