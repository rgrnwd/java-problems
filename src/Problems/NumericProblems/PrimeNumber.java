package Problems.NumericProblems;

public class PrimeNumber extends NumericProblem {
    @Override
    public String solve(int input) {
        boolean isPrimeNumber = false;
        String result = input + " ";

        if (input > 1){
            isPrimeNumber = true;
            for (int i = 2; i < input; ++i){
                if (input % i == 0){
                    isPrimeNumber = false;
                    break;
                }
            }
        }
        if (isPrimeNumber)
            return result + "is a prime number";
        else
            return result + "is not a prime number";
    }
}
