package com.company;
import java.util.Locale;
import java.util.Scanner;
public class PalindromeTriangle {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("How many numbers should we count up to?");
            if (!keyboard.hasNextInt()) {
                System.out.println("Oh no, you have to provide an integer number! Please try again.");
            } else {
                int endNumber = keyboard.nextInt();
                for (int i = 0; i <= endNumber; i++) {
                    int out = i;
                    int count;
                    for (int spaceCount = 0; spaceCount <= endNumber-i; spaceCount++){
                        System.out.print("  ");
                    }
                    for (count = 1; count <= i; count++) {

                        System.out.print(count + " ");
                    }
                    for (count = i-1; count >= 1; count--) {
                        System.out.print(count + " ");
                    }
                    out = count;
                    System.out.println();
                }
                System.out.println("Would you like to make another number pyramid? Type \"yes\" or \"no.\"");
                String keepGoing = keyboard.nextLine();
                if (!keepGoing.toLowerCase(Locale.ROOT).equals("yes") ||
                        !keepGoing.toLowerCase(Locale.ROOT).equals("y")) {
                    break;
                }
            }
        }

    }

}
