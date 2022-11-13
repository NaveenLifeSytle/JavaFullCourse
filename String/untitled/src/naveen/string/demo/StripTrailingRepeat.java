package naveen.string.demo;

import java.util.Locale;

public class StripTrailingRepeat {

    public static void main(String[] args) {
        //string is immutable
         String s1="Naveen Chennai ";

        System.out.println(s1);//Naveen Chennai
        ////////////////////////////////////
        //lowerCase
        System.out.println(s1.toLowerCase());//naveen chennai
        System.out.println(s1);//Naveen Chennai
        /////////////////////////////////////////////////
        //upperCase
        System.out.println(s1.toUpperCase());//NAVEEN CHENNAI
        System.out.println(s1);//Naveen Chennai
        /////////////////////////////////////////////////
        //length
        System.out.println(s1.length());//15

        /////////////////////////////////////////////////

        //length
        System.out.println(s1.length());//15

        /////////////////////////////////////////////////
       //Strip  // only ascii

        String s=" Naveen Chennai ";
        System.out.println(s.length());//16
        String a=s.strip();
        System.out.println(a);//Naveen Chennai
        System.out.println(a.length());//14
        /////////////////////////////////////////////
        //trim    for ascii and unicode

        String s4=" Naveen Chennai ";
        System.out.println(s4.length());//16
        String a4=s4.trim();
        System.out.println(a4);//Naveen Chennai
        System.out.println(a4.length());//14
        /////////////////////////////////////////////
         //strip leading
        System.out.println(s4.stripLeading());//Naveen Chennai  //start la irkkura space ah remove pannum
        //stripTrailing

        System.out.println(s4.stripTrailing());//Naveen Chennai  //end la irkkura space ah remove pannum
        /////////////////////////////////////////////////
        //repeat
        System.out.println(s.repeat(2));//Naveen Chennai  Naveen Chennai
        System.out.println(s.indent(20));//                     Naveen Chennai-creating a space in biggining


    }
}
