package X;

import java.security.InvalidKeyException;

/* renamed from: X.Abm  reason: case insensitive filesystem */
public class C21862Abm extends InvalidKeyException {
    public final Throwable cause;

    public C21862Abm(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
