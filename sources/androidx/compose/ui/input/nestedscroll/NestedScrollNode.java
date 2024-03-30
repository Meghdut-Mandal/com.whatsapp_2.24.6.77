package androidx.compose.ui.input.nestedscroll;

import X.AnonymousClass001;
import X.AnonymousClass040;
import X.AnonymousClass65T;
import X.AnonymousClass7bY;
import X.C109185Wp;
import X.C109195Wq;
import X.C112385do;
import X.C114375h9;
import X.C133206Xf;
import X.C137856gq;
import X.C160277kk;
import X.C161807nV;
import X.C36441kJ;

public final class NestedScrollNode extends C137856gq implements C160277kk, C161807nV, AnonymousClass7bY {
    public NestedScrollDispatcher A00;
    public C160277kk A01;
    public final AnonymousClass65T A02 = C109195Wq.A00(C36441kJ.A19(C112385do.A00, this));

    public /* synthetic */ Object BAY(C114375h9 r2) {
        return C109185Wp.A00(this, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r4 == r3) goto L_0x007c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object Bd2(X.C023509x r12, long r13, long r15) {
        /*
            r11 = this;
            r7 = r13
            r9 = r15
            boolean r0 = r12 instanceof X.C151637Ai
            if (r0 == 0) goto L_0x0080
            r6 = r12
            X.7Ai r6 = (X.C151637Ai) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0080
            int r2 = r2 - r1
            r6.label = r2
        L_0x0014:
            java.lang.Object r4 = r6.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 == r0) goto L_0x0035
            if (r1 != r2) goto L_0x0086
            long r0 = r6.J$0
            X.AnonymousClass0AN.A00(r4)
        L_0x0027:
            X.6Wz r4 = (X.C133156Wz) r4
            long r2 = r4.A00
        L_0x002b:
            long r1 = X.C133156Wz.A01(r0, r2)
            X.6Wz r0 = new X.6Wz
            r0.<init>(r1)
            return r0
        L_0x0035:
            long r9 = r6.J$1
            long r7 = r6.J$0
            java.lang.Object r5 = r6.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r5 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r5
            X.AnonymousClass0AN.A00(r4)
            goto L_0x0055
        L_0x0041:
            X.AnonymousClass0AN.A00(r4)
            X.7kk r5 = r11.A01
            r6.L$0 = r11
            r6.J$0 = r13
            r6.J$1 = r15
            r6.label = r0
            java.lang.Object r4 = r5.Bd2(r6, r7, r9)
            if (r4 == r3) goto L_0x007c
            r5 = r11
        L_0x0055:
            X.6Wz r4 = (X.C133156Wz) r4
            long r0 = r4.A00
            boolean r4 = r5.A08
            if (r4 == 0) goto L_0x007d
            X.5h9 r4 = X.C112385do.A00
            java.lang.Object r5 = X.C109185Wp.A00(r5, r4)
            X.7kk r5 = (X.C160277kk) r5
            if (r5 == 0) goto L_0x007d
            long r7 = X.C133156Wz.A01(r7, r0)
            long r9 = X.C133156Wz.A00(r9, r0)
            r4 = 0
            r6.L$0 = r4
            r6.J$0 = r0
            r6.label = r2
            java.lang.Object r4 = r5.Bd2(r6, r7, r9)
            if (r4 != r3) goto L_0x0027
        L_0x007c:
            return r3
        L_0x007d:
            long r2 = X.C133156Wz.A01
            goto L_0x002b
        L_0x0080:
            X.7Ai r6 = new X.7Ai
            r6.<init>(r11, r12)
            goto L_0x0014
        L_0x0086:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.Bd2(X.09x, long, long):java.lang.Object");
    }

    public static final AnonymousClass040 A00(NestedScrollNode nestedScrollNode) {
        NestedScrollNode nestedScrollNode2;
        if (nestedScrollNode.A08 && (nestedScrollNode2 = (NestedScrollNode) C109185Wp.A00(nestedScrollNode, C112385do.A00)) != null) {
            return A00(nestedScrollNode2);
        }
        AnonymousClass040 r0 = nestedScrollNode.A00.A02;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A09("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public long Bd5(int i, long j, long j2) {
        long j3;
        C160277kk r2;
        int i2 = i;
        long Bd5 = this.A01.Bd5(i2, j, j2);
        if (!this.A08 || (r2 = (C160277kk) C109185Wp.A00(this, C112385do.A00)) == null) {
            j3 = C133206Xf.A03;
        } else {
            j3 = r2.Bd5(i2, C133206Xf.A03(j, Bd5), C133206Xf.A02(j2, Bd5));
        }
        return C133206Xf.A03(Bd5, j3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (r2 == r8) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BdC(X.C023509x r10, long r11) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.AnonymousClass7AY
            if (r0 == 0) goto L_0x0077
            r7 = r10
            X.7AY r7 = (X.AnonymousClass7AY) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0077
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r2 = r7.result
            X.0AO r8 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L_0x003d
            if (r0 == r1) goto L_0x0033
            if (r0 != r6) goto L_0x007d
            long r3 = r7.J$0
            X.AnonymousClass0AN.A00(r2)
        L_0x0025:
            X.6Wz r2 = (X.C133156Wz) r2
            long r0 = r2.A00
            long r1 = X.C133156Wz.A01(r3, r0)
            X.6Wz r0 = new X.6Wz
            r0.<init>(r1)
            return r0
        L_0x0033:
            long r11 = r7.J$0
            java.lang.Object r0 = r7.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r0
            X.AnonymousClass0AN.A00(r2)
            goto L_0x005b
        L_0x003d:
            X.AnonymousClass0AN.A00(r2)
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x0073
            X.5h9 r0 = X.C112385do.A00
            java.lang.Object r0 = X.C109185Wp.A00(r9, r0)
            X.7kk r0 = (X.C160277kk) r0
            if (r0 == 0) goto L_0x0073
            r7.L$0 = r9
            r7.J$0 = r11
            r7.label = r1
            java.lang.Object r2 = r0.BdC(r7, r11)
            if (r2 == r8) goto L_0x0072
            r0 = r9
        L_0x005b:
            X.6Wz r2 = (X.C133156Wz) r2
            long r3 = r2.A00
        L_0x005f:
            X.7kk r5 = r0.A01
            long r1 = X.C133156Wz.A00(r11, r3)
            r0 = 0
            r7.L$0 = r0
            r7.J$0 = r3
            r7.label = r6
            java.lang.Object r2 = r5.BdC(r7, r1)
            if (r2 != r8) goto L_0x0025
        L_0x0072:
            return r8
        L_0x0073:
            long r3 = X.C133156Wz.A01
            r0 = r9
            goto L_0x005f
        L_0x0077:
            X.7AY r7 = new X.7AY
            r7.<init>(r9, r10)
            goto L_0x0012
        L_0x007d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.BdC(X.09x, long):java.lang.Object");
    }

    public long BdF(long j, int i) {
        long j2;
        C160277kk r0;
        if (!this.A08 || (r0 = (C160277kk) C109185Wp.A00(this, C112385do.A00)) == null) {
            j2 = C133206Xf.A03;
        } else {
            j2 = r0.BdF(j, i);
        }
        return C133206Xf.A03(j2, this.A01.BdF(C133206Xf.A02(j, j2), i));
    }

    public NestedScrollNode(C160277kk r2, NestedScrollDispatcher nestedScrollDispatcher) {
        this.A01 = r2;
        this.A00 = nestedScrollDispatcher;
    }

    public AnonymousClass65T BGK() {
        return this.A02;
    }
}
