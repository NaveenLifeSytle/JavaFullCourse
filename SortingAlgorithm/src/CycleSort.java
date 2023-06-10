import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr= {3,5,2,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cycleSort(int[] arr) {
   int i=0;
   while (i< arr.length){
       int correct=arr[i]-1;
       if(arr[i]!=arr[correct]){
           swap(arr,i,correct);
       }else {
           i++;
       }
   }
    }

    private static void swap(int[] arr, int max, int index) {
        int temp=arr[max];
        arr[max]=arr[index];
        arr[index]=temp;

    }
}
