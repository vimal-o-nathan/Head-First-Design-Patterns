package com.vimal.exercises.ch.one.strategy.duck.fly;

public class FlyWithWings implements FlyBehavior {

    @Override public void fly() {
        System.out.println("I'm flying!!");
    }
}
