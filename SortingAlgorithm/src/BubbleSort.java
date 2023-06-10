import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
      int[] arr={1,-3,0,4,5,2};
    //    int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    static int[] bubbleSort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            int count=0;
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;

                }

                }
            if (count==0){
                return arr;
            }
        }
        return  arr;
    }
}
