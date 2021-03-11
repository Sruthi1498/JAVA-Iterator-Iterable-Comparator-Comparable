import java.util.*;


public class IterableImpl {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        //Collections<String> collection = list;
        Iterable<String> iterable = (Iterable<String>) list;

        for(String e: list)
        {
            System.out.println(e);
        }

       Iterator<String> iterator = iterable.iterator();
        while(iterator.hasNext())
        {
            String e = iterator.next();
            System.out.println(e);
        }

        iterable.forEach((e)->
        {
            System.out.println(e);
        });

    }
}
