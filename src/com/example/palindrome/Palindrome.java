package com.example.palindrome;

import java.util.Scanner;

/**
 * Created by kyleofori on 9/15/14.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner palinReader = new Scanner(System.in);
        String palindrome = "";

        System.out.println("Enter the word that you want to check for palindrome-ness.");
        palindrome = palinReader.nextLine(); //count # letters in the word, save that as some integer "i"
        int i = palindrome.length();
        int j = palindrome.length()-1;
        int count = 0;
        System.out.println("This potential palindrome has "+i+" letters...");

        //This is a good time to start using try-catches instead of hasNextInt and NextLine.


        //check if i is the same character as 0
        for ( ; j>=0; j--) {

            if (palindrome.charAt(i-(j+1))==palindrome.charAt(j)) {
                System.out.println(palindrome.charAt(i-(j+1))+"-"+palindrome.charAt(j));
                count++;
            } else {
                break;
            }
        //check if i-1 is the same character as 1
        //and so on...
        }

        if(count==i) {
            System.out.println("This word is a palindrome!");
        } else {
            System.out.println("But this word is not a palindrome.");
        }
        //is the word the same as the reversed word?
    }
}
