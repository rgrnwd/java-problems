package Problems.NumericProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    private NumericProblem primeNumber = new PrimeNumber();

    @Test
    void solve_prime_number_with_number_smaller_than_one() {
        assertEquals("0 is not a prime number", primeNumber.solve(0));
    }
    @Test
    void solve_prime_number_with_number_one() {
        assertEquals("1 is not a prime number", primeNumber.solve(1));
    }

    @Test
    void solve_prime_number_with_prime_number() {
        assertEquals("5 is a prime number", primeNumber.solve(5));
        assertEquals("7 is a prime number", primeNumber.solve(7));
    }

    @Test
    void solve_prime_number_with_a_non_prime_number() {
        assertEquals("4 is not a prime number", primeNumber.solve(4));
        assertEquals("9 is not a prime number", primeNumber.solve(9));
    }
}