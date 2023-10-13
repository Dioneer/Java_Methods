package main.Generic;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        int c = (int)1.0;
        Double d = 2.1;
        Person.sum(a, b);
        Person.sum(c,d);

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        List<String> arr2 = new ArrayList<>();
        for (int i = 0;  i< arr.size(); i++) {
            arr2.add(Integer.toString(arr.get(i)));
        }
        System.out.println(arr2);
        List<Integer>array1 = new ArrayList<>();
        array1.add(1);
        array1.add(10);
        List<Double>array2 = new ArrayList<>();
        array2.add(1.0);
        array2.add(10.0);
        check1(array1);
        check1(array2);
    }
    public static void check1(List<?>list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
    public static void check2(List<? extends Animal>list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }
    public static void check3(List<? super Animal>list) {
        for (Object animal : list) {
            System.out.println(animal);
        }
    }
    public static void show(int n) {
        System.out.println(n);
    }
    public static void show(double n) {
        System.out.println(n);
    }
    public static void show(String n) {
        System.out.println(n);
    }
    public static <T extends Animal> void show(T n) {
        System.out.println(n);
    }
}
class Person<T>{
        public static <T> void sum(T a, T b){
        System.out.println(a+" "+b);
    }
}
class Bacteria{

}
class Animals extends Bacteria{


}