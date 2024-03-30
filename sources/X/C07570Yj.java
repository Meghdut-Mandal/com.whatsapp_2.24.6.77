package X;

import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* renamed from: X.0Yj  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C07570Yj {
    public static final Object A00(C023509x r1, C007403e r2) {
        r2.B2S((CancellationException) null);
        return AnonymousClass0AO.A00(r2.BNp(r1));
    }

    public static final void A03(C005102h r3) {
        C007403e r0 = (C007403e) r3.get(C007403e.A00);
        if (r0 != null) {
            Iterator it = r0.B9e().iterator();
            while (it.hasNext()) {
                ((C007403e) it.next()).B2S((CancellationException) null);
            }
        }
    }

    public static final C007403e A01(C005102h r2) {
        C007403e r0 = (C007403e) r2.get(C007403e.A00);
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0f(r2, "Current context doesn't contain Job in it: ", AnonymousClass000.A0u());
    }

    public static final void A02(CancellationException cancellationException, C005102h r2) {
        C007403e r0 = (C007403e) r2.get(C007403e.A00);
        if (r0 != null) {
            r0.B2S(cancellationException);
        }
    }

    public static final void A04(C005102h r1) {
        C007403e r12 = (C007403e) r1.get(C007403e.A00);
        if (r12 != null && !r12.BL7()) {
            throw r12.B9P();
        }
    }
}
