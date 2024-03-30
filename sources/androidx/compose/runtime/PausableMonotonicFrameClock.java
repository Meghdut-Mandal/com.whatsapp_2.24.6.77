package androidx.compose.runtime;

import X.C005102h;
import X.C005202i;
import X.C005902p;
import X.C008803t;
import X.C009003v;
import X.C122035uC;
import X.C162267oJ;
import X.C90504aG;

public final class PausableMonotonicFrameClock implements C162267oJ {
    public final C122035uC A00 = new C122035uC();
    public final C162267oJ A01;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (r0 == r6) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BxV(X.C023509x r8, X.C006302t r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.AnonymousClass7AX
            if (r0 == 0) goto L_0x0073
            r5 = r8
            X.7AX r5 = (X.AnonymousClass7AX) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0073
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r5.label
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r0) goto L_0x0024
            if (r1 != r4) goto L_0x0079
            X.AnonymousClass0AN.A00(r2)
        L_0x0023:
            return r2
        L_0x0024:
            java.lang.Object r9 = r5.L$1
            X.02t r9 = (X.C006302t) r9
            java.lang.Object r0 = r5.L$0
            androidx.compose.runtime.PausableMonotonicFrameClock r0 = (androidx.compose.runtime.PausableMonotonicFrameClock) r0
            X.AnonymousClass0AN.A00(r2)
            goto L_0x0063
        L_0x0030:
            X.AnonymousClass0AN.A00(r2)
            X.5uC r3 = r7.A00
            r5.L$0 = r7
            r5.L$1 = r9
            r5.label = r0
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            boolean r0 = r3.A02     // Catch:{ all -> 0x007e }
            monitor-exit(r2)
            if (r0 != 0) goto L_0x004e
            X.0AR r1 = X.C36371kC.A12(r5)
            monitor-enter(r2)
            java.util.List r0 = r3.A00     // Catch:{ all -> 0x007e }
            r0.add(r1)     // Catch:{ all -> 0x007e }
            goto L_0x0051
        L_0x004e:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            goto L_0x0060
        L_0x0051:
            monitor-exit(r2)
            X.7Tj r0 = new X.7Tj
            r0.<init>(r3, r1)
            r1.BL1(r0)
            java.lang.Object r0 = r1.A0G()
            if (r0 != r6) goto L_0x004e
        L_0x0060:
            if (r0 == r6) goto L_0x0072
            r0 = r7
        L_0x0063:
            X.7oJ r1 = r0.A01
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r4
            java.lang.Object r2 = r1.BxV(r5, r9)
            if (r2 != r6) goto L_0x0023
        L_0x0072:
            return r6
        L_0x0073:
            X.7AX r5 = new X.7AX
            r5.<init>(r7, r8)
            goto L_0x0012
        L_0x0079:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x007e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.BxV(X.09x, X.02t):java.lang.Object");
    }

    public PausableMonotonicFrameClock(C162267oJ r2) {
        this.A01 = r2;
    }

    public Object fold(Object obj, C009003v r3) {
        return C90504aG.A0j(obj, this, r3);
    }

    public C005202i get(C005902p r2) {
        return C008803t.A00(this, r2);
    }

    public /* synthetic */ C005902p getKey() {
        return C162267oJ.A00;
    }

    public C005102h minusKey(C005902p r2) {
        return C008803t.A01(this, r2);
    }

    public C005102h plus(C005102h r2) {
        return C008803t.A02(this, r2);
    }
}
