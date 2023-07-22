package DecoratorPattern.StarBuzzCoffee;

public class SteamedMilk extends CondimentDecorator {

    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return beverage.getDescription() + ", SteamedMilk";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }

}
