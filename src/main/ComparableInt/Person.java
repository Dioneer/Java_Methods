package main.ComparableInt;

public class Person implements Comparable<Person> {
    private final int id;
    private final String name;
    private int koef;

    public int getKoef() {
        return koef;
    }

    public void setKoef(int koef) {
        this.koef = koef;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("id: %d, name: %s, koef: %d", id, name, koef);
    }

    @Override
    public int compareTo(Person o) {
        return this.koef - o.getKoef();
    }
}
