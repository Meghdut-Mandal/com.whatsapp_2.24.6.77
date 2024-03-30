package X;

import com.whatsapp.newsletter.viewmodel.GetRecommendedNewslettersUseCase$receivedDirectoryNewsletters$1$1;
import java.util.List;

/* renamed from: X.3nz  reason: invalid class name and case insensitive filesystem */
public final class C75903nz implements AnonymousClass4TN {
    public AnonymousClass4PA A00;
    public AnonymousClass4RL A01;
    public AnonymousClass040 A02;
    public final AnonymousClass16D A03;
    public final C30131Zi A04;
    public final C005502l A05;

    public /* synthetic */ void BWe(C21854Abe abe) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        if ((!r8.A00(r57.A00(), X.C36441kJ.A0B(r14, 4309))) == false) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0286  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r58 = this;
            r12 = r58
            X.4PA r0 = r12.A00
            if (r0 == 0) goto L_0x0009
            r0.cancel()
        L_0x0009:
            X.1Zi r7 = r12.A04
            r15 = 0
            X.1GQ r0 = r7.A0G
            boolean r0 = X.C36391kE.A1Z(r0)
            r10 = 0
            if (r0 == 0) goto L_0x009c
            X.1ZO r2 = r7.A0J
            X.1ZQ r8 = r2.A04
            X.1ZS r0 = r2.A03
            r57 = r0
            java.lang.String r3 = r57.A00()
            X.0yC r14 = r2.A02
            r0 = 4271(0x10af, float:5.985E-42)
            long r0 = X.C36441kJ.A0B(r14, r0)
            boolean r0 = r8.A00(r3, r0)
            if (r0 == 0) goto L_0x009f
            java.util.List r5 = r2.A05
            monitor-enter(r5)
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x029a }
            r0 = 1800000(0x1b7740, double:8.89318E-318)
            long r16 = r16 - r0
            long r0 = r2.A00     // Catch:{ all -> 0x029a }
            int r3 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x0048
            X.09w r4 = X.C023409w.A00     // Catch:{ all -> 0x029a }
        L_0x0043:
            java.util.List r1 = r2.A00(r4)     // Catch:{ all -> 0x029a }
            goto L_0x006e
        L_0x0048:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x029a }
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x029a }
        L_0x0050:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x029a }
            if (r0 == 0) goto L_0x0043
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x029a }
            X.1Uw r1 = (X.C28981Uw) r1     // Catch:{ all -> 0x029a }
            X.12q r0 = r2.A01     // Catch:{ all -> 0x029a }
            X.3Qp r1 = r0.A09(r1, r15)     // Catch:{ all -> 0x029a }
            boolean r0 = r1 instanceof X.C44072La     // Catch:{ all -> 0x029a }
            if (r0 == 0) goto L_0x0050
            X.2La r1 = (X.C44072La) r1     // Catch:{ all -> 0x029a }
            if (r1 == 0) goto L_0x0050
            r4.add(r1)     // Catch:{ all -> 0x029a }
            goto L_0x0050
        L_0x006e:
            monitor-exit(r5)
            boolean r0 = X.C36401kF.A1a(r1)
            if (r0 == 0) goto L_0x00c5
            r1.size()
        L_0x0078:
            boolean r0 = X.C36401kF.A1a(r1)
            if (r0 == 0) goto L_0x009f
            X.17Y r4 = r7.A0A
            r3 = 24
            X.1jB r0 = new X.1jB
            r0.<init>(r12, r1, r3)
            r4.A0H(r0)
            java.lang.String r3 = r57.A00()
            r0 = 4309(0x10d5, float:6.038E-42)
            long r0 = X.C36441kJ.A0B(r14, r0)
            boolean r0 = r8.A00(r3, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x009f
        L_0x009c:
            r12.A00 = r10
            return
        L_0x009f:
            X.3ny r1 = new X.3ny
            r1.<init>(r2, r12)
            X.19A r0 = r7.A0F
            boolean r0 = r0.A0I()
            if (r0 != 0) goto L_0x00ba
            java.lang.String r0 = "NewsletterManager/getRecommendedNewsletters/not connected -> skipping"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.8fO r0 = new X.8fO
            r0.<init>()
            r1.BWe(r0)
            goto L_0x009c
        L_0x00ba:
            X.8fN r10 = new X.8fN
            r10.<init>(r1)
            X.164 r0 = r7.A0B
            r0.A01(r10)
            goto L_0x009c
        L_0x00c5:
            java.lang.String r9 = r57.A00()
            r0 = 4271(0x10af, float:5.985E-42)
            long r18 = X.C36441kJ.A0B(r14, r0)
            X.1ZP r6 = r8.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r9)
            java.lang.String r0 = "_timestamp"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.String r0 = r6.A00(r0)
            if (r0 == 0) goto L_0x01f9
            long r16 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            if (r0 == 0) goto L_0x01f9
            r3 = -1
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00fd
            X.0wo r0 = r8.A00
            long r3 = r0.A04()
            long r3 = r3 - r16
            int r0 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x01f9
        L_0x00fd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r9)
            java.lang.String r0 = "_data"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.String r3 = r6.A00(r0)
            if (r3 == 0) goto L_0x01f9
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01fc }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x01fc }
            r0.<init>(r3)     // Catch:{ all -> 0x01fc }
            X.0hr r19 = X.C63893Lv.A01(r0)     // Catch:{ all -> 0x01fc }
        L_0x011a:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x01fc }
            if (r0 == 0) goto L_0x0202
            java.lang.Object r0 = r19.next()     // Catch:{ all -> 0x01fc }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x01fc }
            X.3Ro r4 = X.C28981Uw.A03     // Catch:{ all -> 0x01fc }
            java.lang.String r3 = "jid"
            java.lang.String r3 = r0.optString(r3)     // Catch:{ all -> 0x01fc }
            X.1Uw r4 = r4.A01(r3)     // Catch:{ all -> 0x01fc }
            if (r4 == 0) goto L_0x011a
            X.3Qp r18 = new X.3Qp     // Catch:{ all -> 0x01fc }
            r3 = r18
            r3.<init>((X.AnonymousClass11F) r4)     // Catch:{ all -> 0x01fc }
            java.lang.String r3 = "name"
            java.lang.String r31 = r0.optString(r3)     // Catch:{ all -> 0x01fc }
            java.lang.String r3 = "name_id"
            long r42 = r0.getLong(r3)     // Catch:{ all -> 0x01fc }
            java.lang.String r3 = "desc"
            java.lang.String r32 = r0.optString(r3)     // Catch:{ all -> 0x01fc }
            java.lang.String r3 = "desc_id"
            long r44 = r0.getLong(r3)     // Catch:{ all -> 0x01fc }
            java.lang.String r3 = "pic"
            java.lang.String r33 = r0.optString(r3)     // Catch:{ all -> 0x01fc }
            java.lang.String r3 = "pic_id"
            long r46 = r0.getLong(r3)     // Catch:{ all -> 0x01fc }
            java.lang.String r3 = "pic_preview"
            java.lang.String r34 = r0.optString(r3)     // Catch:{ all -> 0x01fc }
            java.lang.String r3 = "pic_preview_id"
            long r48 = r0.getLong(r3)     // Catch:{ all -> 0x01fc }
            java.lang.String r3 = "verified"
            int r11 = r0.getInt(r3)     // Catch:{ all -> 0x01fc }
            X.2p1[] r6 = X.C52182p1.values()     // Catch:{ all -> 0x01fc }
            int r9 = r6.length     // Catch:{ all -> 0x01fc }
            r4 = 0
        L_0x0177:
            if (r4 >= r9) goto L_0x01f1
            r17 = r6[r4]     // Catch:{ all -> 0x01fc }
            r3 = r17
            int r3 = r3.value     // Catch:{ all -> 0x01fc }
            if (r3 != r11) goto L_0x0192
            java.lang.String r3 = "verification_source"
            int r11 = r0.optInt(r3)     // Catch:{ all -> 0x01fc }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01fc }
            X.2pA[] r4 = X.C52272pA.values()     // Catch:{ all -> 0x01fc }
            int r9 = r4.length     // Catch:{ all -> 0x01fc }
            r3 = 0
            goto L_0x0195
        L_0x0192:
            int r4 = r4 + 1
            goto L_0x0177
        L_0x0195:
            if (r3 >= r9) goto L_0x01a3
            r13 = r4[r3]     // Catch:{ all -> 0x01fc }
            int r6 = r13.value     // Catch:{ all -> 0x01fc }
            if (r16 == 0) goto L_0x01a0
            if (r6 != r11) goto L_0x01a0
            goto L_0x01a5
        L_0x01a0:
            int r3 = r3 + 1
            goto L_0x0195
        L_0x01a3:
            X.2pA r13 = X.C52272pA.UNKNOWN_VERIFICATION_SOURCE     // Catch:{ all -> 0x01fc }
        L_0x01a5:
            java.lang.String r3 = "membership"
            int r3 = r0.getInt(r3)     // Catch:{ all -> 0x01fc }
            X.2pL r23 = X.C54112sQ.A00(r3)     // Catch:{ all -> 0x01fc }
            java.lang.String r3 = "subscribers"
            long r52 = r0.getLong(r3)     // Catch:{ all -> 0x01fc }
            java.lang.String r3 = "creation"
            long r50 = r0.getLong(r3)     // Catch:{ all -> 0x01fc }
            java.lang.String r3 = "invite_code"
            java.lang.String r36 = r0.optString(r3)     // Catch:{ all -> 0x01fc }
            X.2oz r27 = X.C52162oz.PUBLIC     // Catch:{ all -> 0x01fc }
            X.2pB r28 = X.C52282pB.NOT_ENFORCED     // Catch:{ all -> 0x01fc }
            r40 = -1
            r39 = 1
            java.util.ArrayList r37 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01fc }
            X.2pM r25 = X.C52392pM.DEFAULT     // Catch:{ all -> 0x01fc }
            X.2pS r24 = X.C52452pS.DEFAULT     // Catch:{ all -> 0x01fc }
            X.2La r0 = new X.2La     // Catch:{ all -> 0x01fc }
            r30 = r10
            r35 = r10
            r38 = 0
            r54 = 1
            r55 = 0
            r56 = 0
            r20 = r0
            r21 = r10
            r22 = r18
            r26 = r13
            r29 = r17
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r44, r46, r48, r50, r52, r54, r55, r56)     // Catch:{ all -> 0x01fc }
            r1.add(r0)     // Catch:{ all -> 0x01fc }
            goto L_0x011a
        L_0x01f1:
            java.lang.String r1 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x01fc }
            r0.<init>(r1)     // Catch:{ all -> 0x01fc }
            throw r0     // Catch:{ all -> 0x01fc }
        L_0x01f9:
            X.09w r1 = X.C023409w.A00     // Catch:{ all -> 0x01fc }
            goto L_0x0202
        L_0x01fc:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x0202:
            boolean r4 = r1 instanceof X.AnonymousClass03N
            r0 = r4 ^ 1
            if (r0 == 0) goto L_0x0286
            java.util.List r1 = (java.util.List) r1
            r1.size()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r9 = r1.iterator()
        L_0x0215:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0232
            java.lang.Object r4 = r9.next()
            r0 = r4
            X.3Qp r0 = (X.C65073Qp) r0
            X.12q r3 = r2.A01
            X.11F r0 = r0.A06()
            X.3Qp r0 = r3.A09(r0, r15)
            if (r0 != 0) goto L_0x0215
            r6.add(r4)
            goto L_0x0215
        L_0x0232:
            r6.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x0239:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x024f
            java.lang.Object r4 = r6.next()
            X.3Qp r4 = (X.C65073Qp) r4
            X.12q r3 = r2.A01
            X.11F r0 = r4.A06()
            r3.A0I(r4, r0)
            goto L_0x0239
        L_0x024f:
            monitor-enter(r5)
            r1.size()     // Catch:{ all -> 0x029a }
            r5.clear()     // Catch:{ all -> 0x029a }
            r3 = 0
            r2.A00 = r3     // Catch:{ all -> 0x029a }
            java.util.ArrayList r4 = X.C36321k7.A0J(r1)     // Catch:{ all -> 0x029a }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x029a }
        L_0x0262:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x029a }
            if (r0 == 0) goto L_0x0276
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x029a }
            X.2La r0 = (X.C44072La) r0     // Catch:{ all -> 0x029a }
            X.1Uw r0 = r0.A0J()     // Catch:{ all -> 0x029a }
            r4.add(r0)     // Catch:{ all -> 0x029a }
            goto L_0x0262
        L_0x0276:
            r5.addAll(r4)     // Catch:{ all -> 0x029a }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x029a }
            r2.A00 = r3     // Catch:{ all -> 0x029a }
            monitor-exit(r5)
            java.util.List r1 = r2.A00(r1)
            goto L_0x0078
        L_0x0286:
            java.lang.Throwable r3 = X.AnonymousClass0AK.A00(r1)
            if (r3 == 0) goto L_0x0291
            java.lang.String r0 = "RecommendedCache Failed to deserialize"
            com.whatsapp.util.Log.e(r0, r3)
        L_0x0291:
            X.09w r0 = X.C023409w.A00
            if (r4 == 0) goto L_0x0296
            r1 = r0
        L_0x0296:
            java.util.List r1 = (java.util.List) r1
            goto L_0x0078
        L_0x029a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75903nz.A00():void");
    }

    public void Bmz(String str, List list) {
        AnonymousClass4RL r4 = this.A01;
        C36381kD.A1R(this.A05, new GetRecommendedNewslettersUseCase$receivedDirectoryNewsletters$1$1(r4, this, list, (C023509x) null), this.A02);
    }

    public C75903nz(AnonymousClass16D r2, C30131Zi r3, AnonymousClass4RL r4, C005502l r5, AnonymousClass040 r6) {
        C36321k7.A11(r3, r2, r5);
        AnonymousClass00C.A0D(r6, 5);
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = r5;
        this.A01 = r4;
        this.A02 = r6;
    }
}
