public class findMissingLowestPositive {
    public static void main(String[] args) {
        int[] arr={1};
//       int[] arr={1,2,0};
//        int[] arr={6,7,8,9};
        System.out.println(duplicate(arr));
    }

    static int duplicate(int[] nums){

        int i=0;
        while (i< nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[correct] ){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for (int j=0;j< nums.length;j++){
            if(j+1!=nums[j]){
                return j+1;
            }
        }
        return nums.length+1;
    }
    private static void swap(int[] arr, int max, int index) {
        int temp=arr[max];
        arr[max]=arr[index];
        arr[index]=temp;

    }
}
