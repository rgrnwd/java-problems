package Problems.SortingProblems;

public class SelectionSorter extends SortingProblem {
    @Override
    public double[] sort(double[] array) {
        for (int i = 0; i < array.length; ++i) {
            int swapIndex = findSmallestNumberIndex(array, i);
            double smallestNumber = array[swapIndex];
            array[swapIndex] = array[i];
            array[i] = smallestNumber;
        }
        return array;
    }

    private int findSmallestNumberIndex(double[] array, int startIndex) {
        int smallestNumberIndex = startIndex;
        double smallestNumber = array[startIndex];
        if (array.length > (startIndex + 1)) {
            for (int i = startIndex + 1; i < array.length; ++i) {
                if (array[i] < smallestNumber) {
                    smallestNumber = array[i];
                    smallestNumberIndex = i;
                }
            }
        }
        return smallestNumberIndex;
    }
}
