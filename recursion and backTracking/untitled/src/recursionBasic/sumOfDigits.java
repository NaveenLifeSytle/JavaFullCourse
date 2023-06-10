package recursionBasic;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(145));
    }
    static int sumOfDigits(int num){
        if(num==0){
            return  num;
        }
        return num%10+sumOfDigits(num/10);

    }
}
