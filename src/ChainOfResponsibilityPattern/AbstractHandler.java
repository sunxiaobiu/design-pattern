package ChainOfResponsibilityPattern;

/**
 * Created by sun on 16/2/28.
 */
public class AbstractHandler {
    private Handler handler;

    public Handler getHandler(){
        return handler;
    }

    public void setHandler(Handler handler){
        this.handler = handler;
    }

}
