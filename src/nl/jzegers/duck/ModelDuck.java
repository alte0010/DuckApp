package nl.jzegers.duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackQuack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
