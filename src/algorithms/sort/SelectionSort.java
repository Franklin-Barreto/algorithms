package algorithms.sort;

public class SelectionSort {

	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minimum = mininumIndex(array, i);
			swap(array, i, minimum);
		}
	}

	private void swap(int[] array, int firstIndex, int SecondIndex) {
		int temp = array[firstIndex];
		array[firstIndex] = array[SecondIndex];
		array[SecondIndex] = temp;
	}

	private int mininumIndex(int array[], int start) {
		int minimum = start;
		for (int current = start; current < array.length; current++) {
			if (array[current] < array[minimum]) {
				minimum = current;
			}
		}
		return minimum;
	}

}
