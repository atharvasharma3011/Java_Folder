package Project;

import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int myNumber = (int)((Math.random())*100);
    int userNumber = 0;
    do {
        System.out.print("Guess our number (0 to 99): ");
        userNumber = sc.nextInt();

        if (userNumber == myNumber) {
            System.out.println("Wow! Correct Answer");
            break;
        } 
        else if (userNumber > myNumber) {
            System.out.println("Your number is too large! Try another number!...");
        } else {
            System.out.println("Your number is too small! Try another number!...");
        }
    }
    while (myNumber >= 0);
    System.out.println("Our number is: " + myNumber);
}
}
