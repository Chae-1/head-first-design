package strategy.v3;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
