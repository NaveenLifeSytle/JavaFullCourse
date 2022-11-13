package naveen.string.demo;

import java.util.Scanner;

public class StringupperCase {
    public static void main(String[] args) {
//        OddUpperCase();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String word=sc.nextLine();
        oddUpperCase(word);
        //evenUperCase(word);
    }
    public  static void OddUpperCase(){
        String word="hackernaveen";

        char[] words=word.toCharArray();
        for (int i=0;i<words.length;i++){
            if(i%2==0) {
                words[i] = (char) (words[i] - 32);
                System.out.print(words[i]);

            }else {
                System.out.print(words[i]);
            }
        }

    }
    public  static void evenUperCase(String word){


        char[] words=word.toCharArray();
        for (int i=0;i<words.length;i++){
            if(i%2==0) {
                if(words[i]>='a') {
                    System.out.print(words[i]);
                }else {
                    words[i] = (char) (words[i] + 32);
                    System.out.print(words[i]);
                }
            }else {
                if(words[i]>='a') {
                    words[i] = (char) (words[i] - 32);
                    System.out.print(words[i]);
                }else {
                    System.out.print(words[i]);
                }
            }
        }

    }
    public  static void oddUpperCase(String word){

        for (int i=0;i<word.length();i++){
            if(i% 2==0){
                System.out.print(word.substring(i,i+1).toUpperCase());
            }else {
                System.out.print(word.substring(i, i + 1).toLowerCase());
            }
        }
    }
}
