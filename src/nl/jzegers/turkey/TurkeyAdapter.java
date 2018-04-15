package nl.jzegers.turkey;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void fly() {
        turkey.gobble();
    }

    public void quack() {
        for(int i=0; i < 5; i++) {
            turkey.fly();
        }
    }
}
