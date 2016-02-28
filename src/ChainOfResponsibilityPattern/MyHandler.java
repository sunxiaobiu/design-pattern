package ChainOfResponsibilityPattern;

/**
 * Created by sun on 16/2/28.
 */
public class MyHandler extends AbstractHandler implements Handler{

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator(){
        System.out.println(name+"deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }


}
