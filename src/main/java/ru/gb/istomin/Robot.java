package ru.gb.istomin;

public class Robot implements Play{
    private String name;
    private int maxRun;
    private int maxJump;
    private boolean success = true;

    public Robot(String name, int maxRun, int maxJump) {
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

    public int getMaxJump() {
        return maxJump;
    }

    public boolean isSuccess() {
        return success;
    }


    @Override
    public void run() {
        System.out.println("Робот по имени " + name + " может пробежать " + maxRun + "м.");
    }

    @Override
    public void jump() {
        System.out.println("Робот по имени " + name + " может прыгнуть на " + maxJump + "м.");
    }
}

