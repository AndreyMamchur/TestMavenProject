package com.test.bu.entity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ELRIK on 07.09.2017.
 */
public class App {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.writeName();
//
//        System.out.println("And now from context");
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Animal animal1 = (Animal) context.getBean("animal");
//        animal1.writeName();
//
//        World world1 = (World) context.getBean("world");
//        world1.writeAnimal();
//
//        Cat cat = (Cat) context.getBean("cat");
//        cat.writeName();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Animal.class);
        Animal bean = context.getBean(Animal.class);



    }
}
