package X;

import java.util.List;

/* renamed from: X.8rF  reason: invalid class name and case insensitive filesystem */
public class C183718rF extends C132446Tt {
    public final C18820ts A00;
    public final C20650xu A01;
    public final AnonymousClass1EU A02;
    public final C193889Nh A03;
    public final AnonymousClass9Q0 A04;
    public final C1276068y A05;
    public final AnonymousClass1FR A06;
    public final String A07;
    public final boolean A08 = true;
    public final boolean A09;

    public C183718rF(C18820ts r2, C20650xu r3, AnonymousClass1EU r4, C193889Nh r5, AnonymousClass9Q0 r6, C1276068y r7, AnonymousClass1FR r8, String str, boolean z) {
        this.A07 = str;
        this.A09 = z;
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A05 = r7;
        this.A06 = r8;
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r18) {
        /*
            r17 = this;
            r3 = r17
            boolean r0 = r3.A09
            r5 = 1
            X.9Nh r6 = r3.A03
            if (r0 == 0) goto L_0x004e
            r6.A05 = r5
        L_0x000b:
            X.0ts r0 = r3.A00
            X.1S3 r2 = new X.1S3
            r2.<init>(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A07 = r0
            r2.A05 = r6
            r0 = 100
            r2.A01 = r0
            java.lang.String r4 = r3.A07
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0029
            r2.A04(r4)
        L_0x0029:
            X.0xu r1 = r3.A01
            r0 = 0
            android.util.Pair r0 = r1.A0A(r0, r2, r0)
            java.lang.Object r0 = r0.second
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r0.iterator()
        L_0x003c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0051
            X.3T1 r0 = X.C36391kE.A0l(r1)
            X.9lY r0 = r0.A0M
            if (r0 == 0) goto L_0x003c
            r2.add(r0)
            goto L_0x003c
        L_0x004e:
            r6.A04 = r5
            goto L_0x000b
        L_0x0051:
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x019b
            X.1EU r0 = r3.A02
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r7 = r0.A05
            android.util.Pair r6 = X.C24881Ed.A06(r7, r6)
            java.lang.String[] r1 = new java.lang.String[r5]
            r0 = 12
            java.lang.String r11 = java.lang.Integer.toString(r0)
            r9 = 0
            r1[r9] = r11
            java.lang.String r0 = "(status!=? AND interop_id IS NULL AND (metadata LIKE '%\"messageDeleted\":true%' ))"
            android.util.Pair r8 = android.util.Pair.create(r1, r0)
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            java.lang.String r10 = " )"
            java.lang.String[] r5 = new java.lang.String[r5]
            r5[r9] = r11
            java.lang.String r0 = "( status!=? AND interop_id IS NOT NULL )"
            android.util.Pair r9 = android.util.Pair.create(r5, r0)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "(( "
            r5.append(r0)
            java.lang.Object r0 = r9.second
            java.lang.String r0 = (java.lang.String) r0
            r5.append(r0)
            java.lang.String r0 = " OR "
            r5.append(r0)
            java.lang.Object r0 = r8.second
            java.lang.String r0 = (java.lang.String) r0
            r5.append(r0)
            java.lang.String r0 = " ) AND "
            r5.append(r0)
            java.lang.Object r0 = r6.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r11 = X.AnonymousClass000.A0p(r0, r10, r5)
            java.lang.Object r0 = r9.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            com.whatsapp.jid.UserJid r5 = X.C24881Ed.A0A(r7)
            X.12j r0 = r7.A02
            r0.A07(r5)
            r5.getRawString()
            java.lang.Object r0 = r8.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            java.lang.Object r0 = r6.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            java.lang.String r9 = "pay_transaction"
            java.lang.String[] r10 = X.C24881Ed.A0A
            java.lang.String r16 = "readMessagelessPayments/QUERY_PAY_TRANSACTION"
            X.12P r0 = r7.A03     // Catch:{ Exception -> 0x012b }
            X.1M0 r5 = r0.get()     // Catch:{ Exception -> 0x012b }
            X.14e r8 = r5.A02     // Catch:{ all -> 0x0121 }
            r0 = 0
            java.lang.String[] r12 = X.C36371kC.A1b(r1, r0)     // Catch:{ all -> 0x0121 }
            r13 = 0
            java.lang.String r14 = "init_timestamp DESC"
            r15 = r13
            android.database.Cursor r9 = r8.A0A(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0121 }
            if (r9 == 0) goto L_0x011d
            java.lang.String r0 = "readMessagelessPayments"
            java.util.ArrayList r6 = X.C24881Ed.A0B(r9, r7, r0)     // Catch:{ all -> 0x0113 }
            X.1Dc r8 = r7.A04     // Catch:{ all -> 0x0113 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "readMessagelessPayments returned: "
            X.C36341k9.A1N(r0, r1, r6)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0113 }
            r8.A07(r0)     // Catch:{ all -> 0x0113 }
            r9.close()     // Catch:{ all -> 0x0121 }
            r5.close()     // Catch:{ Exception -> 0x012b }
            goto L_0x0137
        L_0x0113:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0118 }
            goto L_0x011c
        L_0x0118:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0121 }
        L_0x011c:
            throw r1     // Catch:{ all -> 0x0121 }
        L_0x011d:
            r5.close()     // Catch:{ Exception -> 0x012b }
            goto L_0x0133
        L_0x0121:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0126 }
            goto L_0x012a
        L_0x0126:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x012b }
        L_0x012a:
            throw r1     // Catch:{ Exception -> 0x012b }
        L_0x012b:
            r5 = move-exception
            X.1Dc r1 = r7.A04
            java.lang.String r0 = "PaymentTransactionStore/readMessagelessPayments "
            r1.A0A(r0, r5)
        L_0x0133:
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
        L_0x0137:
            java.util.Iterator r8 = r6.iterator()
        L_0x013b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0190
            java.lang.Object r5 = r8.next()
            X.9lY r5 = (X.C202319lY) r5
            X.8av r7 = r5.A0A
            X.C18740tg.A06(r7)
            boolean r1 = r5.A0K()
            boolean r0 = r5.A0Q
            r1 = r1 ^ r0
            if (r1 == 0) goto L_0x018b
            java.lang.String r1 = r7.A0F()
        L_0x0159:
            X.C18740tg.A06(r1)
            X.16X r0 = r5.A08
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0171
            boolean r0 = r1.contains(r4)
            if (r0 == 0) goto L_0x0174
        L_0x0171:
            r2.add(r5)
        L_0x0174:
            boolean r0 = r5.A0P
            if (r0 != 0) goto L_0x013b
            X.1FR r1 = r3.A06
            r0 = 0
            java.lang.String r0 = r1.A0W(r5, r0)
            if (r0 == 0) goto L_0x013b
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x013b
            r2.add(r5)
            goto L_0x013b
        L_0x018b:
            java.lang.String r1 = r7.A0G()
            goto L_0x0159
        L_0x0190:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x019b
            X.AXd r0 = X.C21707AXd.A00
            java.util.Collections.sort(r2, r0)
        L_0x019b:
            X.68y r0 = r3.A05
            java.util.ArrayList r1 = r0.A02(r2)
            X.00I r0 = new X.00I
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183718rF.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass00I r6 = (AnonymousClass00I) obj;
        AnonymousClass9Q0 r4 = this.A04;
        String str = this.A07;
        C193889Nh r2 = this.A03;
        Object obj2 = r6.A00;
        C18740tg.A06(obj2);
        Object obj3 = r6.A01;
        C18740tg.A06(obj3);
        r4.A00(r2, str, (List) obj2, (List) obj3);
    }
}
