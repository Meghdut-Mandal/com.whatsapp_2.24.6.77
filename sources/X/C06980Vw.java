package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0Vw  reason: invalid class name and case insensitive filesystem */
public abstract class C06980Vw {
    public static final AnonymousClass035 A00 = AnonymousClass035.A00("CLOSED");

    public static final Object A00(C009003v r5, C15460nN r6, long j) {
        while (true) {
            if (r6.A00 >= j && !r6.A03()) {
                return r6;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass0XE.A00;
            Object obj = atomicReferenceFieldUpdater.get(r6);
            AnonymousClass035 r0 = A00;
            if (obj == r0) {
                return r0;
            }
            C15460nN r1 = (C15460nN) ((AnonymousClass0XE) obj);
            if (r1 == null) {
                r1 = (C15460nN) r5.invoke(Long.valueOf(r6.A00 + 1), r6);
                if (AnonymousClass0A8.A00(r6, (Object) null, r1, atomicReferenceFieldUpdater)) {
                    if (r6.A03()) {
                        r6.A02();
                    }
                }
            }
            r6 = r1;
        }
    }
}
