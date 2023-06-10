public class findUnique {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,2,4,5,8,8};


      System.out.println(unique( arr));
    }

    private static int unique(int[] arr) {
        int unique=0;
        for (int num:arr){
            unique = unique^num;
        }
        return unique;
    }
}
