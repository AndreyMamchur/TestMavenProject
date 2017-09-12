package com.test.bu.entity;

/**
 * Created by ELRIK on 07.09.2017.
 */
public class World {
    private Animal animal;

    public World(Animal animal) {
        this.animal = animal;
    }

    public void writeAnimal(){
        System.out.println(animal.toString());
    }
}
