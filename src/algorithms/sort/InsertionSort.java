package algorithms.sort;

public class InsertionSort {

	public void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			insert(array, i - 1, array[i]);
		}
	}

	private void insert(int array[], int rightIndex, int value) {
		int key = rightIndex;
		while (key >= 0 && array[key] > value) {
			array[key + 1] = array[key];
			key--;
		}
		array[key + 1] = value;
	}
}
