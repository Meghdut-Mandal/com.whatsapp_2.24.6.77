package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.whatsapp.WaTextView;

/* renamed from: X.1rU  reason: invalid class name and case insensitive filesystem */
public class C39191rU extends C011705b {
    public void A0k(View view, C07650Ys r5) {
        super.A0k(view, r5);
        r5.A0B(AnonymousClass0Yd.A08);
        r5.A0L(false);
        AccessibilityNodeInfo accessibilityNodeInfo = r5.A02;
        accessibilityNodeInfo.setLongClickable(false);
        if (view instanceof WaTextView) {
            accessibilityNodeInfo.setText(((TextView) view).getText());
        }
        view.setClickable(false);
        view.setLongClickable(false);
    }
}
