package Achivements;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.String.join;

public class MainGame {
    public static void main(String[] args) {
        MainGame mainGame = new MainGame();
        mainGame.entrypoint();

    }

    // Add more achievement's here to extend
    public static List<IAward> getAwardList() {
        return Arrays.asList(
                new Legend(),
                new SharpShooterAward(),
                new BruiserAward(),
                new VetranAward(),
                new BigWinnerAward());
    }

    private static void showAchievements(final Map<String, List<String>> playerAchievements) {
        String leftAlignFormat = "| %-10s | %-52s |%n";
        System.out.format("+------------+------------------------------------------------------+%n");
        System.out.format("| Player     | Achievement's                                        |%n");
        System.out.format("+------------+------------------------------------------------------+%n");
        playerAchievements.forEach((player, awards) ->
                System.out.format(leftAlignFormat, player, join(", ", awards)));
        System.out.format("+------------+------------------------------------------------------+%n");
    }

    void entrypoint() {

        TreeMap<String,PlayerStats> eachPlayerStatsMap;
        GameWinner gameWinner=new GameWinner();
        AwardCeremony awardCeremony=new AwardCeremony(getAwardList());


       eachPlayerStatsMap=  new GameData().generateTeamWiseData(3);

        System.out.println("calculating Current Game Winner");
        System.out.println("Winner for this match is " + gameWinner.winnerTeamForCurrentMatch(eachPlayerStatsMap));
        System.out.println("Giving Awards to each Player");
         Map<String,List<String>> eachPlayerAward= awardCeremony.awardCalculate(eachPlayerStatsMap);

         showAchievements(eachPlayerAward);


        System.out.println("Successful execution");


    }
}


