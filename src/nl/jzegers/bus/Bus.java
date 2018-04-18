package nl.jzegers.bus;

import java.util.HashMap;
import java.util.Map;

public class Bus {
    private Driver driver;
    private HashMap<String, Nameable> chairs = new HashMap<String, Nameable>();

    public Bus(Driver driver) {
        this.driver = driver;
    }

    public void getIn(Nameable nameable1, Nameable nameable2, Nameable nameable3) {
        getIn(nameable1);
        getIn(nameable2);
        getIn(nameable3);
    }

    public void getIn(Nameable nameable) {
        String key = nameable.getName();
        Nameable value = nameable;
        this.chairs.put(key, value);
        showInfo(nameable, " is ingestapt");
    }

    public Nameable getOut(String name) {
        if (!chairs.containsKey(name)) {
            System.out.println(name + " zit niet in de bus");
            return null;
        }
        Nameable deportedPerson = chairs.get(name);
        chairs.remove(name);
        showInfo(deportedPerson, " is uitgestapt");
        return deportedPerson;
    }

    private void showInfo(Nameable nameable, String action) {
        System.out.println(nameable.getName() + action);
    }

    private int getCount() {
        return chairs.size();
    }

    public String[] getNames() {
        String[] names = new String[getCount()];
        int i = 0;
        for (String key : chairs.keySet()) {
            names[i] = key;
            i++;
        }
        return names;
    }

    public void info() {
        System.out.println(this);
    }

    public String toString() {
        return "Er zitten " + getCount() + " dingen in de bus.";
    }

    public void printNames() {
        System.out.println("Deze wezens zitten in de bus:");
        for(Map.Entry<String, Nameable> entry : chairs.entrySet()) {
            String key = entry.getKey();
            System.out.println("- "+key);
        }
    }
}
