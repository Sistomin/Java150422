package ru.gb.istomin.homework1;

public class TaskThree {
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 10, b = -7, c = (a + b);
        if (c >= 0) {
            System.out.println("The amount is positive");
        } else {
            System.out.println("The sum is negative");
        }
    }
}
