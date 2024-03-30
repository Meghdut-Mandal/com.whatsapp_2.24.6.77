package com.whatsapp.jobqueue.job.exception;

public class OutOfMemoryException extends Exception {
    public final int messageDistributionType;

    public OutOfMemoryException(int i) {
        super("OutOfMemoryError");
        this.messageDistributionType = i;
    }
}
