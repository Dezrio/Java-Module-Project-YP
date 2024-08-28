public class Race {
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
