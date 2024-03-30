package org.chromium.net;

public abstract class QuicException extends NetworkException {
    public abstract int getQuicDetailedErrorCode();

    public QuicException(String str, Throwable th) {
        super(str, th);
    }
}
