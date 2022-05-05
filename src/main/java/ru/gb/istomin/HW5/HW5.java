package ru.gb.istomin.HW5;
//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании объекта.
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
//консоль.
//4. Создать массив из 5 сотрудников.
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
//30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
public class HW5 {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Иванов Иван Иванович","Инженер","II@gb.ru",2220001,30000,42);
        empArr[1] = new Employee("Петров Петр Васильевич", "Стажер", "PP2gb.ru", 2220002, 15000, 20);
        empArr[2] = new Employee("Сидоров Степан Павлович", "Менеджер", "SS@gb.ru", 2220000, 50000, 45);
        empArr[3] = new Employee("Людоедова Люся Васильевна", "Помощник", "LL@gb.ru", 2220003, 25000, 25);
        empArr[4] = new Employee("Якина Янна Сергеевна", "Старший Инженер", "YY@gb.ru", 2220005, 35000, 33);
        for (Employee employee : empArr)
            if (employee.getAge()>40)
                System.out.println(employee);
    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private long telephone;
    private int salary;
    private int age;

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public long getTelephone() {
        return telephone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, String position, String email, int telephone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}