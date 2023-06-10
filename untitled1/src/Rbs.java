public class Rbs {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        System.out.println(pivetWithDuplicate(arr));
        //System.out.println(find(arr,2));
    }
    static int  find(int[]arr, int target){
        int pivet=pivet(arr);

        if(pivet==-1){
            return search(arr,target,0,arr.length-1);
        }
        if(arr[pivet]==target){
            return pivet;
        }
        if (target>=arr[0]) {
         return search(arr, target, 0, pivet - 1);


        }
            return search(arr,target,pivet+1,arr.length-1);

    }
    static int pivet(int[] arr){
        int s=0;
        int e=arr.length-1;

      while(s<e){
          int mid=s+((e-s)/2);
          if (mid<e && arr[mid]>arr[mid+1]){
              return mid;
          }
          if(mid>s && arr[mid]<arr[mid-1]){
              return mid-1;
          }
          if(arr[mid]<=arr[s]){
              e=mid-1;
          }
          else {
              s=mid+1;
          }
      }
      return -1;
    }
    static int search(int[] arr,int target,int s,int e){

        while (s<=e) {
            int mid = s + ((e - s) / 2);
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                    e = mid - 1;
                }
                if (target > arr[mid]) {
                    s = mid + 1;
                }


        }
        return -1;
    }


    //with duplicate
    static int pivetWithDuplicate(int[] arr){
        int s=0;
        int e=arr.length-1;

        while(s<e){
            int mid=s+((e-s)/2);
            if (mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if( arr[mid]<=arr[mid+1] && arr[mid]>=arr[mid-1] ){
                s=mid+1;
            }
            else  if(e>mid && arr[mid]<arr[s]){
                e=mid-1;
            }
        }
        return -1;
    }

}
