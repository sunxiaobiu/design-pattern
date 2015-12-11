package proxypattern;

/**
 * Created by sun on 15/12/10.
 */
public class BootStrap {
    public static void main(String[] args) {
        PrettyGirl prettyGirl = new PrettyGirl("孙萧育");

        Proxy proxy = new Proxy(prettyGirl);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveFoods();
    }
}
