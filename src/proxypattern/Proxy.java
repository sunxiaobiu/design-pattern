package proxypattern;

/**
 * Created by sun on 15/12/10.
 */
public class Proxy {

    PersuitPerson persuitPerson;

    public Proxy(PrettyGirl mm){
        persuitPerson = new PersuitPerson(mm);
    }

    public void giveDolls(){
        persuitPerson.giveDolls();
    }

    public void giveFlowers(){
        persuitPerson.giveFlowers();
    }

    public void giveFoods(){
        persuitPerson.giveFoods();
    }


}
