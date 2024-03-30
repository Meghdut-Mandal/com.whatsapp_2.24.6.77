package X;

/* renamed from: X.9c1  reason: invalid class name and case insensitive filesystem */
public final class C197629c1 {
    public final AnonymousClass9Pb A00;
    public final AnonymousClass9FA A01;

    public C197629c1(AnonymousClass9Pb r2, AnonymousClass9FA r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: X.9dd} */
    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: type inference failed for: r14v9 */
    /* JADX WARNING: type inference failed for: r14v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C194679Qr A00(X.C197629c1 r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.util.Map r25, java.util.Map r26) {
        /*
            java.lang.String r1 = "type"
            r0 = r25
            java.lang.Object r11 = r0.get(r1)
            java.lang.String r1 = "resource"
            boolean r3 = X.AnonymousClass00C.A0J(r11, r1)
            java.lang.String r6 = "result_selector"
            java.lang.String r1 = "next"
            java.lang.String r4 = "result_path"
            java.lang.String r7 = "parameters"
            java.lang.String r8 = "input_selector"
            java.lang.String r2 = "catch"
            r14 = 0
            r13 = r22
            if (r3 == 0) goto L_0x0093
            java.lang.String r3 = "id"
            java.lang.String r20 = X.C90484aE.A0m(r3, r0)
            java.util.Map r24 = X.C165587tf.A0o(r8, r0)
            java.lang.Object r5 = r0.get(r7)
            boolean r3 = r5 instanceof java.util.Map
            if (r3 == 0) goto L_0x0090
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L_0x0090
            X.5Tg r3 = X.C108375Tg.ADDITIONAL_PARAMS
            java.lang.String r3 = r3.key
            r7 = r26
            X.011 r3 = X.C36441kJ.A19(r3, r7)
            java.util.Map r25 = X.C000400e.A0C(r5, r3)
        L_0x0043:
            java.util.Map r26 = X.C165587tf.A0o(r6, r0)
            java.lang.Object r4 = r0.get(r4)
            boolean r3 = r4 instanceof java.lang.String
            if (r3 == 0) goto L_0x008d
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x008d
            java.lang.String r21 = X.C165597tg.A0l(r4)
        L_0x0057:
            java.lang.String r22 = X.C90464aC.A0Z(r1, r0)
            java.lang.String r1 = "merge"
            java.lang.Object r3 = r0.get(r1)
            if (r3 != 0) goto L_0x0065
            java.lang.String r3 = "replace"
        L_0x0065:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = "merge_param"
            java.lang.Object r17 = r0.get(r1)
            java.lang.Object r1 = r0.get(r2)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x007e
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x007e
            X.9dd r14 = new X.9dd
            r14.<init>(r1)
        L_0x007e:
            X.8h2 r9 = new X.8h2
            r18 = r23
            r15 = r9
            r16 = r14
            r19 = r13
            r23 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r9
        L_0x008d:
            java.lang.String r21 = "$"
            goto L_0x0057
        L_0x0090:
            r25 = r14
            goto L_0x0043
        L_0x0093:
            java.lang.String r3 = "choice"
            boolean r3 = X.AnonymousClass00C.A0J(r11, r3)
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>"
            java.lang.String r9 = "choices"
            java.lang.String r12 = "default"
            if (r3 == 0) goto L_0x00df
            java.lang.String r5 = X.C90484aE.A0m(r12, r0)
            java.lang.Object r1 = r0.get(r9)
            X.AnonymousClass00C.A0E(r1, r10)
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r1.iterator()
        L_0x00b6:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00ca
            java.lang.Object r1 = r3.next()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r1 = X.C90474aD.A0k(r1)
            r4.add(r1)
            goto L_0x00b6
        L_0x00ca:
            java.lang.Object r1 = r0.get(r2)
            if (r1 == 0) goto L_0x00d9
            java.lang.String r0 = X.C90484aE.A0m(r2, r0)
            X.9dd r14 = new X.9dd
            r14.<init>(r0)
        L_0x00d9:
            X.8gz r9 = new X.8gz
            r9.<init>(r14, r13, r5, r4)
            return r9
        L_0x00df:
            java.lang.String r3 = "succeed"
            boolean r3 = X.AnonymousClass00C.A0J(r11, r3)
            if (r3 == 0) goto L_0x00ed
            X.8gy r9 = new X.8gy
            r9.<init>(r13)
            return r9
        L_0x00ed:
            java.lang.String r3 = "pass"
            boolean r3 = X.AnonymousClass00C.A0J(r11, r3)
            if (r3 == 0) goto L_0x011c
            java.util.Map r5 = X.C165587tf.A0o(r8, r0)
            java.util.Map r6 = X.C165587tf.A0o(r7, r0)
            java.lang.Object r3 = r0.get(r4)
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L_0x0119
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0119
            java.lang.String r3 = X.C165597tg.A0l(r3)
        L_0x010d:
            java.lang.String r4 = X.C90464aC.A0Z(r1, r0)
            X.8h0 r14 = new X.8h0
            r1 = r14
            r2 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            return r14
        L_0x0119:
            java.lang.String r3 = "$"
            goto L_0x010d
        L_0x011c:
            java.lang.String r3 = "version_check"
            boolean r3 = X.AnonymousClass00C.A0J(r11, r3)
            r5 = r21
            if (r3 == 0) goto L_0x015d
            java.lang.String r3 = X.C90484aE.A0m(r12, r0)
            java.lang.Object r0 = r0.get(r9)
            X.AnonymousClass00C.A0E(r0, r10)
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r0.iterator()
        L_0x013b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x014f
            java.lang.Object r0 = r1.next()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r0 = X.C90474aD.A0k(r0)
            r2.add(r0)
            goto L_0x013b
        L_0x014f:
            java.lang.Object r1 = X.C36441kJ.A12(r2)
            java.lang.String r1 = (java.lang.String) r1
            X.9FA r0 = r5.A01
            X.8h1 r14 = new X.8h1
            r14.<init>(r0, r13, r3, r1)
            return r14
        L_0x015d:
            java.lang.String r3 = "subflow"
            boolean r3 = X.AnonymousClass00C.A0J(r11, r3)
            if (r3 == 0) goto L_0x01ca
            X.9Pb r3 = r5.A00
            java.util.Map r19 = X.C165587tf.A0o(r8, r0)
            java.util.Map r20 = X.C165587tf.A0o(r7, r0)
            java.util.Map r21 = X.C165587tf.A0o(r6, r0)
            java.lang.Object r5 = r0.get(r4)
            boolean r4 = r5 instanceof java.lang.String
            if (r4 == 0) goto L_0x01c7
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x01c7
            java.lang.String r15 = X.C165597tg.A0l(r5)
        L_0x0183:
            java.lang.Object r4 = r0.get(r2)
            boolean r2 = r4 instanceof java.lang.String
            if (r2 == 0) goto L_0x01c5
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x01c5
            X.9dd r11 = new X.9dd
            r11.<init>(r4)
        L_0x0194:
            java.lang.Object r2 = r0.get(r1)
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L_0x019f
            java.lang.String r2 = (java.lang.String) r2
            r14 = r2
        L_0x019f:
            java.lang.String r1 = "launch_mode"
            java.lang.String r16 = X.C90484aE.A0m(r1, r0)
            java.lang.String r1 = "config"
            java.lang.String r17 = X.C90484aE.A0m(r1, r0)
            X.0w4 r0 = r3.A00
            X.0tq r0 = r0.A00
            X.61B r12 = X.C165587tf.A0Y(r0)
            X.004 r0 = r0.AMX
            java.lang.Object r10 = r0.get()
            X.1K9 r10 = (X.AnonymousClass1K9) r10
            X.8h3 r9 = new X.8h3
            r18 = r24
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r9
        L_0x01c5:
            r11 = r14
            goto L_0x0194
        L_0x01c7:
            java.lang.String r15 = "$"
            goto L_0x0183
        L_0x01ca:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197629c1.A00(X.9c1, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map):X.9Qr");
    }
}
