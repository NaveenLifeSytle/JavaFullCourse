package naveen.string.demo;

public class PrintOnlyNumbers {
    public static void main(String[] args) {
//        printOnlyNumber();
//        System.out.println();
//        printOnlyNumberRegex();
//        System.out.println();
//        printOnlyAlphabets();
//        System.out.println();
//        printOnlyAlphabetsRegex();
//        System.out.println();
//        itsOnlyHaveNumber();
//        System.out.println();
//        itsOnlyHaveNumberRegex();
//        System.out.println();
//        itsOnlyHaveAlpha();
//        System.out.println();
//        itsOnlyHaveAlphaRegex();
        itsOnlyNumberExceptionHandLing();
    }

    ///////////////////////////////////////////////////////////////////////////////
    public static void printOnlyNumber() {
        String word = "naveen9566hh887714";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= '0') {
                if (word.charAt(i) <= '9') {
                    System.out.print(word.charAt(i));
                }
            }

        }


    }

    ///////////////////////////////////////////////////////////////////////////////
    public static void printOnlyNumberRegex() {
        String word = "naveen9566hh887714";
        System.out.println(word.replaceAll("[a-zA-Z]", ""));
    }

    ///////////////////////////////////////////////////////////////////////////////
    public static void printOnlyAlphabets() {
        String word = "naveen9566hh887714";


        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a') {
                if (word.charAt(i) <= 'z') {
                    System.out.print(word.charAt(i));
                }
            }
            if (word.charAt(i) >= 'A') {
                if (word.charAt(i) <= 'Z') {
                    System.out.print(word.charAt(i));
                }
            }

        }

    }

    ///////////////////////////////////////////////////////////////////////////////
    public static void printOnlyAlphabetsRegex() {
        String word = "naveen9566hh887714";
        System.out.println(word.replaceAll("[0-9]", ""));
    }

    ///////////////////////////////////////////////////////////////////////////////
    public static void itsOnlyHaveNumber() {
        String word = "naveen9566hh887714";
        word = "126363743";

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= '0') {
                if (word.charAt(i) <= '9') {
                    count++;
                }
            }

        }
        if (word.length() == count) {
            System.out.println("yeah its only have a number");
        } else {
            System.out.println("nooo...its have alpha or special char");
        }
    }

    /////////////////////////////////////////////////////////////////////
    public static void itsOnlyHaveNumberRegex() {
        String word = "naveen9566hh887714";
        word = "126363743";

        String words = word.replaceAll("[a-zA-Z]", "");

        if (word.length() == words.length()) {
            System.out.println("yeah its only have a number");
        } else {
            System.out.println("nooo...its have alpha or special char");
        }
    }

    /////////////////////////////////////////////////////////////
    public static void itsOnlyHaveAlpha() {
        String word = "naveen9566hh887714";
        word = "naveen";

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a') {
                if (word.charAt(i) <= 'z') {
                   count++;
                }
            }
            if (word.charAt(i) >= 'A') {
                if (word.charAt(i) <= 'Z') {
                  count++;
                }
            }

            if (word.length() == count) {
                System.out.println("yeah its only have a alphabets");
            } else {
                System.out.println("nooo...its have num or special char");
            }
        }
    }

        /////////////////////////////////////////////////////////////////////
        public static void itsOnlyHaveAlphaRegex() {
            String word = "naveen9566hh887714";
            word = "naveen";

            String words = word.replaceAll("[1-9]", "");

            if (word.length() == words.length()) {
                System.out.println("yeah its only have a alphabets");
            } else {
                System.out.println("nooo...its have num or special char");
            }
        }
        /////////////////////////////////////////////////////////////

    public  static  void itsOnlyNumberExceptionHandLing(){
        String word = "naveen9566hh887714";
word="7676567";
        try{
            int num=Integer.parseInt(word);
            System.out.println(num);
        }catch (Exception e){
            System.out.println("its have some char or ahpha");
        }
    }
}