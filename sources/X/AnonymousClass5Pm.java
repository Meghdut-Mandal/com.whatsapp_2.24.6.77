package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.5Pm  reason: invalid class name */
public final class AnonymousClass5Pm extends C50502l1 {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"0", "1"});
    public static final ArrayList A01 = C36351kA.A10(new String[]{"1", "2"});

    public AnonymousClass5Pm(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36341k9.A1C(A0T);
        C36331k8.A1D(A0T, "xmlns", "w:pay");
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C36331k8.A1C(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("account");
        C36331k8.A1D(A0q, "action", "upi-bind-device");
        if (C203539oF.A0P(str2, 1, 1000, false)) {
            C36331k8.A1D(A0q, "device-id", str2);
        }
        String str7 = str3;
        if (C203539oF.A0P(str7, 1, 35, false)) {
            C36331k8.A1D(A0q, "verification-data", str7);
        }
        String str8 = str4;
        if (C203539oF.A0P(str8, 1, 10, false)) {
            C36331k8.A1D(A0q, "provider-type", str8);
        }
        String str9 = str5;
        if (str5 != null && C203539oF.A0P(str9, 1, 100, true)) {
            C36331k8.A1D(A0q, "sms-phone-number", str9);
        }
        Long l3 = l;
        if (l != null && C203539oF.A0L(l3, 0, 9007199254740991L, true)) {
            C36411kG.A1K(A0q, "delay", l.longValue());
        }
        Long l4 = l2;
        if (l2 != null && C203539oF.A0L(l4, 0, 9007199254740991L, true)) {
            C36411kG.A1K(A0q, "counter", l2.longValue());
        }
        A0q.A09("2", "version", A01);
        A0q.A08(str6, "existing-account", A00);
        C36361kB.A1H(A0q, A0T);
        this.A00 = A0T.A03();
    }
}
