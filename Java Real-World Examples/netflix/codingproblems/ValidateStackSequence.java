package netflix.codingproblems;

import java.util.Arrays;
import java.util.Stack;

public class ValidateStackSequence {

    public static void main(String[] args){
        validateStackSequences(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 2, 5, 3, 6, 7, 4});
        validateStackSequences(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 2, 5, 3, 6, 7, 4});
        validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1});
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        System.out.println("pushed: " + Arrays.toString(pushed));
        System.out.println("popped: " + Arrays.toString(popped));

        int popCounter = 0;
        Stack<Integer> sequenceStack = new Stack<>();
        for(int n : pushed){
            sequenceStack.push(n);
            System.out.println("1sequenceStack: " + sequenceStack);
            if(popped[popCounter] == n){
                if(!sequenceStack.isEmpty() && sequenceStack.peek() == n){
                    sequenceStack.pop();
                    popCounter++;
                }
            }
            System.out.println("2sequenceStack: " + sequenceStack);
        }
        for(int n : popped) {
            if(!sequenceStack.isEmpty() && sequenceStack.peek() == n) {
                sequenceStack.pop();
                System.out.println("3sequenceStack: " + sequenceStack);
            }
        }
        return sequenceStack.isEmpty();

    }
}
