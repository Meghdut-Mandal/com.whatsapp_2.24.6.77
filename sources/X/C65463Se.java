package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3Se  reason: invalid class name and case insensitive filesystem */
public class C65463Se implements C236119d {
    public Object A00;
    public Object A01;
    public final int A02;

    public C65463Se(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A00(C65463Se r3) {
        ((C001600r) r3.A01).A0C(new AnonymousClass34Q((Boolean) null, false));
    }

    public void BVN(String str) {
        switch (this.A02) {
            case 0:
                A00(this);
                return;
            case 1:
                C40111uw r3 = ((C77503qb) ((C87244Oa) this.A01)).A00;
                AnonymousClass141 r0 = r3.A02;
                if (r0 != null) {
                    C36341k9.A19(r3.A0D, r0.A0p);
                }
                r3.A0Q.A0T(3012, (Object) null);
                return;
            case 2:
                AnonymousClass00C.A0D(str, 0);
                ((C236119d) this.A00).BVN(str);
                C36321k7.A0R((C170888Hw) this.A01, "Failed to deliver request: iq=", str, AnonymousClass000.A0u());
                return;
            default:
                C36321k7.A1Q("TwoFactorXmppMethods/sendGetTwoFactorAuth/onDeliveryFailure; iq=", str, AnonymousClass000.A0u());
                C36321k7.A0R((C170888Hw) this.A01, "Delivery failure: iqId=", str, AnonymousClass000.A0u());
                return;
        }
    }

    public void BWw(C203399nx r6, String str) {
        C20350xQ r1;
        int i;
        switch (this.A02) {
            case 0:
                A00(this);
                return;
            case 1:
                AnonymousClass00C.A0D(r6, 1);
                int A04 = C36371kC.A04(r6);
                C40111uw r3 = ((C77503qb) ((C87244Oa) this.A01)).A00;
                AnonymousClass141 r0 = r3.A02;
                if (r0 != null) {
                    C36341k9.A19(r3.A0D, r0.A0p);
                }
                if (!(A04 == -2 || A04 == -1 || A04 == 400)) {
                    if (A04 == 401) {
                        r1 = r3.A0Q;
                        i = 3010;
                    } else if (A04 == 403) {
                        r1 = r3.A0Q;
                        i = 3011;
                    } else if (!(A04 == 404 || A04 == 500)) {
                        return;
                    }
                    r1.A0T(i, (Object) null);
                    return;
                }
                r1 = r3.A0Q;
                i = 3012;
                r1.A0T(i, (Object) null);
                return;
            case 2:
                C36321k7.A0w(str, r6);
                ((C236119d) this.A00).BiM(r6, str);
                C36381kD.A1J(this.A01);
                return;
            default:
                C36321k7.A1Q("TwoFactorXmppMethods/sendGetTwoFactorAuth/onError; iq=", str, AnonymousClass000.A0u());
                ((C170888Hw) this.A01).A05(new AnonymousClass5V6(r6, str));
                return;
        }
    }

    public void BiM(C203399nx r5, String str) {
        C001600r r3;
        AnonymousClass34Q r2;
        String str2;
        switch (this.A02) {
            case 0:
                try {
                    if ("result".equals(C36391kE.A0x(r5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
                        r3 = (C001600r) this.A01;
                        C203399nx A0c = r5.A0c("accept");
                        if (A0c != null) {
                            str2 = C36391kE.A0x(A0c, "optout");
                        } else {
                            str2 = null;
                        }
                        r2 = new AnonymousClass34Q(Boolean.valueOf("true".equals(str2)), true);
                    } else {
                        r3 = (C001600r) this.A01;
                        r2 = new AnonymousClass34Q((Boolean) null, false);
                    }
                    r3.A0C(r2);
                    return;
                } catch (C235919b unused) {
                    A00(this);
                    return;
                }
            case 1:
                AnonymousClass00C.A0D(r5, 1);
                ((C006302t) this.A00).invoke(r5);
                return;
            case 2:
                C36321k7.A0w(str, r5);
                ((C236119d) this.A00).BiM(r5, str);
                break;
            default:
                C36321k7.A1Q("TwoFactorXmppMethods/sendGetTwoFactorAuth/onSuccess; iq=", str, AnonymousClass000.A0u());
                C203399nx A0c2 = r5.A0c("2fa");
                C18740tg.A06(A0c2);
                C29011Uz r1 = (C29011Uz) ((AnonymousClass1V0) this.A00).A02.get();
                A0c2.A0c("code");
                boolean z = true;
                if (A0c2.A0c("email") == null) {
                    z = false;
                }
                SharedPreferences.Editor edit = C29011Uz.A00(r1).edit();
                int i = 2;
                if (z) {
                    i = 1;
                }
                C36341k9.A0v(edit, "two_factor_auth_email_set", i);
                break;
        }
        C36381kD.A1J(this.A01);
    }
}
