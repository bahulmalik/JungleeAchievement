package Achivements;

import java.util.Map;
import java.util.TreeMap;


public class GameWinner {
    //"team-player"
    // list A = [1,2,3]
    // list B = [2,3,4]
    String winnerTeamForCurrentMatch(TreeMap<String, PlayerStats> eachPlayerStatsMap) {
        if (!(eachPlayerStatsMap.isEmpty())) {
            int totalTeam1 = 0;
            int totalTeam2 = 0;
            for (Map.Entry<String, PlayerStats> entry : eachPlayerStatsMap.entrySet()) {

                String[] split = entry.getKey().split("-");

                if (split[0].equals("team1")) {
                    totalTeam1 = totalTeam1 + entry.getValue().getNumberOfKillInGame();
                } else if (split[0].equals("team2")) {
                    totalTeam2 += entry.getValue().getNumberOfKillInGame();
                }
            }
            if (totalTeam1 > totalTeam2) {
                return "Team 1";

            } else if (totalTeam1 < totalTeam2) {
                return "Team 2";
            } else
                return "Draw";
        }
        return "No Teams Present";
    }

}
