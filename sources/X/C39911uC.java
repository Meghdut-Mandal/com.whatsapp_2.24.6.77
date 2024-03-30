package X;

import com.whatsapp.event.EventsViewModel$1;
import java.util.List;

/* renamed from: X.1uC  reason: invalid class name and case insensitive filesystem */
public final class C39911uC extends AnonymousClass04R {
    public final AnonymousClass1LV A00;
    public final C19630wG A01;
    public final C220412q A02;
    public final C29541Xa A03;
    public final AnonymousClass11F A04;
    public final C005502l A05;
    public final AnonymousClass05K A06;
    public final AnonymousClass191 A07;
    public final AnonymousClass16J A08;
    public final AnonymousClass05L A09;

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a6, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C39911uC r14) {
        /*
            X.12q r1 = r14.A02
            X.11F r3 = r14.A04
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.AnonymousClass00C.A0E(r3, r0)
            r2 = r3
            X.147 r2 = (X.AnonymousClass147) r2
            int r1 = r1.A05(r2)
            r0 = 1
            if (r1 != r0) goto L_0x00ac
            X.1LV r0 = r14.A00
            java.util.HashSet r0 = r0.A04(r2)
            X.1Xa r10 = r14.A03
            java.util.ArrayList r6 = X.C36321k7.A0J(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0023:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002d
            X.AnonymousClass3QK.A00(r6, r1)
            goto L_0x0023
        L_0x002d:
            X.1Ei r5 = r10.A02
            int r4 = r6.size()
            java.lang.String[] r3 = new java.lang.String[r4]
            r2 = 0
        L_0x0036:
            if (r2 >= r4) goto L_0x0046
            X.163 r1 = r5.A00
            java.lang.Object r0 = r6.get(r2)
            X.11F r0 = (X.AnonymousClass11F) r0
            X.C36331k8.A19(r1, r0, r3, r2)
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0046:
            r0 = 975(0x3cf, float:1.366E-42)
            X.72Z r1 = new X.72Z
            r1.<init>(r3, r0)
            X.12P r0 = r5.A02
            X.1M0 r4 = r0.get()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01a3 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x01a3 }
        L_0x005b:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x01a3 }
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x01a3 }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x01a3 }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x01a3 }
            int r1 = r6.size()     // Catch:{ all -> 0x01a3 }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x01a3 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x01a3 }
            java.lang.String r0 = ","
            java.lang.String r2 = X.C36381kD.A0x(r0, r1)     // Catch:{ all -> 0x01a3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01a3 }
            java.lang.String r0 = "\n        SELECT DISTINCT message_row_id\n        FROM message_event\n        WHERE\n            chat_row_id IN ("
            r1.append(r0)     // Catch:{ all -> 0x01a3 }
            r1.append(r2)     // Catch:{ all -> 0x01a3 }
            java.lang.String r0 = ")\n        ORDER BY start_time\n        DESC\n        LIMIT 1000\n        "
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x01a3 }
            java.lang.String r1 = X.AnonymousClass091.A01(r0)     // Catch:{ all -> 0x01a3 }
            java.lang.String r0 = "GET_ALL_EVENTS_IN_CHATS_QUERY_ID"
            android.database.Cursor r2 = r3.A09(r1, r0, r7)     // Catch:{ all -> 0x01a3 }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x019c }
            X.C24931Ei.A00(r2, r5)     // Catch:{ all -> 0x019c }
            if (r2 == 0) goto L_0x005b
            r2.close()     // Catch:{ all -> 0x01a3 }
            goto L_0x005b
        L_0x00a4:
            r4.close()
            java.util.ArrayList r13 = X.C29541Xa.A00(r10, r5)
            goto L_0x00e4
        L_0x00ac:
            X.1Xa r10 = r14.A03
            X.1Ei r4 = r10.A02
            r2 = 0
            X.163 r0 = r4.A00
            long r0 = r0.A08(r3)
            java.lang.String[] r3 = X.C36441kJ.A1R()
            X.C36351kA.A1V(r3, r2, r0)
            X.12P r0 = r4.A02
            X.1M0 r4 = r0.get()
            X.14e r2 = r4.A02     // Catch:{ all -> 0x01a3 }
            java.lang.String r1 = "SELECT message_row_id\nFROM message_event\nWHERE\n    chat_row_id = ?\nORDER BY start_time\nDESC\nLIMIT 1000"
            java.lang.String r0 = "GET_ALL_EVENTS_IN_CHAT_QUERY_ID"
            android.database.Cursor r2 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x01a3 }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x019c }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x019c }
            X.C24931Ei.A00(r2, r0)     // Catch:{ all -> 0x019c }
            if (r2 == 0) goto L_0x00dd
            r2.close()     // Catch:{ all -> 0x01a3 }
        L_0x00dd:
            r4.close()
            java.util.ArrayList r13 = X.C29541Xa.A00(r10, r0)
        L_0x00e4:
            X.05L r9 = r14.A09
        L_0x00e6:
            java.lang.Object r8 = r9.getValue()
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r13.iterator()
        L_0x00fa:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0118
            java.lang.Object r1 = r2.next()
            X.2bT r1 = (X.AnonymousClass2bT) r1
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0114
            boolean r0 = r10.A04(r1)
            if (r0 != 0) goto L_0x0114
            r3.add(r1)
            goto L_0x00fa
        L_0x0114:
            r4.add(r1)
            goto L_0x00fa
        L_0x0118:
            java.util.List r0 = X.C007103b.A0W(r3)
            java.util.Iterator r5 = r0.iterator()
        L_0x0120:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0141
            java.lang.Object r3 = r5.next()
            X.2bT r3 = (X.AnonymousClass2bT) r3
            X.2nx r2 = X.C51522nx.UPCOMING
            X.2bd r0 = r10.A01(r3)
            if (r0 == 0) goto L_0x013f
            X.2pC r1 = r0.A01
        L_0x0136:
            X.2MK r0 = new X.2MK
            r0.<init>(r2, r3, r1)
            r7.add(r0)
            goto L_0x0120
        L_0x013f:
            r1 = 0
            goto L_0x0136
        L_0x0141:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x018a
            X.0wG r11 = r14.A01
            r0 = 2131887741(0x7f12067d, float:1.9410098E38)
            java.lang.String r0 = X.C36371kC.A0v(r11, r0)
            X.2MJ r6 = new X.2MJ
            r6.<init>(r0)
            r7.add(r6)
            java.util.Iterator r12 = r4.iterator()
            r5 = 0
            r4 = 0
        L_0x015e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x017f
            java.lang.Object r3 = r12.next()
            X.2bT r3 = (X.AnonymousClass2bT) r3
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x017b
            X.2nx r2 = X.C51522nx.CANCELED
            r5 = 1
        L_0x0171:
            r1 = 0
            X.2MK r0 = new X.2MK
            r0.<init>(r2, r3, r1)
            r7.add(r0)
            goto L_0x015e
        L_0x017b:
            X.2nx r2 = X.C51522nx.PAST
            r4 = 1
            goto L_0x0171
        L_0x017f:
            if (r5 != 0) goto L_0x0196
            r0 = 2131887740(0x7f12067c, float:1.9410096E38)
        L_0x0184:
            java.lang.String r0 = X.C36371kC.A0v(r11, r0)
            r6.A00 = r0
        L_0x018a:
            X.3Pm r0 = new X.3Pm
            r0.<init>(r7)
            boolean r0 = r9.B3B(r8, r0)
            if (r0 == 0) goto L_0x00e6
            return
        L_0x0196:
            if (r4 != 0) goto L_0x018a
            r0 = 2131887733(0x7f120675, float:1.9410081E38)
            goto L_0x0184
        L_0x019c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x019e }
        L_0x019e:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x01a3 }
            throw r0     // Catch:{ all -> 0x01a3 }
        L_0x01a3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01a5 }
        L_0x01a5:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39911uC.A01(X.1uC):void");
    }

    public void A0R() {
        this.A08.unregisterObserver(this.A07);
    }

    public C39911uC(AnonymousClass1LV r5, C19630wG r6, C220412q r7, AnonymousClass16J r8, C29541Xa r9, AnonymousClass11F r10, C005502l r11) {
        C36321k7.A1B(r6, r7, r8, r9, r5);
        AnonymousClass00C.A0D(r11, 6);
        this.A01 = r6;
        this.A02 = r7;
        this.A08 = r8;
        this.A03 = r9;
        this.A00 = r5;
        this.A05 = r11;
        this.A04 = r10;
        AnonymousClass05N r0 = new AnonymousClass05N(new C64803Pm((List) null));
        this.A09 = r0;
        this.A06 = r0;
        C90394a5 A002 = C90394a5.A00(this, 18);
        this.A07 = A002;
        C36381kD.A1R(r11, new EventsViewModel$1(this, (C023509x) null), C109325Xd.A00(this));
        r8.registerObserver(A002);
    }
}
