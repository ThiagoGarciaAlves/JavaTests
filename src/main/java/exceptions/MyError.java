package exceptions;

public class MyError extends Error {

    public MyError() {
        super();
    }

    public MyError(Throwable cause) {
        super(cause);
    }
}
