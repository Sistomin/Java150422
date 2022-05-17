package ru.gb.istomin;

public class Plate {//класс тарелка
    private int food;//переменная еда

    public Plate(int food) {  //конструктор класса
        this.food = food;
    }

    public int getFood() {    //гетр
        return food;
    }

    public void setFood(int food) {  //сетр
        this.food = food;
    }

    public void decreaseFood(int n) { //пункт 4 ДЗ, кот уменьшает кол-во еды в тарелке
        food -= n;
    }

    public void info() {//метод для вывода в консоль текущего количества еды
        System.out.println("В тарелке осталось еды " + food);
    }

    public void addFood(int action) {//5. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
        if (action >= 0) {
            food = food + action;//добавляем корм в миску
        }
        else {//не даем вычесть еду из миски
            System.out.println("Вы не можете заберать еду из миски");
        }
    }
}


