package ru.gb.istomin;

public class MyArrayDataException extends NumberFormatException{
    String s;

    public MyArrayDataException() {
        this.s = s;
        System.out.println("Ввод возможен только целых цифр");
    }


}
