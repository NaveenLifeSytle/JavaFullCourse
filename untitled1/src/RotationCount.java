public class RotationCount {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,0,1,2};
        System.out.println(counter(arr));
    }
    static int counter(int arr[]){

return pivetWithDuplicate(arr)+1;
    }
    static int pivetWithDuplicate(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + ((e - s) / 2);
            if (mid < e && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > s && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[mid + 1] && arr[mid] >= arr[mid - 1]) {
                s = mid + 1;
            } else if (e > mid && arr[mid] < arr[s]) {
                e = mid - 1;
            }
        }
        return -1;
    }
}
