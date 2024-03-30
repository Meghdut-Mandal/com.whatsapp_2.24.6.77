package X;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.0sh  reason: invalid class name and case insensitive filesystem */
public class C18150sh extends C09770cu {
    public Object A00;
    public final int A01;

    public C18150sh(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BR7(View view) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            AnonymousClass02U r2 = ((C09320cB) obj).A01;
            r2.A0J.setVisibility(8);
            PopupWindow popupWindow = r2.A0B;
            if (popupWindow != null) {
                popupWindow.dismiss();
            } else if (r2.A0J.getParent() instanceof View) {
                AnonymousClass09G.A00((View) r2.A0J.getParent());
            }
            r2.A0J.A04();
            r2.A0L.A09((C17190qs) null);
            r2.A0L = null;
            AnonymousClass09G.A00(r2.A09);
            return;
        }
        AnonymousClass02U r22 = ((C11040fd) obj).A00;
        r22.A0J.setAlpha(1.0f);
        r22.A0L.A09((C17190qs) null);
        r22.A0L = null;
    }

    public void BR9(View view) {
        if (this.A01 == 0) {
            ((C11040fd) this.A00).A00.A0J.setVisibility(0);
        }
    }
}
