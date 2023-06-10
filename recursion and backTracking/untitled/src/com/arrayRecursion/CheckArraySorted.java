package com.arrayRecursion;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr={10,11,12,13,15};
        System.out.println(arraySorted(arr));
    }
    static boolean arraySorted(int[] arr){
        return helper(arr,0);
    }

    private static boolean helper(int[] arr, int start) {
        if(start==arr.length-1){
            return true;
        }
      return   arr[start]<arr[start+1] &&  helper(arr,start+1);


    }
}
