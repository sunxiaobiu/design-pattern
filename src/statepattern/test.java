package statepattern;

/**
 * Created by sun on 16/3/4.
 */
public class test {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setState("state1");
        context.method();

        //设置第二种状态
        state.setState("state2");
        context.method();
    }
}
