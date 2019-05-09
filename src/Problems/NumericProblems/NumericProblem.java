package Problems.NumericProblems;

import Problems.Problem;

public abstract class NumericProblem extends Problem {
    public abstract String solve(int input);

    @Override
    public String getProblemType() {
        return "numeric";
    }
}
