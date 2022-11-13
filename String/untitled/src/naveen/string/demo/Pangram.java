package naveen.string.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String word=sc.nextLine();
        String[] words=word.split(" ");
        int count=0;
        for (int i=0;i<words.length;i++) {
          count=  pangram(words[i]);
        }
        if(count==0){
            System.out.println("pangram");
        }
        else {
            System.out.println("not pangram");
        }
    }

   public static int pangram(String word){

        int count=0;
        char temp;

      char[] words=  word.toCharArray();
      //ordering String
      for (int i=0;i<words.length-1;i++){
          for(int j=i+1;j<words.length;j++){
              if(words[i]<words[j]){
                 temp=words[i];
                  words[i]=words[j];
                  words[j]=temp;
              }
          }
      }
//checking repeat or not
       for (int i=0;i<words.length-1;i++){
           for(int j=i+1;j<words.length;j++) {
               if(words[i]==words[j]){
                   count++;
                          }
               }
           }
       return count;
   }
}
