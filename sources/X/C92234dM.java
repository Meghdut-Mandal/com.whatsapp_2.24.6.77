package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: X.4dM  reason: invalid class name and case insensitive filesystem */
public class C92234dM extends View.AccessibilityDelegate {
    public final /* synthetic */ AnonymousClass6VJ A00;

    public C92234dM(AnonymousClass6VJ r1) {
        this.A00 = r1;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.A00.A0R.A0B;
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
