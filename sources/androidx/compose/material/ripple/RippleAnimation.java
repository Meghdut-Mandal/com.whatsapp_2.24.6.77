package androidx.compose.material.ripple;

import X.AnonymousClass0n5;
import X.AnonymousClass6J9;
import X.C132336Td;
import X.C133206Xf;
import X.C137076fY;
import X.C161547n5;
import X.C17980sO;
import X.C36381kD;
import X.C93994hT;

public final class RippleAnimation {
    public C133206Xf A00;
    public C133206Xf A01;
    public Float A02;
    public Float A03;
    public final C132336Td A04 = AnonymousClass6J9.A00();
    public final C132336Td A05 = AnonymousClass6J9.A00();
    public final C132336Td A06 = AnonymousClass6J9.A00();
    public final C161547n5 A07;
    public final C161547n5 A08;
    public final C17980sO A09 = new AnonymousClass0n5();

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r0.B1c(r7) != r6) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C023509x r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.AnonymousClass7A2
            if (r0 == 0) goto L_0x006f
            r7 = r9
            X.7A2 r7 = (X.AnonymousClass7A2) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006f
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r1 = r7.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r3) goto L_0x003e
            if (r0 == r4) goto L_0x0057
            if (r0 != r5) goto L_0x0075
            X.AnonymousClass0AN.A00(r1)
        L_0x0026:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0029:
            X.AnonymousClass0AN.A00(r1)
            r7.L$0 = r8
            r7.label = r3
            r1 = 0
            androidx.compose.material.ripple.RippleAnimation$fadeIn$2 r0 = new androidx.compose.material.ripple.RippleAnimation$fadeIn$2
            r0.<init>(r8, r1)
            java.lang.Object r0 = X.C009403z.A00(r7, r0)
            if (r0 == r6) goto L_0x0056
            r2 = r8
            goto L_0x0045
        L_0x003e:
            java.lang.Object r2 = r7.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            X.AnonymousClass0AN.A00(r1)
        L_0x0045:
            X.7n5 r0 = r2.A08
            X.C90474aD.A11(r0, r3)
            X.0sO r0 = r2.A09
            r7.L$0 = r2
            r7.label = r4
            java.lang.Object r0 = r0.B1c(r7)
            if (r0 != r6) goto L_0x005e
        L_0x0056:
            return r6
        L_0x0057:
            java.lang.Object r2 = r7.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            X.AnonymousClass0AN.A00(r1)
        L_0x005e:
            r1 = 0
            r7.L$0 = r1
            r7.label = r5
            androidx.compose.material.ripple.RippleAnimation$fadeOut$2 r0 = new androidx.compose.material.ripple.RippleAnimation$fadeOut$2
            r0.<init>(r2, r1)
            java.lang.Object r0 = X.C009403z.A00(r7, r0)
            if (r0 != r6) goto L_0x0026
            return r6
        L_0x006f:
            X.7A2 r7 = new X.7A2
            r7.<init>(r8, r9)
            goto L_0x0012
        L_0x0075:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.A00(X.09x):java.lang.Object");
    }

    public RippleAnimation(C133206Xf r5) {
        this.A00 = r5;
        Boolean A0j = C36381kD.A0j();
        C137076fY r2 = C137076fY.A00;
        this.A08 = C93994hT.A00(r2, A0j, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A07 = C93994hT.A00(r2, A0j, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }
}
