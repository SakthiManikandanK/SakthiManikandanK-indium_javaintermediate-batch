package collections.list;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList skills = new ArrayList();
        skills.add("Java");
        skills.add("Python");
        skills.add(".Net");
        skills.add("Java");


        System.out.println(skills);

        skills.contains("Java");

        System.out.println(skills.get(1));
        skills.set(2, "Node JS");

        //skills.add(2, "Node JS");

        System.out.println(skills);

        skills.remove(2);

        System.out.println(skills);

//		List synSkills = Collections.synchronizedList(skills);
//
//		System.out.println(synSkills);
//
//		System.out.println(Collections.binarySearch(skills, "Python"));
//
//		Collections.sort(skills);
//
//		System.out.println(skills);
//
    }
}
