package com.google.firebase.iid;

import X.AnonymousClass006;
import X.C18960u7;
import X.C19020uF;
import X.C19030uG;
import X.C19040uH;
import X.C19050uI;
import X.C19080uL;
import X.C19090uM;
import X.C19160uT;
import X.C19170uV;
import X.C19180uW;
import X.C19190uX;
import java.util.Arrays;
import java.util.List;

public final class Registrar {
    public final List getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        C19030uG r4 = new C19030uG(cls, new Class[0]);
        r4.A01(new C19090uM(C18960u7.class, 1));
        r4.A01(new C19090uM(C19160uT.class, 1));
        r4.A01(new C19090uM(C19080uL.class, 1));
        C19040uH r0 = C19170uV.A00;
        AnonymousClass006.A02(r0, "Null factory");
        r4.A02 = r0;
        boolean z = false;
        if (r4.A00 == 0) {
            z = true;
        }
        AnonymousClass006.A08(z, "Instantiation type has already been set.");
        r4.A00 = 1;
        C19020uF A00 = r4.A00();
        C19030uG r1 = new C19030uG(C19180uW.class, new Class[0]);
        r1.A01(new C19090uM(cls, 1));
        C19040uH r02 = C19190uX.A00;
        AnonymousClass006.A02(r02, "Null factory");
        r1.A02 = r02;
        return Arrays.asList(new C19020uF[]{A00, r1.A00(), C19050uI.A00("fire-iid", "20.0.0")});
    }
}
