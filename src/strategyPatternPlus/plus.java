package strategyPatternPlus;

/**
 * Created by sun on 16/2/21.
 */
public class plus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp){
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
