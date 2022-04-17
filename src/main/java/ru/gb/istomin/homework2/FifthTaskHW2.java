package ru.gb.istomin.homework2;

public class FifthTaskHW2 {
    public static void main(String[] args) {
        yearTrue(400);
    }
    public static boolean yearTrue(int year) {
        if (year % 4 == 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        }
        return false;
    }
}
/*Написать метод, который определяет, является ли год високосным, и возвращает boolean
(високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
100-го, при этом каждый 400-й – високосный.
Високосный год всегда делится на 4 без остатка
*/