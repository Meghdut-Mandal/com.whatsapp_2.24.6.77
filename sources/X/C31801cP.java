package X;

/* renamed from: X.1cP  reason: invalid class name and case insensitive filesystem */
public final class C31801cP {
    public final C31851cU A00;
    public final C31821cR A01;
    public final C31831cS A02;
    public final C31811cQ A03;

    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C134736bW A00(X.C132386Tk r14, X.C203399nx r15) {
        /*
            r13 = this;
            if (r15 != 0) goto L_0x0004
            r0 = 0
            return r0
        L_0x0004:
            java.lang.String r0 = "properties"
            X.9nx r3 = r15.A0c(r0)
            java.lang.String r0 = "listing_details"
            X.9nx r8 = r15.A0c(r0)
            java.lang.String r0 = "types"
            X.9nx r1 = r15.A0c(r0)
            java.lang.String r0 = "availability"
            X.9nx r7 = r15.A0c(r0)
            r5 = 0
            if (r1 == 0) goto L_0x00a9
            java.lang.String r0 = "type"
            java.util.List r0 = r1.A0j(r0)
            if (r0 == 0) goto L_0x00a9
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r11 = r0.iterator()
        L_0x0030:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r1 = r11.next()
            X.9nx r1 = (X.C203399nx) r1
            java.lang.String r0 = "name"
            X.9nx r0 = r1.A0c(r0)
            if (r0 == 0) goto L_0x00a6
            java.lang.String r9 = r0.A0e()
        L_0x0048:
            java.lang.String r0 = "options"
            X.9nx r1 = r1.A0c(r0)
            if (r1 == 0) goto L_0x009a
            java.lang.String r0 = "option"
            java.util.List r0 = r1.A0j(r0)
            if (r0 == 0) goto L_0x009a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r10 = r0.iterator()
        L_0x0061:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x009c
            java.lang.Object r1 = r10.next()
            X.9nx r1 = (X.C203399nx) r1
            java.lang.String r0 = "value"
            X.9nx r0 = r1.A0c(r0)
            if (r0 == 0) goto L_0x0098
            java.lang.String r2 = r0.A0e()
        L_0x0079:
            java.lang.String r0 = "thumbnail_media"
            X.9nx r0 = r1.A0c(r0)
            if (r2 == 0) goto L_0x0061
            if (r0 != 0) goto L_0x008c
            X.4zX r1 = new X.4zX
            r1.<init>(r2)
        L_0x0088:
            r4.add(r1)
            goto L_0x0061
        L_0x008c:
            X.9tv r0 = X.C31841cT.A00(r0)
            if (r0 == 0) goto L_0x0061
            X.4zY r1 = new X.4zY
            r1.<init>(r0, r2)
            goto L_0x0088
        L_0x0098:
            r2 = r5
            goto L_0x0079
        L_0x009a:
            X.09w r4 = X.C023409w.A00
        L_0x009c:
            X.6b5 r0 = X.C31831cS.A00(r9, r4)
            if (r0 == 0) goto L_0x0030
            r6.add(r0)
            goto L_0x0030
        L_0x00a6:
            r9 = r5
            goto L_0x0048
        L_0x00a8:
            r5 = r6
        L_0x00a9:
            r4 = 0
            if (r3 == 0) goto L_0x00e3
            java.lang.String r0 = "property"
            java.util.List r0 = r3.A0j(r0)
            if (r0 == 0) goto L_0x00e3
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x00bd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r1 = r3.next()
            X.9nx r1 = (X.C203399nx) r1
            java.lang.String r0 = "name"
            java.lang.String r2 = r1.A0i(r0, r4)
            java.lang.String r0 = "value"
            java.lang.String r1 = r1.A0i(r0, r4)
            if (r2 == 0) goto L_0x00bd
            if (r1 == 0) goto L_0x00bd
            X.6bJ r0 = new X.6bJ
            r0.<init>(r2, r1)
            r6.add(r0)
            goto L_0x00bd
        L_0x00e2:
            r4 = r6
        L_0x00e3:
            if (r8 != 0) goto L_0x0172
            r8 = 0
        L_0x00e6:
            r6 = 0
            if (r7 == 0) goto L_0x01dc
            java.lang.String r0 = "listing"
            X.9nx r1 = r7.A0c(r0)
            if (r1 == 0) goto L_0x01dc
            java.lang.String r0 = "options"
            java.util.List r0 = r1.A0j(r0)
            if (r0 == 0) goto L_0x01dc
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r12 = r0.iterator()
        L_0x0102:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01cf
            java.lang.Object r1 = r12.next()
            X.9nx r1 = (X.C203399nx) r1
            java.lang.String r0 = "is_available"
            X.9nx r0 = r1.A0c(r0)
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = r0.A0e()
            if (r0 == 0) goto L_0x0170
            boolean r10 = java.lang.Boolean.parseBoolean(r0)
        L_0x0120:
            java.lang.String r0 = "product_id"
            X.9nx r0 = r1.A0c(r0)
            if (r0 == 0) goto L_0x016e
            java.lang.String r9 = r0.A0e()
        L_0x012c:
            java.lang.String r0 = "option"
            java.util.List r0 = r1.A0j(r0)
            X.AnonymousClass00C.A08(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r11 = r0.iterator()
        L_0x013e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0163
            java.lang.Object r1 = r11.next()
            X.9nx r1 = (X.C203399nx) r1
            java.lang.String r0 = "name"
            java.lang.String r2 = r1.A0i(r0, r6)
            java.lang.String r0 = "value"
            java.lang.String r1 = r1.A0i(r0, r6)
            if (r2 == 0) goto L_0x013e
            if (r1 == 0) goto L_0x013e
            X.6bJ r0 = new X.6bJ
            r0.<init>(r2, r1)
            r3.add(r0)
            goto L_0x013e
        L_0x0163:
            if (r9 == 0) goto L_0x0102
            X.6bO r0 = new X.6bO
            r0.<init>(r9, r3, r10)
            r7.add(r0)
            goto L_0x0102
        L_0x016e:
            r9 = r6
            goto L_0x012c
        L_0x0170:
            r10 = 0
            goto L_0x0120
        L_0x0172:
            java.lang.String r0 = "description"
            X.9nx r0 = r8.A0c(r0)
            if (r0 == 0) goto L_0x01af
            java.lang.String r6 = r0.A0e()
        L_0x017e:
            java.lang.String r0 = "multi_price"
            X.9nx r0 = r8.A0c(r0)
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = r0.A0e()
            if (r0 == 0) goto L_0x01ad
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0194:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r3 = X.AnonymousClass00C.A0J(r1, r0)
            r2 = 0
            java.lang.String r0 = "lowest_price"
            X.9nx r0 = r8.A0c(r0)
            if (r0 == 0) goto L_0x01c8
            java.lang.String r1 = r0.A0e()
            if (r1 == 0) goto L_0x01c8
            goto L_0x01b1
        L_0x01ad:
            r1 = 0
            goto L_0x0194
        L_0x01af:
            r6 = 0
            goto L_0x017e
        L_0x01b1:
            X.0fN r0 = X.AnonymousClass0RV.A00     // Catch:{ NumberFormatException -> 0x01c8 }
            boolean r0 = r0.A03(r1)     // Catch:{ NumberFormatException -> 0x01c8 }
            if (r0 == 0) goto L_0x01c8
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x01c8 }
            r0.<init>(r1)     // Catch:{ NumberFormatException -> 0x01c8 }
            if (r14 == 0) goto L_0x01c8
            long r0 = r0.longValue()
            java.math.BigDecimal r2 = X.C129676Ia.A00(r14, r0)
        L_0x01c8:
            X.6bP r8 = new X.6bP
            r8.<init>(r6, r2, r3)
            goto L_0x00e6
        L_0x01cf:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01dc
            X.6bD r6 = new X.6bD
            r6.<init>(r7)
        L_0x01dc:
            X.6bW r0 = new X.6bW
            r0.<init>(r6, r8, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31801cP.A00(X.6Tk, X.9nx):X.6bW");
    }

    public C31801cP(C31851cU r1, C31821cR r2, C31831cS r3, C31811cQ r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
