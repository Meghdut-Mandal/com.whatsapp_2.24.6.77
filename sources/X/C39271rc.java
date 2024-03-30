package X;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.1rc  reason: invalid class name and case insensitive filesystem */
public class C39271rc extends C011705b {
    public final /* synthetic */ View A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C39271rc(View view, String str, String str2, boolean z) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = view;
        this.A03 = z;
    }

    public void A0k(View view, C07650Ys r10) {
        super.A0k(view, r10);
        r10.A0G("Button");
        AccessibilityNodeInfo accessibilityNodeInfo = r10.A02;
        accessibilityNodeInfo.setSelected(false);
        r10.A0D(this.A02);
        String str = this.A01;
        if (str != null) {
            r10.A0A(new AnonymousClass0Yd(16, (CharSequence) str));
        }
        View view2 = (View) this.A00.getParent();
        if (this.A03 && view2 != null) {
            int[] A1O = C36441kJ.A1O();
            view2.getLocationOnScreen(A1O);
            int i = A1O[0];
            accessibilityNodeInfo.setBoundsInScreen(new Rect(i, A1O[1], i + view2.getWidth(), C36431kI.A04(view2, A1O[1])));
        }
    }
}
