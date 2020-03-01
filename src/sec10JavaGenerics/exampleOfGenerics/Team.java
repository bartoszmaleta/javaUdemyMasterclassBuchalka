package sec10JavaGenerics.exampleOfGenerics;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {
//public class Team<T extends Player & Coach & Manager> {
    // class first, then interfaces (Player - class, Coach and Manager - Interfaces
    private String name;
    private int playedGames = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private List<T> members = new ArrayList<>();


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        playedGames++;
        // Saves result for actual team and opoonent team!!!
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 3) + tied;
    }
}
