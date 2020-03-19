package algorithms.sort;

public class InsertionSort {

	public void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			insert(array, i - 1, array[i]);
		}
	}

	private void insert(int array[], int rightIndex, int value) {
		while (rightIndex >= 0 && array[rightIndex] > value) {
			array[rightIndex + 1] = array[rightIndex];
			rightIndex--;
		}
		array[rightIndex + 1] = value;
	}
}
