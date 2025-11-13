
//Condition-arrays elements are always in a sorted manner
//Given an sorted array arr[] of integers. Sort the array into a wave-like array(In Place). In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] ..... and so on. If there are multiple solutions, find the lexicographically smallest one.
//
//Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array.

class Solution {
    public void swap(int arr[] , int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    public void sortInWave(int arr[]) {
        // code here
        int i =0;
        while(i<arr.length-1){
            int j = i+1;
            swap(arr,i,j);
            i=i+2;
        }

    }
}
public class Main {

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7};
        Solution S = new Solution();
        S.sortInWave(arr);
        for(int i : arr){
            System.out.println(i);
        }
        }
    }
