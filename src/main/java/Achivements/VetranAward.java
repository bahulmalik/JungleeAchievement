package Achivements;

public class VetranAward implements IAward {


    @Override
    public boolean isEligible(PlayerStats playerStats) {

        if (playerStats.getTotalGamesPlayed() > 1000) {
            return true;
        }
        return false;
    }

}

