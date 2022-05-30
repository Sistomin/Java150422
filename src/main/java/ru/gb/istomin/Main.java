package ru.gb.istomin;
//1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
//        классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
//        консоль).
//        2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//        должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//        печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//        3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//        этот набор препятствий.
//        4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
//        на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
//        препятствий не идет.
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Васька", 50, 7);
        Human human1 = new Human("Василий", 150, 2);
        Robot robot1 = new Robot("Владлен", 500, 50);
        Cat cat2 = new Cat("Шкода", 25, 5);
        Human human2 = new Human("Иван", 100, 1);
        Robot robot2 = new Robot("Джон", 300, 30);

        Play[] plays = {cat1, cat2, robot1, robot2, human1, human2};

        for (Play play : plays) {
            play.run();
            play.jump();
        }

        Road r1 = new Road(50);
        Road r2 = new Road(200);
        Wall w1 = new Wall(2);
        Wall w2 = new Wall(5);

        Ttrial[] trials = {r1, r2, w1, w2};






    }

    public void ch (){
        Cat cat1 = new Cat("Васька", 50, 7);
        Human human1 = new Human("Василий", 150, 2);
        Robot robot1 = new Robot("Владлен", 500, 50);
        Cat cat2 = new Cat("Шкода", 25, 5);
        Human human2 = new Human("Иван", 100, 1);
        Robot robot2 = new Robot("Джон", 300, 30);

        Play[] plays = {cat1, cat2, robot1, robot2, human1, human2};

        for (Play play : plays) {
            play.run();
            play.jump();
        }

        Road r1 = new Road(50);
        Road r2 = new Road(200);
        Wall w1 = new Wall(2);
        Wall w2 = new Wall(5);

        Ttrial[] trials = {r1, r2, w1, w2};
        for (Play play : plays){
            play.run();
            play.jump();
            for (Ttrial ttrial : trials){
                //if ()

            }
        }
    }
}
