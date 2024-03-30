package X;

import java.util.ArrayList;

/* renamed from: X.8vB  reason: invalid class name and case insensitive filesystem */
public final class C185958vB extends C50502l1 {
    public static final ArrayList A00 = C165567td.A0e("AADHAAR", "BANK");

    public C185958vB(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1D(A0T);
        C203539oF.A0E(A0T, str);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-generate-otp");
        if (str2 != null && C203539oF.A0O(str2)) {
            C36331k8.A1D(A0a, "vpa", str2);
        }
        if (str3 != null && C203539oF.A0O(str3)) {
            C36331k8.A1D(A0a, "vpa-id", str3);
        }
        C203539oF.A0G(A0a, str4, false);
        if (C203539oF.A0V(str5, 1, false)) {
            C36331k8.A1D(A0a, "upi-bank-info", str5);
        }
        if (str6 != null && C203539oF.A0S(str6, 1, true)) {
            C36331k8.A1D(A0a, "partial-aadhaar", str6);
        }
        if (str7 != null && C203539oF.A0R(str7, 1, true)) {
            C36331k8.A1D(A0a, "provider-type", str7);
        }
        A0a.A08(str8, "otp-type", A00);
        C165567td.A1F(A0a, A0T, this);
    }
}
