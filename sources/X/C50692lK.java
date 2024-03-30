package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.2lK  reason: invalid class name and case insensitive filesystem */
public final class C50692lK extends C50502l1 {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"dismiss", "exposure", "impression", "notification_received", "primary_click", "secondary_click"});

    public C50692lK(Long l, String str, String str2, String str3, String str4) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, "xmlns", "w:comms");
        C36341k9.A1C(A0T);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        AnonymousClass6QB A0q = C36441kJ.A0q("event");
        if (C203539oF.A0P(str2, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0q, "promotion_id", str2);
        }
        if (C203539oF.A0L(l, -9007199254740991L, 9007199254740991L, false)) {
            C36411kG.A1K(A0q, "timestamp_sec", l.longValue());
        }
        if (C203539oF.A0P(str3, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0q, "logdata", str3);
        }
        A0q.A09(str4, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A00);
        C36361kB.A1H(A0q, A0T);
        C592133b.A00(A0T, this);
    }
}
