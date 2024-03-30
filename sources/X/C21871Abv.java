package X;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;

/* renamed from: X.Abv  reason: case insensitive filesystem */
public class C21871Abv extends CertPathValidatorException {
    public Throwable cause;

    public C21871Abv() {
        super("OCSP response expired");
    }

    public C21871Abv(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public C21871Abv(String str, Throwable th, CertPath certPath, int i) {
        super(str, th, certPath, i);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public static C21871Abv A00(String str, Throwable th, CertPath certPath, int i) {
        return new C21871Abv(str, th, certPath, i);
    }
}
