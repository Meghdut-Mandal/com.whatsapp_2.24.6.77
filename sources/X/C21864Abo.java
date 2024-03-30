package X;

import java.security.cert.CRLException;

/* renamed from: X.Abo  reason: case insensitive filesystem */
public class C21864Abo extends CRLException {
    public Throwable cause;

    public C21864Abo(Throwable th) {
        super("Exception reading IssuingDistributionPoint");
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
