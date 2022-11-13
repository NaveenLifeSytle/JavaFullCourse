package naveen.string.demo;

import java.util.Scanner;

public class printOnlyVowels {
    public static void main(String[] args) {
 print();
    }
    public static void print() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String words = sc.nextLine();
        char[] word = words.toCharArray();
        int count = 0;

        for (int i = 0; i < word.length; i++) {
            switch (word[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.print(word[i]);


            }
        }
    }
    }
