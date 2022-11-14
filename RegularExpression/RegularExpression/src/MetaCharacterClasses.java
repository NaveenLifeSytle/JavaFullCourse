import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCharacterClasses {
    public static void main(String[] args) {
      //  String sentence="Tamil Tamilan TamilNadhu600011 $%$^%$#";
     //   Pattern p=Pattern.compile("Tamil");
      //  Pattern p=Pattern.compile("\\s");  //showing spaces - starts 5   starts 13
       // Pattern p=Pattern.compile("\\S"); //space ah thavira ellam
        // Pattern p=Pattern.compile("\\d"); only numbers
        //Pattern p=Pattern.compile("\\D"); digit  ah thavira ellam
      //  Pattern p=Pattern.compile("\\w"); //alpha numeric ,not special char
          //Pattern p=Pattern.compile("\\W"); //not alpha numeric ,only special char and spaces
      String sentence="TamilTamilan TamilanTamil TamilNadhu600011 $%$^%$#";
      //  Pattern p=Pattern.compile("\\bTamil");//tamil nu start agurathu//space ah vachi oru oru word ah pakkum ore word la two times vantha varathu
      //  Pattern p=Pattern.compile("\\bTamil\\b"); // tamil nu start aganum-end aganum-  Tamil starts 0
      //    Pattern p=Pattern.compile("Tamil\\B");// tamil nu start aganum tanil nu end aaga kudathu//Tamil starts 6//Tamil starts 19
        //Pattern p=Pattern.compile("\\GTamil");//Tamil starts 0 //Tamil starts 5  -tamil nu satrt agnum,kuda vara varthaiyum tamil nu irukkanum
        Pattern p=Pattern.compile(".");//for all character
        Matcher m=p.matcher(sentence);
        while (m.find()){
            System.out.println(m.group()+" starts "+ m.start());
        }
    }
}
