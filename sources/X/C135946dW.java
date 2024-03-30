package X;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.List;

/* renamed from: X.6dW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135946dW implements AccessibilityManager.AccessibilityStateChangeListener {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public /* synthetic */ C135946dW(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void onAccessibilityStateChanged(boolean z) {
        List list;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        int[] iArr = AndroidComposeViewAccessibilityDelegateCompat.A0b;
        if (z) {
            list = androidComposeViewAccessibilityDelegateCompat.A0P.getEnabledAccessibilityServiceList(-1);
        } else {
            list = C023409w.A00;
        }
        androidComposeViewAccessibilityDelegateCompat.A0E = list;
    }
}
