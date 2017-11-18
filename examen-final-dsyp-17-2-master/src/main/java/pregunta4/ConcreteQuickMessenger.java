package pregunta4;

public class ConcreteQuickMessenger extends AbstractMessaging{

	public ConcreteQuickMessenger(AbstractSecurityMode mode) {
		super(mode);
	}

	public void send(String message){
		System.out.println("Message '" + securityMode.send(message) + "' sent via e-mail");
	}
}
