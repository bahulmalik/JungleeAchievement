package Achivements;

public class BigWinnerAward implements IAward {


    @Override
    public boolean isEligible(PlayerStats playerStats) {
        return playerStats.getTotalGamesWinned() > 200;
    }

    @Override
    public String toString() {
        return " Big Winner";
    }
}
