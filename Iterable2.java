import java.util.Iterator;

public class Iterable2 {
    public static void main(String[] args) {
        Iterable1 i = new Iterable1();
        i.add("Alice");
        i.add("bob");

    /*for(String el: i)
    {
        System.out.println(e);
    }*/
        Iterator<String> iterator =(Iterator<String>) i.iterator();
    while(iterator.hasNext())
    {
        String e = iterator.next();
        System.out.println(e);
    }
    }
}
