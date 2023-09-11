package generics;

public class CalcMain {
    public static void main(String[] args) {

        CalcGeneric generic = new CalcGeneric();
        System.out.println(generic.add(10,20));
        System.out.println(generic.add(10.5,20.7));

    }
}
