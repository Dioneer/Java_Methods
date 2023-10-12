package main.cloneable;

public class Man implements Comparable<Man>, Cloneable{
    private int id;
    private String name;

    public Man(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Man o) {
        return this.getId() - o.getId();
    }
    public Man clone() throws CloneNotSupportedException{
        return (Man)super.clone();
    }

    @Override
    public String toString() {
            return String.format("id: %d, name: %s", id, name);
    }
}
