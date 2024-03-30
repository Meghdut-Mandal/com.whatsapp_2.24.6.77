package X;

import javax.net.ssl.SSLException;

/* renamed from: X.0yt  reason: invalid class name and case insensitive filesystem */
public class C21240yt extends Exception {
    public final byte description;
    public final boolean errorTransient = false;
    public final SSLException ex;

    public C21240yt(SSLException sSLException, byte b, boolean z) {
        this.description = b;
        this.ex = sSLException;
    }

    public C21240yt(SSLException sSLException, byte b) {
        this.description = b;
        this.ex = sSLException;
    }
}
