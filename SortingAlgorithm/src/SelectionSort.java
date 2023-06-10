import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
int[] arr={4,9,2,1,7,5,0};

selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            int max=max(arr,0,arr.length-i-1);
            int index=arr.length-i-1;
            swap(arr,max,index);
        }

    }

    private static void swap(int[] arr, int max, int index) {
        int temp=arr[max];
        arr[max]=arr[index];
        arr[index]=temp;

    }

    private static int max(int[] arr, int start, int last) {
        int max= start;
        for (int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return  max;
    }

}
