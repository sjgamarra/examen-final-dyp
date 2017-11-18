package pregunta4;

public class SecureMode implements AbstractSecurityMode {
    private String encrypt(String message) {
        message = message.substring(message.length() - 1) + message.substring(0, message.length() - 1);
        return message;
    }
    
    public String send(String message) {
        return encrypt(message);
    }
}
