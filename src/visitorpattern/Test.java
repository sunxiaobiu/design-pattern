package visitorpattern;

/**
 * Created by sun on 16/3/4.
 */
public class Test {
    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
