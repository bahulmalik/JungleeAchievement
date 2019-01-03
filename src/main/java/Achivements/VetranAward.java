package Achivements;

public class VetranAward implements IAward {


    @Override
    public boolean isEligible(PlayerStats playerStats) {

       return  (playerStats.getTotalGamesPlayed() > 1000);

    }

    @Override
    public String toString() {
        return "Veteran ";
    }
}

