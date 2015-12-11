package proxypattern;


/**
 * Created by sun on 15/12/10.
 */
public class PersuitPerson implements GiveGift{

    PrettyGirl mm;

    public PersuitPerson(PrettyGirl mm){
        this.mm = mm;
    }

    public void giveDolls(){
        System.out.println("送给" + mm.getName() +"洋娃娃~");
    }

    public void giveFlowers(){
        System.out.println("送给" + mm.getName() +"鲜花~");
    }

    public void giveFoods(){
        System.out.println("送给" + mm.getName() +"好吃哒~");
    }
}
