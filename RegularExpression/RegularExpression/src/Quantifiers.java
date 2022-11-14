import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {

        // ? , + , *, {}

        String sentence="abaabbaaabbbbabab";
        /////////////////////////////////////////////////////
       // Pattern p= Pattern.compile("a+");
        //a Strats at 0
        //aa Strats at 2
        //aaa Strats at 6
        //a Strats at 13
        //a Strats at 15
        /////////////////////////////////////////////////////
      //  Pattern p= Pattern.compile("a*");
        //a Strats at 0
        // Strats at 1
        //aa Strats at 2
        // Strats at 4
        // Strats at 5
        //aaa Strats at 6
        // Strats at 9
        // Strats at 10
        // Strats at 11
        // Strats at 12
        //a Strats at 13
        // Strats at 14
        //a Strats at 15
        // Strats at 16
        // Strats at 17
        /////////////////////////////////////////////////////////////////////
      //  Pattern p= Pattern.compile("a?");
        //a Strats at 0
        // Strats at 1
        //a Strats at 2
        //a Strats at 3
        // Strats at 4
        // Strats at 5
        //a Strats at 6
        //a Strats at 7
        //a Strats at 8
        // Strats at 9
        // Strats at 10
        // Strats at 11
        // Strats at 12
        //a Strats at 13
        // Strats at 14
        //a Strats at 15
        // Strats at 16
        // Strats at 17
        /////////////////////////////////////////////////////////////
     //   Pattern p= Pattern.compile("a{2}");
        //aa Strats at 2
        //aa Strats at 6
        ////////////////////////////////////////////////////////

        Pattern p= Pattern.compile("a{1,3}");
        //a Strats at 0
        //aa Strats at 2
        //aaa Strats at 6
        //a Strats at 13
        //a Strats at 15

        Matcher m=p.matcher(sentence);

        while (m.find()){
            System.out.println(m.group()+" Strats at "+ m.start());
        }
    }
}
