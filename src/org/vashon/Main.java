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
        //takes rev and reverses it and prints it
    System.out.println("Your word reversed is, " + rev.reverse().toString());
	//finds number of characters in 'word'
    long totalChar = word.chars().filter(ch -> ch != ' ').count();
    	//if the character count is greater than 8 print fun little easter egg
    if (totalChar > 8) {
    System.out.println("Wow! That's a big word. A total of " + totalChar + " characters!");
    }
    }
}
