public class FindElementInMountainArray {
    public static void main(String[] args) {
int[] arr={2,3,4,5,6,7,8,9,10,11,9,8,7,6,5,4,3,1};
        System.out.println(search(arr,3));
    }
    static int search(int[] arr,int target){
        int peak=searchPeakElement(arr);
        if (arr[peak]==target){
            return peak;
        }
        int firstTry=BinarySearch(arr,target,0,peak-1);
        if (firstTry!=-1){
            return firstTry;
        }
       return BinarySearch(arr,target,peak+1,arr.length-1);

    }
    static int searchPeakElement(int[] arr){
        int s=0;
        int e=arr.length-1;

        while (s<e){
            int mid=s+((e-s)/2);
            if(arr[mid]>arr[mid+1] ){
                e=mid;
            }
            else {
                s=mid+1;
            }
        }
        return s;
    }
    static int BinarySearch(int[] arr,int target,int s,int e){

        while (s<=e) {
            int mid = s + ((e - s) / 2);
            if (target == arr[mid]) {
                return mid;
            }

            boolean asc = arr[0] < arr[arr.length-1];

            if (asc) {


                if (target < arr[mid]) {
                    e = mid - 1;
                }
                if (target > arr[mid]) {
                    s = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    e = mid - 1;
                }
                if (target < arr[mid]) {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
