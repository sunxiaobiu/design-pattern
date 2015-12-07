package strategypattern;

/**
 * Created by sun on 15/12/7.
 */
public class BootStrap {

    public static void main(String[] args) {
        CashContext cashContext = null;
        String type = "正常收费";
        switch (type){
            case "打8折":
                cashContext = new CashContext(new CashRebate("0.8"));
                break;
            case "满300返100":
                cashContext = new CashContext(new CashReturn("300", "100"));
                break;
            case "正常收费":
                cashContext = new CashContext(new CashNomal());
                break;
        }

        double totalPrices = 0.0;
        totalPrices = cashContext.getResult(500);
        System.out.println(totalPrices);
    }
}
