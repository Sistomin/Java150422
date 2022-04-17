package ru.gb.istomin.homework1;

public class SixthTask {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 10, b = -7, c = (a + b);
        if (c >= 0) {
            System.out.println("The amount is positive");
        } else {
            System.out.println("The sum is negative");
        }
    }
    public static void printColor() {
        int value = 5;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value > 0 && value <= 100) {
            System.out.println("yellow");
        }
        if (value > 100) {
            System.out.println("green");
        }
    }
    public static void compareNumbers(){
        int a = 29, b = 30;
        if (a >= b){
            System.out.println("a >= b");
        }
        else{
            System.out.println("a < b");
        }
    }
}
//Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают