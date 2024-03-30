package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.0sy  reason: invalid class name and case insensitive filesystem */
public class C18320sy implements View.OnAttachStateChangeListener {
    public Object A00;
    public final int A01;

    public C18320sy(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            AnonymousClass0Fc r2 = (AnonymousClass0Fc) obj;
            ViewTreeObserver viewTreeObserver2 = r2.A04;
            if (viewTreeObserver2 != null) {
                if (!viewTreeObserver2.isAlive()) {
                    r2.A04 = view.getViewTreeObserver();
                }
                viewTreeObserver = r2.A04;
                onGlobalLayoutListener = r2.A0D;
            }
            view.removeOnAttachStateChangeListener(this);
        }
        C03450Fb r22 = (C03450Fb) obj;
        ViewTreeObserver viewTreeObserver3 = r22.A05;
        if (viewTreeObserver3 != null) {
            if (!viewTreeObserver3.isAlive()) {
                r22.A05 = view.getViewTreeObserver();
            }
            viewTreeObserver = r22.A05;
            onGlobalLayoutListener = r22.A0J;
        }
        view.removeOnAttachStateChangeListener(this);
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
        view.removeOnAttachStateChangeListener(this);
    }

    public void onViewAttachedToWindow(View view) {
    }
}
