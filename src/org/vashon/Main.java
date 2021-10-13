package org.vashon;
//scanner
import  java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        //creates scanner
        Scanner scan = new Scanner(System.in);
        //asks for word
        System.out.println("Enter a single word to get it reversed.");
        //creates string called word with next line
        String word = scan.nextLine();
        //creates a new stringbuilder called rev
        StringBuilder rev = new StringBuilder(word);
        //reverses word
        rev.reverse();
        //takes reversed words and makes it a string
        String paliCheck = rev.toString();
        //prints reversed word
        System.out.println("Your word reversed is, " + rev);

        //if character count is greater than 8 prints message
        long totalChar = word.chars().filter(ch -> ch != ' ').count();
            if (totalChar > 8) {
            System.out.println("Wow! That's a big word. A total of " + totalChar + " characters!");
            }

            //checks is starting word is equal to reversed word
            if (word.equals(paliCheck)) {
            System.out.println("You dummy that word is the same backwards!");
            }

        }
    }
