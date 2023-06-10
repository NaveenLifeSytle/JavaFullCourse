import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] ={6,7,3,1,0,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void sort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }

    }

    private static void swap(int[] arr, int j, int k) {

        int temp=arr[j];
        arr[j]=arr[k];
        arr[k]=temp;
    }
}
