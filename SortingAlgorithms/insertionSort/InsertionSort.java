package insertionSort;

public class InsertionSort {
	private int[] array;

	public InsertionSort(int[] array) {
		this.array = array;
		this.sort();
	}

	public int[] getArray() {
		return this.array;
	}

	public void sort() {

		for (int i = 0; i < this.array.length - 1; i++) {
			int aux = this.array[i + 1];
			for (int j = i; j >= 0; j--) {
				if (this.array[j] > aux) {
					this.array[j + 1] = this.array[j];
					this.array[j] = aux;
				} else {
					break;
				}
			}
		}
	}

	@Override
	public String toString() {
		return java.util.Arrays.toString(this.array);
	}
}
