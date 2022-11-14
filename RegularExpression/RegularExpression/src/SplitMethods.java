import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitMethods {
    public static void main(String[] args) {
        //string split
        //pattern split
//string split
        String sentence="Naveen Chennai Tamil Nadu";
     String str="www.google.com";
//      String[] s=  str.split("\\.");
//
//        for (String st:s){
//            System.out.println(st);
//        }
        //pattern split
        Pattern p= Pattern.compile("\\.");
       String[] m=p.split(str);
       for (String st:m){
           System.out.println(st);
       }


    }
}
