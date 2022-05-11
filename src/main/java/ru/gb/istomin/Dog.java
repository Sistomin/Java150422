package ru.gb.istomin;

public class Dog extends Animal {
    public Dog(String type, String name, int run, int swim) {
        super(type, name, run, swim);
        ++dogCount;//подсчет псов
    }
}
