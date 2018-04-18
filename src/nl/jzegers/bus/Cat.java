package nl.jzegers.bus;

public class Cat implements Nameable {
    private boolean head = true;
    private boolean tail = true;
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public boolean hasHead() {
        return this.head;
    }

    public boolean hasTail() {
        return this.tail;
    }

    public String getName() {
        return this.name;
    }
}
