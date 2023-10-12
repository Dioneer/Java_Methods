package main.cloneable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Man man1 = new Man(12, "asdasd");
        Man man2 = man1.clone();
        man2.setId(21);
        man1.setId(14);
        System.out.println(man1);
        System.out.println(man2);
    }
}
