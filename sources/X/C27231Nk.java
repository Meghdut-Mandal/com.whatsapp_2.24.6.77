package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1Nk  reason: invalid class name and case insensitive filesystem */
public final class C27231Nk {
    public final AnonymousClass19A A00;

    public C27231Nk(AnonymousClass19A r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final Object A00(C27231Nk r7, AnonymousClass148 r8, String str, C023509x r10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C12600iM.A01;
        C12600iM r3 = new C12600iM(AnonymousClass0AA.A01(r10));
        AnonymousClass19A r4 = r7.A00;
        String A09 = r4.A09();
        C50682lJ r2 = new C50682lJ(r8, A09, str);
        AnonymousClass32I r1 = new AnonymousClass32I(r3);
        C203399nx r6 = r2.A00;
        AnonymousClass00C.A08(r6);
        r4.A0E(new C35921jT(r2, r1, 5), r6, A09, 422, 32000);
        Object A002 = r3.A00();
        if (A002 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return AnonymousClass0AJ.A00;
        }
        return A002;
    }
}
