package naveen.string.demo;

public class searchingMethods {
    public static void main(String[] args) {
        String s="naveen";
        //indexOf
        System.out.println( s.indexOf('v'));//2
        System.out.println( s.indexOf("een"));//3
        System.out.println( s.indexOf('n',1));//after index//5
        System.out.println( s.indexOf("en",3));//after index //4
         //lastIndexOf
        System.out.println(s.lastIndexOf("e"));//4
        //remaining  above methods ah last index pottu use pannikkalam.
    }
}
