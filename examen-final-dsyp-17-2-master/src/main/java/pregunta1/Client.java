package pregunta1;

public class Client {

    public static void main(String[] args) {
    	
    	
        Computer basicComputer = new Computer(new WhiteFinish(), new SmallHardDisk(), new BasicProcessor(), new BasicMemory());
        System.out.println("Basic Computer:\n" + basicComputer.getDescription());
        
        System.out.println("\n**********************\n");
        
        Computer officeComputer = new Computer(new WhiteFinish(), new MediumHardDisk(), new FastProcessor(), new AdvancedMemory());
        System.out.println("Office Computer:\n" + officeComputer.getDescription());
        
        System.out.println("\n**********************\n");
        
        Computer developerComputer = new Computer(new BlackFinish(), new MediumHardDisk(), new FastProcessor(), new ProMemory());
        System.out.println("Developer Computer:\n" + developerComputer.getDescription());
        
        System.out.println("\n**********************\n");
        
        Computer highEndComputer = new Computer(new BlackFinish(), new HugeFlash(), new HighEndProcessor(), new ProMemory());
        System.out.println("HighEnd Computer Computer:\n" + highEndComputer.getDescription());
    }
}
