package pregunta5;

import java.util.HashMap;
import java.util.Map;

public class LoggerFlyweight {
	Map<String, Logger> loggers;
	
	public LoggerFlyweight() {
		this.loggers = new HashMap<String, Logger>();
	}
	
	public Logger getLogger(String subsystem){
		Logger logger;
		if(loggers.containsKey(subsystem)){
			logger = loggers.get(subsystem);
		}else{
			System.out.println("CREANDO");
			logger = new Logger(subsystem);
			loggers.put(subsystem, logger);
		}
		return logger;
	}
}
