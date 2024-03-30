package X;

/* renamed from: X.9gj  reason: invalid class name and case insensitive filesystem */
public class C200149gj {
    public int A00;
    public B35 A01;
    public boolean A02;
    public boolean A03;
    public byte[] A04;
    public boolean A05;

    public C200149gj() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r4.startsWith("PGP", r2) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C200149gj(X.B35 r7) {
        /*
            r6 = this;
            r6.<init>()
            r6.A01 = r7
            int r0 = r7.B8o()
            byte[] r0 = new byte[r0]
            r6.A04 = r0
            r5 = 0
            r6.A00 = r5
            java.lang.String r4 = r7.B8R()
            r0 = 47
            int r0 = r4.indexOf(r0)
            r3 = 1
            int r2 = r0 + 1
            if (r2 <= 0) goto L_0x0028
            java.lang.String r0 = "PGP"
            boolean r1 = r4.startsWith(r0, r2)
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r6.A05 = r0
            if (r0 != 0) goto L_0x003f
            boolean r0 = r7 instanceof X.C22842Awr
            if (r0 != 0) goto L_0x003f
            if (r2 <= 0) goto L_0x003c
            java.lang.String r0 = "OpenPGP"
            boolean r0 = r4.startsWith(r0, r2)
            if (r0 == 0) goto L_0x003c
            r5 = 1
        L_0x003c:
            r6.A03 = r5
            return
        L_0x003f:
            r6.A03 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200149gj.<init>(X.B35):void");
    }

    public void A01() {
        int i = 0;
        while (true) {
            byte[] bArr = this.A04;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.A00 = 0;
                this.A01.reset();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0 == 0) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(int r3) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C22694Asy
            if (r0 == 0) goto L_0x0015
            int r0 = r2.A00
            int r3 = r3 + r0
            byte[] r0 = r2.A04
            int r1 = r0.length
            int r0 = r3 % r1
            if (r0 != 0) goto L_0x0042
            r0 = 0
            int r3 = r3 - r1
            int r3 = java.lang.Math.max(r0, r3)
            return r3
        L_0x0015:
            boolean r1 = r2 instanceof X.C22693Asx
            int r0 = r2.A00
            int r3 = r3 + r0
            if (r1 == 0) goto L_0x0025
            byte[] r0 = r2.A04
            int r1 = r0.length
            int r0 = r3 % r1
            if (r0 != 0) goto L_0x0042
        L_0x0023:
            int r3 = r3 - r1
            return r3
        L_0x0025:
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x003c
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x003c
            byte[] r0 = r2.A04
            int r0 = r0.length
            int r1 = r3 % r0
            X.B35 r0 = r2.A01
            int r0 = r0.B8o()
            int r0 = r0 + 2
            int r1 = r1 - r0
            goto L_0x0023
        L_0x003c:
            byte[] r0 = r2.A04
            int r0 = r0.length
            int r1 = r3 % r0
            goto L_0x0023
        L_0x0042:
            int r3 = r3 - r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200149gj.A00(int):int");
    }
}
