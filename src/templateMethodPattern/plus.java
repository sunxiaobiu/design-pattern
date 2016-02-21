package templateMethodPattern;

/**
 * Created by sun on 16/2/21.
 */
public class plus extends AbstractCalculator {
    @Override
    public int calculate(int num1,int num2) {
        return num1 + num2;
    }
}
