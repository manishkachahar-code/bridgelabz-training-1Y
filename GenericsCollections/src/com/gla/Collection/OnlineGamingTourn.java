package com.gla.Collection;
import java.util.*;

class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }

    public int hashCode() {
        return Objects.hash(name);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Player)) return false;
        Player p = (Player) obj;
        return this.name.equals(p.name);
    }

    public String toString() {
        return name;
    }
}

class Match {
    Player p1, p2;

    public Match(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}

class Result {
    Player winner;
    Player loser;

    public Result(Player winner, Player loser) {
        this.winner = winner;
        this.loser = loser;
    }

    public String toString() {
        return winner + " defeated " + loser;
    }
}

class Score implements Comparable<Score> {
    Player player;
    int points;

    public Score(Player player, int points) {
        this.player = player;
        this.points = points;
    }

    public int compareTo(Score other) {
        if (this.points != other.points) {
            return other.points - this.points;
        }
        return this.player.name.compareTo(other.player.name);
    }

    public String toString() {
        return player + " (" + points + ")";
    }
}
public class OnlineGamingTourn {
    public static void main(String[] args) {

        Set<Player> players = new HashSet<>();

        Player p1 = new Player("Aman");
        Player p2 = new Player("Riya");
        Player p3 = new Player("Karan");

        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(new Player("Aman"));

        Queue<Match> matchQueue = new LinkedList<>();
        matchQueue.add(new Match(p1, p2));
        matchQueue.add(new Match(p2, p3));
        matchQueue.add(new Match(p1, p3));

        List<Result> results = new ArrayList<>();

        Map<Player, Integer> scoreMap = new HashMap<>();
        for (Player p : players) {
            scoreMap.put(p, 0);
        }

        Random rand = new Random();

        while (!matchQueue.isEmpty()) {
            Match m = matchQueue.poll();
            Player winner = rand.nextBoolean() ? m.p1 : m.p2;
            Player loser = (winner == m.p1) ? m.p2 : m.p1;

            results.add(new Result(winner, loser));
            scoreMap.put(winner, scoreMap.get(winner) + 10);
        }

        TreeSet<Score> leaderboard = new TreeSet<>();
        for (Player p : scoreMap.keySet()) {
            leaderboard.add(new Score(p, scoreMap.get(p)));
        }

        System.out.println("Match Results:");
        for (Result r : results) {
            System.out.println(r);
        }

        System.out.println("\nLeaderboard:");
        for (Score s : leaderboard) {
            System.out.println(s);
        }
    }
}
