package BridgePattern;

/**
 * Created by sun on 16/2/19.
 */
public class MyBridge extends Bridge{

    public void method(){
        getSourceable().method();
    }
}
