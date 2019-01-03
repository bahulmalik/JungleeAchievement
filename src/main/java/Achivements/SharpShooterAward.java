package Achivements;

public class SharpShooterAward implements IAward {


    @Override
    public boolean isEligible(PlayerStats playerStats) {
        return (playerStats.getNumberOfAttemptedAttacks() * .75) >
                (playerStats.getNumberOfKillInGame() + playerStats.getNumberOfAssists());
    }

    @Override
    public String toString() {
        return "Sharp Shooter";
    }
}
