import java.util.Date;

//inheritance declaration
public class Fruit extends Food implements Comparable<Fruit> {
	//use protected to access only when we have parent or child ref
	protected Date ripe; //import lib to use Date type

	public Fruit(Date r, String n) {
		this.ripe = r;
		this.name = n;
	}
	
	public void ripeTime() {
		System.out.println("You can eat it on " + this.ripe);
	}
	
	@Override     
	public int compareTo(Fruit fruit) {          
	    return ripe.compareTo(fruit.ripe);    
	}     
}
