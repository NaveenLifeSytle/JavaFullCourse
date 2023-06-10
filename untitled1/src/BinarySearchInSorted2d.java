import java.util.Arrays;

public class BinarySearchInSorted2d {
    public static void main(String[] args) {
        int[][] arr=new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int[] ans=search(arr,10);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] search(int[][] arr, int target ) {
        int rs=0;
        int cs=0;
        int ce=arr.length-1;

        while (cs<ce){

            if(arr[rs][ce]==target){
                return new int[]{rs,ce};
            }
            if (rs<arr[0].length-1 && arr[rs][ce]<target) {
                rs++;
            }else {
                int mid=cs+(ce-cs)/2;
                if(arr[rs][mid]<target){
                    cs++;
                } else if (arr[rs][mid]>target) {
                    ce--;
                }
                else {
                    return  new int[]{rs,mid};
                }

            }

        }
        return new int[]{-1,-1};
    }
}
