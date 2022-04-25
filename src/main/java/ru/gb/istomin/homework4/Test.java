package ru.gb.istomin.homework4;
// посчитай число суммы рандомного массива который загадала Яга
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Ты попал в лес к Бабе Яге!");
        System.out.println("Чтобы пройти дальше ты должен решить задачу...");
        System.out.println("Реши задачу, чему равна сумма всех чисел?");
        int arr[] = new int[5];
        int i, sum = 0;
        for (i = 0; i < arr.length; i++) {
            Random rand = new Random();
            int x = rand.nextInt(10);
            arr[i] = x;
            System.out.print(arr[i] + " ");
            sum = (sum + arr[i]);
        }
        System.out.println(" ");
        //System.out.println(sum); //смотрим сумму чтобы не считать)
        System.out.println("Твой ответ?");
        int number = sc.nextInt();
        if (sum == number){
            System.out.println("Верно, ты угадал! Идем дальше;)");
        }else {
            System.out.println("Яга в бешенстве и съела тебя... Можешь начать заново.");
        }

    }
    public static Scanner sc = new Scanner(System.in);
}
