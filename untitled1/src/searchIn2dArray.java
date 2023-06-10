public class searchIn2dArray {
    public static void main(String[] args) {
        int[][] arr=new int[][]{
                {3,44,55,77,66},
                {35,223,5566,22},
                {5,553},
                {8},
                {3,89}
        };

        System.out.println(search(arr,5));

    }

    private static boolean search(int[][] arr, int target) {
        if(arr.length==0){
            return false;
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                if(arr[i][j]==target){
                    return  true;
                }

            }
        }
        return  false;
    }
}
