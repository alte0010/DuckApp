package nl.jzegers.duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("MallardDuck");
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("ModelDuck");
        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        System.out.println("ModelDuck 2.0");
        model.setFlyBehavior(new FlyRocketPowered());
        model.setQuackBehavior(new QuackDeusVult());
        model.performFly();
        model.performQuack();
    }
}
