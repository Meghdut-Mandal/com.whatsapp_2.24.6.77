package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: X.0H7  reason: invalid class name */
public abstract class AnonymousClass0H7 extends AccessibilityNodeProvider {
    public final AnonymousClass0X7 A00;

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C07650Ys A002 = this.A00.A00(i);
        if (A002 == null) {
            return null;
        }
        return A002.A02;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.A00.A02(i, i2, bundle);
    }

    public AnonymousClass0H7(AnonymousClass0X7 r1) {
        this.A00 = r1;
    }

    public List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }
}
