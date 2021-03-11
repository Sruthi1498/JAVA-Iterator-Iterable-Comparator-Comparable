import java.util.Comparator;

public class AgeComparator implements Comparator<Students> {

    @Override
    public int compare(Students s1, Students s2) {
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
