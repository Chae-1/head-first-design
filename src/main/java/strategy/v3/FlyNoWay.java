package strategy.v3;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날수 없다.");
    }
}
