package StrategyPattern;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm fl ying with a rocket!");
    }
}