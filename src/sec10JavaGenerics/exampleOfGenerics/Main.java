package sec10JavaGenerics.exampleOfGenerics;

import com.sun.source.tree.Scope;

public class Main {
    public static void main(String[] args) {
        FootballPlayer brady = new FootballPlayer("Brady");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer messi = new SoccerPlayer("Messi");

        Team fcBarcelona = new Team("FC Barcelona");
        fcBarcelona.addPlayer(brady);
        fcBarcelona.addPlayer(pat);
        fcBarcelona.addPlayer(messi);

        System.out.println(fcBarcelona.numPlayers());
    }
}
