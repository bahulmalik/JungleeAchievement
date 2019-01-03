package Achivements;

public class Legend implements IAward {

    @Override
    public boolean isEligible(PlayerStats playerStats) {

        return ((playerStats.getTotalGamesPlayed()>50));

    }
}
