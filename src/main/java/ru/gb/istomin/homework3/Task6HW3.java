package ru.gb.istomin.homework3;
//Задать одномерный массив и найти в нем минимальный и максимальный элементы
public class Task6HW3 {
    public static void main(String[] args) {
        int arr[] = {20, 1, -7, 10, -15, 40, 7};
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i< arr.length; i++){
           if (arr[i] < min){
             min = arr[i];
           }
           if (arr[i] > max) {
               max = arr[i];
           }
        }
        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);
    }
}
