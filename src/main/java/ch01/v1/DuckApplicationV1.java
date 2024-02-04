package ch01.v1;

public class DuckApplicationV1 {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();

        mallardDuck.fly();
        redheadDuck.fly();

        mallardDuck.quack(); // 불가능 해야하지만, 가능하다.
        redheadDuck.quack();
    }
}
