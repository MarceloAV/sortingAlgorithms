package heapSort;

import sortingAlgorithms.SortingAlgorithm;

public class HeapSort extends SortingAlgorithm {

	public HeapSort(int[] array) {
		super(array);
		this.sort();
	}

	public void sort() {
		for (int i = (super.getArray().length / 2) - 1; i >= 0; i--) {
			this.heap(i, super.getArray().length);
		}

		for (int i = super.getArray().length - 1; i > 0; i--) {
			int aux = super.getArray()[0];
			super.getArray()[0] = super.getArray()[i];
			super.getArray()[i] = aux;
			this.heap(0, i);
		}
	}

	private void heap(int position, int size) {
		int root = position;

		int left = 2 * position + 1;
		int right = 2 * position + 2;

		if (left < size && super.getArray()[left] > super.getArray()[root]) {
			root = left;
		}

		if (right < size && super.getArray()[right] > super.getArray()[root]) {
			root = right;
		}

		if (root != position) {

			int aux = super.getArray()[position];
			super.getArray()[position] = super.getArray()[root];
			super.getArray()[root] = aux;

			this.heap(root, size);
		}
	}
}
