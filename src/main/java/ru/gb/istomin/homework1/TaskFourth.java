package ru.gb.istomin.homework1;

public class TaskFourth {
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = 5;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value > 0 && value <= 100) {
            System.out.println("yellow");
        }
        if (value > 100) {
            System.out.println("green");
        }
    }
}
/* int переменную value и инициализируйте
ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен
вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100
включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;*/