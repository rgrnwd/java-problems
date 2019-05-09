package Problems.ProbabilityProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinatoricsCalculatorTest {

    CombinatoricsCalculator combinatoricsCalc = new CombinatoricsCalculator();

    @Test void calculate_should_return_invalid_input_when_elements_negative() {
        double[] input = { -2, 3 };
        assertEquals("Invalid Input (negative)", combinatoricsCalc.calculate(input));
    }
    @Test void calculate_should_return_invalid_input_when_slots_negative() {
        double[] input = { 2, -3 };
        assertEquals("Invalid Input (negative)", combinatoricsCalc.calculate(input));
    }
    @Test void calculate_should_return_summary_of_probabilities() {
        double[] input = { 10, 3 };
        assertEquals("P=6,V=720,C=120", combinatoricsCalc.calculate(input));
    }
    @Test void calculate_should_handle_large_numbers() {
        double[] input = { 20, 15 };
        assertEquals("P=1307674368000,V=20274183401472000,C=15504", combinatoricsCalc.calculate(input));
    }
    @Test
    public void calculatePermutations_should_return_factorial_of_1_for_zero_input() {
        assertEquals(1, combinatoricsCalc.calculatePermutations(0));
    }
    @Test
    public void calculatePermutations_should_return_factorial_of_1_for_negative_input() {
        assertEquals(1, combinatoricsCalc.calculatePermutations(-5));
    }
    @Test
    public void calculatePermutations_should_return_factorial_of_available_elements() {
        assertEquals(6, combinatoricsCalc.calculatePermutations(3));
        assertEquals(24, combinatoricsCalc.calculatePermutations(4));
    }
    @Test
    public void calculateVariations_with_repetition_should_return_element_times_slots() {
        assertEquals(1000, combinatoricsCalc.calculateVariations(10, 3, true));
    }
    @Test
    public void calculateVariations_without_repetition_should_return_factorial_of_elements_over_factorial_of_available_slots() {
        assertEquals(720, combinatoricsCalc.calculateVariations(10, 3, false));
    }
    @Test
    public void calculateVariations_without_repetition_should_return_factorial_of_large_numbers() {
//        assertEquals((double)29059430400, combinatoricsCalc.calculateVariations(16, 10, false));
    }
    @Test
    public void calculateVariations_without_repetition_should_return_factorial_when_elements_and_available_slots_are_equal() {
        assertEquals(120, combinatoricsCalc.calculateVariations(5, 5, false));
    }
    @Test
    public void calculateCombinations_with_repetition_should_return_combinations() {
        double a = combinatoricsCalc.calculatePermutations(12); // (10+3-1)! / (3! * (10-1)!)
        double b = combinatoricsCalc.calculatePermutations(3);
        double c = combinatoricsCalc.calculatePermutations(9);
        double expected = a / (b * c);
        assertEquals(expected, combinatoricsCalc.calculateCombinations(10, 3, true));
    }
    @Test
    public void calculateCombinations_without_repetition_should_return_variations_divided_by_permutations() {
        assertEquals(56, combinatoricsCalc.calculateCombinations(8, 5, false));
    }
    @Test
    public void calculateCombinations_without_repetition_should_return_one_when_elements_and_available_slots_are_equal() {
        assertEquals(1, combinatoricsCalc.calculateCombinations(8, 8, false));
    }
    @Test
    public void calculateCombinations_without_repetition_should_return_symmetrical_results() {
        assertEquals(combinatoricsCalc.calculateCombinations(10, 4, false),
                combinatoricsCalc.calculateCombinations(10, 6, false));
    }
}