package X;

/* renamed from: X.6Uk  reason: invalid class name and case insensitive filesystem */
public final class C132596Uk {
    public static final C132596Uk A00 = new C132596Uk();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.Map} */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A02(java.lang.Object r11, java.lang.String r12, java.util.Map r13, java.util.Map r14) {
        /*
            r10 = this;
            if (r13 != 0) goto L_0x0009
            if (r14 != 0) goto L_0x0008
            X.00f r14 = X.C000400e.A0D()
        L_0x0008:
            return r14
        L_0x0009:
            if (r14 == 0) goto L_0x0017
            java.lang.String r0 = "merge"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0018
            java.util.LinkedHashMap r13 = r10.A00(r14, r13)
        L_0x0017:
            return r13
        L_0x0018:
            java.lang.String r0 = "incremental_merge"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0025
            java.util.LinkedHashMap r13 = r10.A01(r14, r13)
            return r13
        L_0x0025:
            java.lang.String r0 = "wae_commerce_merge"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0017
            java.util.LinkedHashMap r7 = X.C36431kI.A1G()
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r14)
        L_0x0035:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004d
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x0035
            r7.put(r1, r0)
            goto L_0x0035
        L_0x004d:
            java.util.List r0 = X.C113315fL.A00
            java.util.Iterator r9 = r0.iterator()
        L_0x0053:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r6 = r9.next()
            boolean r0 = r14.containsKey(r6)
            if (r0 != 0) goto L_0x0069
            boolean r0 = r13.containsKey(r6)
            if (r0 == 0) goto L_0x0053
        L_0x0069:
            java.lang.Object r5 = r14.get(r6)
            boolean r0 = r5 instanceof java.util.Map
            r4 = 0
            if (r0 == 0) goto L_0x00f8
            java.util.Map r5 = (java.util.Map) r5
        L_0x0074:
            java.lang.Object r1 = r13.get(r6)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x007f
            r4 = r1
            java.util.Map r4 = (java.util.Map) r4
        L_0x007f:
            if (r5 == 0) goto L_0x00ef
            if (r4 == 0) goto L_0x00ef
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r5)
            java.util.Iterator r8 = X.AnonymousClass000.A0y(r4)
        L_0x008c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r8)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "direct_connect"
            boolean r0 = X.AnonymousClass00C.A0J(r2, r0)
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x00b9
            r0 = r1
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008c
        L_0x00b5:
            r3.put(r2, r1)
            goto L_0x008c
        L_0x00b9:
            if (r1 == 0) goto L_0x008c
            goto L_0x00b5
        L_0x00bc:
            boolean r0 = r11 instanceof java.util.List
            if (r0 == 0) goto L_0x00c5
            r0 = r11
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x00c7
        L_0x00c5:
            X.09w r0 = X.C023409w.A00
        L_0x00c7:
            java.util.Iterator r2 = r0.iterator()
        L_0x00cb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r1 = r2.next()
            boolean r0 = r5.containsKey(r1)
            if (r0 != 0) goto L_0x00e1
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x00cb
        L_0x00e1:
            java.lang.Object r0 = r4.get(r1)
            if (r0 != 0) goto L_0x00eb
            X.00f r0 = X.C000400e.A0D()
        L_0x00eb:
            r3.put(r1, r0)
            goto L_0x00cb
        L_0x00ef:
            X.00f r3 = X.C000400e.A0D()
        L_0x00f3:
            r7.put(r6, r3)
            goto L_0x0053
        L_0x00f8:
            r5 = r4
            goto L_0x0074
        L_0x00fb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132596Uk.A02(java.lang.Object, java.lang.String, java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r3 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.LinkedHashMap A00(java.util.Map r8, java.util.Map r9) {
        /*
            r7 = this;
            java.util.LinkedHashMap r6 = X.C000400e.A06(r8)
            java.util.Iterator r5 = X.AnonymousClass000.A0y(r9)
        L_0x0008:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003a
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r5)
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r3 = r0.getValue()
            java.lang.Object r2 = r6.get(r4)
            boolean r0 = r2 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x0038
            java.util.Map r2 = (java.util.Map) r2
        L_0x0025:
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L_0x002c
            r1 = r3
            java.util.Map r1 = (java.util.Map) r1
        L_0x002c:
            if (r2 == 0) goto L_0x0034
            if (r1 == 0) goto L_0x0034
            java.util.LinkedHashMap r3 = r7.A00(r2, r1)
        L_0x0034:
            r6.put(r4, r3)
            goto L_0x0008
        L_0x0038:
            r2 = r1
            goto L_0x0025
        L_0x003a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132596Uk.A00(java.util.Map, java.util.Map):java.util.LinkedHashMap");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.LinkedHashMap A01(java.util.Map r11, java.util.Map r12) {
        /*
            r10 = this;
            java.util.LinkedHashMap r5 = X.C000400e.A06(r11)
            java.util.Iterator r9 = X.AnonymousClass000.A0y(r12)
        L_0x0008:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r9)
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r7 = r0.getValue()
            boolean r0 = r5.containsKey(r4)
            if (r0 == 0) goto L_0x009d
            java.lang.Object r1 = r5.get(r4)
            boolean r0 = r1 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x0052
            java.lang.Object r8 = r5.get(r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any>"
            X.AnonymousClass00C.A0E(r8, r0)
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            X.AnonymousClass00C.A0E(r7, r0)
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            r6 = 0
            int r3 = r7.length
        L_0x003a:
            if (r6 >= r3) goto L_0x004e
            r2 = r7[r6]
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            int r1 = r8.length
            int r0 = r1 + 1
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r0)
            r8[r1] = r2
            int r6 = r6 + 1
            goto L_0x003a
        L_0x004e:
            r5.put(r4, r8)
            goto L_0x0008
        L_0x0052:
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x007b
            java.lang.Object r2 = r5.get(r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"
            X.AnonymousClass00C.A0E(r2, r0)
            java.util.Collection r2 = (java.util.Collection) r2
            X.AnonymousClass00C.A0E(r7, r0)
            java.util.Iterator r1 = X.C90514aH.A13(r7)
        L_0x0068:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r1.next()
            java.util.ArrayList r2 = X.C007103b.A0T(r0, r2)
            goto L_0x0068
        L_0x0077:
            r5.put(r4, r2)
            goto L_0x0008
        L_0x007b:
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x009d
            java.lang.Object r3 = r5.get(r4)
            boolean r0 = r3 instanceof java.util.Map
            r2 = 0
            if (r0 == 0) goto L_0x00a2
            java.util.Map r3 = (java.util.Map) r3
        L_0x008a:
            java.lang.Object r1 = r12.get(r4)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0095
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
        L_0x0095:
            if (r3 == 0) goto L_0x0008
            if (r2 == 0) goto L_0x0008
            java.util.LinkedHashMap r7 = r10.A01(r3, r2)
        L_0x009d:
            r5.put(r4, r7)
            goto L_0x0008
        L_0x00a2:
            r3 = r2
            goto L_0x008a
        L_0x00a4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132596Uk.A01(java.util.Map, java.util.Map):java.util.LinkedHashMap");
    }
}
