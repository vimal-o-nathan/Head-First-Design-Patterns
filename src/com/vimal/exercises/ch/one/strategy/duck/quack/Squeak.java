package com.vimal.exercises.ch.one.strategy.duck.quack;

public class Squeak implements QuackBehavior {

    @Override public void quack() {
        System.out.println("Squeak");
    }
}
