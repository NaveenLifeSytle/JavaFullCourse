public class floorOfTheGivenNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9};
        System.out.println(search(arr,5));
    }
    static int search(int[] arr,int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int s=0;
        int e=arr.length-1;


        while (s<=e) {
            int mid = s + ((e - s) / 2);
            if (target == arr[mid]) {
                return mid;
            }
            else if (target < arr[mid]) {
                e = mid - 1;
            }
            else  {
                s = mid + 1;
            }
        }
        return arr[e];
    }

}
