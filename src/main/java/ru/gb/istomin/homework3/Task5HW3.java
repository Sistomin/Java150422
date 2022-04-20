package ru.gb.istomin.homework3;

import java.util.Arrays;

//Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
public class Task5HW3 {
    public static void main(String[] args) {
        int len = 20, initialValue = 7;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
        }
        System.out.print(Arrays.toString(arr));
    }
}
