package exceptions;

import org.junit.Test;

public class ExceptionsTest {

    @Test(expected = MyError.class)
    public void exceptionTest01() {
        throw new MyError();
    }

    @Test(expected = MyRuntimeException.class)
    public void exceptionTest02() {
        throw new MyRuntimeException();
    }

    @Test(expected = MyException.class)
    public void exceptionTest03() throws MyException {
        throw new MyException();
    }

    @Test(expected = MyError.class)
    public void exceptionTest04() {
        throw new MyError(new MyError());
    }

    @Test(expected = MyRuntimeException.class)
    public void exceptionTest05() {
        throw new MyRuntimeException(new MyRuntimeException());
    }

    @Test(expected = MyException.class)
    public void exceptionTest06() throws MyException {
        throw new MyException(new MyException());
    }

    @Test(expected = MyRuntimeException.class)
    public void exceptionTest07() {
        throw new MyRuntimeException(new MyError());
    }

    @Test(expected = MyException.class)
    public void exceptionTest08() throws MyException {
        throw new MyException(new MyRuntimeException());
    }

    @Test(expected = MyException.class)
    public void exceptionTest09() throws MyException {
        throw new MyException(new MyRuntimeException(new MyError()));
    }

}
