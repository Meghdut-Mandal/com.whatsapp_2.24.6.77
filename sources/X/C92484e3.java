package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* renamed from: X.4e3  reason: invalid class name and case insensitive filesystem */
public final class C92484e3 extends AccessibilityNodeProvider {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public C92484e3(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        AndroidComposeViewAccessibilityDelegateCompat.A0J(bundle, accessibilityNodeInfo, this.A00, str, i);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        AccessibilityNodeInfo A0B = AndroidComposeViewAccessibilityDelegateCompat.A0B(androidComposeViewAccessibilityDelegateCompat, i);
        if (androidComposeViewAccessibilityDelegateCompat.A0I && i == androidComposeViewAccessibilityDelegateCompat.A01) {
            androidComposeViewAccessibilityDelegateCompat.A03 = A0B;
        }
        return A0B;
    }

    public AccessibilityNodeInfo findFocus(int i) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        int[] iArr = AndroidComposeViewAccessibilityDelegateCompat.A0b;
        return createAccessibilityNodeInfo(androidComposeViewAccessibilityDelegateCompat.A01);
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return AndroidComposeViewAccessibilityDelegateCompat.A0V(bundle, this.A00, i, i2);
    }
}
