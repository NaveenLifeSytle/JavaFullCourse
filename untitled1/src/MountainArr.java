public class MountainArr {
    public static void main(String[] args) {
        int arr[]={5,10,11,12,13,14,15,16,20,18,16,14,12,10,8};
        System.out.println(search(arr));
        System.out.println(search2(arr));
    }
    static int search(int[] arr){
        int s=0;
        int e=arr.length-1;

        while (s<=e){
            int mid=s+((e-s)/2);
            if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]){
                e=mid-1;
            } else if (arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1]) {
                s=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    //2nd way
    static int search2(int[] arr){
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
}
