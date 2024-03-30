package X;

import java.math.BigInteger;
import java.security.cert.CRLSelector;

/* renamed from: X.AaR  reason: case insensitive filesystem */
public class C21794AaR implements B6O {
    public final CRLSelector A00;
    public final boolean A01;
    public final BigInteger A02;
    public final boolean A03;
    public final byte[] A04;

    public Object clone() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (java.util.Arrays.equals(r1, r0) == false) goto L_0x0050;
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BPQ(java.security.cert.CRL r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.security.cert.X509CRL
            if (r0 == 0) goto L_0x0051
            r4 = r7
            java.security.cert.X509CRL r4 = (java.security.cert.X509CRL) r4
            r1 = 0
            r5 = 0
            X.122 r0 = X.C22634As0.A0C     // Catch:{ Exception -> 0x0050 }
            java.lang.String r0 = r0.A01     // Catch:{ Exception -> 0x0050 }
            byte[] r0 = r4.getExtensionValue(r0)     // Catch:{ Exception -> 0x0050 }
            if (r0 == 0) goto L_0x001b
            byte[] r0 = X.C22659AsP.A03(r0)     // Catch:{ Exception -> 0x0050 }
            X.AsK r1 = X.C22654AsK.A01(r0)     // Catch:{ Exception -> 0x0050 }
        L_0x001b:
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0022
            if (r1 == 0) goto L_0x0037
            return r5
        L_0x0022:
            if (r1 == 0) goto L_0x0037
            java.math.BigInteger r3 = r6.A02
            if (r3 == 0) goto L_0x0037
            byte[] r2 = r1.A00
            r1 = 1
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1, r2)
            int r0 = r0.compareTo(r3)
            if (r0 != r1) goto L_0x0037
            return r5
        L_0x0037:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0051
            X.122 r0 = X.C22634As0.A0K
            java.lang.String r0 = r0.A01
            byte[] r1 = r4.getExtensionValue(r0)
            byte[] r0 = r6.A04
            if (r0 != 0) goto L_0x004a
            if (r1 == 0) goto L_0x0051
            return r5
        L_0x004a:
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0051
        L_0x0050:
            return r5
        L_0x0051:
            java.security.cert.CRLSelector r0 = r6.A00
            boolean r0 = r0.match(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21794AaR.BPQ(java.security.cert.CRL):boolean");
    }

    public C21794AaR(C193739Mr r2) {
        this.A00 = r2.A04;
        this.A01 = r2.A01;
        this.A02 = r2.A00;
        this.A04 = r2.A03;
        this.A03 = r2.A02;
    }
}
