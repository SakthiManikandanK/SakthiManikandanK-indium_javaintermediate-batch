package collections.list;

import collections.Skill;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListWithObjDemo {
    public static void main(String[] args) {
        List list = new ArrayList();

        Skill java = new Skill(1, "java", true);
        Skill dotNet = new Skill(2, "dotNet", false);

        list.add(java);
        list.add(dotNet);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Skill skill = (Skill) iterator.next();
            System.out.println();
        }

    }
}
