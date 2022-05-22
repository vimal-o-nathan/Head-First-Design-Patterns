package com.vimal.exercises.ch.one.strategy.duck.quack;

public class Quack implements QuackBehavior {

    @Override public void quack() {
        System.out.println("Quack");
    }
}
