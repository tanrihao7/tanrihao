package com.Exception;

/**
 * @date 2020/9/25 0:33
 */
public class CustomExcption extends Exception {
    public String message;
    public Throwable throwable;

    public CustomExcption(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
