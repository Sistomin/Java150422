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
    private static final int SIZE = 10000000;
    private static final int HAFL = SIZE / 2;

    public static void main(String[] args) {
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1.0f;
        }

        firstMethod(arr);
        secondMethod(arr);

    }
    static class MyThread extends Thread {
        private float[] arr;

        MyThread(String name, float[] arr) {
            super(name);
            this.arr = arr;
        }

        @Override
        public void run() {
            calculate();
        }

        private void calculate() {
            for (int i = 0; i < HAFL; i++) {
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));
            }
        }

}
    private static void firstMethod(float[] arr) {
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long oneTime = System.currentTimeMillis() - start1;

        System.out.println("Время выполнения при однопоточном вычислении: " + oneTime);
    }

    private static void secondMethod(float[] arr) {
        long start2 = System.currentTimeMillis();//точка вренени старта

        float[] leftHalf = new float[HAFL];//созданм два массива левый и правый

        float[] rightHalf = new float[HAFL];

        System.arraycopy(arr, 0, leftHalf, 0, HAFL);//копируем значения в массивы из большого массива
        System.arraycopy(arr, HAFL, rightHalf, 0, HAFL);

        MyThread leftThread = new MyThread("leftHalf", leftHalf);//объявляем потоки
        MyThread rightThread = new MyThread("rightHalf", rightHalf);

        leftThread.start();//запускаем потоки
        rightThread.start();

        try {
            leftThread.join();//останавливаем потоки по завершению
            rightThread.join();
        } catch (InterruptedException e) {//отлавливаем исключение InterruptedException (позволяет прервать поток уже выполняющий блокирующий вызов)
            e.printStackTrace();
        }

        float[] mergedArray = new float[SIZE];//слееваем массив, объявляем новый массив

        System.arraycopy(leftHalf, 0, mergedArray, 0, HAFL);//копируем левую часть в массив mergedArray
        System.arraycopy(rightHalf, 0, mergedArray, leftHalf.length, rightHalf.length);//копируем правую часть в массив mergedArray

        long twoTime = System.currentTimeMillis() - start2;//конечная точка времени второго метода

        System.out.println("Время выполнения при многопоточном вычислении: " + twoTime);
    }
}
