package X;

/* renamed from: X.95t  reason: invalid class name and case insensitive filesystem */
public abstract class C1898295t {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r1 <= 126) goto L_0x0058;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.C21674AUx r6) {
        /*
            X.9DK r0 = new X.9DK
            r0.<init>(r6)
            X.AUx r4 = r0.A00
            int r0 = r4.A02()
            java.lang.StringBuilder r3 = X.C90524aI.A0h(r0)
            r2 = 0
        L_0x0010:
            int r0 = r4.A02()
            if (r2 >= r0) goto L_0x0094
            r6 = r4
            X.8I5 r6 = (X.AnonymousClass8I5) r6
            boolean r0 = r6 instanceof X.AnonymousClass8I4
            if (r0 == 0) goto L_0x003d
            X.8I4 r6 = (X.AnonymousClass8I4) r6
            int r5 = r6.bytesLength
            int r0 = r2 + 1
            int r0 = r5 - r0
            r0 = r0 | r2
            if (r0 >= 0) goto L_0x0035
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r2 >= 0) goto L_0x0085
            java.lang.String r0 = "Index < 0: "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.C165567td.A0M(r0, r1, r2)
            throw r0
        L_0x0035:
            byte[] r1 = r6.bytes
            int r0 = r6.bytesOffset
            int r0 = r0 + r2
            byte r1 = r1[r0]
            goto L_0x0041
        L_0x003d:
            byte[] r0 = r6.bytes
            byte r1 = r0[r2]
        L_0x0041:
            r0 = 34
            if (r1 == r0) goto L_0x007c
            r0 = 39
            if (r1 == r0) goto L_0x0079
            r0 = 92
            if (r1 == r0) goto L_0x0076
            switch(r1) {
                case 7: goto L_0x007f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0067;
                case 10: goto L_0x006a;
                case 11: goto L_0x006d;
                case 12: goto L_0x0070;
                case 13: goto L_0x0073;
                default: goto L_0x0050;
            }
        L_0x0050:
            r0 = 32
            if (r1 < r0) goto L_0x005f
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 > r0) goto L_0x005f
        L_0x0058:
            char r0 = (char) r1
            r3.append(r0)
        L_0x005c:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x005f:
            int r1 = X.C165577te.A07(r3, r1)
            goto L_0x0058
        L_0x0064:
            java.lang.String r0 = "\\b"
            goto L_0x0081
        L_0x0067:
            java.lang.String r0 = "\\t"
            goto L_0x0081
        L_0x006a:
            java.lang.String r0 = "\\n"
            goto L_0x0081
        L_0x006d:
            java.lang.String r0 = "\\v"
            goto L_0x0081
        L_0x0070:
            java.lang.String r0 = "\\f"
            goto L_0x0081
        L_0x0073:
            java.lang.String r0 = "\\r"
            goto L_0x0081
        L_0x0076:
            java.lang.String r0 = "\\\\"
            goto L_0x0081
        L_0x0079:
            java.lang.String r0 = "\\'"
            goto L_0x0081
        L_0x007c:
            java.lang.String r0 = "\\\""
            goto L_0x0081
        L_0x007f:
            java.lang.String r0 = "\\a"
        L_0x0081:
            r3.append(r0)
            goto L_0x005c
        L_0x0085:
            java.lang.String r0 = "Index > length: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.C165567td.A0M(r0, r1, r5)
            throw r0
        L_0x0094:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1898295t.A00(X.AUx):java.lang.String");
    }
}
