
public class Seafood extends Food {
	//constructor that changes name to parameter
	public Seafood(String name) {
		this.name = name;
	}
	
	public void prepare() {
        System.out.println("Peel the " + this.name);
	}
}
