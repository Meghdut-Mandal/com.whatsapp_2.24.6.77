package X;

import android.view.accessibility.AccessibilityEvent;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* renamed from: X.7Ra  reason: invalid class name and case insensitive filesystem */
public final class C154137Ra extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154137Ra(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(1);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(this.this$0.A0T.getParent().requestSendAccessibilityEvent(this.this$0.A0T, (AccessibilityEvent) obj));
    }
}
