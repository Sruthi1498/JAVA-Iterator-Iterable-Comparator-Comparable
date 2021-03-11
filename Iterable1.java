import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable1 implements Iterable<String>{

    List<String> el = new ArrayList<String>();

    public void add(String el)
    {
        this.el.add(el);
    }

    @Override
    public Iterator<String> iterator() {
        return this.el.iterator();
    }
}
