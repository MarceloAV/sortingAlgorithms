package bubbleSort;

public class BubbleSort {

	private int[] array;

	public BubbleSort(int[] array) {
		this.array = array;
		this.sort();
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	private int[] sort() {

		for (int i = 0; i < this.array.length; i++) {
			for (int j = i + 1; j < this.array.length; j++) {
				if (this.array[i] > this.array[j]) {
					int aux = this.array[i];
					this.array[i] = this.array[j];
					this.array[j] = aux;
				}
			}
		}
		return this.array;
	}

	@Override
	public String toString() {
		return java.util.Arrays.toString(this.array);
	}
}
