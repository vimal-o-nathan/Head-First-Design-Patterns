package com.vimal.exercises.ch.one.strategy.duck.quack;

public class MuteQuack implements QuackBehavior {

    @Override public void quack() {
        System.out.println("<< Silence >>");
    }
}
