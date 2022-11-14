import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNum{
    public static void main(String[] args) throws FileNotFoundException {

        File file=new File("C:\\Users\\hackerNaveen\\OneDrive\\Desktop\\mobNum.txt");
        Scanner sc=new Scanner(file);
        boolean linePresent= sc.hasNext();
        while (linePresent) {

            String word= sc.next();
            int index=word.lastIndexOf(":");
            String num=word.substring(index+1);

            Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
            Matcher m = p.matcher(num);

            if (m.find())
                System.out.println(num + " is valid mobile number");
            else
                System.out.println(num + " is not valid mobile number");

            linePresent= sc.hasNext();
        }

    }
}
