public class Main {
	public static void main(String args[]) {
        int[] array = new int[] {
            1, 2, 3, 4, 5,
            20, 40, 60, 80, 100,
            500, 501, 502, 503, 504,
            1998, 2019
            };
        
        SortedList list = new SortedList(array);

        System.out.println(list);

        int pos_exists   = list.bin_search(60);
        int pos_nonexist = list.bin_search(110);
        System.out.println("60 found at " + pos_exists + ", 110 not found at " + pos_nonexist);

        list.insert(110);

        System.out.println(list);
        pos_nonexist = list.bin_search(110);
        System.out.println("110 now inserted and found at " + pos_nonexist);

    }
	
}
