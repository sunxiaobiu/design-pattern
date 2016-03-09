package statepattern;

/**
 * Created by sun on 16/3/4.
 */
public class State {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void method1(){
        System.out.println("state 1 is running!");
    }

    public void method2(){
        System.out.println("state 2 is running!");
    }
}
