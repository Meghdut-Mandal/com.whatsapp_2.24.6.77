package com.whatsapp.jobqueue.job.exception;

public class UnrecoverableErrorException extends Exception {
    public UnrecoverableErrorException(Throwable th) {
        super(th);
    }
}
