package ch01.v3;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("조용");
    }
}
