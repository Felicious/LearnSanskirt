import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//array
		int input[] = {500, 700, 800, 100, 300, 200, 900, 400, 1000, 600};
		System.out.println("Input: ");
		
		// System.out.println(input); //prints the address of input
		
		//found this on StackOverflow:
		System.out.println(Arrays.toString(input));
		
		//do quicksort and print result
		DoQuicksort sorted_items = new DoQuicksort(input);
		System.out.println("Output: ");
		System.out.println(Arrays.toString(input));
		
		/* Output:
		Input: 
		[500, 700, 800, 100, 300, 200, 900, 400, 1000, 600]
		Output: 
		[100, 200, 300, 400, 500, 600, 700, 800, 900, 1000]
		
		*/
		
	}
}
