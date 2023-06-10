package recursionBasic;

public class BinarySearchRec {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(binarySearch(arr,5,0,arr.length-1));
    }
static  int binarySearch(int[] arr, int target, int s, int end){
        if(s>end){
            return -1;
        }

        int mid=s+(end-s)/2;
        if(target==arr[mid]){
            return mid;
        } else if (target<arr[mid]) {
         return    binarySearch(arr,target,s,mid-1);
        }
   return binarySearch(arr,target,mid+1,end);
}
}

