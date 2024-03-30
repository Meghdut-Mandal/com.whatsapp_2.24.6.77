package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8vD  reason: invalid class name and case insensitive filesystem */
public final class C185978vD extends C50502l1 {
    public static final ArrayList A00 = C36351kA.A10(C165597tg.A1a());
    public static final ArrayList A01 = C165567td.A0e("mobile_number", "numeric_id");

    public C185978vD(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C165567td.A1E(A0T);
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "update-alias");
        if (str2 != null && C203539oF.A0T(str2, 1, true)) {
            C36331k8.A1D(A0a, "device_id", str2);
        }
        AnonymousClass6QB A0q = C36441kJ.A0q("alias");
        if (C203539oF.A0R(str3, 8, false)) {
            C36331k8.A1D(A0q, "alias_value", str3);
        }
        String str10 = str4;
        if (C203539oF.A0P(str10, 1, 20, false)) {
            C36331k8.A1D(A0q, "alias_id", str10);
        }
        String str11 = str5;
        if (C203539oF.A0P(str11, 1, 1000, false)) {
            C36331k8.A1D(A0q, "vpa", str11);
        }
        String str12 = str6;
        if (str6 != null && C203539oF.A0P(str12, 1, 1000, true)) {
            C36331k8.A1D(A0q, "vpa_id", str12);
        }
        String str13 = str7;
        if (C203539oF.A0P(str13, 1, 1000, true)) {
            C36331k8.A1D(A0q, "vpa_name", str13);
        }
        A0q.A09(str8, "alias_type", A01);
        A0q.A08(str9, "alias_status", A00);
        C36361kB.A1H(A0q, A0a);
        C165567td.A1F(A0a, A0T, this);
    }
}
