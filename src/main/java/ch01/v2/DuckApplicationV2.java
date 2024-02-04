package ch01.v2;

public class DuckApplicationV2 {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();

        mallardDuck.fly();
        redheadDuck.fly();

        mallardDuck.quack(); // 이제, 울음소리를 낼 수없다.
        redheadDuck.quack();
    }
}
