package naveen.string.demo;

public class StringReverse {
    public static void main(String[] args) {
        String word ="nan";
        String reverse="";
        for (int i=word.length()-1;i>=0;i--){
             reverse=reverse+word.charAt(i);
        }

        if(word.equals(reverse)){
            System.out.println("polindrome");
        }else {
            System.out.println("not polindrome");
        }
    }
}
