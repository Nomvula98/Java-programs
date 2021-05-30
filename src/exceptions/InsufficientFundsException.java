package exceptions;

public class InsufficientFundsException extends Exception {

    private static final long serialVersionUID = 5680295425422511166L;

    public InsufficientFundsException(){
        super();
    }
    public InsufficientFundsException(String msg){
        super(msg);
    }
}
