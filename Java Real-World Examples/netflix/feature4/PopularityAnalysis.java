package netflix.feature4;

import java.util.HashMap;

public class PopularityAnalysis {

    public HashMap<String, Boolean> getTrendAnalysisReport(int[] weeklyPopularityArray){
        HashMap<String, Boolean> trendMap = new HashMap<>();
        boolean increasingTrend = false;
        boolean decreasingTrend = false;
        for(int i = 0; i < weeklyPopularityArray.length - 1; i++){
            if(weeklyPopularityArray[i] < weeklyPopularityArray[i+1]) {
                increasingTrend = true;
            } else if(weeklyPopularityArray[i] > weeklyPopularityArray[i+1]){
                decreasingTrend = true;
            }
        }
        trendMap.put("INCREASING_TREND", increasingTrend);
        trendMap.put("DECREASING_TREND", decreasingTrend);
        trendMap.put("FLUCTUATING", increasingTrend == decreasingTrend);
        return trendMap;
    }
}
