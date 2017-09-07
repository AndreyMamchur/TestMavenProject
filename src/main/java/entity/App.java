package entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ELRIK on 07.09.2017.
 */
public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.writeName();

        System.out.println("And now from context");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Animal animal1 = (Animal) context.getBean("animal");
        animal1.writeName();

    }
}
