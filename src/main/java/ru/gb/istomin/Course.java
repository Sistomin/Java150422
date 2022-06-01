package ru.gb.istomin;

import static ru.gb.istomin.Team.teams;

public class Course {
    private int length;
    //private int height;

    public Course(int length) {
        this.length = length;
        //this.height = height;

    }

    public int getLength() {
        return length;
    }

    Course[] c = {
            new Course(150),
            new Course(200),
            new Course(250),
            new Course(500)
    };
    //Course[] c = new Course[3];
    //Random random = new Random();
    // Создаем полосу препятствий
    //public Course() {
       // Road road1 = new Road(150);
       // Wall wall = new Wall(2);
       /// Road road2 = new Road(400);
       // c[0] = (Course) road1;
       // c[1] = (Course) wall;
       // c[2] = (Course) road2;
    //}
    //Вывод информации о полосе препятствий
   /*public void infoCourse() {
        System.out.println("Длина первой беговой дорожки: " + c.getHeight());
        System.out.println("Высота стены: " + ((Wall) let[1]).getHeight());
        System.out.println("Длина второй беговой дорожки: " + ((Water) let[2]).getLength());
        System.out.println();
    }*/
    // Проходим полосу препятствий
    /*public void passObstacles(Team team){
        for(Animal animal : team.teamAnimal){
            for(Let l : let){
                if(!l.doIt(animal)){
                    animal.setPassing(l.doIt(animal));
                    break;
                }
                animal.setPassing(true);
            }
        }
    }*/
    public void doIt(){
       for (Team team: teams){
           for (Course course : c){
              // if (){

               }

           }
       }


    }





