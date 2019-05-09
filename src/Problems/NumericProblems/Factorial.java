package Problems.NumericProblems;

public class Factorial extends NumericProblem {
    @Override
    public String solve(int input) {
        int result = 1;

        for (int i = input; i > 0; i--) {
            result*=i;
        }
        return "Factorial is " + result;
    }
}
