package netflix.feature1;

import java.util.*;

public class GroupSimilarTiles {

    private String getVector(String tile){

        tile = tile.toLowerCase();
        int[] alphabetCountArray = new int[26];
        for(char c : tile.toCharArray()){
            alphabetCountArray[c - 'a']++;
        }
        StringBuilder vector = new StringBuilder();
        for (int alphabetCount : alphabetCountArray) {
            vector.append("#").append(alphabetCount);
        }
        return vector.toString();
    }

    private void addTileToMap(Map<String, Set<String>> vectorMap, String tile){

        String vector = getVector(tile);
        Set<String> vectorSet = vectorMap.get(vector);
        if(vectorSet == null){
            vectorSet = new HashSet<>();
        }
        vectorSet.add(tile);
        vectorMap.put(vector, vectorSet);

    }

    public Set<String> getSimilarTiles(Map<String, Set<String>> vectorMap, String tile){
        addTileToMap(vectorMap, tile);
        String vector = getVector(tile);
        return vectorMap.get(vector);
    }

    public List<Set<String>> getGroupedTiles(Map<String, Set<String>> vectorMap, List<String> tiles){

        for(String tile : tiles){
            addTileToMap(vectorMap, tile);
        }
       List<Set<String>> groupedTiles = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : vectorMap.entrySet()) {
            Set<String> tileSet = entry.getValue();
            groupedTiles.add(tileSet);
        }
        return groupedTiles;
    }
}