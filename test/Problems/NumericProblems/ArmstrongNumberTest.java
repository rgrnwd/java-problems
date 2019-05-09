package Problems.NumericProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmstrongNumberTest {

    NumericProblem armstrong = new ArmstrongNumber();

    @Test
    void solve_armstrong_number_zero() {
        assertEquals("0 is an armstrong number", armstrong.solve(0));
    }
    @Test
    void solve_armstrong_number_one() {
        assertEquals("1 is an armstrong number", armstrong.solve(1));
    }
    @Test
    void solve_armstrong_number_two() {
        assertEquals("2 is not an armstrong number", armstrong.solve(2));
    }
    @Test
    void solve_armstrong_number_larger_armstrong() {
        assertEquals("153 is an armstrong number", armstrong.solve(153));
        assertEquals("370 is an armstrong number", armstrong.solve(370));
    }
    @Test
    void solve_armstrong_number_larger_not_armstrong() {
        assertEquals("154 is not an armstrong number", armstrong.solve(154));
        assertEquals("372 is not an armstrong number", armstrong.solve(372));
    }
}