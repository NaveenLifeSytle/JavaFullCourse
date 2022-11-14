import java.util.StringTokenizer;
public class StringTokenizerDemo{
    public static void main(String[] args) {
      //  StringTokenizer st=new StringTokenizer("naveen chennai"); // default delimiter space
      //  StringTokenizer st=new StringTokenizer("www.google.com",".");
       // StringTokenizer st=new StringTokenizer("www-google-com","-");
        StringTokenizer st=new StringTokenizer("www-google-com","-",true);
        System.out.println("count of tokens "+st.countTokens());
while (st.hasMoreTokens()){
    System.out.println(st.nextToken());
}
    }
}
