package X;

/* renamed from: X.9Pt  reason: invalid class name and case insensitive filesystem */
public class C194449Pt {
    public final AF3 A00;

    public C203399nx A01(byte[] bArr) {
        AnonymousClass1AL[] r3 = new AnonymousClass1AL[3];
        AF3 af3 = this.A00;
        C36381kD.A1N("key-type", af3.A03, r3);
        C165587tf.A1L("key-version", af3.A04, r3);
        C36351kA.A1N("provider", af3.A05, r3);
        return new C203399nx("pin", AF3.A00(af3, bArr), r3);
    }

    public C194449Pt(AF3 af3) {
        this.A00 = af3;
    }

    public static void A00(C194449Pt r4, C198799eD r5, C236119d r6, byte[] bArr, AnonymousClass1AL[] r8) {
        r5.A02.A0H(r6, new C203399nx(r4.A01(bArr), "account", r8), "set", AnonymousClass6X5.A0L);
    }
}
