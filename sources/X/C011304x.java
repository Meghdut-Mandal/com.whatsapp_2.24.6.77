package X;

import android.view.View;

/* renamed from: X.04x  reason: invalid class name and case insensitive filesystem */
public abstract class C011304x {
    public static int A00(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static boolean A02(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean A03(View view) {
        return view.isLaidOut();
    }

    public static void A01(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }
}
