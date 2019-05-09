package Problems.SortingProblems;

import Problems.Problem;

public abstract class SortingProblem extends Problem {
    public abstract double[] sort(double[] array);

    @Override
    public String getProblemType() {
        return "sorting";
    }
}
