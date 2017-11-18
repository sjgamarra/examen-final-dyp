package pregunta4;

public class ConcreteEZMessenger extends AbstractMessaging{

	public ConcreteEZMessenger(AbstractSecurityMode mode) {
		super(mode);
	}

	public void send(String message){
		System.out.println("Message '" + securityMode.send(message) + "' sent via EZ");
	}
}
