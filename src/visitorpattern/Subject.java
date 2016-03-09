package visitorpattern;

/**
 * Created by sun on 16/3/4.
 */
public interface Subject {
    public void accept(Visitor visitor);

    public String getSubject();
}
