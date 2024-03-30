package X;

import android.view.View;

/* renamed from: X.07x  reason: invalid class name and case insensitive filesystem */
public class C018507x implements View.OnAttachStateChangeListener {
    public void onViewDetachedFromWindow(View view) {
    }

    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        AnonymousClass09G.A00(view);
    }
}
