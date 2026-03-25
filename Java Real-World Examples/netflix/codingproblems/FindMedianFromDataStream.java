package netflix.codingproblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianFromDataStream {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    public static void main(String[] args){
        FindMedianFromDataStream findMedian = new FindMedianFromDataStream();
        findMedian.add(1);
        System.out.println(findMedian.find());
        findMedian.add(2);
        System.out.println(findMedian.find());
        findMedian.add(3);
        System.out.println(findMedian.find());
        findMedian.add(4);
        System.out.println(findMedian.find());


    }
    public void add(int n){
        if(minHeap.isEmpty()){
            minHeap.add(n);
        } else {
            if (n >= minHeap.peek()) {
                minHeap.add(n);
            } else {
                maxHeap.add(n);
            }
        }

        if(minHeap.size() + 1 < maxHeap.size()){
            minHeap.add(maxHeap.poll());
        } else if(maxHeap.size() + 1 < minHeap.size()){
            maxHeap.add(minHeap.poll());
        }

        System.out.println(maxHeap + "-" + minHeap);
    }
    public double find(){
        if(minHeap.size() > maxHeap.size()){
            return minHeap.peek();
        } else if(minHeap.size() < maxHeap.size()) {
            return maxHeap.peek();
        } else {
            double mean = (minHeap.peek() + maxHeap.peek());
            return mean/2;
        }
    }
}
