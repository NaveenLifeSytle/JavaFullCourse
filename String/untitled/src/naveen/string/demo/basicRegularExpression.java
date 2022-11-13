package naveen.string.demo;

public class basicRegularExpression {
    public static void main(String[] args) {
        String s= "Naveen chennai";
        System.out.println();
        System.out.println(s.matches("\\w{6} \\w{7}"));//itha word la 8 letter and 8 Spaces irukka nu pakkum;
        ////////////////////////////////////////////////////////////////////////////////////
        //repalce
        System.out.println(s.replace('n','s'));//Navees chessai

       System.out.println(s.replace("Nav","srs"));//srseen chennai
        //////////////////////////////////////////////////////////////

        //replace all
        String work="iam practicing for work";
        System.out.println(work.replaceAll("\\s","-"));//iam-practicing-for-work
        //////////////////////////////////////////////////////////

        //replaceFirst
        System.out.println(work.replaceFirst("\\s","-"));//iam-practicing for work

///////////////////////////////////////////////
        //split
        String h="iam practicing for work";

        String[] words=h.split(" ");
        for(String word:words){
            System.out.println(word);
        }
        //output
        // iam
        //practicing
        //for
        //work
////////////////////////////////////////////////////////

        //split   with count
        String n="iam practicing for work";

        String[] lines=h.split(" ",2);
        for(String word:lines){
            System.out.println(word);
        }
        //output
        // iam
        //practicing for work


////////////////////////////////////////////////////////
  //join

        System.out.println(String.join("-","09","02","1999"));//09-02-1999

     //////////////////////////////////////////////

     //ValueOf
int num=5;
     String str=String.valueOf(num);

        System.out.println(str);
        ///////////////////////////////////

        //contains
        String cn="iam practicing for work";
        System.out.println(cn.contains("for"));

        //////////////////////////////////////





    }
}
