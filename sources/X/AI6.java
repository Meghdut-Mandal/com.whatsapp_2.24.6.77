package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;

public final class AI6 implements C236119d {
    public C23022B0s A00;
    public final UserJid A01;
    public final AnonymousClass19A A02;

    public final void A00(C23022B0s b0s) {
        this.A00 = b0s;
        AnonymousClass19A r5 = this.A02;
        String A09 = r5.A09();
        AnonymousClass1AL[] r2 = new AnonymousClass1AL[1];
        boolean A1Y = C36371kC.A1Y("jid", this.A01.getRawString(), r2);
        C203399nx A04 = C203399nx.A04("public_key", r2);
        AnonymousClass1AL[] r22 = new AnonymousClass1AL[5];
        C36341k9.A1V(r22, A1Y ? 1 : 0);
        C36341k9.A1L("xmlns", "w:biz:catalog", r22, 1);
        C36351kA.A1N(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r22);
        C36361kB.A1Q("smax_id", "52", r22);
        r22[4] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
        r5.A0E(this, C36391kE.A0m(A04, r22), A09, 283, 32000);
    }

    public void BiM(C203399nx r6, String str) {
        C203399nx A0c;
        String A0e;
        String str2;
        String str3;
        AnonymousClass00C.A0D(r6, 1);
        C203399nx A0c2 = r6.A0c("public_key");
        if (A0c2 == null || (A0c = A0c2.A0c("pem")) == null || (A0e = A0c.A0e()) == null || A0e.length() == 0) {
            C23022B0s b0s = this.A00;
            if (b0s != null) {
                b0s.BYU(this.A01);
                return;
            }
            return;
        }
        C203399nx A0c3 = r6.A0c("public_key_with_signature");
        String str4 = null;
        if (A0c3 != null) {
            C203399nx A0c4 = A0c3.A0c("public_key_pem");
            if (A0c4 != null) {
                str3 = A0c4.A0e();
            } else {
                str3 = null;
            }
            C203399nx A0c5 = A0c3.A0c("public_key_signature");
            if (A0c5 != null) {
                str4 = A0c5.A0e();
            }
            str2 = str4;
            str4 = str3;
        } else {
            str2 = null;
        }
        C23022B0s b0s2 = this.A00;
        if (b0s2 != null) {
            UserJid userJid = this.A01;
            C18740tg.A06(A0e);
            b0s2.BYV(userJid, A0e, str4, str2);
        }
    }

    public AI6(UserJid userJid, AnonymousClass19A r2) {
        this.A01 = userJid;
        this.A02 = r2;
    }

    public void BVN(String str) {
        C36321k7.A1R("GetBusinessPublicKeyProtocol/delivery-error with iqId ", str, C36341k9.A0i(str));
        C23022B0s b0s = this.A00;
        if (b0s != null) {
            b0s.BYU(this.A01);
        }
    }

    public void BWw(C203399nx r4, String str) {
        C36321k7.A0w(str, r4);
        C36321k7.A1R("GetBusinessPublicKeyProtocol/onError with iqId ", str, AnonymousClass000.A0u());
        Pair A012 = AnonymousClass3ME.A01(r4);
        if (A012 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GetBusinessPublicKeyProtocol/onError error_code=");
            C36351kA.A1L(A012.first, A0u);
        }
        C23022B0s b0s = this.A00;
        if (b0s != null) {
            b0s.BYU(this.A01);
        }
    }
}
