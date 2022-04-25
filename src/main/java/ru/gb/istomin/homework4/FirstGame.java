package ru.gb.istomin.homework4;

import java.util.Scanner;
import java.util.Random;

public class FirstGame {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Привет, Иван!");
        System.out.println("Добро пожаловать в игру спаси принцессу!!!");
        System.out.println("Преодолевая трудности тебе нужно спасти принцессу от злодеев…");
        System.out.println("Перед тобой три пути: /направо, /прямо и /налево. Куда идем искать принцессу?");
        String input = sc.next();
        System.out.println("Ты пошел " + input);
        if (input.equals("/направо")){
            woman();
            snake();
            immortal();
        }
        if (input.equals("/прямо")){
            System.out.println("Ты попал в болото и пропал... Игра окончена!");
        }
        if (input.equals("/налево")){
            System.out.println("Ты попал в логово разбойников и пропал... Игра окончена!");
        }

    }
    public static void woman() {
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
    public static void snake() {
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
    public static void immortal() {
        System.out.println("Вот ты и добрался до замка с принцессой, но она под охраной Кощея Бессмертного.");
        System.out.println("Как ты помнишь смерть Кощея на конце иглы. Найди смерть Кощея и освободи принцессу.");
        System.out.println("Расположи в верном порядке слова чтобы найти смерть Кощея:");
        System.out.println("1.утка-2.дуб-3.заяц-4.игла-5.сундук-6.яйцо");
        System.out.println("Пиши свой вариант. Удачи в поисках…");
        int dead[] = { 2, 5, 3, 1, 6, 4 };//правельный вариант ответа в форме массива
        int vardead[] = new int[6];//вариант ответа играка, массив
        int win = 0;
        for (int i = 0; i < 6; i++) {//заполняем вариант ответа
            int a = sc.nextInt();
            vardead[i] = a;
            if (dead[i] != a){
                System.out.println("Game Over!!! Кощей победил тебя!");
                break;
            }else {
                System.out.println("Верно так держать ;)");
                win = win + 1;
            }
        }
        if (win == 6){
            System.out.println("Поздравляю ты спас принцессу и победил Кощея! Игра окончена!");
        }
    }



}
