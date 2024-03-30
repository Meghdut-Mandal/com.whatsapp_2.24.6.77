package X;

import android.os.Build;

/* renamed from: X.4oe  reason: invalid class name and case insensitive filesystem */
public final class C97214oe extends AnonymousClass61V {
    public static final C97214oe A00 = new C97214oe();

    public C97214oe() {
        super(3, 4);
    }

    public void A00(C162177o9 r3) {
        if (Build.VERSION.SDK_INT >= 23) {
            r3.B6z("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        }
    }
}
