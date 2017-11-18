package pregunta4;

public class ClientNew {

    public static void main(String[] args) {
        String message = "Hello";
        
        AbstractSecurityMode insecureMode = new InsecureMode();
        AbstractSecurityMode secureMode = new SecureMode();
        AbstractSecurityMode selfDestructingMode = new SelfDestructingMode();
        
        AbstractMessaging messenger = new ConcreteQuickMessenger(insecureMode);
        messenger.send(message);
        
        messenger = new ConcreteQuickMessenger(secureMode);
        messenger.send(message);
        
        messenger = new ConcreteQuickMessenger(selfDestructingMode);
        messenger.send(message);
        
        messenger = new ConcreteVIPMessenger(insecureMode);
        messenger.send(message);
        
        messenger = new ConcreteVIPMessenger(secureMode);
        messenger.send(message);
        
        messenger = new ConcreteVIPMessenger(selfDestructingMode);
        messenger.send(message);
        
        messenger = new ConcreteEZMessenger(insecureMode);
        messenger.send(message);
        
        messenger = new ConcreteEZMessenger(secureMode);
        messenger.send(message);
        
        messenger = new ConcreteEZMessenger(selfDestructingMode);
        messenger.send(message);
    }
}
