package Problems.ProbabilityProblems;

import Problems.Problem;

public abstract class ProbabilityProblem extends Problem {
    public abstract String calculate(double[] values);

    @Override
    public String getProblemType() {
        return "probability";
    }
}
