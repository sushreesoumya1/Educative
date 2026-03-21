package netflix.codingproblems;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args){

        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = {"word", "sword", "drow", "rowd", "iced", "dice"};
        List<List<String>> result = groupAnagrams.execute(strs);
        System.out.println(result);
    }

    private List<List<String>> execute(String[] strs){

        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            addVectorToMap(s, getVector(s), map);
        }
        List<List<String>> resultList = new ArrayList<>();
        for (Map.Entry<String, List<String>> resultMap : map.entrySet()) {
            resultList.add(resultMap.getValue());
        }
        return resultList;
    }

    private String getVector(String s){
        StringBuilder sb = new StringBuilder();
        int[] vectorArray = new int[26];
        for(char c : s.toCharArray()){
            vectorArray[c - 'a']++;
        }
        for(int n : vectorArray){
            sb.append("#").append(n);
        }
        return sb.toString();
    }

    private void addVectorToMap(String word, String vector, HashMap<String, List<String>> map) {
        map.computeIfAbsent(vector, k -> new ArrayList<>()).add(word);
    }

}
