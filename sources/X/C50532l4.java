package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.2l4  reason: invalid class name and case insensitive filesystem */
public final class C50532l4 extends C592133b {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"image", "video"});

    public C50532l4(String str, String str2, String str3, String str4) {
        AnonymousClass6QB A0q = C36441kJ.A0q("media");
        if (C203539oF.A0P(str, 1, 1000, false)) {
            C36331k8.A1D(A0q, "iv", str);
        }
        if (C203539oF.A0P(str2, 1, 1000, false)) {
            C36331k8.A1D(A0q, "cipherKey", str2);
        }
        if (C203539oF.A0P(str3, 1, 2000, false)) {
            A0q.A07(str3);
        }
        A0q.A08(str4, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A00);
        C592133b.A00(A0q, this);
    }
}
