package pregunta1;

public interface AbstractComputerFactory {
	
	public Finish buildFinish();
	public Storage buildStorage();
	public Processor buildProcessor();
	public Memory buildMemory();
}
