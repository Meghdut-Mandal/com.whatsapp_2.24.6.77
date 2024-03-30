package X;

import java.security.cert.CertPathBuilderException;

/* renamed from: X.Abr  reason: case insensitive filesystem */
public class C21867Abr extends CertPathBuilderException {
    public Throwable cause;

    public C21867Abr(Throwable th) {
        super("Error finding target certificate.");
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
