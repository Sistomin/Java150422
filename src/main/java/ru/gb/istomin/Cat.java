package ru.gb.istomin;

public class Cat extends Animal {

    private static final int RUN_LIMIT = 200;
    private static final int SWIM_LIMIT = 0;
    private static int count;
    public Cat(String name) {
        super(name, RUN_LIMIT, SWIM_LIMIT);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плвать;)");
    }

    @Override
    public String toString() {
                return "Кот по имени " + getName();
    }
}

