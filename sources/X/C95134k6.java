package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.4k6  reason: invalid class name and case insensitive filesystem */
public class C95134k6 extends C011705b {
    public final C140456lc A00;

    public C95134k6(C140456lc r1) {
        this.A00 = r1;
    }

    public void A0k(View view, C07650Ys r6) {
        super.A0k(view, r6);
        C140456lc r3 = this.A00;
        String A0K = C140456lc.A0K(r3);
        String A0L = C140456lc.A0L(r3);
        if (A0K != null) {
            r6.A0D(A0K);
        }
        AnonymousClass5YW.A00(view.getContext(), view, r6, A0L);
        String A0M = C140456lc.A0M(r3);
        if (A0M != null) {
            r6.A0A(new AnonymousClass0Yd(16, (CharSequence) A0M));
        }
        boolean A0f = r3.A0f(42, false);
        boolean A0f2 = r3.A0f(43, false);
        AccessibilityNodeInfo accessibilityNodeInfo = r6.A02;
        accessibilityNodeInfo.setSelected(A0f);
        accessibilityNodeInfo.setEnabled(!A0f2);
    }
}
