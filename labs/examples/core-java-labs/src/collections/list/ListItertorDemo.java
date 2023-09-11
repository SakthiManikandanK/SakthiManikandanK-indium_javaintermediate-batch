package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListItertorDemo {
    public static void main(String[] args) {
        List student = new ArrayList();
        student.add("id");
        student.add("name");
        student.add("dept");

        ListIterator listIterator = student.listIterator();
        listIterator.add("bloodGroup");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println(student);
    }
}
