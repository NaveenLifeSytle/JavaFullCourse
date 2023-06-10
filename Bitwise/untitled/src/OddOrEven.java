public class OddOrEven {
    public static void main(String[] args) {

     System.out.println( isOdd(8));
    }
    private static boolean isOdd(int num) {
      return (num&1)==1;
    }

}
