package X;

import android.content.Intent;

/* renamed from: X.3Cz  reason: invalid class name and case insensitive filesystem */
public class C61673Cz {
    public final C33771fu A00;

    public C61673Cz(C33771fu r1) {
        this.A00 = r1;
    }

    public Intent A00(String str) {
        String str2;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (this.A00.A02()) {
            str2 = "market://details?id=com.whatsapp.w4b&utm_source=";
        } else {
            str2 = "https://play.google.com/store/apps/details?id=com.whatsapp.w4b&utm_source=";
        }
        return C36331k8.A04(AnonymousClass000.A0p(str2, str, A0u));
    }
}
