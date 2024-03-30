package X;

import android.content.Context;

/* renamed from: X.3LX  reason: invalid class name */
public abstract class AnonymousClass3LX {
    public static final boolean A01(Context context, AnonymousClass6OK r5) {
        AnonymousClass00C.A0D(r5, 1);
        if (A00(context) || AnonymousClass1L0.A01(context, "com.instagram.android") == -1 || !r5.A02(5987)) {
            return false;
        }
        return true;
    }

    public static final boolean A00(Context context) {
        if (AnonymousClass1L0.A01(context, "com.facebook.katana") == -1 && AnonymousClass1L0.A01(context, "com.facebook.wakizashi") == -1) {
            return false;
        }
        return true;
    }
}
