package X;

/* renamed from: X.6G0  reason: invalid class name */
public abstract class AnonymousClass6G0 {
    /* JADX WARNING: type inference failed for: r7v0, types: [X.7n6, java.util.Map] */
    /* JADX WARNING: type inference failed for: r8v0, types: [X.7n6, java.util.Map] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C93824hC A00(X.C161557n6 r7, X.C161557n6 r8, X.C120655rr[] r9) {
        /*
            X.4hC r0 = X.C93824hC.A00
            X.4hD r6 = new X.4hD
            r6.<init>(r0)
            int r5 = r9.length
            r4 = 0
        L_0x0009:
            if (r4 >= r5) goto L_0x0035
            r3 = r9[r4]
            X.607 r2 = r3.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>"
            X.AnonymousClass00C.A0E(r2, r0)
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"
            X.AnonymousClass00C.A0E(r2, r0)
            boolean r0 = r7.containsKey(r2)
            if (r0 != 0) goto L_0x0032
        L_0x0023:
            java.lang.Object r1 = r8.get(r2)
            X.7dn r1 = (X.C157597dn) r1
            java.lang.Object r0 = r3.A01
            X.7dn r0 = r2.A01(r1, r0)
            r6.put(r2, r0)
        L_0x0032:
            int r4 = r4 + 1
            goto L_0x0009
        L_0x0035:
            X.4hC r0 = r6.A06()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6G0.A00(X.7n6, X.7n6, X.5rr[]):X.4hC");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.7n6, java.util.Map] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.AnonymousClass607 r2, X.C161557n6 r3) {
        /*
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"
            X.AnonymousClass00C.A0E(r2, r1)
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L_0x001d
            X.AnonymousClass00C.A0E(r2, r1)
            java.lang.Object r0 = r3.get(r2)
            X.7dn r0 = (X.C157597dn) r0
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r0.getValue()
            return r0
        L_0x001b:
            r0 = 0
            return r0
        L_0x001d:
            X.6fa r0 = r2.A00
            X.00T r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6G0.A02(X.607, X.7n6):java.lang.Object");
    }

    public static Object A01(C136916fF r0, AnonymousClass607 r1) {
        return A02(r1, C136916fF.A04(r0));
    }
}
