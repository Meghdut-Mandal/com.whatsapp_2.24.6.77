package X;

/* renamed from: X.9Pi  reason: invalid class name and case insensitive filesystem */
public final class C194349Pi {
    public final C21010yW A00;

    public C194349Pi(C21010yW r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final void A00(String str, String str2, int i, int i2, int i3, int i4) {
        if (i != 0) {
            C176418c5 r1 = new C176418c5();
            r1.A05 = str;
            r1.A02 = Integer.valueOf(i);
            r1.A03 = Integer.valueOf(i2);
            r1.A00 = Integer.valueOf(i3);
            r1.A01 = Integer.valueOf(i4);
            r1.A04 = str2;
            this.A00.Bly(r1);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EmailVerificationLogger/logEmailAction/failed to log action; entrypoint: ");
        A0u.append(i);
        A0u.append(", surface: ");
        A0u.append(i2);
        C36321k7.A1U("; action: ", A0u, i3);
    }
}
