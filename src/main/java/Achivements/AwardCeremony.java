package Achivements;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AwardCeremony {


    Map<String, List<AwardsList>> eachPlayerAwards = new TreeMap<>();
    private SharpShooterAward sharpShooterAward = new SharpShooterAward();
    private BruiserAward bruiserAward = new BruiserAward();
    private VetranAward vetranAward = new VetranAward();
    private BigWinnerAward bigWinnerAward = new BigWinnerAward();
    private Legend legend = new Legend();

    Map<String,List<AwardsList>> awardCalculate(Map<String, PlayerStats> eachPlayerStatsMap) {
        if (!(eachPlayerStatsMap.isEmpty())) {

            for (Map.Entry<String, PlayerStats> entry : eachPlayerStatsMap.entrySet()) {
                List<AwardsList> iAwardList = new ArrayList<>();
                if (sharpShooterAward.isEligible(entry.getValue())) {
                    iAwardList.add(AwardsList.SHARPSHOOTERAWARD);
                }
                if (bruiserAward.isEligible(entry.getValue())) {
                    iAwardList.add(AwardsList.BRUISERAWARD);

                }
                if (vetranAward.isEligible(entry.getValue())) {
                    iAwardList.add(AwardsList.VETERANAWARD);

                }
                if (bigWinnerAward.isEligible(entry.getValue())) {
                    iAwardList.add(AwardsList.BIGWINNERAWARD);
                }
                if (legend.isEligible(entry.getValue())) {
                    iAwardList.add(AwardsList.LEGEND);
                }
                eachPlayerAwards.put(entry.getKey(), iAwardList);

            }

            return eachPlayerAwards;

        }
        return null;
    }
}
