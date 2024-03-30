package X;

/* renamed from: X.1Y5  reason: invalid class name */
public class AnonymousClass1Y5 {
    public final AnonymousClass1DE A00;
    public final C19970wo A01;

    public AnonymousClass1Y5(C19970wo r1, AnonymousClass1DE r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public boolean A00(C124935z2 r7) {
        if (System.currentTimeMillis() - r7.A04 >= 86400000) {
            r7.A04 = System.currentTimeMillis();
            r7.A01 = 1;
        } else {
            int i = r7.A01;
            if (i >= 15) {
                return false;
            }
            r7.A01 = i + 1;
        }
        this.A00.A04(r7);
        return true;
    }
}
