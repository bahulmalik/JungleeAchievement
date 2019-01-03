package Achivements;

public class BruiserAward implements IAward {


    @Override
    public boolean isEligible(PlayerStats playerStats) {
        return playerStats.getTotalAmountDamageDone() >= 500;
    }

}
