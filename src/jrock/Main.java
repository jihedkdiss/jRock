package jrock;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("+------------------------------+");
        System.out.println("| === jRock by Jihed Kdiss === |");
        System.out.println("+------------------------------+");
        Scanner input = new Scanner(System.in);
        System.out.println("  Please choose:");
        System.out.println("+------------------------------+");
        System.out.println("  1. Rock");
        System.out.println("  2. Paper");
        System.out.println("  3. Scissors");
        System.out.println("+------------------------------+");
        System.out.print("  Your choice: ");
        int choice = input.nextInt();
        System.out.println("+------------------------------+");
        int computerChoice = (int)(Math.random() * 10) % 3;
        computerChoice++;
        String[] options = {"@jihedkdiss", "Rock", "Paper", "Scissors"};
        System.out.println("  Computer choice is: " + options[computerChoice]);
        if (choice == computerChoice) {
            System.out.println("  No one wins!");
            System.out.println("+------------------------------+");
            System.exit(0);
        }
        switch (choice) {
            case 1:
                if(computerChoice == 2) System.out.println("  You lose!");
                else System.out.println("  You win!");
                break;
            case 2:
                if(computerChoice == 3) System.out.println("  You lose!");
                else System.out.println("  You win!");
                break;
            case 3:
                if(computerChoice == 1) System.out.println("  You lose!");
                else System.out.println("  You win!");
                break;
            case 15052004:
                System.out.println("  You found another fazzoura!");
            default:
                System.out.println("  Please choose correctly.");
        }
        System.out.println("+------------------------------+");
    }
}
