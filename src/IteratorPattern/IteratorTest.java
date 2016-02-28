package IteratorPattern;

/**
 * Created by sun on 16/2/28.
 */
public class IteratorTest {

    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
