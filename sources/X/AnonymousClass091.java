package X;

/* renamed from: X.091  reason: invalid class name */
public abstract class AnonymousClass091 extends AnonymousClass090 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(java.lang.String r13) {
        /*
            r5 = 0
            X.AnonymousClass00C.A0D(r13, r5)
            java.lang.String r7 = ""
            java.util.List r12 = X.AnonymousClass099.A0J(r13)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r12.iterator()
        L_0x0013:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.AnonymousClass098.A06(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0013
            r3.add(r1)
            goto L_0x0013
        L_0x002c:
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r3, r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r6 = r3.iterator()
        L_0x003b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r4 = r6.next()
            java.lang.String r4 = (java.lang.String) r4
            int r3 = r4.length()
            r2 = 0
        L_0x004c:
            r1 = -1
            if (r2 >= r3) goto L_0x005d
            char r0 = r4.charAt(r2)
            boolean r0 = X.C06780Vb.A01(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0066
            if (r2 != r1) goto L_0x005e
        L_0x005d:
            r2 = r3
        L_0x005e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r8.add(r0)
            goto L_0x003b
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x004c
        L_0x0069:
            java.util.Iterator r3 = r8.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x00ee
            r2 = 0
        L_0x0074:
            java.lang.Number r2 = (java.lang.Number) r2
            r1 = 0
            if (r2 == 0) goto L_0x00ec
            int r6 = r2.intValue()
        L_0x007d:
            int r10 = r13.length()
            int r2 = r7.length()
            int r0 = r12.size()
            int r0 = r0 * r2
            int r10 = r10 + r0
            if (r2 != 0) goto L_0x00e6
            X.0mA r11 = X.C14770mA.A00
        L_0x008f:
            X.02t r11 = (X.C006302t) r11
            int r0 = r12.size()
            int r9 = r0 + -1
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r4 = r12.iterator()
        L_0x00a0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0124
            java.lang.Object r3 = r4.next()
            int r2 = r1 + 1
            if (r1 >= 0) goto L_0x00b9
            X.AnonymousClass03T.A05()
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x00b9:
            java.lang.String r3 = (java.lang.String) r3
            if (r1 == 0) goto L_0x00bf
            if (r1 != r9) goto L_0x00c7
        L_0x00bf:
            boolean r0 = X.AnonymousClass098.A06(r3)
            if (r0 == 0) goto L_0x00c7
        L_0x00c5:
            r1 = r2
            goto L_0x00a0
        L_0x00c7:
            r1 = r6
            X.AnonymousClass00C.A0D(r3, r5)
            if (r6 < 0) goto L_0x0108
            int r0 = r3.length()
            if (r6 <= r0) goto L_0x00d4
            r1 = r0
        L_0x00d4:
            java.lang.String r0 = r3.substring(r1)
            X.AnonymousClass00C.A08(r0)
            java.lang.Object r0 = r11.invoke(r0)
            if (r0 == 0) goto L_0x00e2
            r3 = r0
        L_0x00e2:
            r8.add(r3)
            goto L_0x00c5
        L_0x00e6:
            X.0lw r11 = new X.0lw
            r11.<init>()
            goto L_0x008f
        L_0x00ec:
            r6 = 0
            goto L_0x007d
        L_0x00ee:
            java.lang.Object r2 = r3.next()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        L_0x00f4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r0 = r2.compareTo(r1)
            if (r0 <= 0) goto L_0x00f4
            r2 = r1
            goto L_0x00f4
        L_0x0108:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Requested character count "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " is less than zero."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x0124:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r10)
            java.lang.String r5 = "\n"
            r4 = 0
            r3 = 1
            r6.append(r7)
            java.util.Iterator r2 = r8.iterator()
            r1 = 0
        L_0x0135:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x014a
            java.lang.Object r0 = r2.next()
            int r1 = r1 + 1
            if (r1 <= r3) goto L_0x0146
            r6.append(r5)
        L_0x0146:
            X.AnonymousClass090.A00(r6, r0, r4)
            goto L_0x0135
        L_0x014a:
            r6.append(r7)
            java.lang.String r0 = r6.toString()
            X.AnonymousClass00C.A08(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass091.A01(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(java.lang.String r12) {
        /*
            java.lang.String r6 = "|"
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            java.lang.String r7 = ""
            boolean r0 = X.AnonymousClass098.A06(r6)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00cc
            java.util.List r2 = X.AnonymousClass099.A0J(r12)
            int r5 = r12.length()
            int r1 = r7.length()
            int r0 = r2.size()
            int r0 = r0 * r1
            int r5 = r5 + r0
            if (r1 != 0) goto L_0x0095
            X.0mA r9 = X.C14770mA.A00
        L_0x0026:
            X.02t r9 = (X.C006302t) r9
            int r0 = r2.size()
            int r4 = r0 + -1
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r12 = r2.iterator()
            r1 = 0
        L_0x0038:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r3 = r12.next()
            int r11 = r1 + 1
            if (r1 >= 0) goto L_0x0051
            X.AnonymousClass03T.A05()
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0051:
            java.lang.String r3 = (java.lang.String) r3
            if (r1 == 0) goto L_0x0057
            if (r1 != r4) goto L_0x005f
        L_0x0057:
            boolean r0 = X.AnonymousClass098.A06(r3)
            if (r0 == 0) goto L_0x005f
        L_0x005d:
            r1 = r11
            goto L_0x0038
        L_0x005f:
            int r10 = r3.length()
            r2 = 0
        L_0x0064:
            r1 = -1
            if (r2 >= r10) goto L_0x008e
            char r0 = r3.charAt(r2)
            boolean r0 = X.C06780Vb.A01(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0092
            if (r2 == r1) goto L_0x008e
            boolean r0 = r3.startsWith(r6, r2)
            if (r0 == 0) goto L_0x008e
            int r0 = r6.length()
            int r2 = r2 + r0
            java.lang.String r0 = r3.substring(r2)
            X.AnonymousClass00C.A08(r0)
            java.lang.Object r0 = r9.invoke(r0)
            if (r0 == 0) goto L_0x008e
            r3 = r0
        L_0x008e:
            r8.add(r3)
            goto L_0x005d
        L_0x0092:
            int r2 = r2 + 1
            goto L_0x0064
        L_0x0095:
            X.0lw r9 = new X.0lw
            r9.<init>()
            goto L_0x0026
        L_0x009b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "\n"
            r4 = 0
            r3 = 1
            r6.append(r7)
            java.util.Iterator r2 = r8.iterator()
            r1 = 0
        L_0x00ac:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = r2.next()
            int r1 = r1 + 1
            if (r1 <= r3) goto L_0x00bd
            r6.append(r5)
        L_0x00bd:
            X.AnonymousClass090.A00(r6, r0, r4)
            goto L_0x00ac
        L_0x00c1:
            r6.append(r7)
            java.lang.String r0 = r6.toString()
            X.AnonymousClass00C.A08(r0)
            return r0
        L_0x00cc:
            java.lang.String r0 = "marginPrefix must be non-blank string."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass091.A02(java.lang.String):java.lang.String");
    }
}
