package Achivements;

import java.util.Map;

@FunctionalInterface
public interface IAward {

    boolean isEligible(PlayerStats playerStats);
}
