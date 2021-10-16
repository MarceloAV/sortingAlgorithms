package selectionSort;

public class SelectionSort {
	private int[] array;

	public SelectionSort(int[] array) {
		this.array = array;
		this.sort();
	}

	public int[] sort() {

		for (int i = 0; i < this.array.length - 1; i++) {
			int pos = i;
			for (int j = i + 1; j < this.array.length; j++) {
				if (this.array[i] >= this.array[j]) {
					pos = j;
				}
			}
			int aux = this.array[pos];
			this.array[pos] = this.array[i];
			this.array[i] = aux;
		}

		return this.array;
	}

	@Override
	public String toString() {
		return java.util.Arrays.toString(this.array);
	}
}
