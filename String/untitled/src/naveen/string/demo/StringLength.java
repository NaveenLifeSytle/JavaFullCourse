package naveen.string.demo;

public class StringLength {
    public static void main(String[] args) {
        //methods

        //1. length()
        //2. isBlank()
        //3.isEmpty()


        //length()
        String s1 = new String("naveen");
        String s2 = "naveen";

        System.out.println(s1.length());//6
        System.out.println(s2.length());//6

        //isBlank()
        String m1 = "";
        String m2 = "   ";
        String m3="naveen";

        System.out.println(m1.isBlank());//true

        System.out.println(m2.isBlank());//true

        System.out.println(m3.isBlank());//false

        //isEmpty()
       String n1="";//true
       String n2=" ";//false
       String n3="naveen";//false

        System.out.println(n1.isEmpty());

        System.out.println(n2.isEmpty());

        System.out.println(n3.isEmpty());




    }
}
