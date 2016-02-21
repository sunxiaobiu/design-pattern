package templateMethodPattern;

/**
 * Created by sun on 16/2/21.
 */
public class bootstrap {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
