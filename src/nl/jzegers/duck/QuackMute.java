package nl.jzegers.duck;

public class QuackMute implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
