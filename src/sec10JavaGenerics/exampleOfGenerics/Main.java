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

        Team<SoccerPlayer> realMadrid = new Team<>("CF Real Madrid");
        Team<SoccerPlayer> manchesterUnited = new Team<>("Manchester United");

        System.out.println("-----------------------------");
        fcBarcelona.matchResult(manchesterUnited, 0, 0);
        fcBarcelona.matchResult(realMadrid, 2, 0);

        realMadrid.matchResult(manchesterUnited, 0, 3);
        realMadrid.matchResult(fcBarcelona, 1, 4);


    }
}
