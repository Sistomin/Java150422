package ru.gb.istomin;

public abstract class Animal {
    private final String name;
    private final int runLimit;
    private final int swimLimit;
    private static int count;
    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

        public void run(int distance) {
        if (distance <= runLimit){
            System.out.println(this + " пробежал " + distance + " м.");
        } else {
            System.out.println(this + " не может пробежать " + distance + " м.");
        }
    }

        public void swim(int distance) {
        if (distance <= swimLimit){
            System.out.println(this + " проплыл " + distance + " м.");
        } else {
            System.out.println(this + " не может проплыть " + distance + " м.");
        }
    }
}
