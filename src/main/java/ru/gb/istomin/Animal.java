package ru.gb.istomin;

public class Animal {
    public static int catCount = 0; //объявил статическую переменную для подсчета котов
    public static int dogCount = 0; //объявил статическую переменную для подсчета псов
    private String type;
    private String name;
    private int run;
    private int swim;


    public Animal(String type, String name, int run, int swim) {
        this.type = type;
        this.name = name;
        this.run = run;
        this.swim = swim;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public void print() {
        if (type == "Кот"){
            if (swim > 0){
                System.out.println("Кот " + name + " не умеет плавать;)");
            }
            if (run >= 200){
                System.out.println("Кот " + name + " не может пробежать более 200м.");
            }
            if (run < 200){
                System.out.println("Кот " + name + " пробежал " + run + "м.");
            }
            if (swim == 0){
                System.out.println("Кот " + name + " не плавает и это верно!");
            }
        }
        if (type == "Пес"){
            if (swim > 10){
                System.out.println(type + " " + name + " не может проплыть больше 10м.");
            }
            if (run >= 500){
                System.out.println(type + " " + name + " не может пробежать более 500м.");
            }
            if (run < 500){
                System.out.println(type + " " + name + " пробежал " + run + "м.");
            }
            if (swim <= 10){
                System.out.println(type + " " + name + " проплыл " + swim + "м.");
            }
        }

    }

}
