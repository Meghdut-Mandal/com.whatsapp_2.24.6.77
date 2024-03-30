package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4Ze  reason: invalid class name and case insensitive filesystem */
public class C90124Ze implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C90124Ze(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005d, code lost:
        if (r2 != false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.A03
            switch(r1) {
                case 1: goto L_0x006c;
                case 2: goto L_0x00b1;
                case 3: goto L_0x0007;
                case 4: goto L_0x002c;
                case 5: goto L_0x0098;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r0.A02
            android.view.View r3 = (android.view.View) r3
            X.C36361kB.A16(r3, r0)
            r5 = 1
            r6 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r7 = 1
            r8 = 0
            r9 = 1
            r11 = 1
            r12 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 200(0xc8, double:9.9E-322)
            r4.setDuration(r1)
            r3.startAnimation(r4)
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
            r0.startAnimation(r4)
        L_0x002b:
            return
        L_0x002c:
            java.lang.Object r5 = r0.A00
            com.whatsapp.registration.RegistrationScrollView r5 = (com.whatsapp.registration.RegistrationScrollView) r5
            java.lang.Object r4 = r0.A01
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r0.A02
            android.view.View r3 = (android.view.View) r3
            boolean r0 = r5.A04
            r2 = 1
            if (r0 != 0) goto L_0x0048
            android.view.ViewTreeObserver r1 = r5.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r0 = r5.A07
            r1.addOnScrollChangedListener(r0)
            r5.A04 = r2
        L_0x0048:
            boolean r2 = r5.canScrollVertically(r2)
            r0 = -1
            boolean r1 = r5.canScrollVertically(r0)
            if (r1 != 0) goto L_0x005d
            if (r2 != 0) goto L_0x005f
            r0 = 0
            X.C011004s.A05(r4, r0)
            X.C011004s.A05(r3, r0)
            return
        L_0x005d:
            if (r2 == 0) goto L_0x0066
        L_0x005f:
            float r0 = r5.A06
            X.C011004s.A05(r3, r0)
            if (r1 == 0) goto L_0x002b
        L_0x0066:
            float r0 = r5.A06
            X.C011004s.A05(r4, r0)
            return
        L_0x006c:
            java.lang.Object r1 = r0.A01
            android.view.View r1 = (android.view.View) r1
            int r4 = r1.getHeight()
            if (r4 <= 0) goto L_0x002b
            X.C36351kA.A1C(r1, r0)
            java.lang.Object r3 = r0.A00
            X.3FP r3 = (X.AnonymousClass3FP) r3
            com.whatsapp.WaImageView r2 = r3.A08
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r1.width = r4
            r1.height = r4
            r2.setLayoutParams(r1)
            X.1sU r1 = r3.A0B
            java.lang.Object r0 = r0.A02
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getHeight()
            X.C36341k9.A16(r1, r0)
            return
        L_0x0098:
            java.lang.Object r3 = r0.A01
            android.widget.ScrollView r3 = (android.widget.ScrollView) r3
            boolean r1 = X.AnonymousClass3MY.A00(r3)
            r2 = 0
            if (r1 == 0) goto L_0x00a6
            r2 = 2131233743(0x7f080bcf, float:1.8083632E38)
        L_0x00a6:
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            r1.setBackgroundResource(r2)
            X.C36351kA.A1C(r3, r0)
            return
        L_0x00b1:
            java.lang.Object r4 = r0.A02
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            X.C36361kB.A16(r4, r0)
            android.graphics.drawable.Drawable r1 = r4.getDrawable()
            int r8 = r1.getIntrinsicWidth()
            android.graphics.drawable.Drawable r1 = r4.getDrawable()
            int r5 = r1.getIntrinsicHeight()
            r7 = 2
            int[] r2 = new int[r7]
            java.lang.Object r9 = r0.A01
            android.view.View r9 = (android.view.View) r9
            r9.getLocationOnScreen(r2)
            int[] r10 = new int[r7]
            java.lang.Object r1 = r0.A00
            X.3fk r1 = (X.C70803fk) r1
            com.whatsapp.conversation.ConversationListView r1 = r1.A2U
            r1.getLocationOnScreen(r10)
            r3 = 0
            r6 = r2[r3]
            r1 = r10[r3]
            int r6 = r6 - r1
            r13 = 1
            r2 = r2[r13]
            r1 = r10[r13]
            int r2 = r2 - r1
            int r1 = r9.getWidth()
            int r1 = r8 - r1
            int r1 = r1 / r7
            int r6 = r6 - r1
            int r1 = r9.getHeight()
            int r1 = r5 - r1
            int r1 = r1 / r7
            int r2 = r2 - r1
            r4.setVisibility(r3)
            android.view.animation.AnimationSet r3 = new android.view.animation.AnimationSet
            r3.<init>(r13)
            float r7 = (float) r6
            float r2 = (float) r2
            float r1 = (float) r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r5
            float r1 = r2 - r1
            android.view.animation.TranslateAnimation r6 = new android.view.animation.TranslateAnimation
            r6.<init>(r7, r7, r2, r1)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            android.graphics.drawable.Drawable r1 = r9.getDrawable()
            int r1 = r1.getIntrinsicWidth()
            float r9 = (float) r1
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 * r10
            float r1 = (float) r8
            float r9 = r9 / r1
            r14 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r8 = new android.view.animation.ScaleAnimation
            r12 = 1065353216(0x3f800000, float:1.0)
            r15 = 1
            r16 = 1056964608(0x3f000000, float:0.5)
            r11 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r2 = 0
            android.view.animation.AlphaAnimation r1 = new android.view.animation.AlphaAnimation
            r1.<init>(r14, r2)
            r3.addAnimation(r1)
            r3.addAnimation(r8)
            r3.addAnimation(r6)
            r1 = 2000(0x7d0, double:9.88E-321)
            r3.setDuration(r1)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>(r5)
            r3.setInterpolator(r1)
            r1 = 9
            X.C89234Vt.A00(r3, r0, r1)
            r4.startAnimation(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90124Ze.onGlobalLayout():void");
    }
}
