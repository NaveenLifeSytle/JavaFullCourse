package naveen.string.demo;

public class ComparisionMethos {
    public static void main(String[] args) {

        //equals
        String s1 = new String("java");
        String s2 = new String("java");
        boolean result = s1.equals(s2);
        System.out.println(result);//true
        ///////////////////    //////////////////////////////////////////////////
        //equalIgnoreCase
        String a1 = new String("java");
        String a2 = new String("JAVA");
        boolean results = a1.equalsIgnoreCase(a2);
        System.out.println(results);//true

        ///////////////////    //////////////////////////////////////////////////
        //compareTo
        String b1 = new String("queen");
        String b2 = new String("naveen");
        int out = b1.compareTo(b2);
        System.out.println(out);// possitive

        ///////////////////    //////////////////////////////////////////////////
        //compareToIgnoreCase
        String c1 = new String("Naveen");
        String c2 = new String("naveen");
        int outs = c1.compareToIgnoreCase(c2);
        System.out.println(outs);// neutral
       //////////////////////////////////////////////////////////
       // startsWith
        String aa="naveen";
        System.out.println(aa.startsWith("n"));
        // startsWithpos
        String aaa="naveen";
        System.out.println(aaa.startsWith("v",2));
        ////////////////////////////////////////////////////////

        // endsWith
        String aaaa="naveen";
        System.out.println(aaaa.endsWith("n"));
        //endsWithpos
        String aaaaa="naveen";
        System.out.println(aaaaa.startsWith("v",2));
        ////////////////////////////////////////////////////////
        //contentEquals
        String s=new String("naveen");
        StringBuffer st=new StringBuffer("naveen");

        System.out.println( s.contentEquals(st));
    }
}
