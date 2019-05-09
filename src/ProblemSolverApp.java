import Problems.*;
import Problems.NumericProblems.*;
import Problems.ProbabilityProblems.CombinatoricsCalculator;
import Problems.ProbabilityProblems.ProbabilityProblem;
import Problems.SortingProblems.*;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemSolverApp {
    private static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        printInstructions();

        boolean oneMoreRound;
        do {
            Problem problem = problemFromUserInput();
            if (problem == null){
                System.out.println("Sorry, I didn't really get that. Please input the number of the Problem solve");
            }
            else {
                if (problem.getProblemType().equals("numeric"))
                    System.out.println(((NumericProblem) problem).solve(getUserInput()));
                else if (problem.getProblemType().equals("sorting")) {
                    double[] userInput = getUserInputArray();
                    if (userInput != null) {
                        double[] result = ((SortingProblem) problem).sort(userInput);
                        System.out.println(Arrays.toString(result));
                    }
                }
                else if (problem.getProblemType().equals("probability")) {
                    System.out.println(((ProbabilityProblem) problem).calculate(getUserInputArray()));
                }
            }
            oneMoreRound = userWantsToContinue();
        } while (oneMoreRound);

        System.out.println("Okay, bye!");
        reader.close();
    }

    private static boolean userWantsToContinue() {
        System.out.println("Wanna play another round?");
        String input = reader.next();
        return input.equals("y") || input.equals("yes");
    }

    private static int getUserInput() {
        int input = 0;

        try {
            input = reader.nextInt();
            reader.nextLine();
        }
        catch (Exception ex){
            System.out.println("An exception!?" + ex.getMessage());
        }
        return input;
    }

    private static double[] getUserInputArray() {
        double[] input;

        try {
            String inputText = reader.nextLine();
            String[] inputBits = inputText.split(" ");
            input = new double[inputBits.length];

            for (int i = 0; i < inputBits.length; ++i){
                input[i] = Integer.valueOf(inputBits[i]);
            }
        }
        catch (Exception ex){
            System.out.println("That doesn't seem like a valid number? (" + ex.getMessage() + ")");
            return null;
        }
        return input;
    }

    private static Problem problemFromUserInput() {
        System.out.println("Input Problem number:");
        switch (getUserInput()){
            case 1:
                System.out.println("Okay, Fibonacci it is! What's the limit?");
                return new Fibonacci();
            case 2:
                System.out.println("Okay, PrimeNumber it is! What's the number you want to check?");
                return new PrimeNumber();
            case 3:
                System.out.println("Okay, Palindrome it is! What's the number you want to check?");
                return new Palindrome();
            case 4:
                System.out.println("Okay, Factorial it is! What's the number you want to check?");
                return new Factorial();
            case 5:
                System.out.println("Okay, armstrong numbers it is! What's the number you want to check?");
                return new ArmstrongNumber();
            case 6:
                System.out.println("In that case, can you give me an array to sort? separate numbers by spaces, please :)");
                return new BubbleSorter();
            case 7:
                System.out.println("In that case, can you give me an array to sort? separate numbers by spaces, please :)");
                return new SelectionSorter();
            case 8:
                System.out.println("How many elements and slots do you have? separate two numbers by space");
                return new CombinatoricsCalculator();
            default:
                return null;
        }
    }

    private static void printInstructions(){
        System.out.println("Hello Java Problem Solver");
        System.out.println("=========================");
        System.out.println("Please pick a Problem to solve");
        System.out.println("1. Fibonacci");
        System.out.println("2. Prime number");
        System.out.println("3. Palindrome");
        System.out.println("4. Factorial");
        System.out.println("5. Armstrong");
        System.out.println("6. Bubble sort");
        System.out.println("7. Selection sort");
        System.out.println("8. Combinatorics (# of permutations, variations and combinations)");
    }
}
