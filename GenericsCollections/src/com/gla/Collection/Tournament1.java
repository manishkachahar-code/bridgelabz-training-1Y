package com.gla.Collection;
import java.util.*;

// Team class
class Team implements Comparable<Team> {
    String name;
    int points;

    public Team(String name) {
        this.name = name;
        this.points = 0;
    }

    // For TreeSet sorting (descending points)
    @Override
    public int compareTo(Team other) {
        if (this.points != other.points) {
            return other.points - this.points; // higher points first
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " (" + points + " pts)";
    }
}

// Match class
class Match {
    Team team1, team2;

    public Match(Team t1, Team t2) {
        team1 = t1;
        team2 = t2;
    }
}

// Result class
class Result {
    Team winner;
    Team loser;

    public Result(Team winner, Team loser) {
        this.winner = winner;
        this.loser = loser;
    }

    @Override
    public String toString() {
        return winner.name + " defeated " + loser.name;
    }
}

public class Tournament1 {
    public static void main(String[] args) {

        // 1. Register teams (Set ensures uniqueness)
        Set<Team> teams = new HashSet<>();
        Team t1 = new Team("Team A");
        Team t2 = new Team("Team B");
        Team t3 = new Team("Team C");

        teams.add(t1);
        teams.add(t2);
        teams.add(t3);

        // 2. Schedule matches (Queue)
        Queue<Match> matchQueue = new LinkedList<>();
        matchQueue.add(new Match(t1, t2));
        matchQueue.add(new Match(t2, t3));
        matchQueue.add(new Match(t1, t3));

        // 3. Store results (List)
        List<Result> results = new ArrayList<>();

        Random rand = new Random();

        // Process matches
        while (!matchQueue.isEmpty()) {
            Match match = matchQueue.poll();

            // Random winner simulation
            Team winner = rand.nextBoolean() ? match.team1 : match.team2;
            Team loser = (winner == match.team1) ? match.team2 : match.team1;

            // Update points
            winner.points += 2; // winner gets 2 points

            // Save result
            results.add(new Result(winner, loser));
        }

        // 4. Display results
        System.out.println("Match Results:");
        for (Result r : results) {
            System.out.println(r);
        }

        // 5. Leaderboard (TreeSet sorted)
        TreeSet<Team> leaderboard = new TreeSet<>(teams);

        System.out.println("\nLeaderboard:");
        for (Team t : leaderboard) {
            System.out.println(t);
        }
    }
}
