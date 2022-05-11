package ru.gb.istomin;

public class Cat extends Animal {
    public Cat(String type, String name, int run, int swim) {
        super(type, name, run, swim);
        ++catCount;//подсчет котов
    }
}
