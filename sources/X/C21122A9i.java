package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.A9i  reason: case insensitive filesystem */
public class C21122A9i implements C160927lo {
    public View A00;
    public View A01;
    public AnonymousClass9V8 A02;
    public boolean A03 = true;
    public final C001700s A04 = C36431kI.A0S();
    public final C001700s A05 = C36431kI.A0S();
    public final C194329Pf A06 = new C194329Pf();
    public final Activity A07;
    public final AnonymousClass026 A08;
    public final AnonymousClass026 A09;
    public final C25841Hw A0A;
    public final C207739wu A0B;
    public final C201419jW A0C;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.view.View r10, X.C001700s r11, X.C21122A9i r12) {
        /*
            X.9V8 r0 = r12.A02
            if (r0 == 0) goto L_0x0030
            if (r10 == 0) goto L_0x0030
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x0018
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0031
            android.app.Activity r0 = r12.A07
            boolean r0 = r0.isInPictureInPictureMode()
            if (r0 == 0) goto L_0x0031
        L_0x0018:
            X.6PI r4 = X.AnonymousClass6PI.A04
        L_0x001a:
            java.lang.Object r2 = r11.A04()
            if (r2 != 0) goto L_0x0027
            int r1 = r4.A00
            if (r1 == 0) goto L_0x0030
            r0 = 3
            if (r1 == r0) goto L_0x0030
        L_0x0027:
            boolean r0 = X.C1901797e.A00(r2, r4)
            if (r0 != 0) goto L_0x0030
            r11.A0C(r4)
        L_0x0030:
            return
        L_0x0031:
            X.9V8 r0 = r12.A02
            X.B5N r3 = X.AnonymousClass96Z.A00(r0)
            if (r3 != 0) goto L_0x0049
            X.1Hw r0 = r12.A0A
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0018
            r1 = 3
            r0 = 0
            X.6PI r4 = new X.6PI
            r4.<init>(r0, r0, r1)
            goto L_0x001a
        L_0x0049:
            android.view.ViewParent r4 = r10.getParent()
            android.view.View r4 = (android.view.View) r4
            int r0 = r4.getHeight()
            if (r0 == 0) goto L_0x0030
            X.9xj r3 = (X.C208149xj) r3
            X.9dr r1 = r3.A02
            X.9dr r0 = X.C198609dr.A02
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x0073
            X.9dr r0 = X.C198609dr.A01
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0018
            X.9dq r1 = r3.A01
            X.9dq r0 = X.C198599dq.A02
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0018
        L_0x0073:
            int[] r7 = X.C36441kJ.A1O()
            r4.getLocationOnScreen(r7)
            r10 = 0
            r9 = r7[r10]
            r5 = 1
            r6 = r7[r5]
            int r0 = r4.getWidth()
            int r2 = r9 + r0
            r1 = r7[r5]
            int r0 = r4.getHeight()
            int r1 = r1 + r0
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r9, r6, r2, r1)
            X.1R6 r0 = r3.A00
            int r6 = r0.A01
            int r3 = r0.A03
            int r2 = r0.A02
            int r1 = r0.A00
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r6, r3, r2, r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r0)
            boolean r1 = r3.intersect(r8)
            int r0 = r3.width()
            if (r0 != 0) goto L_0x00b6
            int r0 = r3.height()
            if (r0 == 0) goto L_0x0018
        L_0x00b6:
            if (r1 == 0) goto L_0x0018
            r0 = r7[r10]
            int r1 = -r0
            r0 = r7[r5]
            int r0 = -r0
            r3.offset(r1, r0)
            int r0 = r3.left
            if (r0 != 0) goto L_0x00da
            int r2 = r4.getWidth()
            int r0 = r4.getHeight()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>(r2, r0)
            r0 = 2
            X.6PI r4 = new X.6PI
            r4.<init>(r1, r3, r0)
            goto L_0x001a
        L_0x00da:
            int r0 = r3.top
            if (r0 != 0) goto L_0x0030
            int r2 = r4.getWidth()
            int r1 = r4.getHeight()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            X.6PI r4 = new X.6PI
            r4.<init>(r0, r3, r5)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21122A9i.A00(android.view.View, X.00s, X.A9i):void");
    }

    public void Bc1() {
        C201419jW r1 = this.A0C;
        Activity activity = this.A07;
        synchronized (r1) {
            r1.A00();
            r1.A01(activity);
        }
    }

    public void Bcf() {
        C201419jW r1 = this.A0C;
        Activity activity = this.A07;
        synchronized (r1) {
            r1.A00();
            r1.A01(activity);
        }
    }

    public void Bh9(View view) {
        this.A01 = view;
        C201419jW r1 = this.A0C;
        r1.A02(this.A09);
        r1.A02(this.A0B);
        r1.A02(this.A08);
        r1.A01(this.A07);
    }

    public void Bho() {
        C201419jW r0 = this.A0C;
        r0.A00();
        r0.A00.clear();
    }

    public void BqK(View view) {
        this.A00 = view;
        A00(view, this.A04, this);
    }

    public void Bqq(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            A00(this.A01, this.A05, this);
            A00(this.A00, this.A04, this);
        }
    }

    public void onGlobalLayout() {
        A00(this.A01, this.A05, this);
        A00(this.A00, this.A04, this);
    }

    public C21122A9i(AnonymousClass01I r2, C207719ws r3, C25841Hw r4, C207739wu r5, C201419jW r6, C21010yW r7) {
        this.A07 = r2;
        this.A0C = r6;
        this.A0B = r5;
        this.A08 = r3;
        this.A0A = r4;
        this.A09 = new C207729wt(r2, this, r7);
    }

    public C001600r B9C() {
        return this.A04;
    }

    public C001600r B9D() {
        return this.A05;
    }
}
