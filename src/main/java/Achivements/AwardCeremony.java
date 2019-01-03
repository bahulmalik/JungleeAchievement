package Achivements;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AwardCeremony {
    private final List<IAward> availableAwards;
    Map<String, List<String>> eachPlayerAwards = new TreeMap<>();

    public AwardCeremony(final List<IAward> availableAwards) {
        this.availableAwards = availableAwards;
    }

    Map<String, List<String>> awardCalculate(Map<String, PlayerStats> eachPlayerStatsMap) {

        eachPlayerStatsMap.forEach((s, playerStats) -> {

            List<String> awardsLists = availableAwards.stream()
                    .filter(award -> award.isEligible(playerStats))
                    .map(Objects::toString)
                    .collect(Collectors.toList());
            eachPlayerAwards.put(s, awardsLists);

        });
        return eachPlayerAwards;
    }
}
