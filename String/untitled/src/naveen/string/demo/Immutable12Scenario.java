package naveen.string.demo;

public class Immutable12Scenario {

    public static void main(String[] args) {

        //== operator -comparing two values
        //equals method - comparing two object

        //scenario 1

        String a1 = new String("java");//heap
        String a2 = "java";//scp

        if (a1 == a2) {
            System.out.println("==");
        } else {                           // !=
            System.out.println("!=");
        }

        if (a1.equals(a2)) {
            System.out.println("equal");
        } else {                              //equal
            System.out.println("not equal");
        }
/////////////////////////////////////////////////////////////////////////////////////////////////
        //scenario 2

        String b1 = new String("java");//heap
        String b2 = b1;//scp

        if (b1 == b2) {
            System.out.println("==");
        } else {                           // ==
            System.out.println("!=");
        }

        if (b1.equals(b2)) {
            System.out.println("equal");
        } else {                              //equal
            System.out.println("not equal");
        }
/////////////////////////////////////////////////////////////////////////////////////////////////
        //Scenario 3
        String c1 = new String("java");//heap
        String c2 = c1;//scp
        c2 = "java";

        if (c1 == c2) {
            System.out.println("==");
        } else {                           // !=
            System.out.println("!=");
        }

        if (c1.equals(c2)) {
            System.out.println("equal");
        } else {                              //equal
            System.out.println("not equal");
        }
/////////////////////////////////////////////////////////////////////////////////////////////////
        //Scenario 4
        String d1 = new String("java");//heap
        String d2 = d1;//scp
        d1 = "python";

        if (d1 == d2) {
            System.out.println("==");
        } else {                           // !=
            System.out.println("!=");
        }

        if (d1.equals(d2)) {
            System.out.println("equal");
        } else {                              //not equal
            System.out.println("not equal");
        }

/////////////////////////////////////////////////////////////////////////////////////////////////
        //Scenario 5
        String e1 = new String("java");//heap
        String e2 = e1;//scp
        e1 = "python";
        e2 = "python";

        if (e1 == e2) {
            System.out.println("==");
        } else {                           // ==
            System.out.println("!=");
        }

        if (e1.equals(e2)) {
            System.out.println("equal");
        } else {                              // equal
            System.out.println("not equal");
        }


/////////////////////////////////////////////////////////////////////////////////////////////////

        //Scenario 6

        String f1 = new String("java");//heap
        String f2 = f1;//scp
        f1 = new String("python");
        f2=new String("python");

        if (f1 == f2) {
            System.out.println("==");
        } else {                           //!=
            System.out.println("!=");
        }

        if (f1.equals(f2)) {
            System.out.println("equal");
        } else {                              // equal
            System.out.println("not equal");
        }

/////////////////////////////////////////////////////////////////////////////////////////////////
        //Scenario 7

        String g1 = new String("java");//heap
        String g2 = g1;//scp
        g1 = new String("python");
        g2=new String("python");
        String g3=new String(g1);

        if (g2 == g3) {
            System.out.println("==");
        } else {                           //!=
            System.out.println("!=");
        }

        if (g2.equals(g3)) {
            System.out.println("equal");
        } else {                              // equal
            System.out.println("not equal");
        }

/////////////////////////////////////////////////////////////////////////////////////////////////
        //Scenario 8

        String h1 = new String("java");//heap
        String h2 = h1;//scp


        if (h1 == h2) {
            System.out.println("==");
        } else {                           //==
            System.out.println("!=");
        }

        if (h1.equals(h2)) {
            System.out.println("equal");
        } else {                              // equal
            System.out.println("not equal");
        }

/////////////////////////////////////////////////////////////////////////////////////////////////

        //Scenario 9

        String i1 = new String("java");//heap
        String i2 = "java";//scp
        i1=null;


        if (i1 == i2) {
            System.out.println("==");
        } else {                           //!=
            System.out.println("!=");
        }

        if (i2.equals(i1)) {
            System.out.println("equal");
        } else {                              // not equal
            System.out.println("not equal");
        }

//        if (i1.equals(i2)) {
//            System.out.println("equal");
//        } else {                              // null pointer exception
//            System.out.println("not equal");
//        }


/////////////////////////////////////////////////////////////////////////////////////////////////

        //Scenario 10

        String j1 = new String("jav");//heap
        String j2 = "java";//scp
        j1=j1+'a';


        if (j1 == j2) {
            System.out.println("==");
        } else {                           //!=
            System.out.println("!=");
        }

        if (j2.equals(j1)) {
            System.out.println("equal");
        } else {                              // equal
            System.out.println("not equal");
        }
    //////////////////////////////////////////////////////////////////////////////////////
//        //Scenario 11
//
//        String k1 = "jav";//heap
//        String k2 = "java";//scp
//        k1=k1+'a';
//
//
//        if (k1 == k2) {
//            System.out.println("==");
//        } else {                           //!=
//            System.out.println("!=");
//        }
//
//        if (k2.equals(k1)) {
//            System.out.println("equal");
//        } else {                              // equal
//            System.out.println("not equal");
//        }
//        //////////////////////////////////////////////////////////////////////////////////////
        //Scenario 12

        String k1 = "java";//heap
        String k2 = "javajava";//scp
        k1=k1+k1;


        if (k1 == k2) {
            System.out.println("==");
        } else {                           //!=
            System.out.println("!=");
        }

        if (k2.equals(k1)) {
            System.out.println("equal");
        } else {                              // equal
            System.out.println("not equal");
        }
        //////////////////////////////////////////////////////////////////////////////////////
    }
}
