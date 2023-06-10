public class searchInRange {
    public static void main(String[] args) {
        int[] arr={10,2,34,22,556,33,44};
        System.out.println(linearSearch(arr,22,1,4));
    }
    static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i=start; i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
