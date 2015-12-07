package factorypattern;

/**
 * Created by sun on 15/12/6.
 */
public class bootStrap {

    public static void main(String[] args) {
        CashSuper cashSuper = CashFactory.createCashAccept("打8折");
        double totalPrices = 0.0;
        totalPrices = cashSuper.acceptCash(500);
        System.out.println(totalPrices);
    }

}
