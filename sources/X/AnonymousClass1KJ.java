package X;

/* renamed from: X.1KJ  reason: invalid class name */
public final class AnonymousClass1KJ {
    public final C19730wQ A00;
    public final C19970wo A01;
    public final C20310xM A02;

    public AnonymousClass1KJ(C19730wQ r2, C19970wo r3, C20310xM r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public final void A00(AnonymousClass11F r6, boolean z) {
        C19970wo r1 = this.A01;
        AnonymousClass2bD r2 = new AnonymousClass2bD(new C64933Qa(r6, C237919w.A00(this.A00, r1), true), C19970wo.A00(r1));
        if (z) {
            byte[] bArr = new byte[32];
            AnonymousClass136.A00().nextBytes(bArr);
            r2.A1b = bArr;
            r2.A13 = true;
        }
        this.A02.A0h(r2);
    }
}
