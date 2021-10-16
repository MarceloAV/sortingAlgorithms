package sortingAlgorithms;

public class SortingAlgorithm {

	// Test edition git

	private int[] array;

	public SortingAlgorithm(int[] array) {
		this.array = array;
	}

	public int[] getArray() {
		return array;
	}
	
	@Override
	public String toString() {
		return java.util.Arrays.toString(this.array);
	}

}
