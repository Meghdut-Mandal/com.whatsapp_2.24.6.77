package X;

import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.util.Set;

/* renamed from: X.9cP  reason: invalid class name and case insensitive filesystem */
public class C197809cP {
    public int A00 = 5;
    public Set A01 = C36441kJ.A16();
    public final AXM A02;

    public C197809cP(PKIXBuilderParameters pKIXBuilderParameters) {
        this.A02 = new AXM(new C198259dA((PKIXParameters) pKIXBuilderParameters));
        this.A00 = pKIXBuilderParameters.getMaxPathLength();
    }

    public C197809cP(AXM axm) {
        this.A02 = axm;
    }
}
