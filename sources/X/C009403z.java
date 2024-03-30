package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.03z  reason: invalid class name and case insensitive filesystem */
public abstract class C009403z {
    public static final AnonymousClass041 A01() {
        C007703h r1 = new C007703h((C007403e) null);
        C005502l r0 = C006702x.A00;
        return new AnonymousClass041(r1.plus(AnonymousClass03K.A00));
    }

    public static final Object A00(C023509x r2, C009003v r3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C007503f.A00;
        C15540nV r0 = new C15540nV(r2, r2.getContext());
        return AnonymousClass0R7.A00(r0, r3, r0);
    }

    public static final AnonymousClass041 A02(C005102h r2) {
        if (r2.get(C007403e.A00) == null) {
            r2 = r2.plus(new C007603g((C007403e) null));
        }
        return new AnonymousClass041(r2);
    }

    public static final void A03(CancellationException cancellationException, AnonymousClass040 r3) {
        C007403e r0 = (C007403e) r3.BAE().get(C007403e.A00);
        if (r0 != null) {
            r0.B2S(cancellationException);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Scope cannot be cancelled because it does not have a job: ");
        sb.append(r3);
        throw new IllegalStateException(sb.toString());
    }

    public static final boolean A04(AnonymousClass040 r1) {
        C007403e r0 = (C007403e) r1.BAE().get(C007403e.A00);
        if (r0 != null) {
            return r0.BL7();
        }
        return true;
    }
}
