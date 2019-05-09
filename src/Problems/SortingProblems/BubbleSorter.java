package Problems.SortingProblems;

public class BubbleSorter extends SortingProblem {
    @Override
    public double[] sort(double[] array) {

        for (int i = 0; i < array.length - 1; ++i){
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] > array[j]) {
                    double swapValue = array[i];
                    array[i] = array[j];
                    array[j] = swapValue;
                }
            }
        }
        return array;
    }
}
