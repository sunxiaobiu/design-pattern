package buildpattern;

import java.awt.*;

/**
 * Created by sun on 15/12/21.
 */
public class PersonFatBuilder extends PersonBuilder{

    public PersonFatBuilder(Graphics g){
        super(g);
    }

    public void BuildHead(){
        g.drawOval(50,20,30,30);
    }
    public void BuildBody(){
        g.drawRect(60,50,50,50);
    }
    public void BuildArmLeft(){
        g.drawLine(60,50,40,100);
    }
    public void BuildArmRight(){
        g.drawLine(70,50,90,100);
    }
    public void BuildLegLeft(){
        g.drawLine(60,100,45,150);
    }
    public void BuildLegRight(){
        g.drawLine(70,100,85,150);
    }
}
