package X;

/* renamed from: X.605  reason: invalid class name */
public final class AnonymousClass605 {
    public final C1506776e A00 = C1506776e.A02(new AnonymousClass61R[16]);

    public final void A00(Throwable th) {
        C1506776e r5 = this.A00;
        int i = r5.A00;
        AnonymousClass0AP[] r3 = new AnonymousClass0AP[i];
        for (int i2 = 0; i2 < i; i2++) {
            r3[i2] = ((AnonymousClass61R) r5.A01[i2]).A01;
        }
        for (int i3 = 0; i3 < i; i3++) {
            r3[i3].B2T(th);
        }
        if (r5.A00 != 0) {
            throw AnonymousClass001.A09("uncancelled requests present");
        }
    }
}
