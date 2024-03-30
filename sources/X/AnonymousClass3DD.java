package X;

/* renamed from: X.3DD  reason: invalid class name */
public final class AnonymousClass3DD {
    public final C21430zE A00;
    public final C19600wD A01;

    public final String A00() {
        int A002 = AnonymousClass1D4.A00(this.A01.A04());
        if (A002 == 0) {
            return "2G";
        }
        if (A002 == 1) {
            return "3G";
        }
        if (A002 == 2) {
            return "4G";
        }
        if (A002 == 3) {
            return "5G";
        }
        if (A002 != 4) {
            return "UNKNOWN";
        }
        return "WIFI";
    }

    public AnonymousClass3DD(C19600wD r1, C21430zE r2) {
        C36321k7.A0x(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }
}
