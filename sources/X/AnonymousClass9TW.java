package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9TW  reason: invalid class name */
public final class AnonymousClass9TW {
    public final /* synthetic */ C193329La A00;

    public void A00(AnonymousClass9VR r7, C193989Nr r8) {
        boolean z;
        C193329La r3 = this.A00;
        C202279lS r2 = r3.A00;
        r2.A01 = false;
        String str = r8.A06;
        if (str == null) {
            z = false;
        } else if (str.equals(r3.A02)) {
            z = true;
        } else {
            return;
        }
        C29461Ws r0 = r2.A0B;
        UserJid userJid = r3.A01;
        r0.A0A(r7, userJid, z);
        boolean z2 = r3.A03;
        if (!z2 || !r7.A01.isEmpty()) {
            r2.A04.A0C(new AnonymousClass8W9(new C193069Js(r7.A01, z2, false), userJid));
        } else {
            r2.A04.A0C(new AnonymousClass8W8(userJid));
        }
    }

    public void A01(C193989Nr r8, int i) {
        C193329La r2 = this.A00;
        C36321k7.A1S("onFetchCollectionsFailure errorCode =", AnonymousClass000.A0u(), i);
        C202279lS r5 = r2.A00;
        r5.A01 = false;
        if (i == 404) {
            r5.A0B.A0F(r2.A01, false);
        } else if (406 == i) {
            UserJid userJid = r2.A01;
            C202279lS.A00(r5, userJid);
            r5.A0B.A0F(userJid, false);
        } else if (421 == i) {
            C202279lS.A00(r5, r8.A05);
        }
        C29461Ws r4 = r5.A0B;
        UserJid userJid2 = r2.A01;
        r4.A0A(new AnonymousClass9VR(new AnonymousClass9VS(false, (String) null), AnonymousClass001.A0I()), userJid2, true);
        r5.A04.A0C(new AnonymousClass8W8(userJid2));
    }

    public AnonymousClass9TW(C193329La r1) {
        this.A00 = r1;
    }
}
