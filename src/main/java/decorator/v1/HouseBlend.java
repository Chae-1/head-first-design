package decorator.v1;

public class HouseBlend extends Beverage {
    private static final double houseBlendPrice = 5;

    @Override
    public double cost() {
        return super.cost() + houseBlendPrice;
    }
}
