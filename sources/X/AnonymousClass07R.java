package X;

import android.view.View;

/* renamed from: X.07R  reason: invalid class name */
public abstract class AnonymousClass07R {
    public static View A00(View view, int i) {
        return view.requireViewById(i);
    }

    public static CharSequence A01(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean A05(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean A06(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void A02(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void A03(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void A04(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
