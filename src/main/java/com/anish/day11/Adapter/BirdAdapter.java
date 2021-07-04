package com.anish.day11.Adapter;

public class BirdAdapter implements ToyDuck{
    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}
