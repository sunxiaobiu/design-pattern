package mementopattern;

/**
 * Created by sun on 16/3/4.
 */
public class Memento {
    private String value;

    public Memento(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
