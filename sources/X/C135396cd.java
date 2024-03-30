package X;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* renamed from: X.6cd  reason: invalid class name and case insensitive filesystem */
public final class C135396cd implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public C135396cd(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    public void onViewAttachedToWindow(View view) {
        ContentCaptureSession A002;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        int[] iArr = AndroidComposeViewAccessibilityDelegateCompat.A0b;
        AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.A0P;
        accessibilityManager.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0N);
        accessibilityManager.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0O);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AnonymousClass5XJ.A00(view);
        }
        C131596Pr r1 = null;
        if (i >= 29 && (A002 = AnonymousClass5XI.A00(view)) != null) {
            r1 = C131596Pr.A00(view, A002);
        }
        androidComposeViewAccessibilityDelegateCompat.A09 = r1;
    }

    public void onViewDetachedFromWindow(View view) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        int[] iArr = AndroidComposeViewAccessibilityDelegateCompat.A0b;
        androidComposeViewAccessibilityDelegateCompat.A0M.removeCallbacks(androidComposeViewAccessibilityDelegateCompat.A0U);
        AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.A0P;
        accessibilityManager.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0N);
        accessibilityManager.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0O);
        androidComposeViewAccessibilityDelegateCompat.A09 = null;
    }
}
