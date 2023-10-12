package main.relations;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.String.join;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(new Heart());
        human.getHeart().pounding();
        Person person0 = new Person("Kilian", 123);
        Person person1 = new Person("Merphy", 124);
        Person person2 = new Person("Jim", 125);
        Component component = new Component(new ArrayList<>(Arrays.asList(person0, person1, person2)));
        System.out.println(component.getDrivers());
        int k = Integer.parseInt("123");
        int kk = Integer.valueOf("123");
        System.out.println(k + kk);
        String l = String.valueOf(123);
        String[] arra = l.split("");
        arra[1] = "4";
        String ll = String.join("", arra);
        System.out.println(ll);
    }

}
