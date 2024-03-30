package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.5cL  reason: invalid class name and case insensitive filesystem */
public abstract class C111475cL {
    public static AnonymousClass630 A00(C203399nx r4) {
        int i;
        String A0i = r4.A0i("v", (String) null);
        if ("1".equals(A0i) || "2".equals(A0i)) {
            int parseInt = Integer.parseInt(A0i);
            String A0i2 = r4.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
            if ("msg".equals(A0i2)) {
                i = 0;
            } else if ("pkmsg".equals(A0i2)) {
                i = 1;
            } else if ("skmsg".equals(A0i2)) {
                i = 2;
            } else if ("frskmsg".equals(A0i2)) {
                i = 3;
            } else if ("msmsg".equals(A0i2)) {
                i = 4;
            } else {
                throw new C235919b(AnonymousClass000.A0p("invalid encrypted node type provided: ", A0i2, AnonymousClass000.A0u()));
            }
            return new AnonymousClass630(r4.A01, parseInt, i);
        }
        throw new C235919b(AnonymousClass000.A0p("invalid encrypted node version provided: ", A0i, AnonymousClass000.A0u()));
    }
}
