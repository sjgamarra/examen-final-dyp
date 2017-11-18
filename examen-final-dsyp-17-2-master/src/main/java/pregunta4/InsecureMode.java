package pregunta4;

public class InsecureMode implements AbstractSecurityMode {
    public String send(String message) {
        return message;
    }
}
