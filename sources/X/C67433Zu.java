package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.3Zu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67433Zu implements TextView.OnEditorActionListener {
    public final /* synthetic */ AnonymousClass4UT A00;
    public final /* synthetic */ C60963Aa A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C67433Zu(AnonymousClass4UT r1, C60963Aa r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C60963Aa r4 = this.A01;
        boolean z = this.A02;
        AnonymousClass4UT r2 = this.A00;
        if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        }
        if (z) {
            r2.BT7();
            return true;
        }
        r4.A05.A0B();
        return true;
    }
}
