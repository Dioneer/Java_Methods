package main.ComparableInt;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(111, "Lev");
        Person person2 = new Person(123, "Mira");
        Person person3 = new Person(124, "Igor");
        List<Person>atts = new ArrayList<>(Arrays.asList(person1, person2, person3));
        for (Person att: atts) {
            att.setKoef((int)Math.round(Math.random()*20));
            System.out.println(att.getKoef());
        }
        Collections.sort(atts);
        for (Person att: atts) {
            System.out.println(att);
        }

    }
}
