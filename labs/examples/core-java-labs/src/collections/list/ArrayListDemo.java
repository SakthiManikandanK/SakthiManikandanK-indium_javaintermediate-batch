package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add("java");
        arrayList.set(1,"collections");
        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
