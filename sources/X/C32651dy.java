package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1dy  reason: invalid class name and case insensitive filesystem */
public final class C32651dy {
    public final AnonymousClass1LW A00;
    public final C20810yC A01;
    public final C21010yW A02;

    public C32651dy(AnonymousClass1LW r2, C20810yC r3, C21010yW r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r2, 3);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public final void A00(AnonymousClass147 r4) {
        String str;
        AnonymousClass00C.A0D(r4, 0);
        if (C20800yB.A01(C21000yV.A02, this.A01, 5245)) {
            AnonymousClass2OP r1 = new AnonymousClass2OP();
            r1.A00 = r4.getRawString();
            UserJid A012 = this.A00.A01(r4);
            if (A012 != null) {
                str = A012.getRawString();
            } else {
                str = null;
            }
            r1.A01 = str;
            this.A02.Bly(r1);
        }
    }
}
