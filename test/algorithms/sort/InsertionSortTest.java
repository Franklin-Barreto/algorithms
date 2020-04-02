package algorithms.sort;

import org.junit.Test;

public class InsertionSortTest {

	private int[] array = { 2, 76, 5, 4, 36, 1 };

	@Test
	public void insertionTest() {
		InsertionSort insertion = new InsertionSort();
		insertion.sort(array);
	}
}
