package Problems.SortingProblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSorterTest {

    private SortingProblem bubbleSorter = new BubbleSorter();

    @Test
    void bubble_sort_with_empty_array() {
        assertEquals(0, bubbleSorter.sort(new double[0]).length);
    }
    @Test
    void bubble_sort_with_already_sorted_array() {
        double[] unsorted = { 1, 2 };
        double[] expected = { 1, 2 };
        assertArrayEquals(expected, bubbleSorter.sort(unsorted));
    }
    @Test
    void bubble_sort_with_unsorted_array() {
        double[] unsorted = { 2, 1 };
        double[] expected = { 1, 2 };
        assertArrayEquals(expected, bubbleSorter.sort(unsorted));
    }

    @Test
    void bubble_sort_with_multiple_levels_unsorted_array() {
        double[] unsorted = { 2, 1, 7, 5, 19, 2, 8 };
        double[] expected = { 1, 2, 2, 5, 7, 8, 19 };

        assertArrayEquals(expected, bubbleSorter.sort(unsorted));
    }

    @Test
    void bubble_sort_with_decimal_point() {
        double[] unsorted = { 1, 0.6, 0.8, 0.3, 0.5 };
        double[] expected = { 0.3, 0.5, 0.6, 0.8, 1 };

        assertArrayEquals(expected, bubbleSorter.sort(unsorted));
    }
}