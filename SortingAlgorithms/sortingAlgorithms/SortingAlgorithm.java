package sortingAlgorithms;

public class SortingAlgorithm {

	// Removing last comment
	// Adding new one

	int x;
	int y;

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
