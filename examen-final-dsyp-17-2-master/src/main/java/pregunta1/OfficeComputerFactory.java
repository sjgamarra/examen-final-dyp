package pregunta1;

public class OfficeComputerFactory implements AbstractComputerFactory {

	@Override
	public Finish buildFinish() {
		return new WhiteFinish();
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
		return new AdvancedMemory();
	}

}
