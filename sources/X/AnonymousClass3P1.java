package X;

import android.view.View;

/* renamed from: X.3P1  reason: invalid class name */
public final class AnonymousClass3P1 {
    public C597435c A00;
    public AnonymousClass3KF A01;
    public final C32371dR A02;
    public final C51662oB A03;
    public final C29731Xt A04;
    public final C28781Ua A05;
    public final AnonymousClass00T A06 = C36431kI.A1I(new AnonymousClass4E2(this));

    public static final void A00(AnonymousClass3P1 r3) {
        boolean z;
        C597435c r0 = r3.A00;
        if (r0 != null) {
            AnonymousClass3KF A012 = r3.A01();
            C77933rI r2 = r0.A01;
            View view = r2.A01;
            if (view != null && (z = A012.A03) != AnonymousClass000.A1Q(view.getVisibility())) {
                C77933rI.A00(r2, z, A012.A02);
            }
        }
    }

    public final AnonymousClass3KF A01() {
        AnonymousClass3KF r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("crossPostingViewModelState");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (X.C36411kG.A1a(r8.A02()) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r3 == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3P1(X.C32371dR r8, X.C51662oB r9, X.C29731Xt r10, X.C28781Ua r11, boolean r12) {
        /*
            r7 = this;
            X.C36321k7.A12(r11, r8, r10)
            r7.<init>()
            r7.A05 = r11
            r7.A02 = r8
            r7.A04 = r10
            r7.A03 = r9
            X.4E2 r0 = new X.4E2
            r0.<init>(r7)
            X.00U r0 = X.C36431kI.A1I(r0)
            r7.A06 = r0
            boolean r0 = r11.A00()
            if (r0 != 0) goto L_0x002a
            X.1Ak r0 = r8.A02()
            boolean r0 = X.C36411kG.A1a(r0)
            r3 = 1
            if (r0 != 0) goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            if (r12 != 0) goto L_0x0030
            r4 = 1
            if (r3 != 0) goto L_0x0031
        L_0x0030:
            r4 = 0
        L_0x0031:
            X.2pr r1 = X.C52602pr.HIDE
            r5 = 0
            X.3KF r0 = new X.3KF
            r6 = 0
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3P1.<init>(X.1dR, X.2oB, X.1Xt, X.1Ua, boolean):void");
    }
}
