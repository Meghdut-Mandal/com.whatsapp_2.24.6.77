package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.63F  reason: invalid class name */
public class AnonymousClass63F {
    public final /* synthetic */ C139556k5 A00;
    public final /* synthetic */ AtomicReference A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public AnonymousClass63F(C139556k5 r1, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3) {
        this.A00 = r1;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = atomicReference3;
    }

    public void A00(double d) {
        AtomicReference atomicReference;
        Double valueOf;
        if (d == -1.0d) {
            atomicReference = this.A03;
            valueOf = C90494aF.A0S();
        } else {
            atomicReference = this.A02;
            valueOf = Double.valueOf(d * C90494aF.A00(this.A03));
        }
        atomicReference.set(valueOf);
    }
}
