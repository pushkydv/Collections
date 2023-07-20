import java.util.ArrayList;
import java.util.ListIterator;

public class List {
    public static void main(String[] args) {
        //System.out.println("First test new check in collection api");
        ArrayList<Student> al= new ArrayList<Student>();
        al.add(new Student(1,"Raju"));
        al.add(new Student(2,"Push"));
        al.add(new Student(4,"Gola"));
        al.add(new Student(5,"Ruchi"));
        al.add(new Student(6,"Pramod"));

        al.stream().forEach(s-> System.out.println(s.getClass()+":  "+s.getName()));

       /* ListIterator<Student> li = al.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }*/

    }
}
