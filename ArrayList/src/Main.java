import java.util.ArrayList;
import java.util.Date;

public class Main {
	public static void printThat(ArrayList<Food> food) {
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i).getClass().getSimpleName() +" ");
		}
		
	}
	
	public static void main(String[] args) { 
		ArrayList<Object> arr = new ArrayList<Object>();
	
		//adding to array
		arr.add("Food");
		arr.add("Orange");
		arr.add("Fruit");
		arr.add("Papaya");
		arr.add(3932728);
		arr.add("Apple");
		arr.add("now");
		arr.add("Food");
		arr.add("sandwich");
		
		ArrayList<Food> food = Arr(arr);
		
		printThat(food);
		
	
	}
	
	public static ArrayList<Food> Arr(ArrayList<Object> arr) {
		ArrayList<Food> food = new ArrayList<Food>();
		
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i) == "Food") {
				Food a = new Food(arr.get(i+1).toString());
				i++; //skip next one
				food.add(a);
			}else if(arr.get(i) == "Fruit") {
				// make Fruit(ripe, name)
				Fruit a = new Fruit(checkDate(arr.get(i+2)), arr.get(i+1).toString());
				i+=2; //skip next one
				food.add(a);
			}
			else if (arr.get(i) == "Apple") {
				Apple a = new Apple(checkDate(arr.get(i+1)));
				i++;
				food.add(a);
			}else { //(arr.get(i) == "Orange")
				Orange a = new Orange(checkDate(arr.get(i+1)));
				i++;
				food.add(a);
			}
		}
		
		return food;
		
	}
	
	public static Date checkDate(Object arr) {
		
		if(arr instanceof Integer) {
			return new Date((int)arr);
		}
		else // (arr == "now") 
		{
			return new Date();
		}
	}
	

}
