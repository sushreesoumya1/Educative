package netflix.feature3;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Feature3 {

    public static void main(String[] args){
        FindMedianAge findMedianAge = new FindMedianAge();
        //int[] ages = {22, 30, 31, 40, 21, 30, 19, 46, 34, 29, 28};
        int[] ages = {15, 20, 35, 40, 10, 25, 30};
        PriorityQueue<Integer> leftMaxQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> rightMinQueue = new PriorityQueue<>();

        for (int age : ages) {
            findMedianAge.addAgeStream(age, leftMaxQueue, rightMinQueue);
            System.out.println("MAX: " + Arrays.toString(leftMaxQueue.toArray()));
            System.out.println("MIN: " + Arrays.toString(rightMinQueue.toArray()));
            int medianAge = findMedianAge.getMedianAge(age, leftMaxQueue, rightMinQueue);
            System.out.println("age: " + medianAge);
        }
    }
}
