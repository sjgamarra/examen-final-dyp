package pregunta6;

public class Egg extends SandwichDecorator {

	public Egg(Sandwich sandwich) {
		super(sandwich);
	}
	
	public String make() {
		return super.sandwich.make() + " + egg";
	}

}
