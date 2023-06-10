import java.lang.reflect.Array;
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr={2,4,5,2,1,6};
        System.out.println(Arrays.toString(setMissmatch(arr)));
    }

    static int[] setMissmatch(int[] arr){

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
              return  new int[] {arr[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }
    private static void swap(int[] arr, int max, int index) {
        int temp=arr[max];
        arr[max]=arr[index];
        arr[index]=temp;

    }
}
