package Problems.ProbabilityProblems;

public class ProbabilityCalculator extends ProbabilityProblem {
    private CombinatoricsCalculator combinatoricsCalculator = new CombinatoricsCalculator();

    @Override
    public String calculate(double[] values) {
        if (values.length < 3){
            return "Expected to receive three numbers";
        }
        int y = (int)values[0];
        int n = (int)values[1];
        double probability = values[2];
        double result = calculateProbability(y, n, probability);
        return String.format("P(%.0f)=%.2f%%", values[0], result);
    }

    private double calculateProbability(int y, int n, double probability) {
        double combinations = combinatoricsCalculator.calculateCombinations(n, y, false);

        double probabilityOfY = combinations * Math.pow(probability, y) * Math.pow(1 - probability, n - y);
        return probabilityOfY * 100;
    }
}
