import java.util.*;

public class findALLMissing {
    public static void main(String[] args) {
        int[] arr={2,4,3,5,2,3,1,8,9};
        System.out.println(findAllMisssing(arr));
    }
    static List<Integer> findAllMisssing(int[] arr){
        List<Integer> list=new ArrayList<>();
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
                list.add(j+1);
            }
        }
        return list;
    }
    private static void swap(int[] arr, int max, int index) {
        int temp=arr[max];
        arr[max]=arr[index];
        arr[index]=temp;

    }
}
