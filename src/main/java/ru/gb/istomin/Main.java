package ru.gb.istomin;
import java.util.*;
//Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
//вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//Посчитать, сколько раз встречается каждое слово.
//2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
//телефонных номеров. В этот телефонный справочник с помощью метода add() можно
//добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
//учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
//лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
//через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
//справочника.
public class Main {

        public static void main(String[] args) {
            System.out.println("Task1:");
            coincidencesTask();
            System.out.println("");
            System.out.println("Task2:");
            phonebook();
        }

    private static void coincidencesTask() {//Класс по пункту 1, совпадения
        List<String> sity = Arrays.asList(//создаем динамический массив данных (ArrayList)
                "Москва", "Орел", "Сочи", "Новосибирск", "Новокузнецк",
                "Барнаул", "Минск", "Киев", "Кишенев", "Москва",
                "Екатеренбург", "Кемерово", "Томск", "Омск", "Москва",
                "Сочи", "Орел", "Москва", "Новокузнецк", "Новосибирск"
        );

        Set<String> unique = new HashSet<String>(sity);//создаем HashSet из массива, "Класс HashSet служит для создания коллекции, содержащей только уникальные элементы"

        System.out.println("Заданный массив: " + sity.toString());//выводим массив в консоль
        System.out.println("Уникальные слова встречающиеся в массиве: " + unique.toString());//выводим ункальные слова
        System.out.println("С какой частотой стречаются слова в массиве:");//вывод информации
        for (String key : unique) {//цикл для печати зачения и кол-ва повторений
            System.out.println(key + ": " + Collections.frequency(sity, key));
        }
    }



    private static void phonebook() {//класс телефонный справочник
        Directory directory = new Directory();

        directory.add("Иванов", "8999123321");//с помощью метода add добавляем данные фамилия и тел. номер
        directory.add("Петров", "8912155326");
        directory.add("Сидоров", "8917155552");
        directory.add("Рыбаков", "8913455672");
        directory.add("Сидоров", "8999999991");
        directory.add("Иванов", "89911111122");
        directory.add("Степанов", "89923231999");
        directory.add("Петров", "8888123113");
        directory.add("Иванов", "8324325234");

        System.out.println("Иванов" + directory.get("Иванов"));// вывод в конссоль фамилии + привязанные номера к этой фамилии
        System.out.println("Петров" + directory.get("Петров"));
        System.out.println("Сидоров" + directory.get("Сидоров"));
        System.out.println("Рыбаков" + directory.get("Рыбаков"));
        System.out.println("Степанов" + directory.get("Степанов"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();//HashMap ключ "фамилия", значение "тел. номер"
    private List<String> phone_number_list;//динамический массив данных (ArrayList)


    public void add(String name, String phone_number) {//Метод для добаления тел. номера(phone_number), по индексу name(фамилия)
        if (directory_hm.containsKey(name)) {//containsKey проверка есть ли уже такая фамилия, возвращает true
            phone_number_list = directory_hm.get(name);//Получаем элемент списка directory_hm с индексом name
            phone_number_list.add(phone_number);//добавляем номер телефона
            directory_hm.put(name, phone_number_list);//Метод put() используем для добавления пары ключ-значение
        } else {
            phone_number_list = new ArrayList<>();//если фамилия не встречалась, добавляем новые значения
            phone_number_list.add(phone_number);//добавляем номер телефона
            directory_hm.put(name, phone_number_list);//Метод put() используем для добавления пары ключ-значение
        }
    }

    public List<String> get(String name) {
        return directory_hm.get(name);
    }//гетор для получения по фамилии тел. номера

}
