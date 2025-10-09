import java.util.*;

class Person {
    public String name;
    protected int age;
    private String city = "Delhi";

    public void printData() {
        System.out.print("\nMy name is: " + name);
        System.out.print("\nMy age is: " + age);
        System.out.print("\nMy city is: " + city);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    Student(String name, int age) {
        super(name, age);
    }

    public void checkEligibility() {
        if (age >= 18) {
            System.out.print("\n" + name + " is eligible to vote!");
        } else {
            System.out.print("\n" + name + " is not eligible to vote!");
        }
    }
}

public class accessModifiers {
    public static void main(String[] args) {
        Person p1 = new Person("Bharat", 23);
        p1.printData();

        Student st = new Student("Bharat", 23);
        st.checkEligibility();
    }
}
