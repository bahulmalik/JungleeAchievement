package Achivements;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MainGame {
    public static void main(String[] args) {
        MainGame mainGame = new MainGame();
        mainGame.entrypoint();

    }

    void entrypoint() {

        TreeMap<String,PlayerStats> eachPlayerStatsMap;
        GameWinner gameWinner=new GameWinner();
        AwardCeremony awardCeremony=new AwardCeremony();


       eachPlayerStatsMap=  new GameData().generateTeamWiseData(3);

        System.out.println("calculating Current Game Winner");
        System.out.println("Winner for this match is " + gameWinner.winnerTeamForCurrentMatch(eachPlayerStatsMap));
        System.out.println("Giving Awards to each Player");
        awardCeremony.awardCalculate(eachPlayerStatsMap);


        System.out.println("Successful execution");


    }

}
