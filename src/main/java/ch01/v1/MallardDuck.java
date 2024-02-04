package ch01.v1;

public class MallardDuck extends Duck{
    // 1. MallardDuck 은 날수 있고, 수영을 할 수 있다.
    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}
