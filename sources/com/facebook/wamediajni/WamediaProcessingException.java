package com.facebook.wamediajni;

public class WamediaProcessingException extends Exception {
    public WamediaProcessingException(String str) {
        super(str);
    }

    public WamediaProcessingException(String str, Throwable th) {
        super(str, th);
    }

    public WamediaProcessingException(Throwable th) {
        super(th);
    }

    public WamediaProcessingException() {
    }
}
