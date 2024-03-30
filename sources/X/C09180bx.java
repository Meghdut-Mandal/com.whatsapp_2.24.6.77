package X;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: X.0bx  reason: invalid class name and case insensitive filesystem */
public class C09180bx implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakReference A00;
    public final WeakReference A01;

    public void A00() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            AnonymousClass000.A0Y(weakReference).removeOnAttachStateChangeListener(this);
            View A0Y = AnonymousClass000.A0Y(weakReference);
            if (A0Y != null) {
                A0Y.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
        weakReference.clear();
        this.A01.clear();
    }

    public void onGlobalLayout() {
        WeakReference weakReference = this.A01;
        if (weakReference.get() == null) {
            A00();
            return;
        }
        weakReference.get();
        Handler handler = AnonymousClass6YL.A0M;
    }

    public void onViewAttachedToWindow(View view) {
        if (this.A01.get() == null) {
            A00();
        } else if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    public void onViewDetachedFromWindow(View view) {
        if (this.A01.get() == null) {
            A00();
        } else if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public C09180bx(View view, AnonymousClass6YL r3) {
        this.A01 = AnonymousClass001.A0F(r3);
        this.A00 = AnonymousClass001.A0F(view);
    }
}
