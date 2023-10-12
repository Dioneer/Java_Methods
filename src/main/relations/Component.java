package main.relations;

import java.util.List;

public class Component {
    List<Person> drivers;

    public List<Person> getDrivers() {
        return drivers;
    }

    public Component(List<Person> drivers) {
        this.drivers = drivers;
    }
}
