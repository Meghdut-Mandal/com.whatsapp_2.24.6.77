package X;

import com.whatsapp.Me;

/* renamed from: X.1ZS  reason: invalid class name */
public final class AnonymousClass1ZS {
    public final C19730wQ A00;
    public final C18820ts A01;
    public final AnonymousClass1M4 A02;

    public AnonymousClass1ZS(C19730wQ r2, C18820ts r3, AnonymousClass1M4 r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r3, 3);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final String A00() {
        String A012;
        C19730wQ r0 = this.A00;
        r0.A0G();
        Me me = r0.A00;
        if (me == null || (A012 = AnonymousClass1M4.A01(me.cc, me.number)) == null || A012.length() == 0) {
            return "ZZ";
        }
        return A012;
    }

    public final String A01(String str) {
        String A03;
        if (AnonymousClass00C.A0J(str, "Global")) {
            return "Global";
        }
        if (str != null && (A03 = this.A02.A03(this.A01, str)) != null) {
            return A03;
        }
        C19730wQ r0 = this.A00;
        r0.A0G();
        Me me = r0.A00;
        if (me != null) {
            return this.A02.A03(this.A01, AnonymousClass1M4.A01(me.cc, me.number));
        }
        return null;
    }
}
