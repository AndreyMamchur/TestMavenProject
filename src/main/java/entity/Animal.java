package entity;

/**
 * Created by ELRIK on 07.09.2017.
 */
public class Animal {
    private String name;
    private  String age;

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public  void writeName(){
        System.out.println("My name is One");
    }
}
