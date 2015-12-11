package decoratorpattern;

/**
 * Created by sun on 15/12/10.
 */
public class BootStrap {
    public static void main(String[] args) {
        Person beautifulGirl = new Person("孙萧育");
        System.out.println("\n第一种装扮：");

        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();

        tShirts.Decorate(beautifulGirl);
        bigTrouser.Decorate(tShirts);
        bigTrouser.show();
    }
}
