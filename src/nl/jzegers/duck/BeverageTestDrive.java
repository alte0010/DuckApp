package nl.jzegers.duck;

public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("");
        teaHook.prepareRecipe();

        System.out.println("");
        coffeeHook.prepareRecipe();
    }
}
