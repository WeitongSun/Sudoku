package pkgHelper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void doesElementExist_Test1() {

		int[] arr = { 1, 2, 3, 4, 5 };
		int iValue = 5;
		boolean bExpected = true;
		boolean bActual = LatinSquare.doesElementExist(arr, iValue);

		assertEquals(bExpected, bActual);

	}

	@Test
	public void doesElementExist_Test2() {

		int[] arr = { 1, 2, 3, 4, 5 };
		int iValue = 8;
		boolean bExpected = false;
		boolean bActual = LatinSquare.doesElementExist(arr, iValue);

		assertEquals(bExpected, bActual);

	}

	@Test
	public void hasDuplicates_test1() {

		int[] arr = { 1, 2, 3, 4, 5 };

		boolean bExpected = false;
		boolean bActual = LatinSquare.hasDuplicates(arr);

		assertEquals(bExpected, bActual);

	}

	@Test
	public void hasDuplicates_test2() {

		int[] arr = { 1, 2, 3, 4, 1 };

		boolean bExpected = true;
		boolean bActual = LatinSquare.hasDuplicates(arr);

		assertEquals(bExpected, bActual);

	}

	@Test
	public void hasDuplicates_test3() {

		int[] arr1 = { 1, 2, 3, 4, 1 };
		int[] arr2 = { 1, 2, 3, 4, 1 };

		boolean bExpected = true;
		boolean bActual = LatinSquare.hasDuplicates(arr1);

		assertEquals(bExpected, bActual);

	

	}

	@Test
	public void getColumn_test() {
		int[][] puzzle = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		LatinSquare testSquare = new LatinSquare(puzzle);

		int[] column0 = new int[] { 1, 4, 7 };
		int[] column1 = new int[] { 2, 5, 8 };
		int[] column2 = new int[] { 3, 6, 9 };

		assertEquals(Arrays.toString(column0), Arrays.toString(testSquare.getColumn(0)));
		assertEquals(Arrays.toString(column1), Arrays.toString(testSquare.getColumn(1)));
		assertEquals(Arrays.toString(column2), Arrays.toString(testSquare.getColumn(2)));
	}

	@Test
	public void getRow_test() {
		int[][] puzzle = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		LatinSquare testSquare = new LatinSquare(puzzle);

		int[] row0 = new int[] { 1, 2, 3 };
		int[] row1 = new int[] { 4, 5, 6 };
		int[] row2 = new int[] { 7, 8, 9 };

		assertEquals(Arrays.toString(row0), Arrays.toString(testSquare.getRow(0)));
		assertEquals(Arrays.toString(row1), Arrays.toString(testSquare.getRow(1)));
		assertEquals(Arrays.toString(row2), Arrays.toString(testSquare.getRow(2)));
	}

	@Test
	public void hasAllValues_test() {
		int[] arr1 = new int[] { 1, 2, 3, 4 };
		int[] arr2 = new int[] { 2, 4, 1, 3 };
		boolean bExpected = true;

		assertEquals(LatinSquare.hasAllValues(arr1, arr2), bExpected);
	}

	@Test
	public void isLatinSquare_test1() {
		int[][] puzzle = new int[][] { { 1, 2, 3, 4, 5 }, { 2, 3, 5, 1, 4 }, { 3, 5, 4, 2, 1 }, { 4, 1, 2, 5, 3 },
				{ 5, 4, 1, 3, 2 } };
		LatinSquare testSquare = new LatinSquare(puzzle);
		boolean bExpected = true;
		assertEquals(testSquare.isLatinSquare(), bExpected);
	}

	@Test
	public void isLatinSquare_test2() {
		int[][] puzzle = new int[][] { { 1, 2, 3, 4, 5 }, { 3, 2, 5, 1, 4 }, { 3, 5, 4, 2, 1 }, { 4, 1, 2, 5, 3 },
				{ 5, 4, 1, 3, 2 } };
		LatinSquare testSquare = new LatinSquare(puzzle);
		boolean bExpected = false;
		assertEquals(testSquare.isLatinSquare(), bExpected);
	}

	@Test
	public void containsZeros_test1() {
		int[][] puzzle = new int[][] { { 1, 0, 3, 4, 5 }, { 3, 2, 5, 1, 4 }, { 3, 5, 4, 2, 1 }, { 4, 1, 2, 5, 3 },
				{ 5, 4, 1, 3, 2 } };
		LatinSquare testSquare = new LatinSquare(puzzle);
		boolean bExpected = true;
		assertEquals(testSquare.containsZeros(), bExpected);
	}

	@Test
	public void containsZeros_test2() {
		int[][] puzzle = new int[][] { { 1, 2, 3, 4, 5 }, { 3, 2, 5, 1, 4 }, { 3, 5, 4, 2, 1 }, { 4, 1, 2, 5, 3 },
				{ 5, 4, 1, 3, 2 } };
		LatinSquare testSquare = new LatinSquare(puzzle);
		boolean bExpected = false;
		assertEquals(testSquare.containsZeros(), bExpected);
	}

}
