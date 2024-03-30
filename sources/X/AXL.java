package X;

import java.security.cert.CertPathParameters;
import java.util.Collections;
import java.util.Set;

public class AXL implements CertPathParameters {
    public final int A00;
    public final Set A01;
    public final AXM A02;

    public Object clone() {
        return this;
    }

    public AXL(C197809cP r2) {
        this.A02 = r2.A02;
        this.A01 = Collections.unmodifiableSet(r2.A01);
        this.A00 = r2.A00;
    }
}
