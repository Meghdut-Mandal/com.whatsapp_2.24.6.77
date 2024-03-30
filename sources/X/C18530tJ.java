package X;

/* renamed from: X.0tJ  reason: invalid class name and case insensitive filesystem */
public class C18530tJ implements C010904r {
    public Object A00;
    public final int A01;

    public C18530tJ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0134, code lost:
        if (r11 != false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013d, code lost:
        r2 = X.AnonymousClass000.A0a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r15.A05() <= 0) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass09H BRE(android.view.View r14, X.AnonymousClass09H r15) {
        /*
            r13 = this;
            int r0 = r13.A01
            if (r0 == 0) goto L_0x005c
            java.lang.Object r5 = r13.A00
            androidx.coordinatorlayout.widget.CoordinatorLayout r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r5
            X.09H r0 = r5.A02
            boolean r0 = X.C014106d.A01(r0, r15)
            if (r0 != 0) goto L_0x0056
            r5.A02 = r15
            r2 = 1
            if (r15 == 0) goto L_0x001c
            int r1 = r15.A05()
            r0 = 1
            if (r1 > 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r5.A03 = r0
            if (r0 != 0) goto L_0x005a
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 != 0) goto L_0x005a
        L_0x0027:
            r5.setWillNotDraw(r2)
            X.09I r4 = r15.A00
            boolean r0 = r4.A0A()
            if (r0 != 0) goto L_0x0053
            r3 = 0
            int r2 = r5.getChildCount()
        L_0x0037:
            if (r3 >= r2) goto L_0x0053
            android.view.View r1 = r5.getChildAt(r3)
            boolean r0 = X.C011504z.A09(r1)
            if (r0 == 0) goto L_0x0057
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.0Ak r0 = (X.C02460Ak) r0
            X.0XL r0 = r0.A0B
            if (r0 == 0) goto L_0x0057
            boolean r0 = r4.A0A()
            if (r0 == 0) goto L_0x0057
        L_0x0053:
            r5.requestLayout()
        L_0x0056:
            return r15
        L_0x0057:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x005a:
            r2 = 0
            goto L_0x0027
        L_0x005c:
            int r6 = r15.A05()
            java.lang.Object r7 = r13.A00
            X.02U r7 = (X.AnonymousClass02U) r7
            r5 = 0
            int r3 = r15.A05()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.A0J
            r2 = 8
            if (r0 == 0) goto L_0x016d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x016d
            androidx.appcompat.widget.ActionBarContextView r0 = r7.A0J
            android.view.ViewGroup$MarginLayoutParams r4 = X.AnonymousClass000.A0a(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = r7.A0J
            boolean r0 = r0.isShown()
            r12 = 1
            if (r0 == 0) goto L_0x016f
            android.graphics.Rect r0 = r7.A05
            if (r0 != 0) goto L_0x0096
            android.graphics.Rect r0 = X.AnonymousClass001.A06()
            r7.A05 = r0
            android.graphics.Rect r0 = X.AnonymousClass001.A06()
            r7.A06 = r0
        L_0x0096:
            android.graphics.Rect r9 = r7.A05
            android.graphics.Rect r10 = r7.A06
            int r11 = r15.A03()
            int r8 = r15.A05()
            int r1 = r15.A04()
            int r0 = r15.A02()
            r9.set(r11, r8, r1, r0)
            android.view.ViewGroup r8 = r7.A09
            java.lang.reflect.Method r1 = X.AnonymousClass04u.A00
            if (r1 == 0) goto L_0x00c6
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00be }
            r0[r5] = r9     // Catch:{ Exception -> 0x00be }
            r0[r12] = r10     // Catch:{ Exception -> 0x00be }
            r1.invoke(r8, r0)     // Catch:{ Exception -> 0x00be }
            goto L_0x00c6
        L_0x00be:
            r8 = move-exception
            java.lang.String r1 = "ViewUtils"
            java.lang.String r0 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r1, r0, r8)
        L_0x00c6:
            int r10 = r9.top
            int r11 = r9.left
            int r1 = r9.right
            android.view.ViewGroup r0 = r7.A09
            X.09H r0 = X.C012005e.A08(r0)
            if (r0 != 0) goto L_0x0163
            r9 = 0
            r8 = 0
        L_0x00d6:
            int r0 = r4.topMargin
            if (r0 != r10) goto L_0x015b
            int r0 = r4.leftMargin
            if (r0 != r11) goto L_0x015b
            int r0 = r4.rightMargin
            if (r0 != r1) goto L_0x015b
            r11 = 0
        L_0x00e3:
            if (r10 <= 0) goto L_0x0139
            android.view.View r0 = r7.A08
            if (r0 != 0) goto L_0x0139
            android.content.Context r1 = r7.A0i
            android.view.View r0 = new android.view.View
            r0.<init>(r1)
            r7.A08 = r0
            r0.setVisibility(r2)
            int r1 = r4.topMargin
            r0 = 51
            r10 = -1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r10, r1, r0)
            r2.leftMargin = r9
            r2.rightMargin = r8
            android.view.ViewGroup r1 = r7.A09
            android.view.View r0 = r7.A08
            r1.addView(r0, r10, r2)
        L_0x010a:
            android.view.View r0 = r7.A08
            if (r0 == 0) goto L_0x0137
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x012d
            android.view.View r8 = r7.A08
            int r0 = X.C011504z.A03(r8)
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            android.content.Context r1 = r7.A0i
            r0 = 2131099653(0x7f060005, float:1.7811665E38)
            if (r2 == 0) goto L_0x0126
            r0 = 2131099654(0x7f060006, float:1.7811667E38)
        L_0x0126:
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            r8.setBackgroundColor(r0)
        L_0x012d:
            boolean r0 = r7.A0X
            if (r0 != 0) goto L_0x0134
            if (r12 == 0) goto L_0x0134
            r3 = 0
        L_0x0134:
            if (r11 == 0) goto L_0x017b
            goto L_0x0176
        L_0x0137:
            r12 = 0
            goto L_0x012d
        L_0x0139:
            android.view.View r0 = r7.A08
            if (r0 == 0) goto L_0x010a
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass000.A0a(r0)
            int r0 = r2.height
            int r1 = r4.topMargin
            if (r0 != r1) goto L_0x014f
            int r0 = r2.leftMargin
            if (r0 != r9) goto L_0x014f
            int r0 = r2.rightMargin
            if (r0 == r8) goto L_0x010a
        L_0x014f:
            r2.height = r1
            r2.leftMargin = r9
            r2.rightMargin = r8
            android.view.View r0 = r7.A08
            r0.setLayoutParams(r2)
            goto L_0x010a
        L_0x015b:
            r4.topMargin = r10
            r4.leftMargin = r11
            r4.rightMargin = r1
            r11 = 1
            goto L_0x00e3
        L_0x0163:
            int r9 = r0.A03()
            int r8 = r0.A04()
            goto L_0x00d6
        L_0x016d:
            r12 = 0
            goto L_0x017b
        L_0x016f:
            int r0 = r4.topMargin
            if (r0 == 0) goto L_0x016d
            r4.topMargin = r5
            r12 = 0
        L_0x0176:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.A0J
            r0.setLayoutParams(r4)
        L_0x017b:
            android.view.View r0 = r7.A08
            if (r0 == 0) goto L_0x0186
            if (r12 != 0) goto L_0x0183
            r5 = 8
        L_0x0183:
            r0.setVisibility(r5)
        L_0x0186:
            if (r6 == r3) goto L_0x0198
            int r2 = r15.A03()
            int r1 = r15.A04()
            int r0 = r15.A02()
            X.09H r15 = r15.A07(r2, r3, r1, r0)
        L_0x0198:
            X.09H r15 = X.C012005e.A0B(r14, r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18530tJ.BRE(android.view.View, X.09H):X.09H");
    }
}
