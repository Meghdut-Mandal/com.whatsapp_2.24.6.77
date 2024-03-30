package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6sL  reason: invalid class name and case insensitive filesystem */
public class C144496sL implements C160027kL {
    public C123185w5 A00;
    public final C19600wD A01;
    public final C107115Mp A02;
    public final C19770wU A03;

    public void Be0() {
        A00(this, (C131626Pu) null);
    }

    public /* synthetic */ void Bip() {
    }

    public static void A00(C144496sL r4, C131626Pu r5) {
        C123185w5 r42 = r4.A00;
        if (r42 != null) {
            AnonymousClass6V2.A00(r42.A00, r42.A01, r42.A03, r5, r42.A04);
            AnonymousClass7gC r0 = r42.A02;
            if (r0 != null) {
                r0.BSR(r5);
            }
        }
    }

    public void Bio(C131626Pu r5) {
        if (r5 == null) {
            r5 = null;
        } else {
            int i = r5.A00;
            if (i == 1 || i == 2 || i == 3) {
                C123185w5 r0 = this.A00;
                if (r0 != null) {
                    AnonymousClass6V2 r3 = r0.A01;
                    AnonymousClass6V2.A02(r3);
                    AnonymousClass6V2.A01(r0.A00, r3, r0.A03, r0.A04);
                    return;
                }
                return;
            }
        }
        A00(this, r5);
    }

    public C144496sL(C123185w5 r2, C19600wD r3, C21159AAt aAt, UserJid userJid, AnonymousClass19A r6, C19770wU r7) {
        this.A00 = r2;
        this.A03 = r7;
        this.A01 = r3;
        this.A02 = new C107115Mp(aAt, this, userJid, r6);
    }
}
