import java.util.ArrayList;
import java.util.Date;
import java.util.Collections;  

public class OrganizeFruit {
	public static void main(String args[])
	 {
		ArrayList<Fruit> fruits = new ArrayList<Fruit>();
		
		//make a random list of fruit
		fruits.add(new Fruit(new Date(2000000000), "bittermelon"));
		fruits.add(new Apple(new Date(2000000000)));
		fruits.add(new Fruit(new Date(1940009000), "pumpkin"));
		fruits.add(new Fruit(new Date(1599000022), "bittermelon"));
		fruits.add(new Orange(new Date(1900909999)));
		fruits.add(new Apple(new Date(1909909999)));
		fruits.add(new Apple(new Date(1908808888)));
		fruits.add(new Fruit(new Date(2009000022), "bittermelon"));
		fruits.add(new Orange(new Date(1308909999)));
		
		System.out.println("Initial fruits: ");
		viewFruits(fruits);
		
		Collections.sort(fruits);
		
		System.out.println("Sorted fruits: ");
		viewFruits(fruits);
		
	 }
	
	public static void viewFruits(ArrayList<Fruit> fruits) {
		
			for(int i = 0; i < fruits.size(); i++) {
				System.out.println(fruits.get(i).name +" " + fruits.get(i).ripe);
			}
	}
}
