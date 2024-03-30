package X;

import java.lang.ref.WeakReference;

/* renamed from: X.2k7  reason: invalid class name and case insensitive filesystem */
public abstract class C50052k7 extends C132446Tt {
    public final C02680Bk A00 = new C02680Bk();
    public final AnonymousClass17Y A01;
    public final AnonymousClass3D9 A02;
    public final AnonymousClass34X A03;
    public final C64613Or A04;
    public final AnonymousClass1DF A05;
    public final AnonymousClass1NO A06;
    public final C29541Xa A07;
    public final AnonymousClass11F A08;
    public final AnonymousClass1EV A09;
    public final AnonymousClass1EU A0A;
    public final WeakReference A0B;

    public void A09() {
        this.A00.A03();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d6, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d9, code lost:
        throw r0;
     */
    /* renamed from: A0G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void A08(java.lang.Void... r12) {
        /*
            r11 = this;
            X.4c6 r7 = r11.A02
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L_0x003e
            X.1DF r4 = r11.A05
            X.11F r2 = r11.A08
            r1 = 0
            X.3M7 r0 = new X.3M7
            r0.<init>(r11, r1)
            r3 = 1
            int r0 = r4.A01(r0, r2, r3)
            if (r0 > 0) goto L_0x002c
            X.3Or r0 = r11.A04
            X.0Bk r1 = r11.A00
            int r0 = r0.A01(r1, r2)
            if (r0 > 0) goto L_0x002c
            X.3D9 r0 = r11.A02
            int r0 = r0.A00(r1, r2)
            if (r0 > 0) goto L_0x002c
            r3 = 0
        L_0x002c:
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L_0x003e
            X.17Y r2 = r11.A01
            r1 = 21
            X.75B r0 = new X.75B
            r0.<init>((int) r1, (java.lang.Object) r11, (boolean) r3)
            r2.A0H(r0)
        L_0x003e:
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L_0x0067
            X.1DF r4 = r11.A05
            X.11F r3 = r11.A08
            r0 = 0
            X.3M7 r2 = new X.3M7
            r2.<init>(r11, r0)
            r1 = 12
            r0 = 1
            java.util.ArrayList r3 = r4.A0E(r2, r3, r1, r0)
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L_0x0067
            X.17Y r2 = r11.A01
            r1 = 35
            X.74i r0 = new X.74i
            r0.<init>(r11, r3, r1)
            r2.A0H(r0)
        L_0x0067:
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L_0x0080
            X.1NO r1 = r11.A06
            X.11F r0 = r11.A08
            long r2 = r1.A01(r0)
            X.17Y r4 = r11.A01
            r1 = 6
            X.3vB r0 = new X.3vB
            r0.<init>(r11, r2, r1)
            r4.A0H(r0)
        L_0x0080:
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L_0x00df
            X.34X r8 = r11.A03
            X.11F r6 = r11.A08
            X.12P r0 = r8.A01
            X.1M0 r5 = r0.get()
            X.14e r4 = r5.A02     // Catch:{ all -> 0x00cc }
            java.lang.String r3 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND _id IN (SELECT message_row_id FROM message_ephemeral WHERE keep_in_chat = 1)"
            java.lang.String[] r2 = X.C36441kJ.A1R()     // Catch:{ all -> 0x00cc }
            r1 = 0
            X.163 r0 = r8.A00     // Catch:{ all -> 0x00cc }
            X.C36331k8.A19(r0, r6, r2, r1)     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "GET_KEPT_MESSAGE_COUNT_FOR_JID_SQL"
            android.database.Cursor r4 = r4.A09(r3, r0, r2)     // Catch:{ all -> 0x00cc }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "count"
            long r2 = X.C36351kA.A07(r4, r0)     // Catch:{ all -> 0x00c0 }
            goto L_0x00bc
        L_0x00b1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "msgstore/countKeptMessages/db no message for "
            X.C36321k7.A1K(r6, r0, r1)     // Catch:{ all -> 0x00c0 }
            r2 = 0
        L_0x00bc:
            r4.close()     // Catch:{ all -> 0x00cc }
            goto L_0x00d1
        L_0x00c0:
            r1 = move-exception
            if (r4 == 0) goto L_0x00cb
            r4.close()     // Catch:{ all -> 0x00c7 }
            goto L_0x00cb
        L_0x00c7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00cc }
        L_0x00cb:
            throw r1     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0200 }
            throw r1
        L_0x00d1:
            r5.close()
            X.17Y r4 = r11.A01
            r1 = 4
            X.3vB r0 = new X.3vB
            r0.<init>(r11, r2, r1)
            r4.A0H(r0)
        L_0x00df:
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L_0x0110
            X.1EV r0 = r11.A09
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0110
            X.1EU r0 = r11.A0A
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r9 = r0.A05
            X.11F r8 = r11.A08
            android.util.Pair r10 = X.C24881Ed.A05(r9, r8)
            r1 = 0
            if (r10 != 0) goto L_0x0164
            X.1Dc r3 = r9.A04
            java.lang.String r0 = "PaymentTransactionStore/countAllTransactionsForChat/null selection"
            r3.A05(r0)
        L_0x0105:
            X.17Y r4 = r11.A01
            r3 = 5
            X.3vB r0 = new X.3vB
            r0.<init>(r11, r1, r3)
            r4.A0H(r0)
        L_0x0110:
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L_0x01ed
            X.1Xa r5 = r11.A07
            X.11F r4 = r11.A08
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            boolean r0 = X.AnonymousClass143.A0G(r4)
            if (r0 == 0) goto L_0x01ed
            X.12q r1 = r5.A01
            X.147 r0 = X.C65533Sl.A01(r4)
            int r1 = r1.A05(r0)
            r0 = 2
            if (r1 == r0) goto L_0x0136
            r0 = 6
            if (r1 == r0) goto L_0x0136
            if (r1 != 0) goto L_0x01ed
        L_0x0136:
            X.0yC r1 = r5.A03
            r0 = 5563(0x15bb, float:7.795E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01ed
            r7 = 0
            X.1Ei r6 = r5.A02
            X.0wo r0 = r5.A00
            long r2 = X.C19970wo.A00(r0)
            X.163 r0 = r6.A00
            long r0 = r0.A08(r4)
            java.lang.String[] r4 = X.C36441kJ.A1S()
            X.C36351kA.A1V(r4, r7, r0)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0 = 1
            r4[r0] = r1
            X.12P r0 = r6.A02
            X.1M0 r3 = r0.get()
            goto L_0x01b2
        L_0x0164:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SELECT COUNT(*) as count FROM pay_transaction WHERE "
            r3.append(r0)
            java.lang.Object r0 = r10.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = X.AnonymousClass000.A0q(r0, r3)
            X.12P r0 = r9.A03
            X.1M0 r6 = r0.get()
            X.14e r4 = r6.A02     // Catch:{ all -> 0x01fb }
            java.lang.Object r3 = r10.second     // Catch:{ all -> 0x01fb }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "COUNT_TRANSACTIONS_FOR_JID_SQL"
            android.database.Cursor r5 = r4.A09(r5, r0, r3)     // Catch:{ all -> 0x01fb }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x0194
            java.lang.String r0 = "count"
            long r1 = X.C36351kA.A07(r5, r0)     // Catch:{ all -> 0x01ef }
            goto L_0x01aa
        L_0x0194:
            X.1Dc r4 = r9.A04     // Catch:{ all -> 0x01ef }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = "PaymentTransactionStore/countAllTransactionsForChat/db no message for "
            r3.append(r0)     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r3)     // Catch:{ all -> 0x01ef }
            r4.A06(r0)     // Catch:{ all -> 0x01ef }
        L_0x01aa:
            r5.close()     // Catch:{ all -> 0x01fb }
            r6.close()
            goto L_0x0105
        L_0x01b2:
            X.14e r2 = r3.A02     // Catch:{ all -> 0x01d3 }
            java.lang.String r1 = "SELECT message_row_id\nFROM message_event\nWHERE\n    chat_row_id = ?\n    AND\n    start_time > ?\n    AND\n    is_canceled = 0\nORDER BY start_time\nASC\nLIMIT 1000"
            java.lang.String r0 = "GET_ALL_UPCOMING_EVENTS_IN_CHAT_QUERY_ID"
            android.database.Cursor r2 = r2.A09(r1, r0, r4)     // Catch:{ all -> 0x01d3 }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x01cc }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01cc }
            X.C24931Ei.A00(r2, r0)     // Catch:{ all -> 0x01cc }
            if (r2 == 0) goto L_0x01da
            r2.close()     // Catch:{ all -> 0x01d3 }
            goto L_0x01da
        L_0x01cc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01ce }
        L_0x01ce:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x01d3 }
            throw r0     // Catch:{ all -> 0x01d3 }
        L_0x01d3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01d5 }
        L_0x01d5:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x01da:
            r3.close()
            java.util.ArrayList r3 = X.C29541Xa.A00(r5, r0)
            X.17Y r2 = r11.A01
            r1 = 36
            X.74i r0 = new X.74i
            r0.<init>(r11, r3, r1)
            r2.A0H(r0)
        L_0x01ed:
            r0 = 0
            return r0
        L_0x01ef:
            r1 = move-exception
            if (r5 == 0) goto L_0x01fa
            r5.close()     // Catch:{ all -> 0x01f6 }
            goto L_0x01fa
        L_0x01f6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01fb }
        L_0x01fa:
            throw r1     // Catch:{ all -> 0x01fb }
        L_0x01fb:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0200 }
            throw r1
        L_0x0200:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50052k7.A08(java.lang.Void[]):java.lang.Void");
    }

    public C50052k7(AnonymousClass17Y r2, C39801to r3, AnonymousClass3D9 r4, AnonymousClass34X r5, C64613Or r6, AnonymousClass1DF r7, AnonymousClass1NO r8, C29541Xa r9, AnonymousClass11F r10, AnonymousClass1EV r11, AnonymousClass1EU r12) {
        this.A01 = r2;
        this.A0A = r12;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A07 = r9;
        this.A06 = r8;
        this.A02 = r4;
        this.A09 = r11;
        this.A0B = AnonymousClass001.A0F(r3);
        this.A08 = r10;
    }
}
