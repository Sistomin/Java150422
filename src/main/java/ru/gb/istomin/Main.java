package ru.gb.istomin;

import java.util.Random;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.
public class Main {
    public static void main(String[] args) {
Animal[] animals = {
        new Cat("Шкода"),
        new Dog("Дружок"),
        new Cat("Белка"),
        new Dog("Боб"),
        new Cat("Мурзик"),
        new Dog("Шустрый"),
        new Dog("Жучка")
};
        System.out.println("Количество животных " + Animal.getCount() + " шт.");
        System.out.println("Количество котов " + Cat.getCount() + " шт.");
        System.out.println("Количество собак " + Dog.getCount() + " шт.");
        Random random = new Random();
        for (Animal animal : animals) {
            animal.run(random.nextInt(600));
            animal.swim(random.nextInt(20));
        }

    }
}
