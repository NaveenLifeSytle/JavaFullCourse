package naveen.string.demo;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {

//        String[] name={"naveen","priya","vijay"};
//
//        StringBufferAndStringBuilder sbt=new StringBufferAndStringBuilder();
//        sbt.join(name);
        stringBufferMethods();
    }

    private void join(String[] name) {
        String sentence = "";
        StringBuffer sb = new StringBuffer("");

        for (String s : name) {
            sentence = sentence + name;
            System.out.println("String " + sentence.hashCode());//String -1301721631 String 1950675010 String 1702831907
            sb.append(s);
            System.out.println("String Buffer " + sb.hashCode());//String Buffer 2065951873 String Buffer 2065951873 String Buffer 2065951873
        }
    }
        public static  void stringBufferMethods(){
//thread safe //all methods are synchronized
        StringBuffer sb=new StringBuffer("naveen");

        //append
            System.out.println( sb.append(" A"));//naveen A

            ////////////////////////////////////////////////////////////
            //insert
            System.out.println(sb.insert(6,'.'));//naveen. A
            ////////////////////////////////
            System.out.println(sb.replace(6,8," "));//naveen A
            ///////////////////////////////
            System.out.println(sb.reverse()); //A neevan

        }

    public static  void stringBuilderMethods(){

        //not threadsafe
        //all methods are not synchronized
        StringBuilder sb=new StringBuilder("naveen");

        //append
        System.out.println( sb.append(" A"));//naveen A

        ////////////////////////////////////////////////////////////
        //insert
        System.out.println(sb.insert(6,'.'));//naveen. A
        ////////////////////////////////
        System.out.println(sb.replace(6,8," "));//naveen A
        ///////////////////////////////
        System.out.println(sb.reverse()); //A neevan

    }



}
