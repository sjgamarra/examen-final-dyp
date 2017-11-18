package pregunta6;

public class Bacon extends SandwichDecorator {

	public Bacon(Sandwich sandwich) {
		super(sandwich);
	}
	
	public String make() {
		return super.sandwich.make() + " + turkey";
	}

}
