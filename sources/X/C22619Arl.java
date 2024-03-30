package X;

/* renamed from: X.Arl  reason: case insensitive filesystem */
public class C22619Arl extends AnonymousClass120 {
    public C22653AsJ A00 = C22653AsJ.A01;
    public C22654AsK A01;

    public static C22619Arl A00(Object obj) {
        if (obj instanceof C22619Arl) {
            return (C22619Arl) obj;
        }
        if (obj != null) {
            return new C22619Arl(C22656AsM.A04(obj));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1 == 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            X.AsK r3 = r4.A01
            java.lang.String r0 = "BasicConstraints: isCa("
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r0)
            X.AsJ r0 = r4.A00
            if (r0 == 0) goto L_0x0011
            byte r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r3 != 0) goto L_0x0021
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
        L_0x001c:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x0021:
            r2.append(r0)
            java.lang.String r0 = "), pathLenConstraint = "
            r2.append(r0)
            byte[] r1 = r3.A00
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            r2.append(r0)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22619Arl.toString():java.lang.String");
    }

    public C22619Arl(C22656AsM asM) {
        if (asM.A0H() == 0) {
            this.A00 = null;
            return;
        }
        if (asM.A0J(0) instanceof C22653AsJ) {
            this.A00 = C22653AsJ.A01(asM.A0J(0));
        } else {
            this.A00 = null;
            this.A01 = C22654AsK.A01(asM.A0J(0));
        }
        if (asM.A0H() <= 1) {
            return;
        }
        if (this.A00 != null) {
            this.A01 = C22654AsK.A01(asM.A0J(1));
            return;
        }
        throw AnonymousClass001.A08("wrong sequence in constructor");
    }

    public AnonymousClass121 Bve() {
        C202169lB A002 = C202169lB.A00();
        C22653AsJ asJ = this.A00;
        if (asJ != null) {
            A002.A06(asJ);
        }
        C22654AsK asK = this.A01;
        if (asK != null) {
            A002.A06(asK);
        }
        return new C22675Asf(A002);
    }
}
