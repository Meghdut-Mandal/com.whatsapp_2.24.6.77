package X;

/* renamed from: X.6Jm  reason: invalid class name and case insensitive filesystem */
public final class C130046Jm {
    public String A00;
    public final C21010yW A01;

    public C130046Jm(C21010yW r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public static final void A00(C130046Jm r2, String str, int i, int i2) {
        if (str != null && !str.equals(r2.A00)) {
            C1040157y r1 = new C1040157y();
            r1.A03 = Integer.valueOf(i2);
            r1.A02 = Integer.valueOf(i);
            r2.A01.Bly(r1);
            r2.A00 = str;
        }
    }
}
