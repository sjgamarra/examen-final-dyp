package pregunta4;

public class ConcreteVIPMessenger extends AbstractMessaging{

	public ConcreteVIPMessenger(AbstractSecurityMode mode) {
		super(mode);
	}

	public void send(String message){
		System.out.println("Message '" + securityMode.send(message) + "' sent via P2P");
	}
}
