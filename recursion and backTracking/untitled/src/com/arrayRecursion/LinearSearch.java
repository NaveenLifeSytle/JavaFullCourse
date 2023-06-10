package com.arrayRecursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={10,11,12,12,15};

helper2ArrayList(arr,12,0);
        System.out.println(list);
      //  System.out.println(helper2(arr,15,0));


        System.out.println(helper4ArrayList(arr,12,0));
    }

    public  static boolean linearSearch(int[] arr,int target){
        return helper(arr,target,0);
    }
    private static boolean helper(int[] arr, int target,int index) {
        if(index<arr.length && target==arr[index]){
            return true;
        }
        return index<arr.length && helper(arr,target,index+1);


    }

    private static int helper2(int[] arr, int target,int index) {
        if (index==arr.length){
            return -1;
        }
        if( target==arr[index]){
            return index;
        }else {
            return helper2(arr, target, index + 1);
        }

    }
static ArrayList list=new ArrayList();
    static void helper2ArrayList(int[] arr, int target,int index) {
        if (index==arr.length){
            return;
        }
        if( target==arr[index]){
            list.add(index);
        }
             helper2ArrayList(arr, target, index + 1);


    }
    static ArrayList helper3ArrayList(int[] arr, int target,int index,ArrayList list) {
        if (index==arr.length){
            return list;
        }
        if( target==arr[index]){
            list.add(index);
        }
        return  helper3ArrayList(arr, target, index + 1,list);


    }
    static ArrayList helper4ArrayList(int[] arr, int target,int index) {

        ArrayList list1=new ArrayList<>();
        if (index==arr.length){
            return list1;
        }
        if( target==arr[index]){
            list1.add(index);
        }
         ArrayList ansfromBelow= helper4ArrayList(arr, target, index + 1);
        list1.addAll(ansfromBelow);
        return list1;

    }
}
