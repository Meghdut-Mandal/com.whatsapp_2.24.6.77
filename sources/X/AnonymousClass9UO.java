package X;

/* renamed from: X.9UO  reason: invalid class name */
public class AnonymousClass9UO {
    public int A00;
    public String A01;
    public String A02;
    public String A03;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r0 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0047
            r2 = 0
            if (r5 == 0) goto L_0x001a
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x001a
            X.9UO r5 = (X.AnonymousClass9UO) r5
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 != 0) goto L_0x001b
            if (r0 == 0) goto L_0x0022
        L_0x001a:
            return r2
        L_0x001b:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0022
            return r2
        L_0x0022:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            if (r1 != 0) goto L_0x002b
            if (r0 == 0) goto L_0x0032
            return r2
        L_0x002b:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0032
            return r2
        L_0x0032:
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x001a
            java.lang.String r1 = r4.A03
            java.lang.String r0 = r5.A03
            if (r1 != 0) goto L_0x0042
            if (r0 == 0) goto L_0x0047
            r3 = 0
            return r3
        L_0x0042:
            boolean r0 = r1.equals(r0)
            return r0
        L_0x0047:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9UO.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((((C36341k9.A09(this.A01) + 31) * 31) + C36341k9.A09(this.A02)) * 31) + this.A00) * 31) + C36421kH.A05(this.A03);
    }

    public AnonymousClass9UO(String str, String str2, String str3, int i) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = str3;
    }
}
