package com.vimal.exercises.ch.one.strategy.duck;

import com.vimal.exercises.ch.one.strategy.duck.fly.FlyNoWay;
import com.vimal.exercises.ch.one.strategy.duck.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override public void display() {
        System.out.println("I'm a model duck");
    }
}
