package X;

import android.content.SharedPreferences;

/* renamed from: X.1Uu  reason: invalid class name and case insensitive filesystem */
public final class C28961Uu {
    public final C19420v0 A00;

    public C28961Uu(C19420v0 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final C63063Ip A00() {
        AnonymousClass005 r8 = this.A00.A00;
        long j = ((SharedPreferences) r8.get()).getLong("account_logout_request_attempt_timestamp", -1);
        String string = ((SharedPreferences) r8.get()).getString("account_logout_request_server_token", (String) null);
        if (j < 0 || string == null) {
            return null;
        }
        return new C63063Ip(j, ((SharedPreferences) r8.get()).getString("account_logout_request_new_device_name", (String) null), string);
    }

    public final void A01(C63063Ip r8) {
        long j;
        String str;
        String str2;
        if (r8 != null) {
            j = r8.A00;
            str2 = r8.A02;
            str = r8.A01;
        } else {
            j = -1;
            str = null;
            str2 = null;
        }
        C19420v0 r4 = this.A00;
        C19420v0.A00(r4).putLong("account_logout_request_attempt_timestamp", j).apply();
        SharedPreferences.Editor A002 = C19420v0.A00(r4);
        if (str2 != null) {
            A002.putString("account_logout_request_server_token", str2);
        } else {
            A002.remove("account_logout_request_server_token");
        }
        A002.apply();
        SharedPreferences.Editor A003 = C19420v0.A00(r4);
        if (str != null) {
            A003.putString("account_logout_request_new_device_name", str);
        } else {
            A003.remove("account_logout_request_new_device_name");
        }
        A003.apply();
    }
}
