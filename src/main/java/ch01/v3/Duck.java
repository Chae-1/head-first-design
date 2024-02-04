package ch01.v3;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performQuack() {
        flyBehavior.fly();
    }

    public void performFly() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("수영합니다.");
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
