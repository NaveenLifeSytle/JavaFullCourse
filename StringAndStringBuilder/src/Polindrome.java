public class Polindrome {
    public static void main(String[] args) {
        String str="malayalam";
        System.out.println(polindrome(str));

    }
    static boolean polindrome(String str){
        for (int i=0;i< str.length();i++){
            int start=str.charAt(i);
            int end=str.charAt(str.length()-i-1);
            if(start!=end){
                return  false;
            }
        }
      return true;
    }
}
