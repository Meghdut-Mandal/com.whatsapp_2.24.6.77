package X;

/* renamed from: X.9Zg  reason: invalid class name and case insensitive filesystem */
public final class C196349Zg {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r1 == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        if (r1 != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ef, code lost:
        if (r1 == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0112, code lost:
        if (r1 != false) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x006e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00f7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C193259Kq A00(X.C197849cT r8, X.AnonymousClass9OY r9, X.C196349Zg r10, X.C87374On r11) {
        /*
            r3 = 0
            X.8z7 r7 = r8.A00
            X.8z7 r0 = X.C188148z7.UNKNOWN
            if (r7 == r0) goto L_0x016f
            java.util.ArrayList r2 = r8.A02
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0017
            java.util.ArrayList r0 = r8.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x016f
        L_0x0017:
            java.util.Iterator r6 = r2.iterator()
        L_0x001b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r5 = r6.next()
            X.9Kn r5 = (X.C193229Kn) r5
            r0 = 2
            X.AnonymousClass00C.A0D(r5, r0)
            X.9Kp r4 = r9.A03
            X.9Fq r0 = r5.A00
            java.lang.String r1 = r0.A00
            java.util.Map r0 = r4.A02
            java.lang.Object r0 = r0.get(r1)
            X.004 r0 = (X.AnonymousClass004) r0
            if (r0 == 0) goto L_0x0091
            java.lang.Object r1 = r0.get()
            X.AnonymousClass00C.A08(r1)
            X.B0B r1 = (X.B0B) r1
            X.9Fs r0 = new X.9Fs
            r0.<init>(r1)
        L_0x0049:
            X.0pP r1 = r9.A09
            X.AnonymousClass00C.A0D(r11, r3)
            X.B0B r0 = r0.A00
            boolean r0 = r0.B1C(r5, r1, r11)
            if (r0 != 0) goto L_0x00bc
            X.1Ak r1 = X.C23931Ak.of(r5)
            r0 = 0
            X.9Kq r4 = new X.9Kq
            r4.<init>(r1, r0, r3)
        L_0x0060:
            boolean r1 = r4.A02
            X.8z7 r0 = X.C188148z7.AND
            if (r7 != r0) goto L_0x007e
            if (r1 != 0) goto L_0x008e
        L_0x0068:
            X.8zp r1 = X.C188588zp.NO
        L_0x006a:
            X.8zp r0 = X.C188588zp.UNSET
            if (r1 == r0) goto L_0x001b
            int r1 = r1.ordinal()
            r0 = 1
            if (r1 == r3) goto L_0x012d
            if (r1 == r0) goto L_0x0164
            java.lang.String r0 = "No boolean equivalent for UNSET"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x007e:
            X.8z7 r0 = X.C188148z7.OR
            if (r7 != r0) goto L_0x0087
            if (r1 == 0) goto L_0x008e
            X.8zp r1 = X.C188588zp.YES
            goto L_0x006a
        L_0x0087:
            X.8z7 r0 = X.C188148z7.NOR
            if (r7 != r0) goto L_0x008e
            if (r1 == 0) goto L_0x008e
            goto L_0x0068
        L_0x008e:
            X.8zp r1 = X.C188588zp.UNSET
            goto L_0x006a
        L_0x0091:
            java.lang.String r0 = "seconds_since_last_impression"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x00aa
            X.9l3 r1 = r4.A01
            X.0wo r0 = r4.A00
            X.ATg r4 = new X.ATg
            r4.<init>(r0, r1)
        L_0x00a2:
            X.B0B r4 = (X.B0B) r4
            X.9Fs r0 = new X.9Fs
            r0.<init>(r4)
            goto L_0x0049
        L_0x00aa:
            java.lang.String r0 = "other_promotion_event"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x00bc
            X.9l3 r1 = r4.A01
            X.0wo r0 = r4.A00
            X.ATf r4 = new X.ATf
            r4.<init>(r0, r1)
            goto L_0x00a2
        L_0x00bc:
            r1 = 0
            r0 = 1
            X.9Kq r4 = new X.9Kq
            r4.<init>(r1, r1, r0)
            goto L_0x0060
        L_0x00c4:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.ArrayList r0 = r8.A01
            java.util.Iterator r8 = r0.iterator()
        L_0x00ce:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x011b
            java.lang.Object r0 = r8.next()
            X.9cT r0 = (X.C197849cT) r0
            X.9Kq r6 = A00(r0, r9, r10, r11)
            X.8z7 r5 = X.C188148z7.OR
            if (r7 != r5) goto L_0x00e9
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x00e9
            r4.add(r6)
        L_0x00e9:
            boolean r1 = r6.A02
            X.8z7 r0 = X.C188148z7.AND
            if (r7 != r0) goto L_0x0107
            if (r1 != 0) goto L_0x0115
        L_0x00f1:
            X.8zp r1 = X.C188588zp.NO
        L_0x00f3:
            X.8zp r0 = X.C188588zp.UNSET
            if (r1 == r0) goto L_0x00ce
            int r1 = r1.ordinal()
            r0 = 1
            if (r1 == r3) goto L_0x012d
            if (r1 == r0) goto L_0x0118
            java.lang.String r0 = "No boolean equivalent for UNSET"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0107:
            if (r7 != r5) goto L_0x010e
            if (r1 == 0) goto L_0x0115
            X.8zp r1 = X.C188588zp.YES
            goto L_0x00f3
        L_0x010e:
            X.8z7 r0 = X.C188148z7.NOR
            if (r7 != r0) goto L_0x0115
            if (r1 == 0) goto L_0x0115
            goto L_0x00f1
        L_0x0115:
            X.8zp r1 = X.C188588zp.UNSET
            goto L_0x00f3
        L_0x0118:
            X.1Ak r2 = r6.A00
            goto L_0x0168
        L_0x011b:
            int r1 = r7.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0135
            r0 = 2
            if (r1 == r0) goto L_0x012d
            if (r1 == r3) goto L_0x012d
            X.91c r0 = new X.91c
            r0.<init>()
            throw r0
        L_0x012d:
            r2 = 0
            r0 = 1
            X.9Kq r1 = new X.9Kq
            r1.<init>(r2, r2, r0)
            return r1
        L_0x0135:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x015f
            X.8Hc r2 = X.C23931Ak.builder()
            java.util.Iterator r1 = r4.iterator()
        L_0x0143:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0157
            java.lang.Object r0 = r1.next()
            X.9Kq r0 = (X.C193259Kq) r0
            X.1Ak r0 = r0.A00
            if (r0 == 0) goto L_0x0143
            r2.addAll(r0)
            goto L_0x0143
        L_0x0157:
            X.1Ak r2 = r2.build()
            X.AnonymousClass00C.A08(r2)
            goto L_0x0168
        L_0x015f:
            X.1Ak r2 = X.C23931Ak.copyOf((java.util.Collection) r2)
            goto L_0x0168
        L_0x0164:
            X.1Ak r2 = X.C23931Ak.of(r5)
        L_0x0168:
            r0 = 0
            X.9Kq r1 = new X.9Kq
            r1.<init>(r2, r0, r3)
            return r1
        L_0x016f:
            X.91c r0 = new X.91c
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196349Zg.A00(X.9cT, X.9OY, X.9Zg, X.4On):X.9Kq");
    }
}
