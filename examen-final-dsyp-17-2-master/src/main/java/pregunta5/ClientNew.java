package pregunta5;

public class ClientNew {

    public static void main(String[] args) {
        int objects = 30;
        LoggerFlyweight flyweight = new LoggerFlyweight();
        for (int i = 0; i < objects; i++) {
        	Logger loggerUndergraduate = flyweight.getLogger("pe.edu.unmsm.undergraduate");
        	loggerUndergraduate.log("message" + (i + 1), LogType.INFO);
        	Logger loggePostgraduate = flyweight.getLogger("pe.edu.unmsm.postgraduate");
            loggePostgraduate.log("message" + (i + 1), LogType.INFO);
            /*
        	Logger loggerUndergraduate = new Logger("pe.edu.unmsm.undergraduate");
            loggerUndergraduate.log("message" + (i + 1), LogType.INFO);
            Logger loggePostgraduate = new Logger("pe.edu.unmsm.postgraduate");
            loggePostgraduate.log("message" + (i + 1), LogType.INFO);
            */
        }
    }
}
