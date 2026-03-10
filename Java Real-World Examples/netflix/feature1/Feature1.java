package netflix.feature1;

import java.util.*;

/**
 * When a list of tiles are provided, I must get grouped anagram tiles
 * When one tile is provided, I must get the anagram tiles
 */
public class Feature1 {
    public static void main(String[] args) {
        System.out.println("Feature 1");
        List<String> tiles = Arrays.asList("aabbccddabefz", "aAbbcdcdabeFz", "cdabaAbbcdeFz", "aabbcc", "bbccAa", "aAbAcA");
        String tile = "aabbccd";
        Map<String, Set<String>> vectorMap = new HashMap<>();
        GroupSimilarTiles gt = new GroupSimilarTiles();
        System.out.println("vectorMap-1: "  + vectorMap);
        System.out.println(gt.getGroupedTiles(vectorMap, tiles));
        System.out.println("vectorMap-2: "  + vectorMap);
        System.out.println(gt.getSimilarTiles(vectorMap, tile));
        System.out.println("vectorMap-3: "  + vectorMap);
    }
}