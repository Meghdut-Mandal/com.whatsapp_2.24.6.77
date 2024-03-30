package X;

public class AF3 implements C22969AzL {
    public final C22969AzL A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final byte[] A06;

    public static byte[] A00(AF3 af3, byte[] bArr) {
        return af3.A00.B6U(bArr, C18750th.A0H(16));
    }

    public byte[] B6U(byte[] bArr, byte[] bArr2) {
        return this.A00.B6U(bArr, bArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        r2.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        throw X.C90524aI.A0Y(X.C24611Dc.A01("PaymentProviderKey", X.AnonymousClass000.A0p("PaymentProviderKey invalid key type: ", r6, X.AnonymousClass000.A0u())));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AF3(java.lang.Long r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, byte[] r8) {
        /*
            r2 = this;
            r2.<init>()
            r2.A05 = r4
            r2.A02 = r5
            r2.A03 = r6
            r2.A04 = r7
            r2.A06 = r8
            r2.A01 = r3
            int r0 = r6.hashCode()
            switch(r0) {
                case 100229: goto L_0x002b;
                case 113216: goto L_0x0039;
                case 3387192: goto L_0x0047;
                case 110541305: goto L_0x0055;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PaymentProviderKey invalid key type: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r6, r1)
            java.lang.String r0 = "PaymentProviderKey"
            java.lang.String r0 = X.C24611Dc.A01(r0, r1)
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        L_0x002b:
            java.lang.String r0 = "ecc"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.AF2 r0 = new X.AF2
            r0.<init>(r8)
            goto L_0x0062
        L_0x0039:
            java.lang.String r0 = "rsa"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.6wy r0 = new X.6wy
            r0.<init>(r8)
            goto L_0x0062
        L_0x0047:
            java.lang.String r0 = "none"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.AF0 r0 = new X.AF0
            r0.<init>()
            goto L_0x0062
        L_0x0055:
            java.lang.String r0 = "token"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.AF1 r0 = new X.AF1
            r0.<init>()
        L_0x0062:
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AF3.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }
}
