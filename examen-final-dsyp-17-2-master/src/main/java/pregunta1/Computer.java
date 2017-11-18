package pregunta1;

public class Computer {
    private Finish finish;
    private Storage storage;
    private Processor processor;
    private Memory memory;
    
    public Computer(Finish finish, Storage storage, Processor processor, Memory memory)
    {
        this.finish = finish;
        this.storage = storage;
        this.processor = processor;
        this.memory = memory;
    }
    
    public float getTotalPrice()
    {
        return this.finish.price + this.storage.price + this.processor.price + this.memory.price;
    }
    
    public String getDescription()
    {
        return String.format("Your configuration => \n%s \n%s \n%s \n%s \nTotal: $%.2f", this.finish.toString(), this.storage.toString(), this.processor.toString(), this.memory.toString(), this.getTotalPrice());
    }
}
