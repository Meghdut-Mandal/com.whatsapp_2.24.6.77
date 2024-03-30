package X;

import android.util.SparseArray;

/* renamed from: X.5l0  reason: invalid class name and case insensitive filesystem */
public class C116695l0 {
    public final C140456lc A00;

    public C116695l0(C140456lc r5) {
        C140456lc r2 = new C140456lc(13535);
        this.A00 = r2;
        C140456lc r0 = (C140456lc) C140456lc.A0I(r5, 35);
        if (r0 != null) {
            AnonymousClass6XK A01 = AnonymousClass6XK.A01(r0);
            SparseArray sparseArray = r2.A05;
            sparseArray.put(35, A01);
            sparseArray.put(38, r5.A0X(38));
            sparseArray.put(36, r5.A0a(36, ""));
            sparseArray.put(46, r5.A0a(46, ""));
            sparseArray.put(48, r5.A0a(48, ""));
            sparseArray.put(45, r5.A0X(45));
            return;
        }
        throw AnonymousClass001.A09("Null content for BottomSheet");
    }
}
