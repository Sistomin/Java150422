package ru.gb.istomin;

public class Cat {  //класс кот
    private String name; //объявили имя кота
    private int appetite;  //объявили аппетит кота
    public boolean fullCat;  //перевенная типа boolean, сытость кота
    public Cat(String name, int appetite, boolean b){//конструктор класса
        this.name = name;
        this.appetite = appetite;
        this.fullCat = fullCat;
    }

    public String getName() {   //гетр имени кота
        return name;
    }

    public int getAppetite() { //гетор аппетита
        return appetite;
    }

    public void eat(Plate p) {//пункт 4 ДЗ, кот уменьшает кол-во еды в тарелке
        p.decreaseFood(appetite);
    }

}
