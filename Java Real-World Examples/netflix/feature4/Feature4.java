package netflix.feature4;

import java.util.Arrays;
import java.util.HashMap;

public class Feature4 {

    public static void main(String[] args){
        PopularityAnalysis popularityAnalysis = new PopularityAnalysis();
        int[][] movie_ratings = {
                {1,2,2,3},
                {4,5,6,3,4},
                {8,8,7,6,5,4,4,1}
        };
        for(int[] weeklyPopularityArray : movie_ratings) {
            HashMap<String, Boolean> analysisReportMap =  popularityAnalysis.getTrendAnalysisReport(weeklyPopularityArray);
            System.out.println("weeklyPopularityArray: " + Arrays.toString(weeklyPopularityArray));
            System.out.println("Analysis: " + analysisReportMap);
        }
    }
}
