package nl.jzegers.bus;

public class Bus {
    private Driver driver;
    private Person[] chairs = new Person[24];

    public Bus(Driver driver) {
        this.driver = driver;
    }

    public void getIn(Person person1, Person person2, Person person3) {
        getIn(person1);
        getIn(person2);
        getIn(person3);
    }

    public int freeSpace() {
        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i] == null)
                return i;
        }
        return -1;
    }

    public void getIn(Person person) {
        if (freeSpace() == -1) {
            System.out.println("De bus is vol, " + person.getName() + " moet gaan lopen.");
            return;
        }
        this.chairs[freeSpace()] = person;
        showInfo(person);
    }

    private void showInfo(Person person) {
        System.out.println(person.getName() + " is ingestapt");
    }

    private int getCount() {
        int count = 0;
        for (int i = 0; i < chairs.length; i++) {
            Person currentChair = chairs[i];
            if (currentChair != null)
                count++;
        }
        return count;
    }

    public String toString() {
        return "Er zitten " + getCount() + " personen in de bus.";
    }
}
