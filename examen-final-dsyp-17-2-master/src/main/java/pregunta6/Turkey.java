package pregunta6;

public class Turkey extends SandwichDecorator {

	public Turkey(Sandwich sandwich) {
		super(sandwich);
	}
	
	public String make() {
		return super.sandwich.make() + " + bacon";
	}

}
