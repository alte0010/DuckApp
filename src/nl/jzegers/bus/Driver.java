package nl.jzegers.bus;

public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public boolean areEqual(Dog dog1, Cat cat1) {
        return dog1.equals(cat1);
    }

    public boolean areEqual(Dog dog1, Dog dog2) {
        return(dog1 == dog2);
    }
}
