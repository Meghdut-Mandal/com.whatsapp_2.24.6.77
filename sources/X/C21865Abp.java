package X;

import java.security.cert.CRLException;

/* renamed from: X.Abp  reason: case insensitive filesystem */
public class C21865Abp extends CRLException {
    public Throwable cause;

    public C21865Abp(Throwable th) {
        super("Exception reading IssuingDistributionPoint");
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
