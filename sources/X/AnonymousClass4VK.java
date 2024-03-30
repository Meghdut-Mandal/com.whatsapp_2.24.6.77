package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.4VK  reason: invalid class name */
public class AnonymousClass4VK extends AnimatorListenerAdapter {
    public Object A00;
    public final int A01;

    public AnonymousClass4VK(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0069, code lost:
        r2.requestLayout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        r1.setVisibility(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0024;
                case 2: goto L_0x002f;
                case 3: goto L_0x0005;
                case 4: goto L_0x0042;
                case 5: goto L_0x0056;
                case 6: goto L_0x0042;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationEnd(r4)
        L_0x0008:
            return
        L_0x0009:
            super.onAnimationEnd(r4)
            java.lang.Object r0 = r3.A00
            X.15l r0 = (X.C227015l) r0
            com.whatsapp.HomeActivity r2 = r0.A00
            android.view.ViewGroup r1 = r2.A0I
            if (r1 == 0) goto L_0x0008
            android.view.View$OnLayoutChangeListener r0 = r2.A2H
            r1.removeOnLayoutChangeListener(r0)
            android.animation.AnimatorSet r0 = r2.A0A
            r0.removeAllListeners()
            r0 = 0
            r2.A0A = r0
            return
        L_0x0024:
            super.onAnimationEnd(r4)
            java.lang.Object r0 = r3.A00
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            android.view.View r1 = r0.A0D
            r0 = 0
            goto L_0x003e
        L_0x002f:
            super.onAnimationEnd(r4)
            java.lang.Object r1 = r3.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            androidx.appcompat.widget.SearchView r0 = r1.A0L
            r0.A0D()
            android.view.View r1 = r1.A0G
            r0 = 4
        L_0x003e:
            r1.setVisibility(r0)
            return
        L_0x0042:
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            super.onAnimationEnd(r4)
            java.lang.Object r2 = r3.A00
            android.view.View r2 = (android.view.View) r2
            X.C36421kH.A0t(r2)
            r0 = 8
            r2.setVisibility(r0)
            goto L_0x0069
        L_0x0056:
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            super.onAnimationEnd(r4)
            java.lang.Object r2 = r3.A00
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = X.C60973Ab.A08
            r1.height = r0
        L_0x0069:
            r2.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VK.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A01) {
            case 3:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationStart(animator);
                View view = (View) this.A00;
                view.setVisibility(0);
                view.setAlpha(0.0f);
                return;
            case 5:
                AnonymousClass00C.A0D(animator, 0);
                super.onAnimationStart(animator);
                ((View) this.A00).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
