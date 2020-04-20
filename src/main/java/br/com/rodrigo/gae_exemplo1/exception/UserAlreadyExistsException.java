package br.com.rodrigo.gae_exemplo1.exception;

public class UserAlreadyExistsException extends Exception {
    private String message;

    public UserAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;

    }
}
