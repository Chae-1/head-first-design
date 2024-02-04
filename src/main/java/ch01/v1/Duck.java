package ch01.v1;

public abstract class Duck {
    public void quack() {
        System.out.println("quack");
    }

    public void fly() {
        System.out.println("fly");
    }

    public abstract void display();
}
