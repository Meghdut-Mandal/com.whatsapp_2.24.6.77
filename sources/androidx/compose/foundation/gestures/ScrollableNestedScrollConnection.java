package androidx.compose.foundation.gestures;

import X.AnonymousClass5RU;
import X.C023509x;
import X.C133156Wz;
import X.C133206Xf;
import X.C160277kk;
import X.C160557lC;
import X.C90474aD;

public final class ScrollableNestedScrollConnection implements C160277kk {
    public boolean A00;
    public final ScrollingLogic A01;

    public long BdF(long j, int i) {
        if (i == 2) {
            C90474aD.A11(this.A01.A06, true);
        }
        return C133206Xf.A03;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object Bd2(X.C023509x r7, long r8, long r10) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.AnonymousClass7AU
            if (r0 == 0) goto L_0x0057
            r5 = r7
            X.7AU r5 = (X.AnonymousClass7AU) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0057
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r1) goto L_0x005d
            long r10 = r5.J$0
            java.lang.Object r2 = r5.L$0
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection r2 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection) r2
            X.AnonymousClass0AN.A00(r4)
        L_0x0026:
            X.6Wz r4 = (X.C133156Wz) r4
            long r0 = r4.A00
            long r0 = X.C133156Wz.A00(r10, r0)
        L_0x002e:
            X.6Wz r3 = new X.6Wz
            r3.<init>(r0)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r2.A01
            r1 = 0
            X.7n5 r0 = r0.A06
            X.C90474aD.A11(r0, r1)
        L_0x003b:
            return r3
        L_0x003c:
            X.AnonymousClass0AN.A00(r4)
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0053
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r6.A01
            r5.L$0 = r6
            r5.J$0 = r10
            r5.label = r1
            java.lang.Object r4 = r0.A02(r5, r10)
            if (r4 == r3) goto L_0x003b
            r2 = r6
            goto L_0x0026
        L_0x0053:
            long r0 = X.C133156Wz.A01
            r2 = r6
            goto L_0x002e
        L_0x0057:
            X.7AU r5 = new X.7AU
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x005d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.Bd2(X.09x, long, long):java.lang.Object");
    }

    public long Bd5(int i, long j, long j2) {
        float A012;
        if (this.A00) {
            ScrollingLogic scrollingLogic = this.A01;
            if (!scrollingLogic.A03.BN7()) {
                C160557lC r2 = scrollingLogic.A03;
                if (scrollingLogic.A02 == AnonymousClass5RU.Horizontal) {
                    A012 = C133206Xf.A00(j2);
                } else {
                    A012 = C133206Xf.A01(j2);
                }
                if (scrollingLogic.A05) {
                    A012 *= (float) -1;
                }
                float B5g = r2.B5g(A012);
                if (scrollingLogic.A05) {
                    B5g *= (float) -1;
                }
                return scrollingLogic.A00(B5g);
            }
        }
        return C133206Xf.A03;
    }

    public /* synthetic */ Object BdC(C023509x r4, long j) {
        return new C133156Wz(C133156Wz.A01);
    }

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z) {
        this.A01 = scrollingLogic;
        this.A00 = z;
    }
}
