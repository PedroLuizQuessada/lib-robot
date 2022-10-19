package exceptions;

public class CaracterException extends Exception {
    public CaracterException(char c) {
        super(String.format("Caracter %s não definido", c));
    }
}
