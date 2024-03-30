package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.3vT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80483vT implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C29011Uz A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C80483vT(C29011Uz r1, String str, String str2, int i) {
        this.A01 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = i;
    }

    public final void run() {
        C29011Uz r3 = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        int i = this.A00;
        synchronized (r3) {
            Log.i("TwoFactorAuthManager/storeAuthSettingsAsync");
            if (str == null || str.isEmpty()) {
                r3.A0E = "";
                C36341k9.A0u(C29011Uz.A00(r3).edit().remove("two_factor_auth_code").remove("two_factor_auth_using_encryption").remove("two_factor_auth_email_set").remove("two_factor_auth_nag_time").remove("two_factor_auth_nag_interval"), "two_factor_auth_last_code_correctness");
            } else {
                r3.A0E = str;
                C1264463z A012 = r3.A06.A01(AnonymousClass6JD.A0V, str.getBytes(C19430v1.A0D));
                String str3 = null;
                if (A012 != null) {
                    String A002 = A012.A00();
                    if (A002 == null || !str.equals(C29011Uz.A01(r3, A002))) {
                        r3.A02.A0E("TwoFactorAuthManager/encryptCode/EncryptedCodeFailure", String.valueOf(AnonymousClass000.A1W(A002)), false);
                    } else {
                        str3 = A002;
                    }
                }
                boolean z = false;
                if (str3 != null) {
                    z = true;
                    str = str3;
                }
                C36321k7.A1X("TwoFactorAuthManager/storeNewAuthSettings/isUsingEncryption: ", AnonymousClass000.A0u(), z);
                SharedPreferences.Editor putBoolean = C29011Uz.A00(r3).edit().putString("two_factor_auth_code", str).putBoolean("two_factor_auth_using_encryption", z).putLong("two_factor_auth_nag_time", System.currentTimeMillis()).putInt("two_factor_auth_nag_interval", i).putBoolean("two_factor_auth_last_code_correctness", false);
                if (str2 != null) {
                    int i2 = 2;
                    if (str2.length() > 0) {
                        i2 = 1;
                    }
                    putBoolean.putInt("two_factor_auth_email_set", i2);
                } else if (C29011Uz.A00(r3).getInt("two_factor_auth_email_set", 0) == 0) {
                    r3.A04.A01(new C156757ad());
                }
                putBoolean.apply();
            }
            r3.A03.A0H(new C35751jC(r3, 2));
        }
    }
}
