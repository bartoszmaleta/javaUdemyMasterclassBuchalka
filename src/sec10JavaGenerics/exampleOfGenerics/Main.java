package sec10JavaGenerics.exampleOfGenerics;

import com.sun.source.tree.Scope;

public class Main {
    public static void main(String[] args) {
        FootballPlayer brady = new FootballPlayer("Brady");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer messi = new SoccerPlayer("Messi");

        Team<SoccerPlayer> fcBarcelona = new Team<>("FC Barcelona");
//        fcBarcelona.addPlayer(brady);
//        fcBarcelona.addPlayer(pat);
        fcBarcelona.addPlayer(messi);

        System.out.println(fcBarcelona.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<FootballPlayer> footballTeam = new Team<>("New England Patriots");
        footballTeam.addPlayer(brady);

    }
}
