package netflix.codingproblems;


public class MonotonicArray {

    public static void main(String[] args){

        int[] nums1 = new int[]{1 ,2,3,4};
        System.out.println("nums1: " + isMonotonicArray(nums1));
        int[] nums2 = new int[]{4,3,2,1};
        System.out.println("nums2: " + isMonotonicArray(nums2));
        int[] nums3 = new int[]{4,3,2,3};
        System.out.println("nums3: " + isMonotonicArray(nums3));
    }

    public static boolean isMonotonicArray(int[] arr){


        boolean isAsc = true;
        boolean isDesc = true;
        for(int i=0; i< arr.length - 1; i++ ){
            if(arr[i] > arr[i+1]){
                isAsc = false;
            }
            if(arr[i] < arr[i+1]){
                isDesc = false;
            }
        }
        return (isAsc || isDesc);
    }
}
