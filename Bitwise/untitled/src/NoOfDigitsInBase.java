public class NoOfDigitsInBase {
    public static void main(String[] args) {
        int n=6;
        int count=0;
        while (n>0){
            int last=n & 1;
            n=n>>1;
            count++;
        }
        System.out.println(count);
    }
}
