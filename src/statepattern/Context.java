package statepattern;

/**
 * Created by sun on 16/3/4.
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method() {
        if (state.getState().equals("state1")) {
            state.method1();
        } else if (state.getState().equals("state2")) {
            state.method2();
        }
    }
}
