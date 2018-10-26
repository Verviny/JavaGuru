package lv.javaguru.homework3;

public class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    void sayHi() {
        System.out.println("Hi! My name is " + getName() + ", I'm " + getAge() + " years old.");
    }
}
