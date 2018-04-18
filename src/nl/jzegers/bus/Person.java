package nl.jzegers.bus;

public abstract class Person implements Nameable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
