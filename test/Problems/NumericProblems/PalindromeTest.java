package Problems.NumericProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    private NumericProblem palindrome = new Palindrome();

    @Test
    void solve_palindrome_with_zero_input() {
        assertEquals("0 is a Palindrome", palindrome.solve(0));
    }
    @Test
    void solve_palindrome_with_one_digit() {
        assertEquals("1 is a Palindrome", palindrome.solve(1));
    }

    @Test
    void solve_palindrome_with_two_different_digits() {
        assertEquals("12 is not a Palindrome", palindrome.solve(12));
    }

    @Test
    void solve_palindrome_with_two_same_digits() {
        assertEquals("11 is a Palindrome", palindrome.solve(11));
    }

    @Test
    void solve_palindrome_with_three_reversible_digits() {
        assertEquals("131 is a Palindrome", palindrome.solve(131));
    }

    @Test
    void solve_palindrome_with_three_non_reversible_digits() {
        assertEquals("231 is not a Palindrome", palindrome.solve(231));
    }

    @Test
    void solve_palindrome_long_palindrome() {
        assertEquals("987656789 is a Palindrome", palindrome.solve(987656789));
    }
}