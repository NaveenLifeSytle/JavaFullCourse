package recursionBasic;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(546));
    }
    static int productOfDigits(int num){
        if(num==0){
            return  1;
        }
        return num%10 * productOfDigits(num/10);
    }
}
