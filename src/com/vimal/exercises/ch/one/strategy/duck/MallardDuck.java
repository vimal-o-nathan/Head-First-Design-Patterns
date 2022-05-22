package com.vimal.exercises.ch.one.strategy.duck;

import com.vimal.exercises.ch.one.strategy.duck.fly.FlyWithWings;
import com.vimal.exercises.ch.one.strategy.duck.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
