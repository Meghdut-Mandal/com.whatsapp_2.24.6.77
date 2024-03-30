package X;

/* renamed from: X.8D2  reason: invalid class name */
public class AnonymousClass8D2 extends AnonymousClass8D3 {
    public final byte[] zzfp;

    public AnonymousClass8D2(byte[] bArr) {
        this.zzfp = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r7 = (X.AUv) r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r1 = 1
            if (r9 == r8) goto L_0x00b0
            boolean r0 = r9 instanceof X.AUv
            r5 = 0
            if (r0 == 0) goto L_0x0025
            int r3 = r8.A02()
            r7 = r9
            X.AUv r7 = (X.AUv) r7
            int r2 = r7.A02()
            if (r3 != r2) goto L_0x0025
            if (r3 == 0) goto L_0x00b0
            boolean r0 = r9 instanceof X.AnonymousClass8D2
            if (r0 == 0) goto L_0x00ab
            int r1 = r8.zzfk
            int r0 = r7.zzfk
            if (r1 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0026
            if (r1 == r0) goto L_0x0026
        L_0x0025:
            return r5
        L_0x0026:
            if (r3 > r2) goto L_0x0098
            if (r3 > r2) goto L_0x0083
            boolean r0 = r7 instanceof X.AnonymousClass8D2
            X.8D2 r7 = (X.AnonymousClass8D2) r7
            if (r0 == 0) goto L_0x004e
            byte[] r6 = r8.zzfp
            byte[] r5 = r7.zzfp
            int r4 = r8.A04()
            int r3 = r3 + r4
            int r2 = r7.A04()
        L_0x003d:
            if (r4 >= r3) goto L_0x004c
            byte r1 = r6[r4]
            byte r0 = r5[r2]
            if (r1 == r0) goto L_0x0047
            r0 = 0
            return r0
        L_0x0047:
            int r4 = r4 + 1
            int r2 = r2 + 1
            goto L_0x003d
        L_0x004c:
            r0 = 1
            return r0
        L_0x004e:
            int r0 = r7.A02()
            int r2 = X.AUv.A00(r5, r3, r0)
            if (r2 != 0) goto L_0x0077
            X.AUv r4 = X.AUv.A00
        L_0x005a:
            int r0 = r8.A02()
            int r3 = X.AUv.A00(r5, r3, r0)
            if (r3 != 0) goto L_0x006b
            X.AUv r2 = X.AUv.A00
        L_0x0066:
            boolean r0 = r4.equals(r2)
            return r0
        L_0x006b:
            byte[] r1 = r8.zzfp
            int r0 = r8.A04()
            X.8D1 r2 = new X.8D1
            r2.<init>(r1, r0, r3)
            goto L_0x0066
        L_0x0077:
            byte[] r1 = r7.zzfp
            int r0 = r7.A04()
            X.8D1 r4 = new X.8D1
            r4.<init>(r1, r0, r2)
            goto L_0x005a
        L_0x0083:
            r0 = 59
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            java.lang.String r0 = "Ran off end of other: 0, "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r0
        L_0x0098:
            r0 = 40
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            java.lang.String r0 = "Length too large: "
            r1.append(r0)
            r1.append(r3)
            java.lang.IllegalArgumentException r0 = X.C165567td.A0O(r1, r3)
            throw r0
        L_0x00ab:
            boolean r0 = r9.equals(r8)
            return r0
        L_0x00b0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8D2.equals(java.lang.Object):boolean");
    }

    public int A04() {
        if (this instanceof AnonymousClass8D1) {
            return ((AnonymousClass8D1) this).zzfm;
        }
        return 0;
    }
}
