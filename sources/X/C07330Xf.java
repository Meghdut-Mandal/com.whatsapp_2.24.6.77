package X;

/* renamed from: X.0Xf  reason: invalid class name and case insensitive filesystem */
public abstract class C07330Xf {
    public static final Object A00(C023509x r3, long j) {
        if (j > 0) {
            AnonymousClass0AR A02 = AnonymousClass0AA.A02(r3);
            if (j < Long.MAX_VALUE) {
                A02(A02.A01).BpP(A02, j);
            }
            Object A0G = A02.A0G();
            if (A0G == AnonymousClass0AO.COROUTINE_SUSPENDED) {
                return A0G;
            }
        }
        return AnonymousClass0AJ.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r0 != 0) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r3 > 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C023509x r5, long r6) {
        /*
            r1 = 0
            long r3 = r6 ^ r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0030
            int r0 = (int) r3
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0030
            int r0 = (int) r6
            r3 = r0 & 1
            int r0 = (int) r1
            r0 = r0 & 1
            int r3 = r3 - r0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0019
            int r3 = -r3
        L_0x0019:
            if (r3 <= 0) goto L_0x0036
        L_0x001b:
            long r3 = X.C10920fR.A00(r6)
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0027
            r3 = 1
        L_0x0027:
            java.lang.Object r0 = A00(r5, r3)
            java.lang.Object r0 = X.AnonymousClass0AO.A00(r0)
            return r0
        L_0x0030:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0036
            if (r0 != 0) goto L_0x001b
        L_0x0036:
            r3 = 0
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07330Xf.A01(X.09x, long):java.lang.Object");
    }

    public static final C005702n A02(C005102h r1) {
        C005702n r12;
        C005202i r13 = r1.get(C005402k.A00);
        if (!(r13 instanceof C005702n) || (r12 = (C005702n) r13) == null) {
            return AnonymousClass03F.A00;
        }
        return r12;
    }
}
