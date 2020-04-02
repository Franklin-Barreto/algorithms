package algorithms.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import algorithms.search.BinarySearch;

public class BinarySearchTest {

	private int[] array = { 1, 2, 3, 4, 5, 6 };

	@Test
	public void binarySearchTest() {
		BinarySearch binarySearch = new BinarySearch();
		
		assertEquals(0, binarySearch.find(array, 1));
	//	assertEquals(5, binarySearch.find(array, 6));
	}
}
