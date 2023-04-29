package com.homework16.homework16;

public class WrongPassException extends  RuntimeException {
    public WrongPassException() {
    }

    public WrongPassException(String message) {
        super(message);
    }

    public WrongPassException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongPassException(Throwable cause) {
        super(cause);
    }

    public WrongPassException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
