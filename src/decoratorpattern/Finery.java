package decoratorpattern;

/**
 * Created by sun on 15/12/10.
 */
public class Finery extends Person {

    protected Person person;

    //装饰
    public void Decorate(Person person){
        this.person = person;
    }

    @Override
    public void show(){
        if(person != null){
            person.show();
        }
    }

}
