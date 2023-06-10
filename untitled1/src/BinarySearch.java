public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(search(arr,4));
    }
    static int search(int[] arr,int target){

        int s=0;
        int e=arr.length-1;


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
