package ru.gb.istomin.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Immortal {
    public static void main(String[] args) {
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

        public static Scanner sc = new Scanner(System.in);
}
