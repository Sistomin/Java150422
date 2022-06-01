package ru.gb.istomin;

public class Cat implements Play {

    private final String name;
    private final int runLimit;
    private final int jumpLimit;
    private boolean plays;

    public Cat(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.plays = true;
    }

    @Override
    public boolean isPlay() {
        return plays;
    }

    @Override
    public String toString() {
        return "Кот по имени " + name;
    }

    @Override
    public int getRunLimit() {
        return runLimit;
    }

    @Override
    public int getJumpLimit() {
        return jumpLimit;
    }

    public void setPlay(boolean plays) {
        this.plays = plays;
    }
}
