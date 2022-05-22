package com.vimal.exercises.ch.one.strategy.duck.fly;

public class FlyRocketPowered implements FlyBehavior {

    @Override public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
