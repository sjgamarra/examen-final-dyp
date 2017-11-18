package pregunta1;

public class HighEndComputerFactory implements AbstractComputerFactory{

	@Override
	public Finish buildFinish() {
		return new BlackFinish();
	}

	@Override
	public Storage buildStorage() {
		return new HugeFlash();
	}

	@Override
	public Processor buildProcessor() {
		return new HighEndProcessor();
	}

	@Override
	public Memory buildMemory() {
		return new ProMemory();
	}

}
