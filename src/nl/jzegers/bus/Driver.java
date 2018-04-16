package nl.jzegers.bus;

public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public boolean areEqual(Dog dog, Cat cat) {
        return dog.equals(cat);
    }

    public boolean areEqual(Dog dog1, Dog dog2) {
        return(dog1 == dog2);
    }
}
