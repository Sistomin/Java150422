package ru.gb.istomin.homework3;

import java.util.Arrays;

//Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
public class Task2HW3 {
    public static void main(String[] args) {
      int[] arr = new int[100];
      for (int i = 0; i < arr.length; i++){
    arr[i] = i + 1;
      }
        System.out.println(Arrays.toString(arr));
    }
}
