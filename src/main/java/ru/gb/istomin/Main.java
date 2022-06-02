package ru.gb.istomin;
//1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
//подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
//просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
//ячейке лежит символ или текст вместо числа), должно быть брошено исключение
//MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//3 В методе main() вызвать полученный метод, обработать возможные исключения
//MyArraySizeException и MyArrayDataException и вывести результат расчета (сумму элементов,
//при условии что подали на вход корректный массив).
//Заметка: Для преобразования строки к числу используйте статический метод класса Integer:
//Integer.parseInt(сюда_подать_строку);
//Заметка: Если Java не сможет преобразовать входную строку (в строке число криво написано), то
//будет сгенерировано исключение NumberFormatException.
public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {


        /*String[][] checkArray = {//Массив удовлетворяющий всем требованиям
                {"45", "46", "50", "64"},
                {"55", "8", "67", "7"},
                {"99", "93", "11", "12"},
                {"133", "144", "7", "66"}
        };*/

        /*String[][] checkArray = {//массив не удовлетворяет MyArraySizeException
                {"13", "25"},
                {"24", "45"}
        };*/
        String[][] checkArray = {//Массив не удовлетворяет MyArrayDataException
                {"45", "46", "50", "64"},
                {"55", "8", "67", "7"},
                {"99", "93", "11", "12"},
                {"133", "error", "7", "66"}
        };
        changeToIntAndSum(checkArray);
    }

    private static void changeToIntAndSum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int Summ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != 4 && array[i].length != 4) {
                    throw new MyArraySizeException();
                }
                try {
                    Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("В строке номер: " + (i+1) + ", в столбце " + (j+1) + " Введено не число.");
                    throw new MyArrayDataException();
                }
                Summ += Integer.parseInt(array[j][j]);
            }
        }
        System.out.println("Массив удовлетворяем требованиям");
        System.out.println("Сумма всех чисел в массиве равна = " + Summ);
    }
}