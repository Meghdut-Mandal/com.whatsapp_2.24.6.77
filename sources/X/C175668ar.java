package X;

import java.util.ArrayList;

/* renamed from: X.8ar  reason: invalid class name and case insensitive filesystem */
public final class C175668ar extends C129086Ew {
    public final C26201Jg A00;
    public final C26181Je A01;
    public final C26171Jd A02;
    public final C20520xh A03;
    public final AnonymousClass1A1 A04;
    public final C25301Ft A05;

    public String A00() {
        return "MessageAddOnOrphanResolver";
    }

    public ArrayList A02(C64933Qa r7, int i, long j) {
        AnonymousClass00C.A0D(r7, 0);
        return this.A05.A03(r7, 1, i, j);
    }

    public ArrayList A01(int i, long j) {
        return this.A05.A02(1, i, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        if (r7 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011b, code lost:
        if (r9 != null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011f, code lost:
        if (r2 == null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013c, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013f, code lost:
        throw r0;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.util.List r18, java.util.Set r19) {
        /*
            r17 = this;
            r0 = r18
            r4 = r19
            X.C36321k7.A0w(r0, r4)
            java.util.LinkedHashSet r3 = X.C36441kJ.A17()
            java.util.Iterator r16 = r0.iterator()
        L_0x000f:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0140
            java.lang.Object r10 = r16.next()
            X.9XS r10 = (X.AnonymousClass9XS) r10
            java.lang.Long r6 = r10.A07
            X.3Qa r9 = r10.A06
            X.13q r0 = X.AnonymousClass11F.A00
            com.whatsapp.jid.Jid r0 = r10.A03
            X.11F r8 = X.C222713q.A00(r0)
            java.lang.String r5 = " parentKeyId="
            if (r6 == 0) goto L_0x011b
            if (r9 == 0) goto L_0x0121
            X.11F r0 = r9.A00
            if (r0 == 0) goto L_0x011d
            boolean r0 = r3.contains(r9)
            if (r0 == 0) goto L_0x004c
            java.lang.String r2 = r9.A01
            X.AnonymousClass00C.A07(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessageAddOnOrphanResolver/resolveOrphanedMessageAddOns/no parent orphanId="
            r1.append(r0)
            r1.append(r6)
            X.C36321k7.A1R(r5, r2, r1)
            goto L_0x000f
        L_0x004c:
            r2 = r17
            X.1A1 r1 = r2.A04
            X.3T1 r7 = r1.A03(r9)
            if (r7 != 0) goto L_0x0071
            X.1Jg r0 = r2.A00
            android.database.Cursor r5 = r0.A00(r9)
            if (r5 == 0) goto L_0x006d
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0139 }
            if (r0 == 0) goto L_0x0068
            X.3T1 r7 = r1.A00(r5)     // Catch:{ all -> 0x0139 }
        L_0x0068:
            r5.close()
            if (r7 != 0) goto L_0x0071
        L_0x006d:
            r3.add(r9)
            goto L_0x000f
        L_0x0071:
            X.1Je r5 = r2.A01
            long r0 = r7.A1N
            byte[] r11 = r5.A01(r0)
            X.3Qa r15 = r10.A05
            com.whatsapp.jid.Jid r0 = r10.A04
            X.11F r12 = X.C222713q.A00(r0)
            long r0 = r10.A02
            byte[] r5 = r10.A08
            byte[] r14 = r10.A09
            java.lang.String r10 = "MessageAddOnOrphanResolver/buildFMessageAddOn/failed to parse orphan message"
            r13 = 0
            if (r5 != 0) goto L_0x0093
            java.lang.String r0 = "MessageAddOnOrphanResolver/buildFMessageAddOn/Orphan data is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x000f
        L_0x0093:
            X.8SX r5 = X.AnonymousClass8SX.A0i(r5)     // Catch:{ 186 -> 0x0115 }
            X.AnonymousClass00C.A0B(r5)     // Catch:{ 186 -> 0x0115 }
            if (r14 == 0) goto L_0x00ad
            X.8QE r13 = X.AnonymousClass8QE.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x00a5 }
            X.8Hz r13 = X.C170918Hz.A08(r13, r14)     // Catch:{ 186 -> 0x00a5 }
            X.8QE r13 = (X.AnonymousClass8QE) r13     // Catch:{ 186 -> 0x00a5 }
            goto L_0x00ad
        L_0x00a5:
            r1 = move-exception
            java.lang.String r0 = "MessageAddOnOrphanResolver/buildFMessageAddOn/failed to parse orphan stanza data"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x000f
        L_0x00ad:
            X.9T0 r5 = X.C1899296d.A00(r5, r15, r0)
            r5.A04 = r12
            if (r13 == 0) goto L_0x00bf
            int r0 = r13.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00bf
            int r0 = r13.editVersion_
            r5.A01 = r0
        L_0x00bf:
            X.0xh r1 = r2.A03     // Catch:{  }
            X.9YL r0 = r5.A00()     // Catch:{  }
            X.3T1 r5 = r1.A00(r0)     // Catch:{  }
            boolean r0 = r5 instanceof X.AnonymousClass2bM     // Catch:{  }
            if (r0 == 0) goto L_0x000f
            X.2bM r5 = (X.AnonymousClass2bM) r5     // Catch:{  }
            if (r5 == 0) goto L_0x000f
            r5.A0q(r12)
            X.9Vv r0 = new X.9Vv
            r0.<init>(r8, r9)
            r5.A04 = r0
            if (r11 == 0) goto L_0x00df
            r5.A1b = r11
        L_0x00df:
            boolean r0 = r7 instanceof X.AnonymousClass2bK
            if (r0 == 0) goto L_0x00e9
            boolean r0 = r5 instanceof X.C180858mX
            if (r0 == 0) goto L_0x00e9
            goto L_0x000f
        L_0x00e9:
            boolean r0 = r7 instanceof X.C46732ba
            if (r0 == 0) goto L_0x00f3
            X.9Vv r0 = X.C195759Vv.A00(r7)
            r5.A04 = r0
        L_0x00f3:
            X.1Jd r2 = r2.A02
            r0 = 0
            int r1 = X.C26171Jd.A00(r2, r5, r0)
            boolean r0 = X.C65733Tg.A02(r1)
            if (r0 != 0) goto L_0x0103
            r0 = 5
            if (r1 != r0) goto L_0x0106
        L_0x0103:
            r4.add(r6)
        L_0x0106:
            r0 = 8
            if (r1 == r0) goto L_0x0110
            r0 = 9
            if (r1 == r0) goto L_0x0110
            goto L_0x000f
        L_0x0110:
            r2.A0K(r5)
            goto L_0x000f
        L_0x0115:
            r0 = move-exception
            com.whatsapp.util.Log.e(r10, r0)
            goto L_0x000f
        L_0x011b:
            if (r9 == 0) goto L_0x0121
        L_0x011d:
            java.lang.String r2 = r9.A01
            if (r2 != 0) goto L_0x0123
        L_0x0121:
            java.lang.String r2 = ""
        L_0x0123:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessageAddOnOrphanResolver/resolveOrphanedMessageAddOns/invalid orphan orphanId="
            r1.append(r0)
            r1.append(r6)
            X.C36321k7.A1R(r5, r2, r1)
            if (r6 == 0) goto L_0x000f
            r4.add(r6)
            goto L_0x000f
        L_0x0139:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x013b }
        L_0x013b:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175668ar.A04(java.util.List, java.util.Set):void");
    }

    public C175668ar(C26201Jg r2, C26181Je r3, C26171Jd r4, C25301Ft r5, C20520xh r6, AnonymousClass1A1 r7) {
        C36321k7.A1B(r7, r5, r3, r4, r2);
        AnonymousClass00C.A0D(r6, 6);
        this.A04 = r7;
        this.A05 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r6;
    }
}
