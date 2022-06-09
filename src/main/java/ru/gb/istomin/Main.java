package ru.gb.istomin;
//Необходимо написать два метода, которые делают следующее:
//1) Создают одномерный длинный массив, например:
//static final int SIZE = 10_000_000;
//static final int HALF = size / 2;
//float[] arr = new float[size];
//2) Заполняют этот массив единицами.
//3) Засекают время выполнения: long a = System.currentTimeMillis().
//4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
//5) Проверяется время окончания метода System.currentTimeMillis().
//6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
//
//Для первого метода надо считать время только на цикл расчета:
//
//Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и
//склейки.
public class Main {
    public static void main(String[] args) {
        long startAllTime = System.currentTimeMillis();//метка времени начало
        firstMethod();//вызовы методов
        secondMethod();
        long endAllTime = System.currentTimeMillis();//метка времени  конца
        System.out.println("Main all time: " + (endAllTime - startAllTime) + " ms.");//вывод в консоль времени на работу всей программы
    }

    public static void firstMethod() {//первый метод
        long startTime1 = System.currentTimeMillis();//метка времени до расчета первого метода
        int size = 10_000_000;//объявили переменную (длина массива)
        float[] arr = new float[size];//создаем массив длиной size
        for (int i = 0; i < arr.length; i++) {//заполняем массив
            arr[i] = 1.0f;
        }

        for (int i = 0; i < arr.length; i++) {//сам расчет первого метода
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i
                    / 5) * Math.cos(0.4f + i / 2));
        }
        long endTime1 = System.currentTimeMillis();//метка времени после окончания работы первого метода
        System.out.println("FirstMethod time: " + (endTime1 - startTime1) + " ms.");//вывод в консоль времени работы первого метода
    }

    public static void secondMethod() {//второй метод
        long startTime2 = System.currentTimeMillis();//метка времени расчета до второго метода
        int size = 10_000_000;//длина массива
        int half = size / 2;//половина длины массива
        float[] arr = new float[size];//создаем массив длиной size
        for (int i = 0; i < arr.length; i++) {//заполняем массив
            arr[i] = 1.0f;
        }

        long copyTime = System.currentTimeMillis();//метка времени до разделения на два массива
        float[] leftHalf = new float[half];//создаем 1 массив (левый)
        float[] rightHalf = new float[half];//создаем 2 массив (Правый)
        System.arraycopy(arr, 0, leftHalf, 0, half);//копируем данные в левый массив
        for (int i = 0; i < leftHalf.length; i++) {//расчет для левого массива
            arr[i] = (float) (leftHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i
                    / 5) * Math.cos(0.4f + i / 2));
        }
        System.arraycopy(arr, 5000000, rightHalf, 0, 5000000);//копируем данные в правый массив
        for (int i = 0; i < rightHalf.length; i++) {//расчет для правого массива
            arr[i] = (float) (rightHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i
                    / 5) * Math.cos(0.4f + i / 2));
        }

        long mergedArrayTime = System.currentTimeMillis();//метка времени до соединения массивов (левый + правый)
        float[] mergedArray = new float[size];//создаем массив  (склееваем)
        System.arraycopy(leftHalf, 0, mergedArray, 0, leftHalf.length);//копируем данные из левого массива
        System.arraycopy(rightHalf, 0, mergedArray, leftHalf.length, rightHalf.length);//копируем данные из правого массива
        for (int i = 0; i < mergedArray.length; i++) {//расчет для массива (левый + правый)
            arr[i] = (float) (mergedArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i
                    / 5) * Math.cos(0.4f + i / 2));
        }
        long endTime2 = System.currentTimeMillis();//метка времени после конца работы метода 2
        System.out.println("SecondMethod time: " + (endTime2 - startTime2) + " ms.");
        System.out.println("Copy time: " + (mergedArrayTime - copyTime) + " ms.");
        System.out.println("Merged time: " + (endTime2 - mergedArrayTime) + " ms.");
    }

}



