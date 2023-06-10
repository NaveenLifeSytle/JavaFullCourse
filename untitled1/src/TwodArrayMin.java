public class TwodArrayMin {
    public static void main(String[] args) {
        int[][] arr=new int[][]{
                {3,44,55,77,66},
                {35,223,5566,22},
                {5,553},
                {8,1},
                {3,89}
        };

        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    private static int min(int[][] arr) {
        if(arr.length==0){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }

            }
        }
        return  min;
    }
    //
    private static int max(int[][] arr) {
        if(arr.length==0){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }

            }
        }
        return  max;
    }

    //enhanced for loop
    private static int max2(int[][] arr) {
        if(arr.length==0){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }

            }
        }
        return  max;
    }
}
