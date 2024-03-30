package X;

/* renamed from: X.6PV  reason: invalid class name */
public final class AnonymousClass6PV {
    public static final C125225zW A07 = new C125225zW();
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r1.A00(r2, r0) == false) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r4 = 1
            if (r7 == r8) goto L_0x0060
            boolean r0 = r8 instanceof X.AnonymousClass6PV
            r6 = 0
            if (r0 == 0) goto L_0x0037
            int r1 = r7.A02
            X.6PV r8 = (X.AnonymousClass6PV) r8
            int r0 = r8.A02
            if (r1 != r0) goto L_0x0037
            java.lang.String r1 = r7.A04
            java.lang.String r0 = r8.A04
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0037
            boolean r1 = r7.A06
            boolean r0 = r8.A06
            if (r1 != r0) goto L_0x0037
            int r5 = r7.A01
            r0 = 2
            int r3 = r8.A01
            if (r5 != r4) goto L_0x0038
            if (r3 != r0) goto L_0x0043
            java.lang.String r2 = r7.A03
            if (r2 == 0) goto L_0x0059
            X.5zW r1 = A07
            java.lang.String r0 = r8.A03
        L_0x0031:
            boolean r0 = r1.A00(r2, r0)
            if (r0 != 0) goto L_0x0043
        L_0x0037:
            return r6
        L_0x0038:
            if (r3 != r4) goto L_0x0043
            java.lang.String r2 = r8.A03
            if (r2 == 0) goto L_0x0043
            X.5zW r1 = A07
            java.lang.String r0 = r7.A03
            goto L_0x0031
        L_0x0043:
            if (r5 != r3) goto L_0x0059
            java.lang.String r2 = r7.A03
            if (r2 == 0) goto L_0x0054
            X.5zW r1 = A07
            java.lang.String r0 = r8.A03
            boolean r0 = r1.A00(r2, r0)
            if (r0 != 0) goto L_0x0059
            return r6
        L_0x0054:
            java.lang.String r0 = r8.A03
            if (r0 == 0) goto L_0x0059
            return r6
        L_0x0059:
            int r1 = r7.A00
            int r0 = r8.A00
            if (r1 == r0) goto L_0x0060
            r4 = 0
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6PV.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((C36421kH.A04(this.A04) + this.A00) * 31) + C36341k9.A01(this.A06 ? 1 : 0)) * 31) + this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (r0 != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6PV(java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, int r7, boolean r8) {
        /*
            r2 = this;
            r2.<init>()
            r2.A04 = r3
            r2.A05 = r4
            r2.A06 = r8
            r2.A02 = r6
            r2.A03 = r5
            r2.A01 = r7
            java.util.Locale r0 = java.util.Locale.US
            X.AnonymousClass00C.A09(r0)
            java.lang.String r1 = r4.toUpperCase(r0)
            X.AnonymousClass00C.A08(r1)
            java.lang.String r0 = "INT"
            boolean r0 = X.C90494aF.A1Z(r1, r0)
            if (r0 == 0) goto L_0x0027
            r1 = 3
        L_0x0024:
            r2.A00 = r1
            return
        L_0x0027:
            java.lang.String r0 = "CHAR"
            boolean r0 = X.C90494aF.A1Z(r1, r0)
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "CLOB"
            boolean r0 = X.C90494aF.A1Z(r1, r0)
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "TEXT"
            boolean r0 = X.C90494aF.A1Z(r1, r0)
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "BLOB"
            boolean r0 = X.C90494aF.A1Z(r1, r0)
            if (r0 == 0) goto L_0x0049
            r1 = 5
            goto L_0x0024
        L_0x0049:
            java.lang.String r0 = "REAL"
            boolean r0 = X.C90494aF.A1Z(r1, r0)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "FLOA"
            boolean r0 = X.C90494aF.A1Z(r1, r0)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "DOUB"
            boolean r0 = X.C90494aF.A1Z(r1, r0)
            r1 = 1
            if (r0 == 0) goto L_0x0024
        L_0x0062:
            r1 = 4
            goto L_0x0024
        L_0x0064:
            r1 = 2
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6PV.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, boolean):void");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Column{name='");
        A0u.append(this.A04);
        A0u.append("', type='");
        A0u.append(this.A05);
        A0u.append("', affinity='");
        A0u.append(this.A00);
        A0u.append("', notNull=");
        A0u.append(this.A06);
        A0u.append(", primaryKeyPosition=");
        A0u.append(this.A02);
        A0u.append(", defaultValue='");
        String str = this.A03;
        if (str == null) {
            str = "undefined";
        }
        A0u.append(str);
        return AnonymousClass000.A0q("'}", A0u);
    }
}
