package Problems.ProbabilityProblems;

public class CombinatoricsCalculator extends ProbabilityProblem {

    @Override
    public String calculate(double[] values) {
        if (values.length < 2) {
            return "Expected two numbers separated by a space";
        } else {
            int elements = (int)values[0];
            int slots = (int)values[1];
            if (elements < 1 || slots < 1)
                return "Invalid Input (negative)";

            return String.format("P=%d,V=%d,C=%d",
                    calculatePermutations(slots),
                    calculateVariations(elements, slots, false),
                    calculateCombinations(elements, slots, false));
        }
    }

    public long calculatePermutations(int slots) {
        long result = 1;

        for (int i = slots; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    public long calculateVariations(int elements, int slots, boolean repetition) {
        if (repetition){
            return (long)Math.pow(elements, slots);
        } else {
            return calculatePermutations(elements) / calculatePermutations(elements - slots);
        }
    }

    public long calculateCombinations(int elements, int slots, boolean repetition) {
        if (repetition) {
            return calculatePermutations(elements + slots - 1) / (
                    calculatePermutations(slots) * (calculatePermutations(elements - 1)));
        } else{
            return calculateVariations(elements, slots, false) / (calculatePermutations(slots));
        }
    }
}
