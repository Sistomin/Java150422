package ru.gb.istomin.homework3;
//Написать метод, в который передается не пустой одномерный целочисленный массив,
//метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
//массива равны.
//Примеры:
//checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
//checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
//граница показана символами |||, эти символы в массив не входят и не имеют никакого
//отношения к ИЛИ.
//ЧЕСТНО решение не моё, взял чтобы понять как решить, идей не было
public class Task7HW3 {
    public static void main(String[] args) {
        int arr[] = {1,1,1,11,2,1};
        int sumTotal=0;
        for (int i=0; i < arr.length; i++){ // O(arr.length)
            sumTotal += arr[i];
        }
        int sumRight = 0;
        int sumLeft=0;
        for (int i=1; i < arr.length-1; i++) { // O(arr.length)
            sumLeft += arr[i - 1];
            sumRight = sumTotal - arr[i] - sumLeft;
            if (sumRight == sumLeft) {
                System.out.println("\nFound = " + arr[i]);
                System.out.println(i);
                break;
            }
        }
    }
}
