package ru.gb.istomin.homework3;
//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
// если обе сложно). Определить элементы одной из диагоналей можно по следующему
// принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n]
public class Task4HW3 {
    public static void main(String[] args) {
        int x = 1;
        int arr[][] = new int[5][5];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = x;
                System.out.print(arr[i][j] + " ");
                x++;
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j){
                    //arr[i][j] = x;
                    System.out.print(arr[i][j] + " ");
                    //x++;
                }else{
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] + " ");
                    //x++;
                }
            }
            System.out.println();
        }
    }
}
