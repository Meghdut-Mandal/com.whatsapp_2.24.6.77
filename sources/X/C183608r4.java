package X;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import java.util.List;

/* renamed from: X.8r4  reason: invalid class name and case insensitive filesystem */
public final class C183608r4 extends C132446Tt {
    public final AnonymousClass16D A00;
    public final C24881Ed A01;
    public final AnonymousClass9IC A02;

    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map] */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x027f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0288, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x018c, code lost:
        if (r4 != null) goto L_0x018e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r24) {
        /*
            r23 = this;
            r6 = r23
            X.1Ed r1 = r6.A01
            r9 = 4
            r3 = 60
            java.util.ArrayList r2 = r1.A0N()
            X.00f r0 = X.C000400e.A0D()
            boolean r4 = X.C36411kG.A1a(r2)
            if (r4 == 0) goto L_0x01a5
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            X.16D r0 = r6.A00
            r0.A0n(r5)
            java.util.LinkedHashMap r0 = X.C36431kI.A1G()
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x0069
            java.util.HashMap r7 = X.AnonymousClass001.A0J()
            java.util.Iterator r6 = r5.iterator()
        L_0x0030:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x0046
            X.141 r5 = X.C36391kE.A0f(r6)
            X.11F r4 = r5.A0H
            if (r4 == 0) goto L_0x0030
            java.lang.String r4 = r4.getRawString()
            r7.put(r4, r5)
            goto L_0x0030
        L_0x0046:
            java.util.Iterator r6 = r2.iterator()
        L_0x004a:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x0069
            java.lang.Object r4 = r6.next()
            X.AUl r4 = (X.C21668AUl) r4
            com.whatsapp.jid.UserJid r5 = r4.A04
            java.lang.String r4 = X.C36381kD.A0w(r5)
            java.lang.Object r4 = r7.get(r4)
            if (r4 == 0) goto L_0x004a
            X.AnonymousClass00C.A0B(r5)
            r0.put(r5, r4)
            goto L_0x004a
        L_0x0069:
            boolean r4 = r0.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x01a5
            java.util.Set r4 = r0.keySet()
            r6 = 0
            java.util.ArrayList r11 = X.C90504aG.A0u(r4)
            monitor-enter(r1)
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01a2 }
            java.lang.String r4 = "status =? AND type=? AND receiver_jid_row_id IN ("
            r10.append(r4)     // Catch:{ all -> 0x01a2 }
            int r8 = r11.size()     // Catch:{ all -> 0x01a2 }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01a2 }
            r5 = 0
        L_0x008d:
            if (r5 >= r8) goto L_0x00a0
            java.lang.String r4 = "?"
            r7.append(r4)     // Catch:{ all -> 0x01a2 }
            int r4 = r8 + -1
            if (r5 == r4) goto L_0x009d
            java.lang.String r4 = ","
            r7.append(r4)     // Catch:{ all -> 0x01a2 }
        L_0x009d:
            int r5 = r5 + 1
            goto L_0x008d
        L_0x00a0:
            X.C36351kA.A1K(r7, r10)     // Catch:{ all -> 0x01a2 }
            java.lang.String r4 = ") AND "
            r10.append(r4)     // Catch:{ all -> 0x01a2 }
            java.lang.String r4 = "sender_jid_row_id"
            r10.append(r4)     // Catch:{ all -> 0x01a2 }
            java.lang.String r4 = " =?"
            java.lang.String r13 = X.AnonymousClass000.A0q(r4, r10)     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01a2 }
            r4 = 405(0x195, float:5.68E-43)
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x01a2 }
            r7.add(r4)     // Catch:{ all -> 0x01a2 }
            r4 = 1
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x01a2 }
            r7.add(r4)     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01a2 }
            java.util.Iterator r8 = r11.iterator()     // Catch:{ all -> 0x01a2 }
        L_0x00d0:
            boolean r4 = r8.hasNext()     // Catch:{ all -> 0x01a2 }
            if (r4 == 0) goto L_0x00ea
            java.lang.Object r5 = r8.next()     // Catch:{ all -> 0x01a2 }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x01a2 }
            X.12j r4 = r1.A02     // Catch:{ all -> 0x01a2 }
            long r4 = r4.A07(r5)     // Catch:{ all -> 0x01a2 }
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x01a2 }
            r10.add(r4)     // Catch:{ all -> 0x01a2 }
            goto L_0x00d0
        L_0x00ea:
            r7.addAll(r10)     // Catch:{ all -> 0x01a2 }
            com.whatsapp.jid.UserJid r5 = X.C24881Ed.A0A(r1)     // Catch:{ all -> 0x01a2 }
            X.12j r4 = r1.A02     // Catch:{ all -> 0x01a2 }
            long r4 = r4.A07(r5)     // Catch:{ all -> 0x01a2 }
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x01a2 }
            r7.add(r4)     // Catch:{ all -> 0x01a2 }
            java.lang.String[] r14 = X.C36371kC.A1b(r7, r6)     // Catch:{ all -> 0x01a2 }
            java.lang.String r4 = "readLatestSuccessfulP2PTransactionsForUsers/QUERY_SUCCESSFUL_TRANSACTIONS"
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0v(r4)     // Catch:{ all -> 0x01a2 }
            java.lang.String r4 = "/QUERY_PAY_TRANSACTION"
            java.lang.String r18 = X.AnonymousClass000.A0q(r4, r5)     // Catch:{ all -> 0x01a2 }
            java.lang.String[] r4 = X.C24881Ed.A0A     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r5 = X.C36351kA.A10(r4)     // Catch:{ all -> 0x01a2 }
            java.lang.String r4 = "MAX(init_timestamp)"
            r5.add(r4)     // Catch:{ all -> 0x01a2 }
            java.lang.String[] r12 = X.C36371kC.A1b(r5, r6)     // Catch:{ all -> 0x01a2 }
            X.12P r4 = r1.A03     // Catch:{ all -> 0x01a2 }
            X.1M0 r4 = r4.get()     // Catch:{ all -> 0x01a2 }
            X.14e r10 = r4.A02     // Catch:{ all -> 0x0198 }
            java.lang.String r11 = "pay_transaction"
            java.lang.String r15 = "receiver_jid_row_id"
            r17 = 0
            java.lang.String r16 = "init_timestamp DESC"
            android.database.Cursor r8 = r10.A0A(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0198 }
            if (r8 == 0) goto L_0x0158
            java.lang.String r5 = "readLatestSuccessfulP2PTransactionsForUsers"
            java.util.ArrayList r10 = X.C24881Ed.A0B(r8, r1, r5)     // Catch:{ all -> 0x014e }
            X.1Dc r7 = r1.A04     // Catch:{ all -> 0x014e }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x014e }
            java.lang.String r5 = "readLatestSuccessfulP2PTransactionsForUsers returned: "
            X.C36341k9.A1N(r5, r6, r10)     // Catch:{ all -> 0x014e }
            X.C165607th.A1E(r7, r6)     // Catch:{ all -> 0x014e }
            r8.close()     // Catch:{ all -> 0x0198 }
            r4.close()     // Catch:{ all -> 0x01a2 }
            goto L_0x015f
        L_0x014e:
            r2 = move-exception
            r8.close()     // Catch:{ all -> 0x0153 }
            goto L_0x0157
        L_0x0153:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ all -> 0x0198 }
        L_0x0157:
            throw r2     // Catch:{ all -> 0x0198 }
        L_0x0158:
            r4.close()     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01a2 }
        L_0x015f:
            monitor-exit(r1)
            java.util.Iterator r11 = r2.iterator()
        L_0x0164:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x01a5
            java.lang.Object r8 = r11.next()
            X.AUl r8 = (X.C21668AUl) r8
            com.whatsapp.jid.UserJid r7 = r8.A04
            java.util.Iterator r6 = r10.iterator()
        L_0x0176:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x0193
            java.lang.Object r5 = r6.next()
            X.9lY r5 = (X.C202319lY) r5
            com.whatsapp.jid.UserJid r4 = r5.A0D
            boolean r4 = X.AnonymousClass00C.A0J(r7, r4)
            if (r4 == 0) goto L_0x0176
            X.16X r4 = r5.A08
            if (r4 == 0) goto L_0x0193
        L_0x018e:
            monitor-enter(r8)
            r8.A02 = r4     // Catch:{ all -> 0x0195 }
            monitor-exit(r8)
            goto L_0x0164
        L_0x0193:
            r4 = 0
            goto L_0x018e
        L_0x0195:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0198:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x019d }
            goto L_0x01a1
        L_0x019d:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ all -> 0x01a2 }
        L_0x01a1:
            throw r2     // Catch:{ all -> 0x01a2 }
        L_0x01a2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x01a5:
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            long r10 = java.lang.System.currentTimeMillis()
            long r3 = (long) r3
            r5 = 24
            long r3 = r3 * r5
            r5 = 60
            long r3 = r3 * r5
            long r3 = r3 * r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            long r10 = r10 - r3
            r3 = 3
            java.lang.String[] r5 = new java.lang.String[r3]
            r3 = 405(0x195, float:5.68E-43)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            r3 = 0
            r5[r3] = r4
            r4 = 1
            java.lang.String r3 = java.lang.String.valueOf(r4)
            r5[r4] = r3
            java.lang.String r4 = java.lang.String.valueOf(r10)
            r3 = 2
            r5[r3] = r4
            java.lang.String r3 = "readFrequentlyPaidNonWaPaymentUsers/QUERY_SUCCESSFUL_INTEROP_TRANSACTIONS"
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0v(r3)
            java.lang.String r3 = "/QUERY_PAY_TRANSACTION"
            java.lang.String r18 = X.AnonymousClass000.A0q(r3, r4)
            X.12P r3 = r1.A03
            X.1M0 r7 = r3.get()
            X.14e r10 = r7.A02     // Catch:{ all -> 0x02d2 }
            java.lang.String r11 = "pay_transaction"
            r12 = 0
            java.lang.String r13 = "status =? AND type =? AND init_timestamp <=? AND receiver_jid_row_id is null"
            r16 = r12
            r17 = r12
            r14 = r5
            r15 = r12
            android.database.Cursor r10 = r10.A0A(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02d2 }
            if (r10 == 0) goto L_0x0289
            java.util.HashMap r11 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x027f }
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x027f }
            java.lang.String r3 = "extractFrequentlyPaidNonWaPaymentUser"
            java.util.ArrayList r3 = X.C24881Ed.A0B(r10, r1, r3)     // Catch:{ all -> 0x027f }
            java.util.Iterator r16 = r3.iterator()     // Catch:{ all -> 0x027f }
        L_0x020a:
            boolean r3 = r16.hasNext()     // Catch:{ all -> 0x027f }
            if (r3 == 0) goto L_0x026d
            java.lang.Object r13 = r16.next()     // Catch:{ all -> 0x027f }
            X.9lY r13 = (X.C202319lY) r13     // Catch:{ all -> 0x027f }
            X.8av r3 = r13.A0A     // Catch:{ all -> 0x027f }
            java.lang.String r4 = r3.A0F()     // Catch:{ all -> 0x027f }
            boolean r3 = r11.containsKey(r4)     // Catch:{ all -> 0x027f }
            if (r3 == 0) goto L_0x0248
            java.lang.Object r15 = r11.get(r4)     // Catch:{ all -> 0x027f }
            r14 = r15
            X.AUl r14 = (X.C21668AUl) r14     // Catch:{ all -> 0x027f }
            monitor-enter(r15)     // Catch:{ all -> 0x027f }
            int r3 = r14.A00     // Catch:{ all -> 0x026a }
            monitor-exit(r15)     // Catch:{ all -> 0x027f }
            int r3 = r3 + 1
            monitor-enter(r15)     // Catch:{ all -> 0x027f }
            r14.A00 = r3     // Catch:{ all -> 0x026a }
            monitor-exit(r15)     // Catch:{ all -> 0x027f }
            monitor-enter(r15)     // Catch:{ all -> 0x027f }
            long r5 = r14.A01     // Catch:{ all -> 0x026a }
            monitor-exit(r15)     // Catch:{ all -> 0x027f }
            long r3 = r13.A05     // Catch:{ all -> 0x027f }
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 >= 0) goto L_0x020a
            monitor-enter(r15)     // Catch:{ all -> 0x027f }
            r14.A01 = r3     // Catch:{ all -> 0x026a }
            monitor-exit(r15)     // Catch:{ all -> 0x027f }
            X.16X r3 = r13.A08     // Catch:{ all -> 0x027f }
            monitor-enter(r15)     // Catch:{ all -> 0x027f }
            r14.A02 = r3     // Catch:{ all -> 0x026a }
            monitor-exit(r15)     // Catch:{ all -> 0x027f }
            goto L_0x020a
        L_0x0248:
            com.whatsapp.jid.UserJid r14 = r13.A0E     // Catch:{ all -> 0x027f }
            long r3 = r13.A05     // Catch:{ all -> 0x027f }
            X.16X r12 = r13.A08     // Catch:{ all -> 0x027f }
            X.8av r6 = r13.A0A     // Catch:{ all -> 0x027f }
            X.AUl r5 = new X.AUl     // Catch:{ all -> 0x027f }
            r17 = r5
            r18 = r12
            r19 = r6
            r20 = r14
            r21 = r3
            r17.<init>((X.AnonymousClass16X) r18, (X.C175708av) r19, (com.whatsapp.jid.UserJid) r20, (long) r21)     // Catch:{ all -> 0x027f }
            java.lang.String r3 = r6.A0F()     // Catch:{ all -> 0x027f }
            r11.put(r3, r5)     // Catch:{ all -> 0x027f }
            r8.add(r5)     // Catch:{ all -> 0x027f }
            goto L_0x020a
        L_0x026a:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x027f }
            throw r0     // Catch:{ all -> 0x027f }
        L_0x026d:
            X.1Dc r4 = r1.A04     // Catch:{ all -> 0x027f }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x027f }
            java.lang.String r1 = "readFrequentlyPaidNonWaPaymentUsers returned: "
            X.C36341k9.A1N(r1, r3, r8)     // Catch:{ all -> 0x027f }
            X.C165607th.A1E(r4, r3)     // Catch:{ all -> 0x027f }
            r10.close()     // Catch:{ all -> 0x02d2 }
            goto L_0x0289
        L_0x027f:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0284 }
            goto L_0x0288
        L_0x0284:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02d2 }
        L_0x0288:
            throw r1     // Catch:{ all -> 0x02d2 }
        L_0x0289:
            r7.close()
            r8.addAll(r2)
            int r2 = r8.size()
            r1 = 1
            if (r2 <= r1) goto L_0x0299
            java.util.Collections.sort(r8)
        L_0x0299:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r8.iterator()
        L_0x02a5:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x02cc
            java.lang.Object r2 = r3.next()
            X.AUl r2 = (X.C21668AUl) r2
            int r1 = r5.size()
            if (r1 >= r9) goto L_0x02cc
            boolean r1 = r2.A06
            if (r1 != 0) goto L_0x02c8
            com.whatsapp.jid.UserJid r1 = r2.A04
            if (r1 == 0) goto L_0x02c8
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x02a5
            r4.add(r1)
        L_0x02c8:
            r5.add(r2)
            goto L_0x02a5
        L_0x02cc:
            X.9IE r0 = new X.9IE
            r0.<init>(r4, r5)
            return r0
        L_0x02d2:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x02d7 }
            throw r1
        L_0x02d7:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183608r4.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass9IE r13 = (AnonymousClass9IE) obj;
        AnonymousClass00C.A0D(r13, 0);
        AnonymousClass9IC r0 = this.A02;
        PaymentSettingsFragment paymentSettingsFragment = r0.A01;
        AnonymousClass1RY r6 = r0.A00;
        List list = r13.A01;
        List list2 = r13.A00;
        int size = list2.size();
        View view = paymentSettingsFragment.A05;
        if (size == 0) {
            view.setVisibility(8);
            paymentSettingsFragment.A0B.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        paymentSettingsFragment.A0B.setVisibility(0);
        int i = ((GridLayoutManager) paymentSettingsFragment.A0C.getLayoutManager()).A01;
        paymentSettingsFragment.A0C.setAdapter(new C168067ze(paymentSettingsFragment.A0h(), paymentSettingsFragment.A0J, r6, new AnonymousClass9ID(paymentSettingsFragment, list2), paymentSettingsFragment.A0q, list, list2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C183608r4(AnonymousClass16D r2, C24881Ed r3, AnonymousClass9IC r4, PaymentSettingsFragment paymentSettingsFragment) {
        super(paymentSettingsFragment, true);
        C36321k7.A0z(r2, r3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }
}
