package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

        System.out.println("type some letter");

        String letter = scanner.next();

        switch(letter) {
            case "a", "A":
            case "e", "E":
            case "i", "I":
            case "o", "O":
            case "u", "U":
                System.out.println("Vowel " + letter);
                break;


            default:
                System.out.println("consonant " + letter)
            ;
        }



    }
}
