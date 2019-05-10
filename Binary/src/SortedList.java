import java.util.Arrays;

public class SortedList {
	private int list[];
	
	//constructor for dummy values
	public SortedList() {
        // call the other constructor
        this(new int[] {1, 4, 6, 8, 10});
    }
	
	//your own constructor (called in next constructor)
	public SortedList(int array[]) {
		list = array;
		quicksort();
	}
	
	//constructor that takes in initialized array and size
	public SortedList(int array[], int size) {
		this(array); //call your own constructor 
	}
	
	//insert function
	public void insert(int value) {
		// insertion point for the new value using binary search
        int insertion_pt = (- this.bin_search(value)) - 1;

        //copy current array to its new one, with +1 size
        list = Arrays.copyOf(list, list.length + 1);

        //shift all elements to the right of the value to be inserted
        //to make space for the new one
        for (int i = list.length - 1; i > insertion_pt; i--) {
            list[i] = list[i - 1];
        }

        // insert the value in it's insertion point
        list[insertion_pt] = value;
    }
	
	private void quicksort() {
		//calls quicksort
		new DoQuicksort(list);
	}
	
	public int bin_search(int target) {
        int beg  = 0;
        int end   = list.length - 1;
        int middle = (beg + end) / 2;
    
        while (beg <= end) {
            if (list[middle] < target) {
                beg = middle + 1;
            } else if (list[middle] > target) {
                end = middle - 1;
            } else {
                return middle + 1;
            }

            middle = (beg + end) / 2;
        }

        return - beg - 1;
    }
	

	//drk taught me this! 
	//overrides System.out.println(SortedList); to print the inner array
    //will help with printing later
	@Override
    public String toString() {
        return Arrays.toString(list);
    }
}
