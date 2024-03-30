package X;

import android.text.TextUtils;

/* renamed from: X.5Yf  reason: invalid class name and case insensitive filesystem */
public abstract class C109605Yf {
    public static void A00(String str, String str2, Object... objArr) {
        C130166Jz r2 = C130166Jz.A02;
        if (!r2.A01 && !TextUtils.isEmpty("DEVICE_ID") && !TextUtils.isEmpty("player")) {
            r2.A00.offer(new C1264063v(str, str2, objArr));
        }
    }
}
