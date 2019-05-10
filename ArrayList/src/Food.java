
public class Food {
	public String name;
	
	//constructor(?)
	//sets the name value to food by default
	public Food() {
		this.name = "food";
	}
	
	//set the name value of self to the parameter passed in
	public Food(String name) {
		this.name = name;
	}
	
	public void prepare() {
        System.out.println("Prepare the " + this.name);
	}
}
