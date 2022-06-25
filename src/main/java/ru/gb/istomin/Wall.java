package ru.gb.istomin;

public class Wall implements Trial{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Play play) {
        play.jump(this);

    }

    @Override
    public String toString() {
        return "Препятствие стена высотой " + height + " м.";
    }

    public int getHeight() {
        return height;
    }
}
