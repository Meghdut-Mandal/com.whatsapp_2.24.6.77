package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6sM  reason: invalid class name and case insensitive filesystem */
public final class C144506sM implements C160027kL {
    public C121415t6 A00;
    public final C19600wD A01;
    public final C107115Mp A02;
    public final C19770wU A03;

    public void Be0() {
        A00(this, (C131626Pu) null);
    }

    public /* synthetic */ void Bip() {
    }

    public static final void A00(C144506sM r2, C131626Pu r3) {
        C121415t6 r0 = r2.A00;
        if (r0 != null) {
            C132656Ur.A00(r0.A00, r0.A01, r3, r0.A02);
        }
    }

    public void Bio(C131626Pu r4) {
        if (r4 == null) {
            r4 = null;
        } else {
            switch (r4.A00) {
                case 1:
                case 2:
                case 3:
                    C121415t6 r0 = this.A00;
                    if (r0 != null) {
                        C132656Ur r2 = r0.A01;
                        C132656Ur.A02(r2);
                        C132656Ur.A01(r0.A00, r2, r0.A02);
                        return;
                    }
                    return;
            }
        }
        A00(this, r4);
    }

    public C144506sM(C121415t6 r2, C19600wD r3, C21159AAt aAt, UserJid userJid, AnonymousClass19A r6, C19770wU r7) {
        C36321k7.A0y(r7, r6);
        AnonymousClass00C.A0D(aAt, 4);
        AnonymousClass00C.A0D(r3, 6);
        this.A03 = r7;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = new C107115Mp(aAt, this, userJid, r6);
    }
}
