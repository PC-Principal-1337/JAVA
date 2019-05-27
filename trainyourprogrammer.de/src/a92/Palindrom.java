package a92;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){
     
    Scanner scan = new Scanner(System.in);
    System.out.println("Geben sie ein Wort ein:");
    String palindromString = scan.next();
    scan.close();
    StringBuilder palindromStringBuilder = new StringBuilder(palindromString);
     
    if(palindromStringBuilder.reverse().toString().equalsIgnoreCase(palindromString))
        System.out.println( palindromString + " ist ein Palindrom");
    else
        System.out.println( palindromString + " ist kein Palindrom");
     
    }
}
