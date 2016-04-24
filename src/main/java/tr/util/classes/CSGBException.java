package tr.util.classes;


public class CSGBException extends Exception {
    private ExceptionType exceptionType;

    public CSGBException(ExceptionType exceptionType) {
        this.exceptionType = exceptionType;
    }

    public CSGBException(String message, ExceptionType exceptionType) {
        super(message);
        this.exceptionType = exceptionType;
    }

    public CSGBException(String message, Throwable cause, ExceptionType exceptionType) {
        super(message, cause);
        this.exceptionType = exceptionType;
    }

    public CSGBException(Throwable cause, ExceptionType exceptionType) {
        super(cause);
        this.exceptionType = exceptionType;
    }

    public CSGBException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ExceptionType exceptionType) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.exceptionType = exceptionType;
    }

    public ExceptionType getExceptionType() {
        return this.exceptionType;
    }

    public void setExceptionType(ExceptionType exceptionType) {
        this.exceptionType = exceptionType;
    }
}
