import java.util.Arrays;

public class IndexOfFirstAndLastNumber {
    public static void main(String[] args) {
int[] arr={21,21,33,33,33,33,212};
        System.out.println(Arrays.toString(search(arr,33)));
    }

    static int[] search(int[] arr,int target) {
        int[] ans = {-1, -1};
//check for the first occurrence if target is first
        int first=search(arr,target,true);
        int second=search(arr,target,false);
        ans[0]=first;
        ans[1]=second;
        return ans;
    }
   static int search(int[] nums,int target,boolean findStartIndex){
int ans=-1;
        int s=0;
        int e=nums.length-1;
        while (s<=e) {
            int mid = s + ((e - s) / 2);
            if (target < nums[mid]) {
                e = mid - 1;
            }
            else if (target > nums[mid]) {
                s = mid + 1;
            }
            else{
                //potential answer is pound
                ans=mid;
                if(findStartIndex){
                  e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }

        }
        return ans;
    }
}
