package X;

import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: X.6dL  reason: invalid class name and case insensitive filesystem */
public final class C135836dL implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C93214g9 A01;
    public final /* synthetic */ C120765s2 A02;

    public C135836dL(C93214g9 r1, C120765s2 r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public void onGlobalLayout() {
        int A012;
        List list;
        C93214g9 r8 = this.A01;
        C36351kA.A1C(r8, this);
        C128436Cg r0 = this.A02.A02;
        if (!(r0 == null || (list = r0.A03) == null)) {
            r8.A01(list);
        }
        Drawable progressDrawable = r8.getProgressDrawable();
        int i = r8.getProgressDrawable().getBounds().left;
        float f = (float) 4;
        float f2 = (float) 160;
        int A013 = r8.getProgressDrawable().getBounds().left + C14960mT.A01(f * (((float) AnonymousClass000.A0X(C36371kC.A0B(r8)).densityDpi) / f2));
        int i2 = r8.getProgressDrawable().getBounds().right;
        int i3 = this.A00;
        if (i3 == 0) {
            A012 = r8.getProgressDrawable().getBounds().bottom;
        } else {
            A012 = i3 - C14960mT.A01(f * (((float) AnonymousClass000.A0X(C36371kC.A0B(r8)).densityDpi) / f2));
        }
        progressDrawable.setBounds(i, A013, i2, A012);
    }
}
