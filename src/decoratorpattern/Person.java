package decoratorpattern;

/**
 * Created by sun on 15/12/10.
 */
public class Person {

    public Person(){
    }

    private String name;

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("装扮" + name);
    }

}
