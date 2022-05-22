package com.vimal.exercises.ch.one.strategy;

import com.vimal.exercises.ch.one.strategy.duck.Duck;
import com.vimal.exercises.ch.one.strategy.duck.MallardDuck;
import com.vimal.exercises.ch.one.strategy.duck.ModelDuck;
import com.vimal.exercises.ch.one.strategy.duck.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
