package be.technifutur.decouverte.testException;

public class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    private int num;
    public MyException(String message, int num) {
        super(message);
        this.num = num;
    }

    public int getNum(){
        return num;
    }
}
