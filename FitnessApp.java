/*
 *Ferdinand Roche
  *K63-11550-2024
  *Program to calculate the fitness level based on the number of steps taken
 */

import java.util.Scanner;

public class FitnessApp {

  
    public static String getFitnessLevel(int steps) {
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000) {
            return "Good";
        } else if (steps >= 4000) {
            return "Average";
        } else {
            return "Poor";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter your steps for today: ");
        int steps = scanner.nextInt();

        
        String level = getFitnessLevel(steps);

        
        System.out.println("Your fitness level: " + level);

        scanner.close();
    }
}
