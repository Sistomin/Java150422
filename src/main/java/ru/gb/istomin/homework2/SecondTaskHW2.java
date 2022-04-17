package ru.gb.istomin.homework2;

public class SecondTaskHW2 {
    public static void main(String[] args) {
        isPositiveOrNegative(15);
    }
    public static void isPositiveOrNegative(int a){
        if (a >= 0){
            System.out.println("Number " + a + " is positive.");
        }else {
            System.out.println("Number " + a + " is negative.");
        }
    }
}
/*Написать метод, которому в качестве параметра передается целое число, метод должен
напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
считаем положительным числом*/