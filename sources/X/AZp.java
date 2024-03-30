package X;

import java.math.BigInteger;

public class AZp implements C16590pl {
    public BigInteger A00;
    public BigInteger A01;
    public BigInteger A02;
    public C195359Ty A03;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r1.equals(r0) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.AZp
            r2 = 0
            if (r0 == 0) goto L_0x0013
            X.AZp r4 = (X.AZp) r4
            java.math.BigInteger r1 = r3.A02
            java.math.BigInteger r0 = r4.A02
            if (r1 == 0) goto L_0x0014
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0017
        L_0x0013:
            return r2
        L_0x0014:
            if (r0 == 0) goto L_0x0017
            return r2
        L_0x0017:
            java.math.BigInteger r1 = r4.A01
            java.math.BigInteger r0 = r3.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            java.math.BigInteger r1 = r4.A00
            java.math.BigInteger r0 = r3.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZp.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (this.A01.hashCode() ^ this.A00.hashCode()) ^ AnonymousClass000.A0J(this.A02);
    }

    public AZp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, C195359Ty r5, int i) {
        if (i <= bigInteger.bitLength() || C200679hw.A01("org.spongycastle.dh.allow_unsafe_p_value")) {
            this.A00 = bigInteger2;
            this.A01 = bigInteger;
            this.A02 = bigInteger3;
            this.A03 = r5;
            return;
        }
        throw AnonymousClass001.A08("unsafe p value so small specific l required");
    }
}
