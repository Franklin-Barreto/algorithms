package algorithms.sort.test;

import java.util.Arrays;

import org.junit.Test;

import algorithms.sort.InsertionSort;

public class InsertionSortTest {

	private int[] array = { 2, 76, 5, 4, 36, 1 };

	@Test
	public void insertionTest() {
		InsertionSort insertion = new InsertionSort();
		insertion.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
