
public class DoQuicksort {
	private int[] input; // made input a private member of class
	// DONT HAVE TO PASS INPUT AROUND! (isn't that cool?)

	// constructor
	public DoQuicksort(int[] array) {
		input = array;
		quicksort(0, array.length - 1); //calls quicksort
	}

	// don't need functions outside of this DoQuicksort class
	// so just make it private
	private int partition(int p, int r) {
		int pivot = input[r];

		while (p < r) {
			while (input[p] < pivot)
				p++;
			while (input[r] > pivot)
				r--;
			if (input[p] == input[r])
				p++;
			else if (p < r) {
				int tmp = input[p];
				input[p] = input[r];
				input[r] = tmp;
			}
		}

		return r;
	}

	private void quicksort(int p, int r) {
		if (p < r) {
			int j = partition(p, r);
			quicksort(p, j - 1); // can also call this.quicksort to be specific that you're calling THIS class's
									// function
			quicksort(j + 1, r);
		}
	}
}
