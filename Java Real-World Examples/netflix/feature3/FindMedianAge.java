package netflix.feature3;

import java.util.PriorityQueue;

public class FindMedianAge {

    public int getMedianAge(int age, PriorityQueue<Integer> leftMaxQueue, PriorityQueue<Integer> rightMinQueue){
        int median = 0;
        if(!leftMaxQueue.isEmpty() && !rightMinQueue.isEmpty()) {
            int leftSize = leftMaxQueue.size();
            int rightSize = rightMinQueue.size();
            if (leftSize == rightSize) {
                median = (leftMaxQueue.peek() + rightMinQueue.peek()) / 2;
            } else if(leftSize > rightSize){
                median = leftMaxQueue.peek();
            } else {
                median = rightMinQueue.peek();
            }
        } else {
            if(!leftMaxQueue.isEmpty()){
                median = leftMaxQueue.peek();
            } else if(!rightMinQueue.isEmpty()){
                median = rightMinQueue.peek();
            }
        }
        return median;
    }

    public void addAgeStream(int age, PriorityQueue<Integer> leftMaxQueue, PriorityQueue<Integer> rightMinQueue){

        if(leftMaxQueue.isEmpty()){
            leftMaxQueue.add(age);
        } else if(age < leftMaxQueue.peek()){
            leftMaxQueue.add(age);
        } else {
            rightMinQueue.add(age);
        }
        if (leftMaxQueue.size() > rightMinQueue.size() + 1) {
            rightMinQueue.add(leftMaxQueue.poll());
        } else if (rightMinQueue.size() > leftMaxQueue.size() + 1) {
            leftMaxQueue.add(rightMinQueue.poll());
        }
    }
}
