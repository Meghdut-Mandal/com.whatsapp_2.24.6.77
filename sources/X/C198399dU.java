package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.9dU  reason: invalid class name and case insensitive filesystem */
public final class C198399dU {
    public static final C198399dU A00 = new C198399dU();

    public static void A00(C23090B4a b4a, C200219gt r5, String str, String str2) {
        String A0Q;
        b4a.BPE(str, str2);
        Context A002 = r5.A00();
        List A003 = AnonymousClass95I.A00(A002, "com.facebook.stella");
        if (A003 == null && (A003 = AnonymousClass95I.A00(A002, "com.facebook.stella_debug")) == null) {
            A0Q = "";
        } else {
            A0Q = C007103b.A0Q(".", "", "", A003, (C006302t) null);
        }
        b4a.BPE("mwa_app_version", A0Q);
    }
}
