package naveen.string.demo;

public class StringDemo {
    public static void main(String[] args) {
         //String is a class and string is a collection of character
        // string is immutable

        //it's a special class
        // specialities

        // normally we create an object like this for all class


        StringDemo sd=new StringDemo();

        //we can also create an object for string like this;

        String string=new String("naveen");

        //string literal

        String s2="naveen"; // we can crete like this

        //----------------------------------------------------------
         //  String string=new String("naveen"); - if we create an object like this its store in heap memory
        //String s2="naveen" -its store in string constant pool(scp inside in the heap memory)

        // + operator act like a concat operator in string
        System.out.println(5 + 10);//15
        System.out.println("5" + "10");  // 510

                //immutable-if we change the value of string new memory reference can be created
        String s1="naveen";
        s1="priti";
        System.out.println(s1);// priti

        String ss2=new String("naveen");
        ss2="priti";
        System.out.println(ss2);// priti



    }

}
