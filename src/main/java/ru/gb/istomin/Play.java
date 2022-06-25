package ru.gb.istomin;

public interface Play {

    int getRunLimit();
    int getJumpLimit();
    void setPlay(boolean play);
    boolean isPlay();
    default void run(Road road){
        if (isPlay()){
            if (getRunLimit() >= road.getLength()){
                System.out.println(this + " успешно пробежал " + road);
            } else {
                System.out.println(this + " не пробежал " + road);
                setPlay(false);
            }
        }
    };
    default void jump(Wall wall) {
        if (isPlay()){
            if (getJumpLimit() >= wall.getHeight()){
                System.out.println(this + " успешно перепрыгнул стену высотой " + wall);
            } else {
                System.out.println(this + " не перепрыгнул стену высотой " + wall);
                setPlay(false);
            }
        }
    }




}
