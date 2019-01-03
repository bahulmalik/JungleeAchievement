package Achivements;

public class BruiserAward implements IAward {


    @Override
    public boolean isEligible(PlayerStats playerStats) {
        return playerStats.getTotalAmountDamageDone() >= 500;
    }

    @Override
    public String toString() {
        return "Bruiser";
    }
}
