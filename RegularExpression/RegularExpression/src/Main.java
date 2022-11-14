import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //java.util.regex  -api

        //classes
        //1) Pattern-comiled representation of regular expression
        //2)Matcher-find(),group(),    interprets pattern
        //3)PatternSyntaxException - unchecked exception

        //where we use it
        //1)chatbot application
        //2)form
        //3)compiler,interpretter,assembler

        //4)tcp protocall


        String sentence="thupparku thuppaya thuppakki thupparku thuppaya thooum mazhai";

      //  Pattern p=new Pattern(); we cant create object like this
        //  -its have a private constructor-  singleton pattern

     Pattern p=   Pattern.compile("thuppar"); //we can use this method in pattern class//ithu compile panni vachikkum

        Matcher m=p.matcher(sentence);//ithu match pannivachi irukkum
int count=0;
        while (m.find()){
            count++;
            System.out.println(m.group() + " starts "+ m.start()+" ends "+m.end());  //thuppar starts 0 ends 7
            //thuppar starts 29 ends 36
        }
        System.out.println("thuppar aapears "+count+" times");//thuppar aapears 2 times
///////////////////////////////////////////////////////////////////////////////////////////////////
        String str="tamilhjh nadhu is good place";
        String find="tamilhjh";
        startWith(str,find);
        System.out.println();
        endWith();
        System.out.println();
        findTwoChar();

    }
    public  static void startWith(String str, String find){

        Pattern p=Pattern.compile("^"+find); // ^ cap or caret symbol ,starts agutha nu sollum
        Matcher m=p.matcher(str);

        while (m.find()){
            System.out.println("Starts with first pos : "+m.start() +" and end with " +(m.end()-1));
        }

    }
    //////////////////////////////////////////////////////////////////////////////////////////
    public  static void endWith(){
        String str="tamil nadhu is the best place";
        Pattern p=Pattern.compile("place$"); // $ Doller  symbol ,end agutha nu sollum
        Matcher m=p.matcher(str);

        while (m.find()){
            System.out.println("start with first pos : "+m.start() +" and end with " +(m.end()-1));
        }

    }
    ////////////////////////////////////////////////////////////

    public  static void findTwoChar(){
        String str="tamil nadhu is the best place";
        Pattern p=Pattern.compile(" t|a"); //
        Matcher m=p.matcher(str);

        while (m.find()){
            System.out.println("start with first pos : "+m.start() );
        }
//output
// start with first pos : 1
//start with first pos : 7
//start with first pos : 14
//start with first pos : 26
    }
///////////////////////////////////////////////////////////////////////////



}
