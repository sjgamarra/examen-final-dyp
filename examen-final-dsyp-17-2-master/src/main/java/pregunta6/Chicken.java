package pregunta6;

public class Chicken extends SandwichDecorator {

	public Chicken(Sandwich sandwich) {
		super(sandwich);
	}
	
	public String make() {
		return super.sandwich.make() + " + chicken";
	}

}
