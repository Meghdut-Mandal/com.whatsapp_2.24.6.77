package X;

import com.whatsapp.util.Log;

/* renamed from: X.64I  reason: invalid class name */
public final class AnonymousClass64I {
    public final C21390zA A00;
    public final C20810yC A01;
    public final C20720y3 A02;
    public final AnonymousClass1MT A03;
    public final AnonymousClass19O A04;
    public final AnonymousClass1MV A05;

    public final boolean A00() {
        if (!C20800yB.A01(C21000yV.A01, this.A01, 3531)) {
            return false;
        }
        if (!this.A03.A02()) {
            C20720y3.A01(this.A02);
            return false;
        }
        C20720y3 r1 = this.A02;
        if (r1.A0I.A00() || this.A00.A00) {
            return false;
        }
        AnonymousClass19O r3 = this.A04;
        if (r3.A0A() && r3.A03 == null) {
            return false;
        }
        C31901cZ r2 = r1.A07;
        if (r2 != null) {
            r2.Bpn(false, 7);
        } else {
            Log.i("MessageHandler/onDoLogout ignoring due to null sending channel");
        }
        if (!r3.A05 && AnonymousClass19O.A02(r3, "xmpp-bg-to-logout")) {
            r3.A05 = true;
        }
        AnonymousClass000.A14(this.A05.A02, "com.whatsapp.MessageHandler.LOGOUT_ACTION", 3);
        return true;
    }

    public AnonymousClass64I(C21390zA r2, C20810yC r3, C20720y3 r4, AnonymousClass1MT r5, AnonymousClass19O r6, AnonymousClass1MV r7) {
        C36321k7.A1B(r3, r6, r4, r5, r2);
        AnonymousClass00C.A0D(r7, 6);
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A05 = r7;
    }
}
