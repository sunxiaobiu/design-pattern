package Interpreter;

/**
 * Created by sun on 16/3/5.
 */
public class Minus implements Expression {

    public int interpret(Context context){
        return context.getNum1() - context.getNum2();
    }

}
