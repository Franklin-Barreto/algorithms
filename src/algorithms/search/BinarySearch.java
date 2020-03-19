package algorithms.search;

public class BinarySearch {

	public int find(int[] array, int value) {
		int begin = 0;
		int end = array.length;
		int middle = 0;
		while (begin <= end) {
			middle = (begin + end) / 2;
			System.out.println(array[middle]);
			if (array[middle] == value) {
				return middle;
			}
			if (array[middle] < value) {
				begin = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		return -1;
	}

}
