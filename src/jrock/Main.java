package jrock;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("+------------------------------+");
        System.out.println("| === jRock by Jihed Kdiss === |");
        System.out.println("+------------------------------+");
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.print("  > ");
        int choice = input.nextInt();
        int computerChoice = (int)(Math.random() * 10) % 3;
        String[] options = {"Rock", "Paper", "Scissors"};
        System.out.println("Computer choice is: " + options[computerChoice]);
    }
}
