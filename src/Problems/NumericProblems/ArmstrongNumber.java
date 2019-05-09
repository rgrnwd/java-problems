package Problems.NumericProblems;

public class ArmstrongNumber extends NumericProblem {
    @Override
    public String solve(int input) {

        int sumOfDigitsCubed = 0;
        int copyOfInput = input;

        while (copyOfInput > 0) {
            int lastDigit = copyOfInput % 10;
            copyOfInput = copyOfInput / 10;
            sumOfDigitsCubed += (lastDigit * lastDigit * lastDigit);
        }

        if (sumOfDigitsCubed == input)
            return input + " is an armstrong number";
        else
            return input + " is not an armstrong number";
    }
}
