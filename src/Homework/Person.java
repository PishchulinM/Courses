package Homework;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Person {
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getbirthYear() {
        return birthYear;
    }

    public void setbirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {

    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int age() {
        Date d = new Date();
        int year = 1900 + d.getYear();

        return year - birthYear;

    }

    public void input(String name, int birthYear) {
        this.setName(name);
        this.setbirthYear(birthYear);

    }

    public void output() {
        System.out.println(getName() + "  " + getbirthYear());
    }
    public void changeName(String name){
        this.setName(name);
    }
}

class appl {
    public static void main(String[] args) {
        Person per1 = new Person("Victor", 2001);
        Person per2 = new Person();
        per2.input("ma", 2015);
        per2.output();
        System.out.println(per2.age());
        Person per3 = new Person("Vladick", 2000);
        per3.output();
        Person per4 = new Person("Mykola", 1986);
        Person per5 = new Person("Yurka", 1984);
        per5.changeName("Ivan");
        per5.output();

    }
}
