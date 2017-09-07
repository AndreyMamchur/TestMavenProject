package entity;

/**
 * Created by ELRIK on 07.09.2017.
 */
public class Animal {
    private String name;
    private String age;
    private String lastName;

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


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void init(){
        System.out.println("I'm initialising");
    }

    public void destroy(){
        System.out.println("buy buy");
    }

    public  void writeName(){
        System.out.println("My name is " + name + ", and age = " + age);
    }
}
