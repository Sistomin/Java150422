package ru.gb.istomin;


import java.util.Scanner;

public class Plate {
    private int food;
    private Scanner sc;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int n, Cat[] hungryCats) {
        food -= n;
    }

    public void info() {
        System.out.println("В тарелке есть еды " + food);

    }

    public void addFood(int action) {
        food = food + action;
    }
}


