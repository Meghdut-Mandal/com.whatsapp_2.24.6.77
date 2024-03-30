package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.5ZG  reason: invalid class name */
public abstract class AnonymousClass5ZG {
    public static C118855oq A00(C160607lH r4) {
        C118855oq r3 = new C118855oq();
        if (r4.BlO() != C023109s.A0C) {
            r4.BuF();
            return null;
        }
        while (r4.BQE() != C023109s.A0G) {
            String BlN = r4.BlN();
            boolean A1T = C36371kC.A1T(AnonymousClass5ZE.A00(BlN), 32);
            r4.BQE();
            if (!A1T) {
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(BlN)) {
                    r3.A01 = C90504aG.A0k(r4);
                } else if ("payload".equals(BlN)) {
                    r3.A00 = AnonymousClass5ZI.A00(r4);
                }
            }
            r4.BuF();
        }
        return r3;
    }
}
