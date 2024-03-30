package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8ud  reason: invalid class name and case insensitive filesystem */
public final class C185688ud extends C50492l0 {
    public static final ArrayList A00 = C165567td.A0e("614665046147756", "994766073959253");
    public static final ArrayList A01 = C165567td.A0e("fbns", "gcm");
    public static final ArrayList A02 = C165567td.A0f("0", "1", "2");

    public C185688ud(Long l, Long l2, String str, String str2, String str3, String str4) {
        AnonymousClass6QB A0q = C36441kJ.A0q("config");
        if (C203539oF.A0P(str, 1, 1024, false)) {
            C36331k8.A1D(A0q, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        if (l != null && C203539oF.A0M(l, true)) {
            C36411kG.A1K(A0q, "app_mute", l.longValue());
        }
        String str5 = str2;
        if (str2 != null && C203539oF.A0P(str5, 1, 64, true)) {
            C36331k8.A1D(A0q, "pkey", str2);
        }
        Long l3 = l2;
        if (l2 != null && C203539oF.A0L(l3, 0, 5, true)) {
            C36411kG.A1K(A0q, "num_acc", l2.longValue());
        }
        A0q.A09(str3, "platform", A01);
        AnonymousClass00C.A0D(A00, 2);
        A0q.A08(str4, "voip_payload_type", A02);
        C592133b.A00(A0q, this);
    }
}
