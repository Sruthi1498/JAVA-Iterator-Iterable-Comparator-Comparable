import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatgorImpl {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students(101,"Vijay",23));
        list.add(new Students(106,"Ajay",27));
        list.add(new Students(105,"Jai",21));

        Collections.sort(list,new AgeComparator());
        for(Students st: list){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        Collections.sort(list,new NameComparator());
        for(Students st: list){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
