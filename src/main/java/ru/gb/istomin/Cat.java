package ru.gb.istomin;

public class Cat implements Play{
    private String name;
    private int maxRun;
    private int maxJump;
    private boolean success = true;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }


    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }

    public int getMaxJump() {
        return maxJump;
    }



    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public void run(){
        System.out.println("Кот по имени " + name + " может пробежать " + maxRun + "м.");
    }
    @Override
    public void jump(){
        System.out.println("Кот по имени " + name + " может прыгнуть на " + maxJump + "м.");
    }
}

