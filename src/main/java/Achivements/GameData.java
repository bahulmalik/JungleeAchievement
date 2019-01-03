package Achivements;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;


public class GameData {
    TreeMap<String, PlayerStats> eachPlayerStatsMap = new TreeMap<>();

    TreeMap<String, PlayerStats> generateTeamWiseData(int noofTeamMembers) {

        for (int i = 0; i < noofTeamMembers; i++) {

            eachPlayerStatsMap.put("team1-" + "player" + (i + 1), generateData());
        }
        for (int i = 0; i < noofTeamMembers; i++) {
            eachPlayerStatsMap.put("team2-" + "player" + (i + 1), generateData());
        }

        return eachPlayerStatsMap;
    }


    PlayerStats generateData() {
        int min = 1;

        Random random = new Random();
        int numberOfAttemptedAttacks = random.nextInt(55 - min + 1) + min;
        int numberOfHits = random.nextInt(numberOfAttemptedAttacks - min + 1) + min;
        int totalAmountDamageDone = random.nextInt(1000 - min + 1) + min;
        int numberOfKillInGame = random.nextInt(numberOfHits - min + 1) + min;
        int numberOfFirstHit = random.nextInt(numberOfHits - min + 1) + min;
        int numberOfAssists = random.nextInt(numberOfHits - min + 1) + min;
        int numberOfSpellCast = random.nextInt(10 - min + 1) + min;
        int spellCastDamage = random.nextInt(100 - min + 1) + min;
        int timePlayed = random.nextInt(300 - min + 1) + min;
        int totalGamesPlayed = random.nextInt(2000 - min + 1) + min;
        int totalDuration = random.nextInt(timePlayed - min + 1) + min + 1000;
        int totalKill = random.nextInt(numberOfKillInGame - min + 1) + min + 30;
        int totalGamesWinned = random.nextInt(500 - min + 1) + min;


        return new PlayerStats.PlayerStatsBuilder()
                .numberOfAttemptedAttacks(numberOfAttemptedAttacks)
                .numberOfHits(numberOfHits)
                .totalAmountDamageDone(totalAmountDamageDone)
                .numberOfKillInGame(numberOfKillInGame)
                .numberOfFirstHit(numberOfFirstHit)
                .numberOfAssists(numberOfAssists)
                .numberOfSpellCast(numberOfSpellCast)
                .spellCastDamage(spellCastDamage)
                .timePlayed(timePlayed)
                .totalGamesPlayed(totalGamesPlayed)
                .totalDuration(totalDuration)
                .totalKill(totalKill)
                .totalGamesWinned(totalGamesWinned)
                .build();


    }
}