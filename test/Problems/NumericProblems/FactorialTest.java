package Problems.NumericProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    NumericProblem factorial = new Factorial();

    @Test
    void solve_factorial_of_negative_is_one() {
        assertEquals("Factorial is 1", factorial.solve(-5));
    }
    @Test
    void solve_factorial_zero_is_one() {
        assertEquals("Factorial is 1", factorial.solve(0));
    }
    @Test
    void solve_factorial_one() {
        assertEquals("Factorial is 1", factorial.solve(1));
    }
    @Test
    void solve_factorial_five() {
        int expectedResult = 5 * 4 * 3 * 2 * 1;
        assertEquals("Factorial is " + expectedResult, factorial.solve(5));
    }
    @Test
    void solve_factorial_ten() {
        int expectedResult = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1;
        assertEquals("Factorial is " + expectedResult, factorial.solve(10));
    }
}