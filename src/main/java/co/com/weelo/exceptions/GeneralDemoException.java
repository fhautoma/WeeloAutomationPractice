package co.com.weelo.exceptions;

public class GeneralDemoException extends AssertionError {
    private  static  final long serialVersionUID = 1L;

    public GeneralDemoException(String message, Throwable cause) {
        super(message, cause);
    }
}