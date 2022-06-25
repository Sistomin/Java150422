package ru.gb.istomin;

public class Road implements Trial{
    private int length;

    public Road(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Play play) {
        play.run(this);

    }

    @Override
    public String toString() {
        return "Препятствие беговая дорожка высотой " + length + " м.";
    }

    public int getLength() {
        return length;
    }
}
