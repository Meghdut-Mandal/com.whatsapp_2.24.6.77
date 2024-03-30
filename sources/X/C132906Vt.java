package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.6Vt  reason: invalid class name and case insensitive filesystem */
public abstract class C132906Vt {
    public static final AnonymousClass1AL[] A00 = new AnonymousClass1AL[0];

    public static C203399nx A00(AnonymousClass630 r8, int i) {
        int i2 = r8.A01;
        return new C203399nx("enc", r8.A02, (AnonymousClass1AL[]) A03((Integer) null, A02(r8.A00), (String) null, (String) null, i2, i, false).toArray(A00));
    }

    public static C203399nx A01(AnonymousClass630 r7, Integer num, String str, String str2, int i, boolean z) {
        int i2 = r7.A01;
        String A02 = A02(r7.A00);
        return new C203399nx("enc", r7.A02, (AnonymousClass1AL[]) A03(num, A02, str, str2, i2, i, z).toArray(A00));
    }

    public static String A02(int i) {
        if (i == 0) {
            return "msg";
        }
        if (i == 1) {
            return "pkmsg";
        }
        if (i == 2) {
            return "skmsg";
        }
        if (i == 3) {
            return "frskmsg";
        }
        if (i == 4) {
            return "msmsg";
        }
        throw AnonymousClass000.A0d("Unsupported ciphertext type ", AnonymousClass000.A0u(), i);
    }

    public static ArrayList A03(Integer num, String str, String str2, String str3, int i, int i2, boolean z) {
        ArrayList A0I = AnonymousClass001.A0I();
        C36381kD.A1M("v", Integer.toString(i), A0I);
        C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, A0I);
        if (i2 != 0) {
            C36381kD.A1M("count", String.valueOf(i2), A0I);
        }
        if (str2 != null) {
            C36381kD.A1M("mediatype", str2, A0I);
        }
        if (str3 != null) {
            C36381kD.A1M("native_flow_name", str3, A0I);
        }
        if (num != null && num.intValue() > 0) {
            C36381kD.A1M("duration", String.valueOf(num), A0I);
        }
        if (z) {
            C36381kD.A1M("decrypt-fail", "hide", A0I);
        }
        return A0I;
    }
}
