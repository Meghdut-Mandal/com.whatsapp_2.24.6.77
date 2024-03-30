package X;

import com.whatsapp.util.Log;

/* renamed from: X.3KB  reason: invalid class name */
public final class AnonymousClass3KB {
    public final C19970wo A00;
    public final C21520zN A01;
    public final C19420v0 A02;
    public final C21510zM A03;
    public final AnonymousClass3UV A04;
    public final C63293Jm A05;

    public final String A00(String str, String str2) {
        if (str == null || str2 == null) {
            if (str == null && str2 == null) {
                str = "1";
                str2 = "2155550000";
            } else {
                C18740tg.A0D(false, "Country code/phone number is illegally null");
                return null;
            }
        }
        try {
            C64363Nr A0D = this.A04.A0D(str, str2);
            if (A0D == null) {
                Log.e("CheckIfReinstalledTask/fetchPreChatdABProps/null abPropCheckResult");
                return null;
            }
            int i = A0D.A01;
            if (i != 1) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("CheckIfReinstalledTask/fetchPreChatdABProps/status/");
                A0u.append(i);
                A0u.append("/reason/");
                int i2 = A0D.A00;
                String str3 = "temporarily_unavailable";
                if (i2 != 0 && i2 == 1) {
                    str3 = "ab_server_error";
                }
                C36321k7.A1Z(A0u, str3);
                if (i2 == 0) {
                    C21520zN r4 = this.A01;
                    C36341k9.A0w(r4.A0F().edit(), "pref_pre_chatd_ab_next_fetch_time", C19970wo.A00(this.A00) + A0D.A02);
                    return null;
                } else if (i2 == 2) {
                    return "wamsys initialization fails";
                } else {
                    return null;
                }
            } else {
                String str4 = A0D.A03;
                if (str4 == null) {
                    Log.i("CheckIfReinstalledTask/fetchPreChatdABProps/no abHash returned, no need to update PreChatdABProps storage");
                    return null;
                }
                Log.i("CheckIfReinstalledTask/fetchPreChatdABProps/success");
                C36341k9.A0x(C36331k8.A05(this.A02), "pref_pre_chatd_ab_hash", str4);
                return A0D.A04;
            }
        } catch (Exception e) {
            Log.e("CheckIfReinstalledTask/fetchPreChatdABProps/entrypoint call error: ", e);
            return null;
        }
    }

    public final boolean A01(String str) {
        if (str == null || str.equals("wamsys initialization fails")) {
            return false;
        }
        this.A03.A05(str);
        C19420v0 r3 = this.A02;
        C36341k9.A0v(C19420v0.A00(r3), "reg_skip_storage_perm", this.A01.A07(2736));
        C63293Jm r0 = this.A05;
        C19420v0 r4 = r0.A00;
        C21520zN r32 = r0.A01;
        C36331k8.A0w(C19420v0.A00(r4), "reg_abprop_passkey_create", r32.A0E(4732));
        C36331k8.A0w(C19420v0.A00(r4), "reg_abprop_passkey_create_delay_keyboard", r32.A0E(5298));
        C36331k8.A0w(C19420v0.A00(r4), "reg_abprop_passkey_create_education_screen", r32.A0E(5967));
        return true;
    }

    public AnonymousClass3KB(C19970wo r1, C19420v0 r2, C21520zN r3, C21510zM r4, AnonymousClass3UV r5, C63293Jm r6) {
        C36321k7.A11(r1, r4, r3);
        C36341k9.A1F(r2, r5);
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r3;
        this.A05 = r6;
        this.A02 = r2;
        this.A04 = r5;
    }
}
