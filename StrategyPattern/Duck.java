package StrategyPattern;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck() {

    }

    public abstract void display();

    public void Swim() {
        System.out.println("Swiming..");
    }

    public void performQuack() {
        quackBehavior.quack(); // Delegating the behaviour
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
