package pregunta6;

public class Beef extends SandwichDecorator {

	public Beef(Sandwich sandwich) {
		super(sandwich);
	}
	
	public String make() {
		return super.sandwich.make() + " + beef";
	}

}
