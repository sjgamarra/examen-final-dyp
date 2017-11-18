package pregunta4;

public class SelfDestructingMode implements AbstractSecurityMode{
    public String send(String message) {
        message = "☠" + message + "☠";
        return message;
    }
}
