package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.04z  reason: invalid class name and case insensitive filesystem */
public abstract class C011504z {
    public static int A00(View view) {
        return view.getImportantForAccessibility();
    }

    public static int A01(View view) {
        return view.getMinimumHeight();
    }

    public static int A02(View view) {
        return view.getMinimumWidth();
    }

    public static int A03(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static boolean A09(View view) {
        return view.getFitsSystemWindows();
    }

    public static boolean A0A(View view) {
        return view.hasTransientState();
    }

    public static boolean A0B(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static void A05(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void A04(Drawable drawable, View view) {
        view.setBackground(drawable);
    }

    public static void A06(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static void A07(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void A08(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }
}
