package pregunta1;

public class DeveloperComputerFactory implements AbstractComputerFactory{

	@Override
	public Finish buildFinish() {
		return new BlackFinish();
	}

	@Override
	public Storage buildStorage() {
		return new MediumHardDisk();
	}

	@Override
	public Processor buildProcessor() {
		return new FastProcessor();
	}

	@Override
	public Memory buildMemory() {
		return new ProMemory();
	}

}
