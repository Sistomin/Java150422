package ru.gb.istomin;
//Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
//+1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
//(например, в миске 10 еды, а кот пытается покушать 15-20).
//+2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
//удалось покушать (хватило еды), сытость = true.
//+3. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
//наполовину сыт (это сделано для упрощения логики программы).
//+4. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
//потом вывести информацию о сытости котов в консоль.
//+5. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] hungryCats = new Cat[4];
        hungryCats[0] = new Cat("Шкода", 25, false);
        hungryCats[1] = new Cat("Басик", 30, false);
        hungryCats[2] = new Cat("Васька", 35, false);
        hungryCats[3] = new Cat("Мурка", 15, false);


        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < hungryCats.length; i++) {
            if (hungryCats[i].fullCat == false && hungryCats[i].getAppetite() < plate.getFood()){
                hungryCats[i].eat(plate, hungryCats);
                hungryCats[i].fullCat = true;
                System.out.println("Котик " + hungryCats[i].getName() + " покушал " + hungryCats[i].getAppetite() + " еды.");
                plate.info();
                System.out.println("Сытость кота " + hungryCats[i].getName() + " = " + hungryCats[i].fullCat);

            } else {
                System.out.println("Котик " + hungryCats[i].getName() + " не поел!");
                System.out.println("Сытость кота = " + hungryCats[i].fullCat);
                System.out.println("Сколько корма добавить в тарелку?");
                action = sc.nextInt();
                plate.addFood(action);
                plate.info();
            }
        }
        plate.info();
        //System.out.println("Сколько корма добавить в тарелку?");
        //action = sc.nextInt();
        //plate.addFood(action);
        //plate.info();

    }
}


