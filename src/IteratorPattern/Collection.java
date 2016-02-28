package IteratorPattern;

/**
 * Created by sun on 16/2/27.
 */
public interface Collection {

    public IteratorPattern.Iterator iterator();

    public Object get(int i);

    public int size();
}
