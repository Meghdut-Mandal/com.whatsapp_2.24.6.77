package X;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.Map;

/* renamed from: X.7NZ  reason: invalid class name */
public final class AnonymousClass7NZ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C137876gs $scrollObservationScope;
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7NZ(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C137876gs r3) {
        super(0);
        this.$scrollObservationScope = r3;
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        float f;
        float f2;
        C137846gp r2;
        C137876gs r0 = this.$scrollObservationScope;
        AnonymousClass62P r5 = r0.A00;
        AnonymousClass62P r4 = r0.A01;
        Float f3 = r0.A02;
        Float f4 = r0.A03;
        if (r5 == null || f3 == null) {
            f = 0.0f;
        } else {
            f = C90464aC.A03(r5.A01) - f3.floatValue();
        }
        if (r4 == null || f4 == null) {
            f2 = 0.0f;
        } else {
            f2 = C90464aC.A03(r4.A01) - f4.floatValue();
        }
        if (!(f == 0.0f && f2 == 0.0f)) {
            int A02 = AndroidComposeViewAccessibilityDelegateCompat.A02(this.this$0, this.$scrollObservationScope.A04);
            C118355nk r22 = (C118355nk) C36371kC.A0r(AndroidComposeViewAccessibilityDelegateCompat.A0H(this.this$0), this.this$0.A01);
            if (r22 != null) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.this$0;
                try {
                    AccessibilityNodeInfo accessibilityNodeInfo = androidComposeViewAccessibilityDelegateCompat.A03;
                    if (accessibilityNodeInfo != null) {
                        accessibilityNodeInfo.setBoundsInScreen(AndroidComposeViewAccessibilityDelegateCompat.A05(androidComposeViewAccessibilityDelegateCompat, r22));
                    }
                } catch (IllegalStateException unused) {
                }
            }
            this.this$0.A0T.invalidate();
            Map A0H = AndroidComposeViewAccessibilityDelegateCompat.A0H(this.this$0);
            Integer valueOf = Integer.valueOf(A02);
            C118355nk r02 = (C118355nk) A0H.get(valueOf);
            if (!(r02 == null || (r2 = r02.A01.A04) == null)) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this.this$0;
                if (r5 != null) {
                    androidComposeViewAccessibilityDelegateCompat2.A0V.put(valueOf, r5);
                }
                if (r4 != null) {
                    androidComposeViewAccessibilityDelegateCompat2.A0W.put(valueOf, r4);
                }
                AndroidComposeViewAccessibilityDelegateCompat.A0L(r2, androidComposeViewAccessibilityDelegateCompat2);
            }
        }
        if (r5 != null) {
            this.$scrollObservationScope.A02 = (Float) r5.A01.invoke();
        }
        if (r4 != null) {
            this.$scrollObservationScope.A03 = (Float) r4.A01.invoke();
        }
        return AnonymousClass0AJ.A00;
    }
}
