package X;

/* renamed from: X.3Kz  reason: invalid class name and case insensitive filesystem */
public class C63683Kz {
    public Float A00;
    public boolean A01;
    public boolean A02;
    public byte[] A03;

    public synchronized void A00(byte[] bArr) {
        if (!this.A01) {
            this.A03 = bArr;
            this.A01 = true;
        }
    }

    public synchronized boolean A01() {
        return this.A01;
    }

    public synchronized byte[] A02() {
        if (this.A01) {
        } else {
            throw AnonymousClass001.A09("thumbnail not loaded");
        }
        return this.A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r0 != null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L_0x0004
            r0 = 1
            return r0
        L_0x0004:
            r2 = 0
            if (r4 == 0) goto L_0x001b
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r0 = r4.getClass()
            if (r1 != r0) goto L_0x001b
            X.3Kz r4 = (X.C63683Kz) r4
            byte[] r1 = r3.A03
            byte[] r0 = r4.A03
            if (r1 != 0) goto L_0x001c
            if (r0 == 0) goto L_0x0023
        L_0x001b:
            return r2
        L_0x001c:
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0023
            return r2
        L_0x0023:
            java.lang.Float r1 = r3.A00
            java.lang.Float r0 = r4.A00
            boolean r0 = X.C1901797e.A00(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63683Kz.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A03;
        return AnonymousClass000.A0L(this.A00, A0M);
    }
}
