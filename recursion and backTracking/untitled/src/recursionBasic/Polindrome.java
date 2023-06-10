package recursionBasic;

public class Polindrome {
    public static void main(String[] args) {
        System.out.println(polidrom(1231));

    }
    static boolean polidrom(int number){

        String n=Integer.toString(number);
       return helper(n,0,n.length()-1);
    }
    static  boolean helper(String number,int start,int end){
        if(start>end){
            return true;
        }
        if(number.charAt(start)==number.charAt(end)) {
            return helper(number, start + 1, end - 1);
        }
        return false;
    }
}
