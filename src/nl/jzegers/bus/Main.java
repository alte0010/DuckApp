package nl.jzegers.bus;

public class Main {
    public static void main(String[] args) {
	    Driver driver = new Driver("Alpha");
	    // Dog dog1 = new Dog();

	    // Neighbours animals
	    // Dog dog2 = new Dog();
	    // Cat cat1 = new Cat();

	    // System.out.println("dog1, dog2");
	    // System.out.println(driver.areEqual(dog1, dog2));

        // System.out.println("dog1, dog1");
        // System.out.println(driver.areEqual(dog1, dog1));

        Bus bus = new Bus(driver);
        System.out.println(bus);

        // Stop 1
        Child child1 = new Child("Bravo");
        Child child2 = new Child("Charlie");
        Child child3 = new Child("Delta");
        bus.getIn(child1, child2, child3);
        System.out.println(bus);

        // Stop 2
        Child child4 = new Child("Echo");
        bus.getIn(child4);
        System.out.println(bus);

        // Stop 3
        OldMan man1 = new OldMan("Foxtrot");
        bus.getIn(man1);
        System.out.println(bus);
    }
}
