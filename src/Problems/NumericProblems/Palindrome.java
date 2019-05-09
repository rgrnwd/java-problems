package Problems.NumericProblems;

public class Palindrome extends NumericProblem {
    @Override
    public String solve(int input) {
        String result = input + " ";

        int copyOfInput = input;
        int reversedInput = 0;
        while (copyOfInput > 0) {
            reversedInput = (10 * reversedInput) + (copyOfInput % 10);
            copyOfInput = copyOfInput / 10;
        }

        if (input == reversedInput)
            return result + "is a Palindrome";
        else
            return result + "is not a Palindrome";    }
}
