package X;

/* renamed from: X.6eQ  reason: invalid class name and case insensitive filesystem */
public abstract class C136456eQ implements C157467da {
    public final C157597dn A00;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00db, code lost:
        if (r2 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00dd, code lost:
        r2 = new X.C92374dq(X.C36371kC.A0B(r8));
        r8.addView(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C157477db BnY(X.C156897b8 r10, X.C161337ma r11, int r12) {
        /*
            r9 = this;
            r5 = 0
            X.AnonymousClass00C.A0D(r10, r5)
            r0 = 988743187(0x3aef0613, float:0.0018236063)
            r11.Bum(r0)
            X.4gm r0 = X.C113795g8.A02
            r4 = r11
            X.6fF r4 = (X.C136916fF) r4
            java.lang.Object r3 = X.AnonymousClass6G0.A01(r4, r0)
            X.7mQ r3 = (X.C161237mQ) r3
            r0 = -1524341038(0xffffffffa52466d2, float:-1.425957E-16)
            r11.Bum(r0)
            X.7dn r8 = r9.A00
            java.lang.Object r0 = r8.getValue()
            X.6Xx r0 = (X.C133336Xx) r0
            long r0 = r0.A00
            long r6 = X.C133336Xx.A05
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x006d
            java.lang.Object r0 = r8.getValue()
            X.6Xx r0 = (X.C133336Xx) r0
            long r0 = r0.A00
        L_0x0033:
            X.C136916fF.A0M(r4, r5)
            X.6Xx r2 = new X.6Xx
            r2.<init>(r0)
            X.7n5 r7 = X.AnonymousClass6G2.A00(r11, r2)
            X.6Br r0 = r3.Boq(r11, r5)
            X.7n5 r6 = X.AnonymousClass6G2.A00(r11, r0)
            r0 = 331259447(0x13be9e37, float:4.8118755E-27)
            r11.Bum(r0)
            r0 = -1737891121(0xffffffff9869e2cf, float:-3.0229053E-24)
            r11.Bum(r0)
            X.4gm r0 = X.C131966Ro.A03
            java.lang.Object r8 = X.AnonymousClass6G0.A01(r4, r0)
        L_0x0059:
            boolean r0 = r8 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x0085
            r0 = r8
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r1 = r0.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0072
            X.AnonymousClass00C.A08(r1)
            r8 = r1
            goto L_0x0059
        L_0x006d:
            long r0 = r3.B5A(r11, r5)
            goto L_0x0033
        L_0x0072:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Couldn't find a valid parent for "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)
            throw r0
        L_0x0085:
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            X.C136916fF.A0M(r4, r5)
            r0 = 1643267286(0x61f244d6, float:5.5863403E20)
            r11.Bum(r0)
            boolean r0 = r8.isInEditMode()
            if (r0 == 0) goto L_0x00c9
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r0 = X.C90464aC.A1X(r11, r10, r9, r0)
            java.lang.Object r3 = r11.BnZ()
            if (r0 != 0) goto L_0x00a7
            java.lang.Object r0 = X.C129736Ig.A00
            if (r3 != r0) goto L_0x00af
        L_0x00a7:
            X.4gg r3 = new X.4gg
            r3.<init>(r7, r6)
            r11.Bwv(r3)
        L_0x00af:
            X.C136916fF.A0M(r4, r5)
            X.4gg r3 = (X.C93514gg) r3
            X.C136916fF.A0M(r4, r5)
        L_0x00b7:
            X.C136916fF.A0M(r4, r5)
            X.6eU r3 = (X.C136496eU) r3
            r1 = 0
            androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1 r0 = new androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1
            r0.<init>(r10, r3, r1)
            X.C132846Vm.A01(r11, r3, r10, r0)
            X.C136916fF.A0M(r4, r5)
            return r3
        L_0x00c9:
            X.C136916fF.A0M(r4, r5)
            r3 = 0
            int r1 = r8.getChildCount()
        L_0x00d1:
            if (r3 >= r1) goto L_0x00dd
            android.view.View r2 = r8.getChildAt(r3)
            boolean r0 = r2 instanceof X.C92374dq
            if (r0 == 0) goto L_0x010f
            if (r2 != 0) goto L_0x00e9
        L_0x00dd:
            android.content.Context r0 = X.C36371kC.A0B(r8)
            X.4dq r2 = new X.4dq
            r2.<init>(r0)
            r8.addView(r2)
        L_0x00e9:
            r0 = 1618982084(0x607fb4c4, float:7.370227E19)
            boolean r1 = X.C90464aC.A1X(r11, r10, r9, r0)
            boolean r0 = r11.B2f(r2)
            r1 = r1 | r0
            java.lang.Object r3 = r11.BnZ()
            if (r1 != 0) goto L_0x00ff
            java.lang.Object r0 = X.C129736Ig.A00
            if (r3 != r0) goto L_0x0109
        L_0x00ff:
            X.4dq r2 = (X.C92374dq) r2
            X.4gh r3 = new X.4gh
            r3.<init>(r2, r7, r6)
            r11.Bwv(r3)
        L_0x0109:
            X.C136916fF.A0M(r4, r5)
            X.4gh r3 = (X.C93524gh) r3
            goto L_0x00b7
        L_0x010f:
            int r3 = r3 + 1
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136456eQ.BnY(X.7b8, X.7ma, int):X.7db");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136456eQ) {
                C136456eQ r5 = (C136456eQ) obj;
                if (!AnonymousClass000.A1Q(Float.compare(Float.NaN, Float.NaN)) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C136456eQ(C157597dn r1) {
        this.A00 = r1;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C90474aD.A02(38161, Float.NaN));
    }
}
