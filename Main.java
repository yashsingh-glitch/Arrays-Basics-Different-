//Given an array arr[] containing only non-negative integers, your task is to find a continuous
// subarray (a contiguous sequence of elements) whose sum equals a specified value target.
// You need to return the 1-based indices of the leftmost and rightmost elements of this subarray.
// You need to find the first subarray whose sum is equal to the target.

      //  Note: If no such array is possible then, return [-1].
import java.util.*;
class Solution {
    static void subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        int j =0;
        while(i<arr.length-1){
            int sum = 0;
            for(j = i;j<arr.length;j++){

                if(target-sum>=arr[j]){
                    sum=sum+arr[j];
                }
                else{
                    break;
                }
            }
            if(target - sum== 0){
                res.add(i+1);
                res.add(j);
                break;
            }
            i++;
        }
        if(res.isEmpty()){
            res.add(-1);
        }

    }
}

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7};
        Solution S = new Solution();
        S.subarraySum(arr,9);
        }
    }
