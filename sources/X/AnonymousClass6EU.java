package X;

/* renamed from: X.6EU  reason: invalid class name */
public class AnonymousClass6EU {
    public final AnonymousClass6EZ A00;
    public final String A01;

    public String[] A00() {
        AnonymousClass6EZ r2 = this.A00;
        return new String[]{this.A01, r2.A02, String.valueOf(r2.A01), String.valueOf(r2.A00)};
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass6EU)) {
            return false;
        }
        AnonymousClass6EU r4 = (AnonymousClass6EU) obj;
        return this.A01.equals(r4.A01) && this.A00.equals(r4.A00);
    }

    public int hashCode() {
        return this.A01.hashCode() ^ this.A00.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if (r0 == null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.String r4 = r7.A01
            java.lang.String r5 = "@"
            boolean r0 = r4.contains(r5)
            r3 = 4
            if (r0 == 0) goto L_0x0034
            int r0 = r4.indexOf(r5)
            java.lang.String r6 = X.C90514aH.A0z(r4, r0)
            int r0 = r0 + 1
            java.lang.String r2 = r4.substring(r0)
            java.lang.String r0 = "g.us"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0048
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 15
            java.lang.String r0 = X.AnonymousClass14B.A0B(r6, r0)
        L_0x002b:
            X.AnonymousClass000.A1D(r0, r5, r2, r1)
            java.lang.String r0 = r1.toString()
            if (r0 != 0) goto L_0x0038
        L_0x0034:
            java.lang.String r0 = X.AnonymousClass14B.A0B(r4, r3)
        L_0x0038:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)
            java.lang.String r0 = "::"
            r1.append(r0)
            X.6EZ r0 = r7.A00
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            return r0
        L_0x0048:
            java.lang.String r0 = "broadcast"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0034
            X.8dw r0 = X.C177528dw.A00
            java.lang.String r0 = r0.getRawString()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0071
            X.8dv r0 = X.C177518dv.A00
            java.lang.String r0 = r0.getRawString()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0071
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.AnonymousClass14B.A0B(r6, r3)
            goto L_0x002b
        L_0x0071:
            r0 = r4
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6EU.toString():java.lang.String");
    }

    public AnonymousClass6EU(AnonymousClass6EZ r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }
}
