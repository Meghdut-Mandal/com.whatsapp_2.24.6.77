package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.4Vr  reason: invalid class name and case insensitive filesystem */
public class C89214Vr extends C67243Zb {
    public Object A00;
    public Object A01;
    public final int A02;

    public C89214Vr(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public static void A00(Animation animation, Object obj, Object obj2, int i) {
        animation.setAnimationListener(new C89214Vr(obj, obj2, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0096, code lost:
        r3.BYs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0099, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a0, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e7, code lost:
        r3.setImageBitmap((android.graphics.Bitmap) r0);
        r2 = X.C36351kA.A0D();
        r2.setDuration(100);
        r3.startAnimation(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.view.animation.Animation r5) {
        /*
            r4 = this;
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x002d;
                case 2: goto L_0x0005;
                case 3: goto L_0x0035;
                case 4: goto L_0x003b;
                case 5: goto L_0x004f;
                case 6: goto L_0x0067;
                case 7: goto L_0x007f;
                case 8: goto L_0x009a;
                case 9: goto L_0x00a4;
                case 10: goto L_0x00bf;
                case 11: goto L_0x0009;
                case 12: goto L_0x00d8;
                case 13: goto L_0x00e1;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onAnimationEnd(r5)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r0 = r4.A01
            X.3Kc r0 = (X.C63453Kc) r0
            com.whatsapp.qrcode.WaQrScannerView r0 = r0.A0G
            X.C36331k8.A0y(r0)
            java.lang.Object r0 = r4.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x0008
            r0.run()
            return
        L_0x001c:
            java.lang.Object r2 = r4.A00
            android.view.animation.Animation r2 = (android.view.animation.Animation) r2
            r0 = 1500(0x5dc, double:7.41E-321)
            r2.setStartOffset(r0)
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            r0.startAnimation(r2)
            return
        L_0x002d:
            java.lang.Object r0 = r4.A01
            X.6YT r0 = (X.AnonymousClass6YT) r0
            r0.A0N()
            return
        L_0x0035:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 4
            goto L_0x00a0
        L_0x003b:
            java.lang.Object r2 = r4.A01
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = -2
            r1.width = r0
            r2.setLayoutParams(r1)
            r0 = 8
            r2.setVisibility(r0)
            return
        L_0x004f:
            java.lang.Object r2 = r4.A00
            X.2HO r2 = (X.AnonymousClass2HO) r2
            java.lang.Object r3 = r4.A01
            X.4Pt r3 = (X.C87684Pt) r3
            android.view.View r0 = r2.A00
            X.C36421kH.A0s(r0)
            android.view.ViewGroup r1 = r2.A04
            android.view.View r0 = r2.A00
            r1.removeView(r0)
            r0 = 0
            r2.A00 = r0
            goto L_0x0096
        L_0x0067:
            java.lang.Object r2 = r4.A00
            X.2HN r2 = (X.AnonymousClass2HN) r2
            java.lang.Object r3 = r4.A01
            X.4Pt r3 = (X.C87684Pt) r3
            android.view.View r0 = r2.A01
            X.C36421kH.A0s(r0)
            android.view.ViewGroup r1 = r2.A04
            android.view.View r0 = r2.A01
            r1.removeView(r0)
            r0 = 0
            r2.A01 = r0
            goto L_0x0096
        L_0x007f:
            java.lang.Object r2 = r4.A01
            X.2HM r2 = (X.AnonymousClass2HM) r2
            java.lang.Object r3 = r4.A00
            X.4Pt r3 = (X.C87684Pt) r3
            android.view.View r0 = r2.A01
            X.C36331k8.A0y(r0)
            android.view.ViewGroup r1 = r2.A03
            android.view.View r0 = r2.A01
            r1.removeView(r0)
            r0 = 0
            r2.A01 = r0
        L_0x0096:
            r3.BYs()
            return
        L_0x009a:
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 8
        L_0x00a0:
            r1.setVisibility(r0)
            return
        L_0x00a4:
            java.lang.Object r2 = r4.A00
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = -2
            r1.width = r0
            r2.requestLayout()
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            r0 = 16
            X.C90104Zc.A00(r1, r4, r0)
            r2.clearAnimation()
            return
        L_0x00bf:
            java.lang.Object r2 = r4.A00
            com.whatsapp.group.GroupParticipantsSearchFragment r2 = (com.whatsapp.group.GroupParticipantsSearchFragment) r2
            java.lang.Object r1 = r4.A01
            androidx.appcompat.widget.SearchView r1 = (androidx.appcompat.widget.SearchView) r1
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x00d2
            r0 = 0
            r1.A0E()
            r2.A0A = r0
            return
        L_0x00d2:
            X.1N2 r0 = r2.A08
            r0.A01(r1)
            return
        L_0x00d8:
            java.lang.Object r0 = r4.A00
            X.3HI r0 = (X.AnonymousClass3HI) r0
            android.widget.ImageView r3 = r0.A06
            java.lang.Object r0 = r4.A01
            goto L_0x00e7
        L_0x00e1:
            java.lang.Object r3 = r4.A01
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.Object r0 = r4.A00
        L_0x00e7:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r3.setImageBitmap(r0)
            android.view.animation.AlphaAnimation r2 = X.C36351kA.A0D()
            r0 = 100
            r2.setDuration(r0)
            r3.startAnimation(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89214Vr.onAnimationEnd(android.view.animation.Animation):void");
    }

    public void onAnimationStart(Animation animation) {
        if (2 - this.A02 != 0) {
            super.onAnimationStart(animation);
        } else {
            ((View) this.A01).setVisibility(0);
        }
    }
}
