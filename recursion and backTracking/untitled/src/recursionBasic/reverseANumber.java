package recursionBasic;

public class reverseANumber {
    public static void main(String[] args) {
        System.out.println(reverse2(324));

    }
    static int sum=0;

    static void reverse(int num){
        if(num==0){
            return;
        }
        int rem=num%10;
        sum=sum*10+rem;
        reverse(num/10);
    }

    static int reverse2(int num){

        int digits=(int)Math.log10(num)+1;
        return helper(num,digits);
    }

    private static int helper(int num, int digits) {
        if(num%10==num){
            return num;
        }
        int rem=num%10;
        return  rem* (int) Math.pow(10,digits-1)+helper(num/10,digits-1);
    }

}
