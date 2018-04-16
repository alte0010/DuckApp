package nl.jzegers.bus;

public class Dog {
    private boolean head = false;
    private boolean tail = true;

    public boolean hasHead() {
        return this.head;
    }

    public boolean hasTail() {
        return this.tail;
    }

    public boolean equals(Cat cat) {
        return (   cat.hasHead() == this.hasHead()
                && cat.hasTail() == this.hasTail());
    }
}
