public class MinVal {
    public static void main(String[] args) {
        int[] arr={10,2,34,22,556,33,44};
        System.out.println(minVal(arr));
        System.out.println(maxVal(arr));
    }
    static int minVal(int[] arr){

            if(arr.length==0){
                return -1;
            }
            int min=Integer.MAX_VALUE;
            for (int i=0; i< arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            return min;
        }

    static int maxVal(int[] arr){

        if(arr.length==0){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        for (int i=0; i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
