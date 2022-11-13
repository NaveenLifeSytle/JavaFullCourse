package naveen.string.demo;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        vowelsCount();
    }
    public static void vowelsCount() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
       String words= sc.nextLine();
        char[] word=words.toCharArray();
        int count=0;

        for (int i=0;i<word.length;i++){
         switch (word[i]){
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u': count++;


         }
        }

        if(count==0){
            System.out.println("vowewls NOT IN THIS WORD");
            vowelsCount();
        }else
            System.out.println("count of  vowels="+count);
    }
}
