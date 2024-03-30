package X;

/* renamed from: X.0Cr  reason: invalid class name and case insensitive filesystem */
public class C02990Cr {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r1 == r6.A01) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r3 = 1
            if (r5 == r6) goto L_0x0030
            r4 = 0
            if (r6 == 0) goto L_0x004c
            java.lang.Class r1 = r5.getClass()
            java.lang.Class r0 = r6.getClass()
            if (r1 != r0) goto L_0x004c
            X.0Cr r6 = (X.C02990Cr) r6
            int r1 = r5.A00
            int r0 = r6.A00
            if (r1 != r0) goto L_0x004c
            r0 = 8
            if (r1 != r0) goto L_0x0031
            int r2 = r5.A01
            int r1 = r5.A02
            int r0 = r2 - r1
            int r0 = java.lang.Math.abs(r0)
            if (r0 != r3) goto L_0x0031
            int r0 = r6.A02
            if (r2 != r0) goto L_0x0031
            int r0 = r6.A01
            if (r1 != r0) goto L_0x0031
        L_0x0030:
            return r3
        L_0x0031:
            int r1 = r5.A01
            int r0 = r6.A01
            if (r1 != r0) goto L_0x004c
            int r1 = r5.A02
            int r0 = r6.A02
            if (r1 != r0) goto L_0x004c
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r6.A03
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0030
            return r4
        L_0x004a:
            if (r0 == 0) goto L_0x0030
        L_0x004c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02990Cr.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((this.A00 * 31) + this.A02) * 31) + this.A01;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.A00;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i == 4) {
            str = "up";
        } else if (i != 8) {
            str = "??";
        } else {
            str = "mv";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.A02);
        sb.append("c:");
        sb.append(this.A01);
        sb.append(",p:");
        sb.append(this.A03);
        sb.append("]");
        return sb.toString();
    }

    public C02990Cr(Object obj, int i, int i2, int i3) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = obj;
    }
}
