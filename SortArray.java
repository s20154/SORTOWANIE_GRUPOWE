import java.util.Arrays;

public class SortArray {
    private int[] array;

    public SortArray() {
    }

    public SortArray(int[] array) {
        this.array = array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public String getArray() {
        return Arrays.toString(array);
    }

    public void sortArray() {
        boolean swap = true;
        int temp = 0;
        int scope = array.length - 1;
        while (swap) {
            swap = false;
            for (int i = 0; i < scope; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swap = true;
                }
            }
            scope--;
        }
    }

    @Override
    public String toString() {
        return "SortedArray = "
                + Arrays.toString(this.array);
    }
}
