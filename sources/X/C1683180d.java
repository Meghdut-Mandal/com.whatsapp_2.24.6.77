package X;

import android.os.Build;

/* renamed from: X.80d  reason: invalid class name and case insensitive filesystem */
public final class C1683180d extends C208199xq {
    public boolean A01(AnonymousClass6QA r4) {
        AnonymousClass00C.A0D(r4, 0);
        Integer num = r4.A09.A02;
        if (num == C023109s.A0C) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 30 || num != C023109s.A0S) {
            return false;
        }
        return true;
    }

    public C1683180d(AnonymousClass9YC r1) {
        super(r1);
    }
}
