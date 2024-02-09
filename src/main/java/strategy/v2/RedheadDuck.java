package strategy.v2;

public class RedheadDuck implements Duck{
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
