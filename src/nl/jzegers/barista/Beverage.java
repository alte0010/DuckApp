package nl.jzegers.barista;

public abstract class Beverage {
    String description = "Uknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
