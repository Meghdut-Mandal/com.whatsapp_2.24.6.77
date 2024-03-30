package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.6dv  reason: invalid class name and case insensitive filesystem */
public class C136196dv implements TextView.OnEditorActionListener {
    public final /* synthetic */ C1271967i A00;
    public final /* synthetic */ C140456lc A01;
    public final /* synthetic */ C160377ku A02;

    public C136196dv(C1271967i r1, C140456lc r2, C160377ku r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C160377ku r5 = this.A02;
        if (r5 == null) {
            return false;
        }
        C1273868b A002 = C1273868b.A00();
        C140456lc r1 = this.A01;
        A002.A0A(r1, 0);
        C1271967i r0 = this.A00;
        A002.A0A(r0, 1);
        C1273868b.A06(r0, r1, A002, r5);
        return true;
    }
}
