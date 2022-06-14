package ru.gb.istomin;
//Добавить класс Team, который будет содержать: название команды, массив из 4-х участников (т.е. в конструкторе можно
// сразу всех участников указывать), метод для вывода информации о членах команды прошедших дистанцию, метод вывода
// информации обо всех членах команды.
public class Team {

    private String teamName = "SupperStars";
    private String playName;
    private int runLimit;
    private int jumpLimit;
    private boolean isTeam;

    public Team(String playName, int runLimit, int jumpLimit) {
        this.playName = playName;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.isTeam = true;
    }

    public String getPlayName() {
        return playName;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public boolean isTeam() {
        return true;
    }

    public void setTeam(boolean team) {
        isTeam = team;
    }

    Team[] teams = { //массив команды
            new Team("Кот Влад", 150, 2),
            new Team("Человек Степан", 190, 3),
            new Team("Человек Татьяна", 350, 3),
            new Team("Робот Шустрик", 1000, 10)
    };


    void infoTeam() {// вывод информации о комманде
        System.out.println("Название команды: " + teamName);
        for (Team team : teams) {
            System.out.print(team.getPlayName());
            System.out.print(" Run limit = " + team.getRunLimit());
            System.out.println(" Jump limit = " + team.getJumpLimit());
        }
    }

    void showResults() {//метод о прошедших испытание
        for (Team team : teams) {
            if (team.isTeam) {
                System.out.println(team.getPlayName() + " успешно прошел дистанцию ");
            } else {
                System.out.println(team.getPlayName() + " не прошел дистанцию ");
            }
        }


    }
}


