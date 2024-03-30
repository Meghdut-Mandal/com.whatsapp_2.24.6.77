package androidx.compose.animation.core;

import X.AnonymousClass001;
import X.C005102h;
import X.C006302t;
import X.C124485yG;
import X.C129076Ev;
import X.C137126fd;
import X.C160687lQ;
import X.C162277oK;
import X.C90474aD;

public abstract class SuspendAnimationKt {
    public static final void A02(C160687lQ r4, C124485yG r5, C137126fd r6, C006302t r7, float f, long j) {
        long j2;
        if (f == 0.0f) {
            j2 = r4.BBH();
        } else {
            j2 = (long) (((float) (j - r5.A03)) / f);
        }
        r5.A01 = j;
        r5.A06.setValue(r4.BIp(j2));
        r5.A02 = r4.BIx(j2);
        if (j2 >= r4.BBH()) {
            r5.A00 = r5.A01;
            C90474aD.A11(r5.A05, false);
        }
        A03(r5, r6);
        r7.invoke(r5);
    }

    public static final float A00(C005102h r1) {
        C162277oK r0 = (C162277oK) r1.get(C162277oK.A00);
        if (r0 == null) {
            return 1.0f;
        }
        float BGy = r0.BGy();
        if (BGy >= 0.0f) {
            return BGy;
        }
        throw AnonymousClass001.A09("negative scale factor");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cc A[Catch:{ CancellationException -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010a A[Catch:{ CancellationException -> 0x010b }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C160687lQ r23, X.C137126fd r24, X.C023509x r25, X.C006302t r26, long r27) {
        /*
            r4 = r25
            r9 = r24
            r8 = r23
            r12 = r26
            boolean r0 = r4 instanceof X.C151607Af
            if (r0 == 0) goto L_0x012d
            r0 = r4
            X.7Af r0 = (X.C151607Af) r0
            int r3 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x012d
            int r3 = r3 - r2
            r0.label = r3
        L_0x001a:
            java.lang.Object r2 = r0.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r0.label
            r4 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 == r3) goto L_0x002d
            if (r1 == r4) goto L_0x002d
            java.lang.IllegalStateException r7 = X.AnonymousClass000.A0e()
        L_0x002c:
            throw r7
        L_0x002d:
            java.lang.Object r13 = r0.L$3
            X.0fG r13 = (X.C10810fG) r13
            java.lang.Object r12 = r0.L$2
            X.02t r12 = (X.C006302t) r12
            java.lang.Object r8 = r0.L$1
            X.7lQ r8 = (X.C160687lQ) r8
            java.lang.Object r9 = r0.L$0
            X.6fd r9 = (X.C137126fd) r9
            X.AnonymousClass0AN.A00(r2)     // Catch:{ CancellationException -> 0x010b }
            goto L_0x00bd
        L_0x0041:
            X.AnonymousClass0AN.A00(r2)
            r1 = 0
            java.lang.Object r11 = r8.BIp(r1)
            X.6Ev r10 = r8.BIx(r1)
            X.0fG r13 = new X.0fG
            r13.<init>()
            r6 = -9223372036854775808
            r20 = r27
            int r1 = (r27 > r6 ? 1 : (r27 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0091
            X.02h r1 = r0.getContext()     // Catch:{ CancellationException -> 0x010b }
            float r14 = A00(r1)     // Catch:{ CancellationException -> 0x010b }
            X.7Va r7 = new X.7Va     // Catch:{ CancellationException -> 0x010b }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ CancellationException -> 0x010b }
            r0.L$0 = r9     // Catch:{ CancellationException -> 0x010b }
            r0.L$1 = r8     // Catch:{ CancellationException -> 0x010b }
            r0.L$2 = r12     // Catch:{ CancellationException -> 0x010b }
            r0.L$3 = r13     // Catch:{ CancellationException -> 0x010b }
            r0.label = r3     // Catch:{ CancellationException -> 0x010b }
            boolean r1 = r8.BM1()     // Catch:{ CancellationException -> 0x010b }
            if (r1 == 0) goto L_0x0087
            X.02h r2 = r0.getContext()     // Catch:{ CancellationException -> 0x010b }
            X.77j r1 = X.C162257oI.A00     // Catch:{ CancellationException -> 0x010b }
            r2.get(r1)     // Catch:{ CancellationException -> 0x010b }
            java.lang.Object r1 = X.AnonymousClass5WC.A00(r0, r7)     // Catch:{ CancellationException -> 0x010b }
            goto L_0x0108
        L_0x0087:
            X.7Qc r1 = new X.7Qc     // Catch:{ CancellationException -> 0x010b }
            r1.<init>(r7)     // Catch:{ CancellationException -> 0x010b }
            java.lang.Object r1 = X.AnonymousClass5WC.A00(r0, r1)     // Catch:{ CancellationException -> 0x010b }
            goto L_0x0108
        L_0x0091:
            X.7b4 r16 = r8.BIe()     // Catch:{ CancellationException -> 0x010b }
            java.lang.Object r18 = r8.BID()     // Catch:{ CancellationException -> 0x010b }
            X.7IY r1 = new X.7IY     // Catch:{ CancellationException -> 0x010b }
            r1.<init>(r9)     // Catch:{ CancellationException -> 0x010b }
            X.5yG r14 = new X.5yG     // Catch:{ CancellationException -> 0x010b }
            r15 = r10
            r17 = r11
            r19 = r1
            r22 = r20
            r14.<init>(r15, r16, r17, r18, r19, r20, r22)     // Catch:{ CancellationException -> 0x010b }
            X.02h r1 = r0.getContext()     // Catch:{ CancellationException -> 0x010b }
            float r26 = A00(r1)     // Catch:{ CancellationException -> 0x010b }
            r22 = r8
            r23 = r14
            r25 = r12
            A02(r22, r23, r24, r25, r26, r27)     // Catch:{ CancellationException -> 0x010b }
            r13.element = r14     // Catch:{ CancellationException -> 0x010b }
        L_0x00bd:
            java.lang.Object r1 = r13.element     // Catch:{ CancellationException -> 0x010b }
            X.AnonymousClass00C.A0B(r1)     // Catch:{ CancellationException -> 0x010b }
            X.5yG r1 = (X.C124485yG) r1     // Catch:{ CancellationException -> 0x010b }
            X.7n5 r1 = r1.A05     // Catch:{ CancellationException -> 0x010b }
            boolean r1 = X.C90474aD.A1U(r1)     // Catch:{ CancellationException -> 0x010b }
            if (r1 == 0) goto L_0x0134
            X.02h r1 = r0.getContext()     // Catch:{ CancellationException -> 0x010b }
            float r19 = A00(r1)     // Catch:{ CancellationException -> 0x010b }
            X.7VM r6 = new X.7VM     // Catch:{ CancellationException -> 0x010b }
            r14 = r6
            r15 = r8
            r16 = r9
            r17 = r12
            r18 = r13
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ CancellationException -> 0x010b }
            r0.L$0 = r9     // Catch:{ CancellationException -> 0x010b }
            r0.L$1 = r8     // Catch:{ CancellationException -> 0x010b }
            r0.L$2 = r12     // Catch:{ CancellationException -> 0x010b }
            r0.L$3 = r13     // Catch:{ CancellationException -> 0x010b }
            r0.label = r4     // Catch:{ CancellationException -> 0x010b }
            boolean r1 = r8.BM1()     // Catch:{ CancellationException -> 0x010b }
            if (r1 == 0) goto L_0x00ff
            X.02h r2 = r0.getContext()     // Catch:{ CancellationException -> 0x010b }
            X.77j r1 = X.C162257oI.A00     // Catch:{ CancellationException -> 0x010b }
            r2.get(r1)     // Catch:{ CancellationException -> 0x010b }
            java.lang.Object r1 = X.AnonymousClass5WC.A00(r0, r6)     // Catch:{ CancellationException -> 0x010b }
            goto L_0x0108
        L_0x00ff:
            X.7Qc r1 = new X.7Qc     // Catch:{ CancellationException -> 0x010b }
            r1.<init>(r6)     // Catch:{ CancellationException -> 0x010b }
            java.lang.Object r1 = X.AnonymousClass5WC.A00(r0, r1)     // Catch:{ CancellationException -> 0x010b }
        L_0x0108:
            if (r1 != r5) goto L_0x00bd
            return r5
        L_0x010b:
            r7 = move-exception
            java.lang.Object r0 = r13.element
            X.5yG r0 = (X.C124485yG) r0
            r6 = 0
            if (r0 == 0) goto L_0x0118
            X.7n5 r0 = r0.A05
            X.C90474aD.A11(r0, r6)
        L_0x0118:
            java.lang.Object r0 = r13.element
            X.5yG r0 = (X.C124485yG) r0
            if (r0 == 0) goto L_0x012b
            long r4 = r0.A01
            long r1 = r9.A01
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x012b
        L_0x0126:
            if (r3 == 0) goto L_0x002c
            r9.A03 = r6
            throw r7
        L_0x012b:
            r3 = 0
            goto L_0x0126
        L_0x012d:
            X.7Af r0 = new X.7Af
            r0.<init>(r4)
            goto L_0x001a
        L_0x0134:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.A01(X.7lQ, X.6fd, X.09x, X.02t, long):java.lang.Object");
    }

    public static final void A03(C124485yG r5, C137126fd r6) {
        r6.A05.setValue(r5.A06.getValue());
        C129076Ev r4 = r6.A02;
        C129076Ev r3 = r5.A02;
        int A02 = r4.A02();
        for (int i = 0; i < A02; i++) {
            r4.A05(i, r3.A01(i));
        }
        r6.A00 = r5.A00;
        r6.A01 = r5.A01;
        r6.A03 = C90474aD.A1U(r5.A05);
    }
}
