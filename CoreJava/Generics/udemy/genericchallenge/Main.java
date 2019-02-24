package udemy.genericchallenge;

import udemy.genericspack.FootballPlayer;
import udemy.genericspack.Team;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
    }
}
