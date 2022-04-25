package ru.gb.istomin.homework4;
// Рыба игры со Змеем, сравниваем две суммы рандомных массивов
import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ты попал в пещеру к Змею Горынычу. Чтобы пройти дальше ты должен его победить.");
        System.out.println("Чтобы начать бой введи 1, чтобы бежать 2.");
        int battle = sc.nextInt();
         if (battle == 2) {
            System.out.println("В момент бегства Змей испепилил тебя. Game Over!");
        } else {
            int arr[] = new int[6];
            int sumsnake = 0, sumhuman = 0;
            for (int i = 0; i < arr.length; i++) {
                Random rand = new Random();
                int x = rand.nextInt(2);
                arr[i] = x;
                //System.out.print(arr[i] + " "); //массив ударов змея
                sumsnake = (sumsnake + arr[i]);
            }
            System.out.println(" ");
            System.out.println("Змей ударил " + sumsnake + " раз/раза");
             for (int j = 0; j < arr.length; j++) {
                 Random rand = new Random();
                 int x = rand.nextInt(2);
                 arr[j] = x;
                 //System.out.print(arr[j] + " "); //массив ударов Ивана
                 sumhuman = (sumhuman + arr[j]);
             }
             System.out.println(" ");
             System.out.println("Ты успел ударить " + sumhuman + " раз/раза");
             if (sumhuman >= sumsnake){
                 System.out.println("Ты победил Змея. Продолжаем путь)))");
             } else {
                 System.out.println("Ты пал в не равном бою. Змей празнует победу. Game Over!");
             }
        }

    }
}