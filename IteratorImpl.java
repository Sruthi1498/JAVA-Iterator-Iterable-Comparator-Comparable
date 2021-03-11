import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class IteratorImpl {
    static int i = 1;

    public static void main(String[] args) {

        Collection<String> list = new ConcurrentLinkedQueue<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(i++ + " " + iterator.next());
        }
    }
}