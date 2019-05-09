package Problems.ProbabilityProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityCalculatorTest {

    private ProbabilityProblem probabilityCalc = new ProbabilityCalculator();

    @Test
    public void calculate_returns_error_when_not_enough_input_provided(){
        double[] invalid_input = { 1, 2 };
        assertEquals("Expected to receive three numbers", probabilityCalc.calculate(invalid_input));
    }

    @Test
    public void calculate_return_100_percent_when_event_is_sure_to_happen_once_out_of_one_time() {
        double[] input = { 1, 1, 1 };
        assertEquals("P(1)=100.00%", probabilityCalc.calculate(input));
    }

    @Test
    public void calculate_return_50_percent_when_event_is_point_five_probability_once_out_of_one_time() {
        double[] input = { 1, 1, 0.5 };
        assertEquals("P(1)=50.00%", probabilityCalc.calculate(input));
    }

    @Test
    public void calculate_return_25_percent_when_event_is_point_five_probability_two_of_two_times() {
        double[] input = { 2, 2, 0.5 };
        assertEquals("P(2)=25.00%", probabilityCalc.calculate(input));
    }

    @Test
    public void calculate_return_probability_of_event_happening_two_of_five_times() {
        double[] input = { 2, 5, 0.25 };
        assertEquals("P(2)=26.37%", probabilityCalc.calculate(input));
    }

    @Test
    public void calculate_return_lower_probability_for_same_event_happening_three_of_five_times() {
        double[] input_inverted = { 3, 5, 0.25 };
        assertEquals("P(3)=8.79%", probabilityCalc.calculate(input_inverted));
    }
}