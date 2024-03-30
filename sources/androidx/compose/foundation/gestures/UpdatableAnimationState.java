package androidx.compose.foundation.gestures;

import X.AnonymousClass7dW;
import X.C114135gh;
import X.C160547lB;
import X.C93304gL;

public final class UpdatableAnimationState {
    public static final C93304gL A05 = new C93304gL(0.0f);
    public float A00;
    public long A01 = Long.MIN_VALUE;
    public C93304gL A02 = A05;
    public boolean A03;
    public final C160547lB A04;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        if (X.AnonymousClass000.A1Q((r9 > 0.0f ? 1 : (r9 == 0.0f ? 0 : -1))) == false) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b A[SYNTHETIC, Splitter:B:25:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab A[Catch:{ all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae A[Catch:{ all -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C023509x r13, X.AnonymousClass00S r14, X.C006302t r15) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C151757Au
            if (r0 == 0) goto L_0x002e
            r7 = r13
            X.7Au r7 = (X.C151757Au) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002e
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r10 = r7.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r11 = 0
            r2 = -9223372036854775808
            r8 = 2
            r5 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 == r1) goto L_0x0039
            if (r0 != r8) goto L_0x0034
            java.lang.Object r14 = r7.L$1
            X.00S r14 = (X.AnonymousClass00S) r14
            java.lang.Object r4 = r7.L$0
            androidx.compose.foundation.gestures.UpdatableAnimationState r4 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r4
            goto L_0x00c3
        L_0x002e:
            X.7Au r7 = new X.7Au
            r7.<init>(r12, r13)
            goto L_0x0012
        L_0x0034:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0039:
            float r9 = r7.F$0
            java.lang.Object r14 = r7.L$2
            X.00S r14 = (X.AnonymousClass00S) r14
            java.lang.Object r15 = r7.L$1
            X.02t r15 = (X.C006302t) r15
            java.lang.Object r4 = r7.L$0
            androidx.compose.foundation.gestures.UpdatableAnimationState r4 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r4
            goto L_0x0091
        L_0x0048:
            X.AnonymousClass0AN.A00(r10)
            boolean r0 = r12.A03
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00de
            X.02h r4 = r7.getContext()
            X.77i r0 = X.C162277oK.A00
            X.02i r0 = r4.get(r0)
            X.7oK r0 = (X.C162277oK) r0
            if (r0 == 0) goto L_0x0067
            float r9 = r0.BGy()
        L_0x0063:
            r12.A03 = r1
            r4 = r12
            goto L_0x006a
        L_0x0067:
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0063
        L_0x006a:
            float r0 = r4.A00     // Catch:{ all -> 0x00d4 }
            float r10 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x00d4 }
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)
            if (r0 != 0) goto L_0x00a1
            X.7UV r0 = new X.7UV     // Catch:{ all -> 0x00d4 }
            r0.<init>(r4, r15, r9)     // Catch:{ all -> 0x00d4 }
            r7.L$0 = r4     // Catch:{ all -> 0x00d4 }
            r7.L$1 = r15     // Catch:{ all -> 0x00d4 }
            r7.L$2 = r14     // Catch:{ all -> 0x00d4 }
            r7.F$0 = r9     // Catch:{ all -> 0x00d4 }
            r7.label = r1     // Catch:{ all -> 0x00d4 }
            java.lang.Object r0 = X.AnonymousClass5WC.A00(r7, r0)     // Catch:{ all -> 0x00d4 }
            if (r0 != r6) goto L_0x0094
            goto L_0x00a0
        L_0x0091:
            X.AnonymousClass0AN.A00(r10)     // Catch:{ all -> 0x00d4 }
        L_0x0094:
            r14.invoke()     // Catch:{ all -> 0x00d4 }
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r0 == 0) goto L_0x006a
            goto L_0x00a1
        L_0x00a0:
            return r6
        L_0x00a1:
            float r0 = r4.A00     // Catch:{ all -> 0x00d4 }
            float r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x00d4 }
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00ac
            r1 = 0
        L_0x00ac:
            if (r1 != 0) goto L_0x00c9
            X.7Tf r1 = new X.7Tf     // Catch:{ all -> 0x00d4 }
            r1.<init>(r4, r15)     // Catch:{ all -> 0x00d4 }
            r7.L$0 = r4     // Catch:{ all -> 0x00d4 }
            r7.L$1 = r14     // Catch:{ all -> 0x00d4 }
            r0 = 0
            r7.L$2 = r0     // Catch:{ all -> 0x00d4 }
            r7.label = r8     // Catch:{ all -> 0x00d4 }
            java.lang.Object r0 = X.AnonymousClass5WC.A00(r7, r1)     // Catch:{ all -> 0x00d4 }
            if (r0 != r6) goto L_0x00c6
            return r6
        L_0x00c3:
            X.AnonymousClass0AN.A00(r10)     // Catch:{ all -> 0x00d4 }
        L_0x00c6:
            r14.invoke()     // Catch:{ all -> 0x00d4 }
        L_0x00c9:
            r4.A01 = r2
            X.4gL r0 = A05
            r4.A02 = r0
            r4.A03 = r5
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00d4:
            r1 = move-exception
            r4.A01 = r2
            X.4gL r0 = A05
            r4.A02 = r0
            r4.A03 = r5
            throw r1
        L_0x00de:
            java.lang.String r0 = "animateToZero called while previous animation is running"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.A00(X.09x, X.00S, X.02t):java.lang.Object");
    }

    public UpdatableAnimationState(AnonymousClass7dW r3) {
        this.A04 = r3.BxH(C114135gh.A02);
    }
}
