package X;

import android.os.Handler;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public final class AI7 implements C236119d {
    public C31751cK A00;
    public final int A01;
    public final C19730wQ A02;
    public final C26421Kc A03;
    public final UserJid A04;
    public final AnonymousClass19A A05;
    public final AnonymousClass3L6 A06;
    public final String A07;
    public final Handler A08 = C36341k9.A0H();
    public final C19700wN A09;
    public final AnonymousClass1KK A0A;

    public void BVN(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A06.A01("profile_view_tag");
        Log.i("sendGetBusinessProfile/delivery-error");
        this.A08.post(new AnonymousClass751(21, str, this));
    }

    public void BiM(C203399nx r6, String str) {
        C19700wN r1;
        String str2;
        C36331k8.A1I(str, r6);
        this.A06.A01("profile_view_tag");
        C203399nx A0c = r6.A0c("business_profile");
        if (A0c == null) {
            r1 = this.A09;
            str2 = "payload businessProfileNode doesn't match server";
        } else {
            C203399nx A0c2 = A0c.A0c("profile");
            if (A0c2 == null) {
                r1 = this.A09;
                str2 = "payload profileNode doesn't match server";
            } else {
                C19730wQ r0 = this.A02;
                UserJid userJid = this.A04;
                r0.A0M(userJid);
                C207109uZ A012 = C203059nD.A01(userJid, A0c2);
                this.A0A.A0G(A012, userJid);
                this.A08.post(new AVa(this, A012, 27));
                return;
            }
        }
        r1.A0E("smb-reg-business-profile-fetch-failed", str2, false);
        BWw(r6, str);
    }

    public final void A00(C31751cK r17) {
        AnonymousClass1AL[] r1;
        UserJid userJid;
        this.A00 = r17;
        AnonymousClass19A r9 = this.A05;
        String A092 = r9.A09();
        this.A06.A02("profile_view_tag");
        String str = this.A07;
        if (str != null) {
            r1 = new AnonymousClass1AL[2];
            userJid = this.A04;
            C90504aG.A1E(userJid, "jid", r1, 0);
            C36341k9.A1L("tag", str, r1, 1);
        } else {
            r1 = new AnonymousClass1AL[1];
            userJid = this.A04;
            C90504aG.A1E(userJid, "jid", r1, 0);
        }
        ArrayList A0I = AnonymousClass001.A0I();
        C203399nx.A0E("profile", A0I, r1);
        this.A02.A0M(userJid);
        C203399nx A052 = C203399nx.A05("business_profile", new AnonymousClass1AL[]{new AnonymousClass1AL("v", this.A01)}, C165577te.A1b(A0I, 0));
        AnonymousClass1AL[] r12 = new AnonymousClass1AL[3];
        C36331k8.A1R(A092, r12, 0);
        C165567td.A1S("w:biz", r12, 1, 2);
        r9.A0E(this, C36391kE.A0m(A052, r12), A092, 132, 32000);
        C36321k7.A1K(userJid, "sendGetBusinessProfile jid=", AnonymousClass000.A0u());
    }

    public AI7(C19700wN r2, C19730wQ r3, AnonymousClass1KK r4, C26421Kc r5, UserJid userJid, AnonymousClass19A r7, AnonymousClass3L6 r8, String str, int i) {
        this.A01 = i;
        this.A04 = userJid;
        this.A07 = str;
        this.A09 = r2;
        this.A02 = r3;
        this.A06 = r8;
        this.A05 = r7;
        this.A0A = r4;
        this.A03 = r5;
    }

    public void BWw(C203399nx r4, String str) {
        C36321k7.A0w(str, r4);
        this.A06.A01("profile_view_tag");
        Log.i("sendGetBusinessProfile/response-error");
        this.A08.post(new C1502274l(this, r4, str, 16));
    }
}
