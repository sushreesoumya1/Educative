package netflix.feature8;

import java.util.Stack;

public class ValidateUserSession {

    public boolean validate(int[] pushed, int[] popped){
        Stack<Integer> stack = new Stack<>();
        int popCounter = 0;

        for(int n : pushed) {
            stack.push(n);
            if(popped[popCounter] == n && !stack.isEmpty()){
                stack.pop();
            }
        }

        for(int n : popped){
            if(!stack.isEmpty() && stack.peek() == n){
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
