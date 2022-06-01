package ru.gb.istomin;

public class Team {


    private static String teamName = "SupperStars";
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
        return isTeam;
    }

    public void setTeam(boolean team) {
        isTeam = team;
    }

    static Team[] teams = { //массив команды
            new Team("Влад", 150, 3),
            new Team("Степан", 190, 3),
            new Team("Кирилл", 250, 3),
            new Team("Татьяна", 350, 3),
            new Team("Шустрик", 1000, 10)
    };


    static void infoTeam() {// вывод информации о комманде
        System.out.println("Название команды: " + teamName);
        for (Team a : teams) {
            System.out.print(a.getPlayName());
            System.out.print(" Run limit = " + a.getRunLimit());
            System.out.println(" Jump limit = " + a.getJumpLimit());
        }
    }

    static void showResults() {
        for (Team a : teams) {
            if (a.isTeam) {
                System.out.println(a.getPlayName() + " успешно прошел дистанцию ");
            } else {
                System.out.println(a.getPlayName() + " не прошел дистанцию ");
            }
        }


    }
}


