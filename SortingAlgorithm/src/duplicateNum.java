import java.util.ArrayList;
import java.util.List;

public class duplicateNum {
    public static void main(String[] args) {
        int[] arr={1,4,5,2,2,3};
        System.out.println(duplicate(arr));
    }

    static int duplicate(int[] arr){

        int i=0;
        while (i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for (int j=0;j< arr.length;j++){
            if(j+1!=arr[j]){
                return arr[j];
            }
        }
        return arr.length;
    }
    private static void swap(int[] arr, int max, int index) {
        int temp=arr[max];
        arr[max]=arr[index];
        arr[index]=temp;

    }
}
