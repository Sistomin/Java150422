package ru.gb.istomin.homework2;

public class FirstTaskHM2 {
    public static void main(String[] args) {
                interval(10, 5);
            }
    public static boolean interval(int a, int b){
int sum = a + b;
if (sum > 10 && sum < 20) return true;
    else {
    return false;
}

    }
}
//1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
//в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.