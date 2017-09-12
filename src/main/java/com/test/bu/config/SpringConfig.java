package com.test.bu.config;
import com.test.bu.entity.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ELRIK on 07.09.2017.
 */
@Configuration
public class SpringConfig {

    @Bean
    public Animal getAnimal(){
        Animal animal = new Animal();
        animal.setName("name1");
        animal.setAge("age1");
        return animal;
    }

}
