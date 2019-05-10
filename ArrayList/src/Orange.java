import java.util.Date;

public class Orange extends Fruit {
	//must define a super constructor
	public Orange(Date ripe) {
		//constructor for Fruit is Fruit(date r, name)
		super(ripe, "orange");
	}
	
	public void prepare() {
        System.out.println("Peel the " + this.name);
    }
	
}
