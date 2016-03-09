package Interpreter;

/**
 * Created by sun on 16/3/5.
 */
public class test {
    public static void main(String[] args) {
        Context context = new Context(1,2);
        Expression plus = new Plus();
        System.out.println(plus.interpret(context));

        Expression minus = new Minus();
        System.out.println(minus.interpret(context));
    }
}
