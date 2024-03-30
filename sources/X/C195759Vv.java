package X;

/* renamed from: X.9Vv  reason: invalid class name and case insensitive filesystem */
public class C195759Vv {
    public final AnonymousClass11F A00;
    public final C64933Qa A01;

    public static C195759Vv A00(AnonymousClass3T1 r3) {
        return new C195759Vv(r3.A0L(), r3.A1J);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C195759Vv) {
            C195759Vv r4 = (C195759Vv) obj;
            if (this.A01.equals(r4.A01)) {
                AnonymousClass11F r1 = this.A00;
                AnonymousClass11F r0 = r4.A00;
                if (r1 == null) {
                    if (r0 != null) {
                        return false;
                    }
                    return true;
                } else if (r1.equals(r0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.A01.hashCode() + 31) * 31) + AnonymousClass000.A0H(this.A00);
    }

    public C195759Vv(AnonymousClass11F r1, C64933Qa r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C36351kA.A1K(this.A01, A0u);
        A0u.append(". [sender_jid=");
        return C165567td.A0X(this.A00, A0u);
    }
}
