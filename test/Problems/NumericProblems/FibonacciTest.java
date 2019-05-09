package Problems.NumericProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    private NumericProblem fibonacci = new Fibonacci();

    @Test
    void solve_fibonacci_with_zero_limit() {
        assertEquals("0 1", fibonacci.solve(0));
    }
    @Test
    void solve_fibonacci_with_standard_limit() {
        assertEquals("0 1 1 2 3 5 8 13 21 34", fibonacci.solve(10));
    }

}