package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.1Ek  reason: invalid class name and case insensitive filesystem */
public final class C24951Ek {
    public final AnonymousClass12O A00;
    public final C20810yC A01;
    public final C21010yW A02;

    public C24951Ek(AnonymousClass12O r2, C20810yC r3, C21010yW r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r2, 3);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public final void A00(AnonymousClass3T1 r4) {
        String str;
        if (C20800yB.A01(C21000yV.A02, this.A01, 7564)) {
            Jid A0L = r4.A0L();
            if (A0L instanceof C223313w) {
                A0L = this.A00.A0A((C223313w) A0L);
            }
            C44612Oe r1 = new C44612Oe();
            r1.A00 = "HOSTED_ACCOUNT_SYSTEM_MESSAGE_OUT_OF_ORDER";
            if (A0L != null) {
                str = A0L.user;
            } else {
                str = null;
            }
            r1.A01 = String.valueOf(str);
            this.A02.Bly(r1);
        }
    }
}
