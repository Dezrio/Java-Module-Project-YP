import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int speed;
        String name;

        Race race = new Race();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++){
            System.out.printf("Введите название машины №%d%n", i);
            name = scanner.next();

            while (true){
                System.out.printf("Введите скорость машины №%d%n", i);
                speed = scanner.nextInt();

                if (speed < 0 || speed > 250)
                    System.out.println("Неправильная скорость");
                else
                    break;
            }

            race.checkLeader(new Automobile(name, speed));
        }

        System.out.printf("Самая быстрая машина: %s%n", race.raceLeader);
    }
}

class Automobile {
    int speed;
    String name;

    public Automobile(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
}

class Race {
    final int time = 24;
    int leaderDistance = 0;
    public String raceLeader = "";

    public void checkLeader(Automobile automobile){
        int automobileDistance = automobile.speed * time;

        if (automobileDistance > leaderDistance)
        {
            leaderDistance = automobileDistance;
            raceLeader = automobile.name;
        }
    }
}