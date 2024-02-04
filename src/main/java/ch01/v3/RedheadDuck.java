package ch01.v3;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.quackBehavior = new MuteQuack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("빨간 오리입니다.");
    }
}
