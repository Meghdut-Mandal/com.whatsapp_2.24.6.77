package X;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: X.0c9  reason: invalid class name and case insensitive filesystem */
public class C09300c9 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener A00;
    public final /* synthetic */ AnonymousClass0G0 A01;

    public C09300c9(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, AnonymousClass0G0 r2) {
        this.A01 = r2;
        this.A00 = onGlobalLayoutListener;
    }

    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.A01.A04.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.A00);
        }
    }
}
