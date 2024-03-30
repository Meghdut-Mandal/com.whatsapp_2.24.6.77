package X;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* renamed from: X.6dX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135956dX implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public /* synthetic */ C135956dX(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        int[] iArr = AndroidComposeViewAccessibilityDelegateCompat.A0b;
        androidComposeViewAccessibilityDelegateCompat.A0E = androidComposeViewAccessibilityDelegateCompat.A0P.getEnabledAccessibilityServiceList(-1);
    }
}
