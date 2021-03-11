import java.util.ArrayList;
import java.util.Collections;

public class StudentImpl {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Alice",24));
        al.add(new Student(106,"Bob",27));
        al.add(new Student(105,"Joe",20));

        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }
    }
}

