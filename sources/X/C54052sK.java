package X;

import android.content.SharedPreferences;

/* renamed from: X.2sK  reason: invalid class name and case insensitive filesystem */
public abstract class C54052sK {
    public static int A00(C19420v0 r1, int i) {
        SharedPreferences A0E;
        String str;
        int i2;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            A0E = C36341k9.A0E(r1);
            str = "autodownload_wifi_mask";
            i2 = 15;
        } else if (i == 2) {
            return r1.A05();
        } else {
            if (i == 3) {
                A0E = C36341k9.A0E(r1);
                str = "autodownload_roaming_mask";
                i2 = 0;
            } else {
                throw AnonymousClass001.A08("network_type not valid");
            }
        }
        return A0E.getInt(str, i2);
    }
}
