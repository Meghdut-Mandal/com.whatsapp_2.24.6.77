package androidx.compose.foundation.gestures;

import X.AnonymousClass5RU;
import X.AnonymousClass7UU;
import X.C133206Xf;
import X.C137076fY;
import X.C157497dd;
import X.C157507de;
import X.C160257ki;
import X.C160557lC;
import X.C161547n5;
import X.C36381kD;
import X.C90464aC;
import X.C93994hT;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;

public final class ScrollingLogic {
    public C160257ki A00;
    public C157497dd A01;
    public AnonymousClass5RU A02;
    public C160557lC A03;
    public NestedScrollDispatcher A04;
    public boolean A05;
    public final C161547n5 A06 = C93994hT.A00(C137076fY.A00, C36381kD.A0j(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");

    public final long A00(float f) {
        long A0B;
        if (f == 0.0f) {
            return C133206Xf.A03;
        }
        if (this.A02 == AnonymousClass5RU.Horizontal) {
            A0B = C90464aC.A0B(f, 0.0f);
        } else {
            A0B = C90464aC.A0B(0.0f, f);
        }
        long j = C133206Xf.A03;
        return A0B;
    }

    public final long A01(C157507de r4, int i, long j) {
        AnonymousClass7UU r2 = new AnonymousClass7UU(r4, this, i);
        C160257ki r1 = this.A00;
        if (i == 4 || (!this.A03.B9O() && !this.A03.B9N())) {
            return ((C133206Xf) r2.invoke(new C133206Xf(j))).A00;
        }
        return r1.B1M(r2, i, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C023509x r12, long r13) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C1515479z
            r6 = r11
            if (r0 == 0) goto L_0x004d
            r4 = r12
            X.79z r4 = (X.C1515479z) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004d
            int r2 = r2 - r1
            r4.label = r2
        L_0x0013:
            java.lang.Object r3 = r4.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 != r0) goto L_0x0053
            java.lang.Object r8 = r4.L$0
            X.0fF r8 = (X.C10800fF) r8
            X.AnonymousClass0AN.A00(r3)
        L_0x0025:
            long r1 = r8.element
            X.6Wz r0 = new X.6Wz
            r0.<init>(r1)
            return r0
        L_0x002d:
            X.AnonymousClass0AN.A00(r3)
            X.0fF r8 = new X.0fF
            r8.<init>()
            r9 = r13
            r8.element = r13
            X.7lC r1 = r11.A03
            r7 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r5 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r5.<init>(r6, r7, r8, r9)
            r4.L$0 = r8
            r4.label = r0
            X.5RT r0 = X.AnonymousClass5RT.Default
            java.lang.Object r0 = r1.BpQ(r0, r4, r5)
            if (r0 != r2) goto L_0x0025
            return r2
        L_0x004d:
            X.79z r4 = new X.79z
            r4.<init>(r11, r12)
            goto L_0x0013
        L_0x0053:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.A02(X.09x, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C023509x r10, long r11) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.AnonymousClass7A0
            if (r0 == 0) goto L_0x0025
            r6 = r10
            X.7A0 r6 = (X.AnonymousClass7A0) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0025
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 == r8) goto L_0x002b
            if (r0 == r7) goto L_0x002b
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0025:
            X.7A0 r6 = new X.7A0
            r6.<init>(r9, r10)
            goto L_0x0012
        L_0x002b:
            java.lang.Object r0 = r6.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = (androidx.compose.foundation.gestures.ScrollingLogic) r0
            X.AnonymousClass0AN.A00(r1)
            goto L_0x0088
        L_0x0033:
            X.AnonymousClass0AN.A00(r1)
            X.7n5 r0 = r9.A06
            X.C90474aD.A11(r0, r8)
            X.5RU r3 = r9.A02
            X.5RU r2 = X.AnonymousClass5RU.Horizontal
            long r0 = X.C133156Wz.A01
            if (r3 != r2) goto L_0x007d
            float r1 = X.C90464aC.A01(r11)
            r0 = 0
            long r1 = X.C90464aC.A0B(r1, r0)
        L_0x004c:
            r0 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1 r4 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1
            r4.<init>(r9, r0)
            X.7ki r3 = r9.A00
            X.7lC r0 = r9.A03
            boolean r0 = r0.B9O()
            if (r0 != 0) goto L_0x0074
            X.7lC r0 = r9.A03
            boolean r0 = r0.B9N()
            if (r0 != 0) goto L_0x0074
            X.6Wz r0 = new X.6Wz
            r0.<init>(r1)
            r6.L$0 = r9
            r6.label = r7
            java.lang.Object r0 = r4.invoke(r0, r6)
        L_0x0071:
            if (r0 != r5) goto L_0x0087
            return r5
        L_0x0074:
            r6.L$0 = r9
            r6.label = r8
            java.lang.Object r0 = r3.B1L(r6, r4, r1)
            goto L_0x0071
        L_0x007d:
            float r1 = X.C90464aC.A00(r11)
            r0 = 0
            long r1 = X.C90464aC.A0B(r0, r1)
            goto L_0x004c
        L_0x0087:
            r0 = r9
        L_0x0088:
            r1 = 0
            X.7n5 r0 = r0.A06
            X.C90474aD.A11(r0, r1)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.A03(X.09x, long):java.lang.Object");
    }

    public ScrollingLogic(C160257ki r4, C157497dd r5, AnonymousClass5RU r6, C160557lC r7, NestedScrollDispatcher nestedScrollDispatcher, boolean z) {
        this.A03 = r7;
        this.A02 = r6;
        this.A00 = r4;
        this.A05 = z;
        this.A01 = r5;
        this.A04 = nestedScrollDispatcher;
    }
}
