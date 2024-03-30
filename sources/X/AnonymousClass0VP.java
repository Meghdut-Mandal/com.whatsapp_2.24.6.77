package X;

import android.view.accessibility.AccessibilityManager;

/* renamed from: X.0VP  reason: invalid class name */
public abstract class AnonymousClass0VP {
    public static void A00(AccessibilityManager accessibilityManager, C16700pw r2) {
        accessibilityManager.addTouchExplorationStateChangeListener(new C09220c1(r2));
    }

    public static void A01(AccessibilityManager accessibilityManager, C16700pw r2) {
        accessibilityManager.removeTouchExplorationStateChangeListener(new C09220c1(r2));
    }
}
