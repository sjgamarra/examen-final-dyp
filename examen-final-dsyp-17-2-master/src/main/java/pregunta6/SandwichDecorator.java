package pregunta6;

public class SandwichDecorator implements Sandwich{

	Sandwich sandwich;
	
	public SandwichDecorator(Sandwich sandwich) {
		this.sandwich = sandwich;
	}
	
	@Override
	public String make() {
		return "";
	}

}
