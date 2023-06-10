public class InfiniteArrayFindElement {
    public static void main(String[] args) {
int[] arr={12,13,14,15,16,17,18,19,20,21,22,23,24};
        System.out.println(find(arr,15));
    }
    static int find(int[] arr,int target){
        int s=0;
        int e=1;
        while (target>arr[e]){
            int temp=e+1;
             e=e+(e-s+1)*2;
             s=temp;
        }
        return binarySearch(arr, target,s,e);

    }
    static int binarySearch(int[] arr,int target,int s,int e){

        while (s<=e) {

               int mid = s + ((e - s) / 2);

               if (target < arr[mid]) {
                    e = mid - 1;
                }
                else if (target > arr[mid]) {
                    s = mid + 1;
                }else {
                    return  mid;
            }

        }
        return -1;
    }
}
