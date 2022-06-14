package ru.gb.istomin;

//Добавить класс Course (полоса препятствий), в котором будут находиться: массив препятствий,
// метод который будет просить команду пройти всю полосу;
public class Course {

    private Team team;
    private int length;
    private int height;

    public Course(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    static Course[] c = { //массив препятствий
            new Course(100, 2),
            new Course(500, 5)
    };
    // Проходим полосу препятствий
    public void doIt(){

            for (Course c: c) {
                    if (team.getRunLimit() >= length && team.getJumpLimit() >= height){
                        team.setTeam(true);
                        System.out.println(1);
                    } else {
                        team.setTeam(false);
                        System.out.println(2);
                    }
            }
    }
}





