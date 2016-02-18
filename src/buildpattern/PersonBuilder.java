package buildpattern;

import java.awt.*;

/**
 * Created by sun on 15/12/21.
 */
public abstract class PersonBuilder {
    protected Graphics g;

    public PersonBuilder(Graphics g){
        this.g = g;
    }

    public abstract void BuildHead();
    public abstract void BuildBody();
    public abstract void BuildArmLeft();
    public abstract void BuildArmRight();
    public abstract void BuildLegLeft();
    public abstract void BuildLegRight();

}
