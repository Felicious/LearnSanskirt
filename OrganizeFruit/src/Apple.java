import java.util.Date;

//identical to orange except for class name and constructor name
public class Apple extends Fruit {
	//must define a super constructor
	public Apple(Date ripe) {
		//constructor for Fruit is Fruit(date r, name)
		super(ripe, "apple");
	}
	
	//if Fruit has prepare, this overrides Fruit's 
	public void prepare() {
        System.out.println("Core the " + this.name);
    }
}
