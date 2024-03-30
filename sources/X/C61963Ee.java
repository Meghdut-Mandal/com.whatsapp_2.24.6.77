package X;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: X.3Ee  reason: invalid class name and case insensitive filesystem */
public class C61963Ee {
    public int A00 = 0;
    public CharSequence A01 = null;
    public CharSequence A02 = null;
    public CharSequence A03 = null;
    public boolean A04 = true;
    public boolean A05 = false;

    public C193769Mu A00() {
        String str;
        boolean z;
        if (!TextUtils.isEmpty(this.A03)) {
            int i = this.A00;
            if (C52962qT.A00(i)) {
                if (i != 0) {
                    z = AnonymousClass000.A1P(i & 32768);
                } else {
                    z = this.A05;
                }
                if (TextUtils.isEmpty(this.A01) && !z) {
                    throw AnonymousClass001.A08("Negative text must be set and non-empty.");
                } else if (TextUtils.isEmpty(this.A01) || !z) {
                    return new C193769Mu(this.A03, this.A02, this.A01, this.A00, this.A04, this.A05);
                } else {
                    throw AnonymousClass001.A08("Negative text must not be set if device credential authentication is allowed.");
                }
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Authenticator combination is unsupported on API ");
                A0u.append(Build.VERSION.SDK_INT);
                A0u.append(": ");
                if (i == 15) {
                    str = "BIOMETRIC_STRONG";
                } else if (i == 255) {
                    str = "BIOMETRIC_WEAK";
                } else if (i == 32768) {
                    str = "DEVICE_CREDENTIAL";
                } else if (i == 32783) {
                    str = "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
                } else if (i != 33023) {
                    str = String.valueOf(i);
                } else {
                    str = "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
                }
                throw AnonymousClass000.A0c(str, A0u);
            }
        } else {
            throw AnonymousClass001.A08("Title must be set and non-empty.");
        }
    }
}
