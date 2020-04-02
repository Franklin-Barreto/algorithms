package algorithms.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import algorithms.sort.SelectionSort;

public class SelectionSortTest {

	private int[] array = { 2, 8, 7, 45, 69, 52, 3 };

	@Test
	public void sortTest() {
		SelectionSort selection = new SelectionSort();
		selection.sort(array);
		assertEquals(2, array[0]);
		assertEquals(69, array[array.length - 1]);

	}
}
