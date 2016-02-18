package buildpattern;

/**
 * Created by sun on 15/12/21.
 */
public class PersonDirector {

    private PersonBuilder pb;

    public PersonDirector(PersonBuilder pb){
        this.pb = pb;
    }

    public void CreatePerson(){
        pb.BuildArmLeft();
        pb.BuildArmRight();
        pb.BuildBody();
        pb.BuildHead();
        pb.BuildLegLeft();
        pb.BuildLegRight();
    }
}
