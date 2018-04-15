package nl.jzegers.hometheater;

public class Tuner {
    double frequency;
    String description;
    Amplifier amplifier;

    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setAm() {
        System.out.println(description + " setting AM mode");
    }

    public void setFm() {
        System.out.println(description + " setting FM mode");
    }

    public void setFrequency(double frequency) {
        System.out.println(description + " setting frequency to " + frequency);
        this.frequency = frequency;
    }

    public String toString() {
        return description;
    }
}
