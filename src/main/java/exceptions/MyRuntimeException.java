package exceptions;

public class MyRuntimeException extends RuntimeException {

    public MyRuntimeException() {
        super();
    }

    public MyRuntimeException(Throwable cause) {
        super(cause);
    }
}
