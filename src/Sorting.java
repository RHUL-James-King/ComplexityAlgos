public class Sorting {

    public int[] selectionSort(int[] array) {
        for(int i = 0; i < array.length; i ++) {
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                smallestIndex = (array[j] < array[smallestIndex]) ? j : smallestIndex;
            }
            swap(array, i, smallestIndex);
        }
        return array;
    }

    public int[] insertionSort(int[] array) {
        int sortedPrefix = 0;
        for(int i = sortedPrefix+1; i < array.length; i++) {
            int insertInt = array[i];
            int insertIndex = i;
            for(int j = i; j == 0 || array[j] <= array[i]; j--){
                array[j+1] = array[j];
                insertIndex--;
            }
            array[insertIndex] = insertInt;
        }
        return array;ava.lang.ArrayIndexOutOfBoundsException: -1
    }

    public int[] mergeSort(int[] array) {
        return array;
    }

    private int[] swap(int[] array, int i, int j) {
        int tempInt = array[i];
        array[i] = array[j];
        array[j] = tempInt;
        return array;
    }
}
