package pregunta1;

import java.util.ArrayList;
import java.util.List;

public class ClientNew {

    public static void main(String[] args) {
    	
    	List<AbstractComputerFactory> factories = new ArrayList<AbstractComputerFactory>();
        factories.add(new BasicComputerFactory());
        factories.add(new OfficeComputerFactory());
        factories.add(new DeveloperComputerFactory());
        factories.add(new HighEndComputerFactory());
        
        for (AbstractComputerFactory factory : factories) {
        	Computer computer = new Computer(factory.buildFinish(), factory.buildStorage(), factory.buildProcessor(), factory.buildMemory());
        	System.out.println(factory.getClass().getSimpleName() + " Computer:\n"+ computer.getDescription());
        	System.out.println("\n**********************\n");
		}
    	
    	/*
    	AbstractComputerFactory factory = new BasicComputerFactory();
    	
    	Computer basicComputer = new Computer(factory.buildFinish(), factory.buildStorage(), factory.buildProcessor(), factory.buildMemory());   	
        System.out.println("Basic Computer:\n" + basicComputer.getDescription());
        
        System.out.println("\n**********************\n");
        
        factory = new OfficeComputerFactory();
        Computer officeComputer = new Computer(factory.buildFinish(), factory.buildStorage(), factory.buildProcessor(), factory.buildMemory());
        System.out.println("Office Computer:\n" + officeComputer.getDescription());
        
        System.out.println("\n**********************\n");
        
        factory = new DeveloperComputerFactory();
        Computer developerComputer = new Computer(factory.buildFinish(), factory.buildStorage(), factory.buildProcessor(), factory.buildMemory());
        System.out.println("Developer Computer:\n" + developerComputer.getDescription());
        
        System.out.println("\n**********************\n");
        
        factory = new HighEndComputerFactory();
        Computer highEndComputer = new Computer(factory.buildFinish(), factory.buildStorage(), factory.buildProcessor(), factory.buildMemory());
        System.out.println("HighEnd Computer Computer:\n" + highEndComputer.getDescription());
        */
    	
        
    }
}
