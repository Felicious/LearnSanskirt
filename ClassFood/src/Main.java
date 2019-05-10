import java.util.Date;

public class Main {
	public static void main(String args[])
	 {
		Date d = new Date(2000000000);
		Food gum = new Food("gum");
		Food las = new Food("lasagna");
		Fruit pom = new Fruit(d, "pomegranate");
		Fruit app = new Apple(d);
		Orange o = new Orange(d);
		Shrimp sh = new Shrimp();
		Seafood p = new Prawn();
		Seafood l = new Seafood("lobster");

		sh.prepare();
		app.prepare();
		pom.prepare();
		o.prepare();
		gum.prepare();
		p.prepare();
		l.prepare();
		las.prepare();
		las = app;
		las.prepare();

		o.ripeTime();
		pom.ripeTime();
	 }
}
