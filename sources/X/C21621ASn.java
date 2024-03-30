package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.ASn  reason: case insensitive filesystem */
public final class C21621ASn implements C23057B2d {
    public String BER() {
        return "m";
    }

    public Set BE3(AnonymousClass3T1 r2) {
        if (r2.A15) {
            return Collections.singleton("s");
        }
        return null;
    }

    public AnonymousClass9IU BES(AnonymousClass1S3 r4) {
        if (r4.A08 == null) {
            return null;
        }
        boolean booleanValue = r4.A01().booleanValue();
        AnonymousClass9IU r1 = new AnonymousClass9IU();
        Set singleton = Collections.singleton("s");
        if (booleanValue) {
            r1.A00 = singleton;
            return r1;
        }
        r1.A01 = singleton;
        return r1;
    }
}
