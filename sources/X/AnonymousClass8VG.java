package X;

import com.whatsapp.util.Log;

/* renamed from: X.8VG  reason: invalid class name */
public final class AnonymousClass8VG extends AnonymousClass8VH {
    public final AnonymousClass9TW A00;
    public final C193989Nr A01;
    public final C19600wD A02;
    public final C20810yC A03;
    public final C199349fA A04;
    public final AnonymousClass19A A05;
    public final AnonymousClass3L6 A06;
    public final C63273Jk A07;
    public final C192079Fp A08 = new C192079Fp();
    public final C31781cN A09;
    public final AnonymousClass9EK A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8VG(AnonymousClass1KK r2, AnonymousClass9TW r3, C193989Nr r4, C31781cN r5, AnonymousClass9EK r6, C19600wD r7, C20810yC r8, C199349fA r9, AnonymousClass19A r10, AnonymousClass3L6 r11, C63273Jk r12) {
        super(r2, r4.A05);
        C36331k8.A1G(r5, 3, r6);
        this.A06 = r11;
        this.A05 = r10;
        this.A09 = r5;
        this.A0A = r6;
        this.A02 = r7;
        this.A01 = r4;
        this.A00 = r3;
        this.A04 = r9;
        this.A07 = r12;
        this.A03 = r8;
    }

    public void BVN(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A08.A00.remove(str);
        A00(this);
        this.A07.A01(str);
        Log.e("GetCollectionsProtocol/onDeliveryFailure/delivery-error");
        this.A00.A01(this.A01, -1);
    }

    /* JADX WARNING: type inference failed for: r0v66, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r42, java.lang.String r43) {
        /*
            r41 = this;
            r12 = 0
            r14 = r42
            r1 = r43
            X.C36331k8.A1I(r1, r14)
            r5 = r41
            A00(r5)
            X.3Jk r0 = r5.A07
            r0.A02(r1)
            X.9Fp r0 = r5.A08
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r4 = r0.get(r1)
            X.33b r4 = (X.C592133b) r4
            X.0yC r3 = r5.A03
            r2 = 5886(0x16fe, float:8.248E-42)
            boolean r2 = r3.A0E(r2)
            if (r2 == 0) goto L_0x02f6
            if (r4 == 0) goto L_0x02f6
            X.9nx r4 = X.C90514aH.A0e(r14, r4)
            java.lang.String r3 = "collections"
            java.lang.String r7 = "paging"
            java.lang.String r6 = "after"
            java.lang.String r2 = "#elementValue"
            java.lang.String[] r19 = new java.lang.String[]{r3, r7, r6, r2}
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            java.lang.Long r16 = X.C36411kG.A0t()
            java.lang.Long r17 = X.C165567td.A0Q()
            r6 = 0
            X.9oF r13 = X.C203379ns.A00
            r20 = 0
            r18 = r6
            java.lang.Object r8 = r13.A0Z(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r8 = (java.lang.String) r8
            r2 = 43
            X.B9v r2 = X.C23213B9v.A00(r4, r2)
            X.C203539oF.A0B(r14, r2)
            java.lang.String r2 = "collection"
            java.lang.String[] r16 = new java.lang.String[]{r3, r2}
            X.AQN r15 = X.AQN.A00
            r17 = 0
            r19 = 20
            java.util.ArrayList r2 = X.C203539oF.A09(r14, r15, r16, r17, r19)
            r0.remove(r1)
            X.9EK r0 = r5.A0A
            r40 = r0
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x033d
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            java.util.Iterator r20 = r2.iterator()
        L_0x007d:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x02e3
            java.lang.Object r4 = r20.next()
            X.8sD r4 = (X.C184298sD) r4
            X.AnonymousClass00C.A0B(r4)
            java.lang.Object r0 = r4.A01
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r19 = X.C36411kG.A13(r0)
            java.util.Iterator r18 = r0.iterator()
        L_0x0098:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0277
            java.lang.Object r0 = r18.next()
            X.8t3 r0 = (X.C184818t3) r0
            java.lang.Object r3 = r0.A00
            X.8tR r3 = (X.C185058tR) r3
            X.AnonymousClass00C.A08(r3)
            X.8sr r0 = r3.A07
            if (r0 == 0) goto L_0x0273
            java.lang.String r0 = r0.A00
            r32 = r0
        L_0x00b3:
            java.lang.String r0 = r3.A0B
            r27 = r0
            X.AnonymousClass00C.A08(r27)
            java.lang.String r0 = r3.A0D
            r28 = r0
            X.AnonymousClass00C.A08(r28)
            X.8rj r0 = r3.A01
            if (r0 == 0) goto L_0x026f
            java.lang.String r0 = r0.A00
            r29 = r0
        L_0x00c9:
            X.8rj r0 = r3.A00
            if (r0 == 0) goto L_0x026c
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x026c
            X.6Tk r2 = new X.6Tk
            r2.<init>(r0)
        L_0x00d6:
            X.8rj r0 = r3.A02
            if (r0 == 0) goto L_0x0269
            java.lang.String r0 = r0.A00
        L_0x00dc:
            if (r2 == 0) goto L_0x00f1
            if (r0 == 0) goto L_0x00f1
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00e9 }
            java.math.BigDecimal r33 = X.C129676Ia.A00(r2, r0)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00f3
        L_0x00e9:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r33 = r6
            r2 = r6
            goto L_0x00f3
        L_0x00f1:
            r33 = r6
        L_0x00f3:
            X.8rr r0 = r3.A05
            if (r0 == 0) goto L_0x0145
            if (r2 == 0) goto L_0x0145
            java.lang.Object r7 = r0.A00
            X.8tH r7 = (X.C184958tH) r7
            java.lang.String r0 = r7.A02
            X.AnonymousClass00C.A08(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.math.BigDecimal r9 = X.C129676Ia.A00(r2, r0)     // Catch:{ IllegalArgumentException -> 0x0148 }
            java.lang.Object r1 = r7.A01     // Catch:{ IllegalArgumentException -> 0x0148 }
            X.8ro r1 = (X.C184048ro) r1     // Catch:{ IllegalArgumentException -> 0x0148 }
            java.lang.Object r0 = r7.A00     // Catch:{ IllegalArgumentException -> 0x0148 }
            X.8ro r0 = (X.C184048ro) r0     // Catch:{ IllegalArgumentException -> 0x0148 }
            if (r1 == 0) goto L_0x013b
            if (r0 == 0) goto L_0x013b
            java.lang.String r7 = r1.A00     // Catch:{ IllegalArgumentException -> 0x0148 }
            X.AnonymousClass00C.A08(r7)     // Catch:{ IllegalArgumentException -> 0x0148 }
            java.lang.String r10 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0148 }
            X.AnonymousClass00C.A08(r10)     // Catch:{ IllegalArgumentException -> 0x0148 }
            java.lang.String r13 = "yyyy-MM-dd'T'HH:mmZ"
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ ParseException -> 0x013b }
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x013b }
            r1.<init>(r13, r0)     // Catch:{ ParseException -> 0x013b }
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)     // Catch:{ ParseException -> 0x013b }
            r1.setTimeZone(r0)     // Catch:{ ParseException -> 0x013b }
            java.util.Date r7 = r1.parse(r7)     // Catch:{ ParseException -> 0x013b }
            java.util.Date r1 = r1.parse(r10)     // Catch:{ ParseException -> 0x013b }
            goto L_0x013d
        L_0x013b:
            r1 = r6
            r7 = r6
        L_0x013d:
            X.6bV r17 = new X.6bV     // Catch:{ IllegalArgumentException -> 0x0148 }
            r0 = r17
            r0.<init>(r2, r9, r7, r1)     // Catch:{ IllegalArgumentException -> 0x0148 }
            goto L_0x014a
        L_0x0145:
            r17 = r6
            goto L_0x014a
        L_0x0148:
            r17 = r6
        L_0x014a:
            X.8rj r0 = r3.A03
            if (r0 == 0) goto L_0x01c3
            java.lang.String r0 = r0.A00
            r31 = r0
        L_0x0152:
            X.8ro r0 = r3.A04
            if (r0 == 0) goto L_0x01c0
            java.lang.String r0 = r0.A00
            r30 = r0
        L_0x015a:
            java.lang.String r0 = r3.A0C
            boolean r39 = java.lang.Boolean.parseBoolean(r0)
            java.lang.String r1 = r3.A0A
            java.lang.String r0 = "out of stock"
            boolean r35 = r0.equalsIgnoreCase(r1)
            X.9nx r1 = r3.A00
            java.lang.String r0 = "compliance_category"
            java.lang.String r7 = r1.A0i(r0, r6)
            java.util.List r1 = r3.A0E
            boolean r0 = X.C36401kF.A1a(r1)
            if (r0 == 0) goto L_0x0262
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.Iterator r16 = r1.iterator()
        L_0x0180:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01c6
            java.lang.Object r10 = r16.next()
            X.8sJ r10 = (X.C184358sJ) r10
            if (r10 == 0) goto L_0x0180
            java.lang.String r0 = r10.A03
            r22 = r0
            X.AnonymousClass00C.A08(r22)
            java.lang.String r15 = r10.A04
            X.AnonymousClass00C.A08(r15)
            java.lang.String r14 = r10.A05
            X.AnonymousClass00C.A08(r14)
            java.lang.Object r0 = r10.A02
            long r0 = X.C36431kI.A09(r0)
            int r13 = (int) r0
            java.lang.Object r0 = r10.A00
            long r0 = X.C36431kI.A09(r0)
            int r10 = (int) r0
            X.9tv r0 = new X.9tv
            r21 = r0
            r23 = r15
            r24 = r14
            r25 = r13
            r26 = r10
            r21.<init>(r22, r23, r24, r25, r26)
            r9.add(r0)
            goto L_0x0180
        L_0x01c0:
            r30 = r6
            goto L_0x015a
        L_0x01c3:
            r31 = r6
            goto L_0x0152
        L_0x01c6:
            java.util.ArrayList r34 = X.C36441kJ.A15(r9)
            r0 = r40
            X.1cO r10 = r0.A00
            X.9nx r1 = r3.A00
            java.lang.String r0 = "compliance_info"
            X.9nx r0 = r1.A0c(r0)
            X.9te r1 = X.C31791cO.A01(r0)
            java.lang.String r0 = "COUNTRY_ORIGIN_EXEMPT"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x01e9
            java.lang.String r0 = "N/A"
            X.9te r1 = new X.9te
            r1.<init>(r6, r0, r6)
        L_0x01e9:
            java.lang.Long r0 = r3.A09
            if (r0 == 0) goto L_0x025f
            long r36 = r0.longValue()
        L_0x01f1:
            X.8tM r9 = r3.A08
            r0 = 0
            if (r9 == 0) goto L_0x0224
            java.lang.String r15 = r9.A03
            X.AnonymousClass00C.A08(r15)
            X.8ro r7 = r9.A01
            if (r7 == 0) goto L_0x025d
            java.lang.String r14 = r7.A00
        L_0x0201:
            X.8ro r7 = r9.A00
            if (r7 == 0) goto L_0x025b
            java.lang.String r13 = r7.A00
        L_0x0207:
            X.8ss r7 = r9.A02
            if (r7 == 0) goto L_0x020d
            java.lang.String r0 = r7.A00
        L_0x020d:
            java.lang.String r7 = "true"
            boolean r26 = X.AnonymousClass00C.A0J(r0, r7)
            int r25 = X.AnonymousClass962.A00(r15)
            X.9tw r0 = new X.9tw
            r21 = r0
            r22 = r14
            r23 = r13
            r24 = r6
            r21.<init>(r22, r23, r24, r25, r26)
        L_0x0224:
            X.9nx r9 = r3.A00
            java.lang.String r7 = "variant_info"
            X.9nx r7 = r9.A0c(r7)
            X.1cP r9 = r10.A00
            X.6bW r25 = r9.A00(r2, r7)
            r38 = 1
            X.9up r7 = new X.9up
            r21 = r7
            r22 = r1
            r23 = r0
            r24 = r17
            r26 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r39)
            X.8sq r0 = r3.A06
            if (r0 == 0) goto L_0x0259
            java.lang.String r0 = r0.A00
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            X.8VY r1 = new X.8VY
            r1.<init>(r7, r0)
        L_0x0252:
            r0 = r19
            r0.add(r1)
            goto L_0x0098
        L_0x0259:
            r1 = r7
            goto L_0x0252
        L_0x025b:
            r13 = r6
            goto L_0x0207
        L_0x025d:
            r14 = r6
            goto L_0x0201
        L_0x025f:
            r36 = 99
            goto L_0x01f1
        L_0x0262:
            java.lang.String r0 = "Connection/Product/missing required fields."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0098
        L_0x0269:
            r0 = r6
            goto L_0x00dc
        L_0x026c:
            r2 = r6
            goto L_0x00d6
        L_0x026f:
            r29 = r6
            goto L_0x00c9
        L_0x0273:
            r32 = r6
            goto L_0x00b3
        L_0x0277:
            java.util.ArrayList r18 = X.C90504aG.A0u(r19)
            java.lang.String r3 = r4.A02
            X.AnonymousClass00C.A08(r3)
            java.lang.String r2 = r4.A03
            X.AnonymousClass00C.A08(r2)
            java.lang.Object r10 = r4.A00
            X.8tO r10 = (X.C185028tO) r10
            if (r10 != 0) goto L_0x02a1
            X.9Wa r7 = new X.9Wa
            r7.<init>(r6, r6, r12, r12)
        L_0x0290:
            X.9Wv r0 = new X.9Wv
            r13 = r0
            r14 = r7
            r15 = r6
            r16 = r3
            r17 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            r11.add(r0)
            goto L_0x007d
        L_0x02a1:
            java.lang.String r1 = r10.A03
            X.AnonymousClass00C.A08(r1)
            boolean r0 = X.AnonymousClass14B.A0F(r1)
            if (r0 != 0) goto L_0x02e1
            java.lang.String r0 = "APPROVED"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02e1
            java.lang.String r0 = "REJECTED"
            boolean r0 = r1.equals(r0)
            int r9 = X.C36371kC.A00(r0)
        L_0x02be:
            X.8rj r0 = r10.A01
            r7 = 0
            if (r0 == 0) goto L_0x02df
            java.lang.String r4 = r0.A00
        L_0x02c5:
            X.8rj r0 = r10.A00
            if (r0 == 0) goto L_0x02dd
            java.lang.String r1 = r0.A00
        L_0x02cb:
            X.8sp r0 = r10.A02
            if (r0 == 0) goto L_0x02d1
            java.lang.String r7 = r0.A00
        L_0x02d1:
            java.lang.String r0 = "true"
            boolean r0 = X.AnonymousClass00C.A0J(r7, r0)
            X.9Wa r7 = new X.9Wa
            r7.<init>(r4, r1, r9, r0)
            goto L_0x0290
        L_0x02dd:
            r1 = r6
            goto L_0x02cb
        L_0x02df:
            r4 = r6
            goto L_0x02c5
        L_0x02e1:
            r9 = 0
            goto L_0x02be
        L_0x02e3:
            int r0 = X.C165607th.A08(r8)
            boolean r1 = X.AnonymousClass000.A1R(r0)
            X.9VS r0 = new X.9VS
            r0.<init>(r1, r8)
            X.9VR r2 = new X.9VR
            r2.<init>(r0, r11)
            goto L_0x0335
        L_0x02f6:
            X.1cN r6 = r5.A09
            java.lang.String r0 = "collections"
            X.9nx r4 = r14.A0c(r0)
            if (r4 == 0) goto L_0x033d
            java.lang.String r0 = "collection"
            java.util.List r0 = r4.A0j(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x030e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0326
            X.9nx r1 = X.C36431kI.A0s(r2)
            X.9Wv r0 = r6.A01(r1)
            if (r0 == 0) goto L_0x030e
            X.9Wv r0 = r6.A01(r1)
            r3.add(r0)
            goto L_0x030e
        L_0x0326:
            java.lang.String r0 = "paging"
            X.9nx r0 = r4.A0c(r0)
            X.9VS r0 = X.C31791cO.A00(r0)
            X.9VR r2 = new X.9VR
            r2.<init>(r0, r3)
        L_0x0335:
            X.9Nr r1 = r5.A01
            X.9TW r0 = r5.A00
            r0.A00(r2, r1)
            return
        L_0x033d:
            X.9Nr r1 = r5.A01
            X.9TW r0 = r5.A00
            r0.A01(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8VG.BiM(X.9nx, java.lang.String):void");
    }

    public static final void A00(AnonymousClass8VG r1) {
        C21700zf A0V;
        if (r1.A01.A06 == null && (A0V = C165597tg.A0V(r1.A06)) != null) {
            A0V.A06("datasource_collections");
        }
    }
}
