package paquete;

public class MessageUtil {
  private String message;

  public MessageUtil(String message) {
    this.message = message;
  }

  public String printMessage() {
   System.err.println("hola gusugus");
    return message;
  }

  public String salutationMessage() {
    message = "Hi!" + message;
   System.err.println(message);
    return message;
  }
}