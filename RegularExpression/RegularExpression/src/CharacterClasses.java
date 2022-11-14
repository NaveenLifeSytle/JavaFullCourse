import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClasses {
    public static void main(String[] args) {

        String sentence="abcbcacabaaabbc#$&";

      //  Pattern p=Pattern.compile("abc"); //abc- one time-ithu mathiri kodhutha abc nu evlo vatti irukkunu print pannum
       // Pattern p=Pattern.compile("[abc]");//ithukku meaning A or b or c -irukkanu pakkum
        //Pattern p=Pattern.compile("[^ab]");//nama ipdi kodhutha ab ah thavira ennalm irukko athulam print agum
       // Pattern p=Pattern.compile("[a-z]");//nama kodukkura sentence la lowercase letters mattum print agum only alphabets
       // Pattern p=Pattern.compile("[A-Z]");//nama kodukkura sentence la Uppercase letters mattum print agum only alphabets
        //Pattern p=Pattern.compile("[a-zA-Z]");//nama kodukkura sentence la lowercase and uppercase letters mattum print agum only alphabets
       // Pattern p=Pattern.compile("[0-9]");//only numbers
      //  Pattern p=Pattern.compile("[a-zA-Z0-9]");//number and alphabets only
        Pattern p=Pattern.compile("[^a-zA-Z0-9]");//special character only
        Matcher m=p.matcher(sentence);
        while (m.find()){
            System.out.println(m.group());
        }
    }

}
