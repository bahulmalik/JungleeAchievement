package Achivements;

public class Legend implements IAward {

    @Override
    public boolean isEligible(PlayerStats playerStats) {

        return ((playerStats.getTotalGamesPlayed()>50));

    }

    @Override
    public String toString() {
        return "Legend";
    }
}
