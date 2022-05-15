package ru.gb.istomin;

public class Cat {
    //public boolean fullness;
    private String name;
    private int appetite;
    public boolean fullCat;
    public Cat(String name, int appetite, boolean b){
        this.name = name;
        this.appetite = appetite;
        this.fullCat = fullCat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFullCat() {
        return fullCat;
    }

    public void setFullCat(boolean fullCat) {
        this.fullCat = fullCat;
    }

    public void eat(Plate p, Cat[] hungryCats) {
        p.decreaseFood(appetite, hungryCats);
    }
    public void eat(){

    }
}
