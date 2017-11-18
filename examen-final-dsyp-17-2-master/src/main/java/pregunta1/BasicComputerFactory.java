package pregunta1;

public class BasicComputerFactory implements AbstractComputerFactory{

	@Override
	public Finish buildFinish() {
		return new WhiteFinish();
	}

	@Override
	public Storage buildStorage() {
		return new SmallHardDisk();
	}

	@Override
	public Processor buildProcessor() {
		return new BasicProcessor();
	}

	@Override
	public Memory buildMemory() {
		return new BasicMemory();
	}

}
