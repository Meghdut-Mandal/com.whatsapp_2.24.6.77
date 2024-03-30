package X;

/* renamed from: X.3IH  reason: invalid class name */
public class AnonymousClass3IH {
    public final C21690ze A00;
    public final AnonymousClass31Y A01;

    public AnonymousClass3IH(AnonymousClass31Y r1, C21690ze r2) {
        C36321k7.A0x(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }

    public void A00(String str) {
        AnonymousClass00C.A0D(str, 1);
        if (this.A01.A00.A0E(2087)) {
            this.A00.markerPoint(1029386189, str);
        }
    }

    public void A01(String str) {
        if (this.A01.A00.A0E(2087)) {
            this.A00.markerStart(1029386189, "entry_point", str);
        }
    }

    public void A02(String str, short s) {
        if (this.A01.A00.A0E(2087)) {
            C21690ze r0 = this.A00;
            if (str == null) {
                r0.markerEnd(1029386189, s);
            } else {
                r0.BPI(str, 1029386189, s);
            }
        }
    }
}
