package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4aB  reason: invalid class name and case insensitive filesystem */
public class C90454aB implements AnonymousClass4TM {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C90454aB(UserJid userJid, AnonymousClass4TP r2, C62403Ga r3, int i) {
        this.A03 = i;
        this.A02 = r3;
        if (i != 0) {
            this.A00 = userJid;
            this.A01 = r2;
        } else {
            this.A01 = r2;
            this.A00 = userJid;
        }
    }

    public void Bbg(C28981Uw r7) {
        if (this.A03 != 0) {
            AnonymousClass00C.A0D(r7, 0);
            C62403Ga r3 = (C62403Ga) this.A02;
            r3.A02.A00(r7, (UserJid) this.A00);
            C36411kG.A1F(r3.A01, r3, this.A01, 36);
            return;
        }
        C62403Ga r5 = (C62403Ga) this.A02;
        r5.A01.A0H(new AnonymousClass736(r5, this.A01, this.A00, 16));
    }

    public void onError(Throwable th) {
        int i;
        int i2 = this.A03;
        C62403Ga r2 = (C62403Ga) this.A02;
        AnonymousClass17Y r1 = r2.A01;
        if (i2 != 0) {
            i = 13;
        } else {
            i = 12;
        }
        C81123wV.A00(r1, r2, i);
        ((AnonymousClass4TP) this.A01).BWt(C36371kC.A11(new AnonymousClass2YQ((UserJid) this.A00)));
    }
}
