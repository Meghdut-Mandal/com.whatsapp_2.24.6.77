package X;

import android.widget.PopupWindow;

/* renamed from: X.0tC  reason: invalid class name and case insensitive filesystem */
public class C18460tC implements PopupWindow.OnDismissListener {
    public Object A00;
    public final int A01;

    public C18460tC(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onDismiss() {
        if (this.A01 != 0) {
            C07200Ws r1 = (C07200Ws) this.A00;
            C16610pn r0 = r1.A00;
            if (r0 != null) {
                r0.BVt(r1);
                return;
            }
            return;
        }
        ((C06710Ut) this.A00).A02();
    }
}
