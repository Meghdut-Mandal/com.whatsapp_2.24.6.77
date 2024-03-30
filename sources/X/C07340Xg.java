package X;

/* renamed from: X.0Xg  reason: invalid class name and case insensitive filesystem */
public abstract class C07340Xg {
    public static final Object A00(C023509x r3, C009003v r4, long j) {
        if (j > 0) {
            return A02(r4, new C15530nU(r3, j));
        }
        throw new C13390jn("Timed out immediately", (C007403e) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C023509x r8, X.C009003v r9, long r10) {
        /*
            boolean r0 = r8 instanceof X.C13910ke
            if (r0 == 0) goto L_0x0023
            r7 = r8
            X.0ke r7 = (X.C13910ke) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0023
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r1 = r7.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r4) goto L_0x002d
            java.lang.Object r3 = r7.L$1
            X.0fG r3 = (X.C10810fG) r3
            goto L_0x0029
        L_0x0023:
            X.0ke r7 = new X.0ke
            r7.<init>(r8)
            goto L_0x0012
        L_0x0029:
            X.AnonymousClass0AN.A00(r1)     // Catch:{ 0jn -> 0x0057 }
            return r1
        L_0x002d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0032:
            X.AnonymousClass0AN.A00(r1)
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005f
            X.0fG r3 = new X.0fG
            r3.<init>()
            r7.L$0 = r9     // Catch:{ 0jn -> 0x0057 }
            r7.L$1 = r3     // Catch:{ 0jn -> 0x0057 }
            r7.J$0 = r10     // Catch:{ 0jn -> 0x0057 }
            r7.label = r4     // Catch:{ 0jn -> 0x0057 }
            X.0nU r0 = new X.0nU     // Catch:{ 0jn -> 0x0057 }
            r0.<init>(r7, r10)     // Catch:{ 0jn -> 0x0057 }
            r3.element = r0     // Catch:{ 0jn -> 0x0057 }
            java.lang.Object r1 = A02(r9, r0)     // Catch:{ 0jn -> 0x0057 }
            if (r1 != r6) goto L_0x0056
            return r6
        L_0x0056:
            return r1
        L_0x0057:
            r2 = move-exception
            X.03e r1 = r2.A00
            java.lang.Object r0 = r3.element
            if (r1 == r0) goto L_0x005f
            throw r2
        L_0x005f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07340Xg.A01(X.09x, X.03v, long):java.lang.Object");
    }

    public static final Object A02(C009003v r5, C15530nU r6) {
        Object obj;
        Object A0Y;
        r6.BL4(new C15280mz(C07330Xf.A02(r6.A00.getContext()).BL6(r6, r6.getContext(), r6.A00)));
        boolean z = false;
        try {
            C07710Yz.A03(r5, 2);
            obj = r5.invoke(r6, r6);
        } catch (Throwable th) {
            obj = new AnonymousClass0AT(th);
        }
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        if (obj == r2 || (A0Y = r6.A0Y(obj)) == C007803i.A00) {
            return r2;
        }
        if (!(A0Y instanceof AnonymousClass0AT)) {
            return C007803i.A01(A0Y);
        }
        Throwable th2 = ((AnonymousClass0AT) A0Y).A00;
        if (!(th2 instanceof C13390jn) || ((C13390jn) th2).A00 != r6) {
            z = true;
        }
        if (z) {
            throw th2;
        } else if (!(obj instanceof AnonymousClass0AT)) {
            return obj;
        } else {
            throw ((AnonymousClass0AT) obj).A00;
        }
    }
}
