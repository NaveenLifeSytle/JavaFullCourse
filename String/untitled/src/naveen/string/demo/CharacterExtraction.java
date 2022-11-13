package naveen.string.demo;

public class CharacterExtraction {
    public static void main(String[] args) {
        String s1="naveen_lifestyle";
               //  0123456789
        System.out.println(s1.charAt(1));//n


        /////////////////////////////////////////////////
        char[] s=s1.toCharArray();
        int ch='e';
        int count=0;
        for(int i=0;i<s.length;i++){
            if(s[i]==ch){
                count++;
            }
        }
        System.out.println(count);
        ////////////////////////////////////////////////
        //subString      //returning string
        System.out.println(s1.substring(7));//lifestyle

        System.out.println(s1.substring(7,12));//lifes,  bigin inclusive ,end exclusive
 ////////////////////////////////////////////////////////////////////

        //subSequence //returning char sequence // its doing same of subString


        System.out.println(s1.substring(7,12));//lifes,  bigin inclusive ,end exclusive

    }
}
