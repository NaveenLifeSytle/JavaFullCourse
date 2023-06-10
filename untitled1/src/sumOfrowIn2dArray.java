public class sumOfrowIn2dArray {
    public static void main(String[] args) {
        int[][] arr=new int[][]{
                {1,34,5},
                {4,67,7},
                {100,50,40}
        };
        System.out.println(SumOfBigRow(arr));


    }
    static int SumOfBigRow(int[][] arr){

        int ans=Integer.MIN_VALUE;

        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;
            }
            if (ans < sum) {
                ans = sum;
            }
        }
        return ans;
    }
}
