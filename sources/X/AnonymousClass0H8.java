package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.0H8  reason: invalid class name */
public class AnonymousClass0H8 extends AnonymousClass0X7 {
    public final /* synthetic */ AnonymousClass0BN A00;

    public C07650Ys A01(int i) {
        int i2;
        AnonymousClass0BN r0 = this.A00;
        if (i == 2) {
            i2 = r0.A00;
        } else {
            i2 = r0.A02;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return A00(i2);
    }

    public AnonymousClass0H8(AnonymousClass0BN r1) {
        this.A00 = r1;
    }

    public C07650Ys A00(int i) {
        return new C07650Ys(AccessibilityNodeInfo.obtain(this.A00.A0n(i).A02));
    }

    public boolean A02(int i, int i2, Bundle bundle) {
        int i3;
        AnonymousClass0BN r2 = this.A00;
        if (i == -1) {
            return C011504z.A0B(r2.A04, i2, bundle);
        }
        if (i2 == 1) {
            return r2.A0v(i);
        }
        if (i2 == 2) {
            return r2.A0u(i);
        }
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = r2.A05;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = r2.A00) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE && i3 == i3) {
                r2.A00 = Integer.MIN_VALUE;
                r2.A04.invalidate();
                r2.A0p(i3, 65536);
            }
            r2.A00 = i;
            r2.A04.invalidate();
            r2.A0p(i, 32768);
            return true;
        } else if (i2 != 128) {
            return r2.A0w(i, i2, bundle);
        } else {
            if (r2.A00 != i) {
                return false;
            }
            r2.A00 = Integer.MIN_VALUE;
            r2.A04.invalidate();
            r2.A0p(i, 65536);
            return true;
        }
    }
}
