package exceptions;

public class RobotException extends Exception {
    public RobotException() {
        super("Falha ao instanciar o Robot");
    }
}
