package algorithms.sort.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import algorithms.search.BinarySearch;

public class BinarySearchTest {

	private int[] array = { 1, 2, 3, 4, 5, 6 };

	@Test
	public void binarySearchTest() {
		BinarySearch binarySearch = new BinarySearch();
		int index = binarySearch.find(array, 6);
		assertEquals(5, index);
	}
}
