package decorator.v1;

/**
 * 우유 : 4
 * 두유 : 3
 * 모카 : 3
 * 휘핑크림 : 5
 */
public abstract class Beverage {

    private static final double priceOfMilk = 4;
    private static final double priceOfSoy = 3;
    private static final double priceOfMocha = 3;
    private static final double priceOfWhip = 5;
    private String description;
    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;

    public boolean isMilk() {
        return milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public double cost() {
        double cost = 0;
        if (isMilk()) {
            cost += priceOfMilk;
        }

        if (isMocha()) {
            cost += priceOfMocha;
        }

        if (isWhip()) {
            cost += priceOfWhip;
        }

        if (isSoy()) {
            cost += priceOfSoy;
        }

        return cost;
    }
}
