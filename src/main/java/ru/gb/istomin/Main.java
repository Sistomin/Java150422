package ru.gb.istomin;

import ru.gb.istomin.Cat;

import static ru.gb.istomin.Animal.catCount;
import static ru.gb.istomin.Animal.dogCount;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
//препятствия. Результатом выполнения действия будет печать в консоль. (Например,
//dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
//кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот", "Мурзик", 150, 0);
        cat.print();
        Cat cat1 = new Cat("Кот", "Басик", 220, 5);
        cat1.print();
        Dog dog = new Dog("Пес", "Боб", 0, 7);
        dog.print();
        Dog dog1 = new Dog("Пес","Друг",550, 20);
        dog1.print();
        Dog dog2 = new Dog("Пес", "Альф", 400, 5);
        dog2.print();
        Cat cat2 = new Cat("Кот", "Tom", 100, 0);
        cat2.print();
        Dog dog3 = new Dog("Пес", "Белка", 50, 5);
        dog3.print();
        System.out.println("Всего котов " + catCount + "шт.");
        System.out.println("Всего собак " + dogCount + "шт.");
        System.out.println("Итого животных " + (catCount+dogCount) + "шт."); //подсчет и вывод всех животных
    }
}