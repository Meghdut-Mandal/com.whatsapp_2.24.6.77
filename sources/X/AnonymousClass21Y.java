package X;

import android.view.View;

/* renamed from: X.21Y  reason: invalid class name */
public final class AnonymousClass21Y extends C61273Bf implements View.OnAttachStateChangeListener {
    public final View A00;

    public void onViewAttachedToWindow(View view) {
        C56962xR r0 = this.A00;
        if (r0 != null) {
            AnonymousClass3B4 r2 = r0.A00;
            if (!r2.A01) {
                r2.A01 = true;
                r2.A04.post(r2.A09);
            }
        }
    }

    public AnonymousClass21Y(View view) {
        this.A00 = view;
        view.addOnAttachStateChangeListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        A00();
    }
}
