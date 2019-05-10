import java.util.Date;

//inheritance declaration
public class Fruit extends Food {
	//use protected to access only when we have parent or child ref
	protected Date ripe; //import lib to use Date type

	public Fruit(Date r, String n) {
		this.ripe = r;
		this.name = n;
	}
	
	public void ripeTime() {
		System.out.println("You can eat it on " + this.ripe);
	}
}
