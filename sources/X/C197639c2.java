package X;

import android.text.TextUtils;

/* renamed from: X.9c2  reason: invalid class name and case insensitive filesystem */
public class C197639c2 {
    public final AnonymousClass3EU A00;
    public final AnonymousClass9OF A01;

    public C197639c2(AnonymousClass3EU r1, AnonymousClass9OF r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static boolean A00(String str) {
        if (TextUtils.isEmpty(str) || str.length() > 255 || str.equalsIgnoreCase("facebook2@icici") || !C36361kB.A1Z(str, C190929Aw.A02)) {
            return false;
        }
        return true;
    }
}
