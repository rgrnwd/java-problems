package Problems.NumericProblems;

public class Fibonacci extends NumericProblem {

    @Override
    public String solve(int limit) {
        int firstNumber = 0;
        int secondNumber = 1;
        String result = firstNumber + " " + secondNumber;

        for (int i = 2; i < limit; ++i) {
            int sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            result += " " + sum;
        }

        return result;
    }
}
