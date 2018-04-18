package nl.jzegers.bus;

public class Main {
    public static void main(String[] args) {
	    Driver driver = new Driver("Alpha");

        Bus bus = new Bus(driver);
        bus.info();

        // Stop 1
        Child child1 = new Child("Bravo");
        Child child2 = new Child("Charlie");
        Child child3 = new Child("Delta");

        bus.getIn(child1, child2, child3);
        bus.info();

        // Stop 2
        Child child4 = new Child("Echo");
        bus.getIn(child4);
        bus.info();

        // Stop 3
        OldMan man1 = new OldMan("Foxtrot");
        bus.getIn(man1);
        bus.info();

        // Checkpoint
        Person deportedPerson = (Person) bus.getOut("Bravo");
        bus.info();

        // Dog
        Dog dog1 = new Dog("Golf");
        bus.getIn(dog1);
        bus.info();

        bus.printNames();
        BusStation terneuzen = new BusStation();
        terneuzen.arrives(bus);
        bus.info();
        bus.printNames();
    }
}
