package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0t1  reason: invalid class name and case insensitive filesystem */
public class C18350t1 implements View.OnAttachStateChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C18350t1(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onViewAttachedToWindow(View view) {
        if (this.A02 != 0) {
            View view2 = (View) this.A01;
            view2.removeOnAttachStateChangeListener(this);
            AnonymousClass09G.A00(view2);
            return;
        }
        C022909q r1 = (C022909q) this.A01;
        AnonymousClass02E r0 = r1.A02;
        r1.A04();
        AnonymousClass0BU.A00((ViewGroup) r0.A0F.getParent()).A05();
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
