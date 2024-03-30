package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.1OK  reason: invalid class name */
public final class AnonymousClass1OK implements AnonymousClass1OJ {
    public final C20780y9 A00;

    public AnonymousClass1OK(C20780y9 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public Object Bot(C107995Rt r7, C023509x r8) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AnonymousClass0AR.A02;
        AnonymousClass0AR r5 = new AnonymousClass0AR(1, AnonymousClass0AA.A01(r8));
        r5.A0J();
        C20780y9 r4 = this.A00;
        Class<C20300xL> cls = C20300xL.class;
        C20300xL r0 = (C20300xL) r4.A01(cls);
        C21126A9m a9m = new C21126A9m(this, r5);
        r0.A08(a9m);
        C19460v5 r1 = r0.A05;
        if (r1.A05()) {
            r1.A02();
            throw new NullPointerException("deleteVNameCert");
        }
        ((C20300xL) r4.A01(cls)).A09(a9m);
        r5.resumeWith(new C119485pt(C108095Sd.RESET_IDENTITY_FAILED, false));
        return r5.A0G();
    }
}
