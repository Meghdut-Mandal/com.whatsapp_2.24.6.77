package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.0VQ  reason: invalid class name */
public abstract class AnonymousClass0VQ {
    public static CharSequence A00(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void A01(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
