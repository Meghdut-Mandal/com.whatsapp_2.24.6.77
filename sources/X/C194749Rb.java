package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9Rb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C194749Rb {
    public final /* synthetic */ AnonymousClass142 A00;
    public final /* synthetic */ C202319lY A01;
    public final /* synthetic */ C167687yZ A02;

    public /* synthetic */ C194749Rb(AnonymousClass142 r1, C202319lY r2, C167687yZ r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void A00(C202059ky r6, String str, String str2) {
        C135086c7 r0;
        C167687yZ r4 = this.A02;
        C202319lY r3 = this.A01;
        AnonymousClass142 r2 = this.A00;
        if (r6 != null) {
            AnonymousClass9IK.A01(r4.A01);
            C167687yZ.A01(r6, r4);
            return;
        }
        r3.A0K = str2;
        C175928bI r02 = (C175928bI) r3.A0A;
        C18740tg.A06(r02);
        C201599jw r1 = r02.A0G;
        C18740tg.A06(r1);
        if (str != null) {
            r0 = C202349ld.A00(str, "mandateNo");
        } else {
            r0 = null;
        }
        r1.A08 = r0;
        r3.A02 = 417;
        r3.A0E = (UserJid) r2.A0H;
        C36391kE.A1S(r4.A0M, r4, r3, 10);
    }
}
