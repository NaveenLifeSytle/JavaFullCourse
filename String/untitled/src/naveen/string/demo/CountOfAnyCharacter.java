package naveen.string.demo;

import java.util.Scanner;

public class CountOfAnyCharacter {
    public static void main(String[] args) {
        countSearch();
    }
    public static void countSearch() {
        String words="agilandam";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a char to search:::");
        char search=sc.next().charAt(0);
        char[] word=words.toCharArray();
        int count=0;

        for (int i=0;i<word.length;i++){
            if(search==word[i]){
                count++;
            }

        }

        if(count==0){
            System.out.println("THIS CHAR NOT IN THIS WORD");
            countSearch();
        }else
        System.out.println("count of  character="+count);
    }
}
