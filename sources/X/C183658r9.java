package X;

import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8r9  reason: invalid class name and case insensitive filesystem */
public class C183658r9 extends C132446Tt {
    public final AnonymousClass9Q0 A00;
    public final C1276068y A01;
    public final ArrayList A02;
    public final /* synthetic */ PaymentTransactionHistoryActivity A03;

    public C183658r9(AnonymousClass9Q0 r2, PaymentTransactionHistoryActivity paymentTransactionHistoryActivity, C1276068y r4, ArrayList arrayList) {
        ArrayList arrayList2;
        this.A03 = paymentTransactionHistoryActivity;
        if (arrayList != null) {
            arrayList2 = C36441kJ.A15(arrayList);
        } else {
            arrayList2 = null;
        }
        this.A02 = arrayList2;
        this.A00 = r2;
        this.A01 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        if (X.C202859mm.A04(r3.A04, r3.A0H.A0P(r7), r2, true) != false) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r10) {
        /*
            r9 = this;
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r3 = r9.A03
            X.11F r0 = r3.A08
            if (r0 != 0) goto L_0x010a
            boolean r0 = r3.A0Q
            r7 = 0
            r6 = 1
            if (r0 != 0) goto L_0x00c0
            X.0yf r1 = r3.A06
            X.0yi r0 = X.C21100yf.A0l
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x00c0
            X.9Nh r1 = r3.A0X
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x002c
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x002c
            X.978 r0 = r1.A00
            if (r0 != 0) goto L_0x002c
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x002c
            X.9tb r0 = r1.A01
            if (r0 == 0) goto L_0x00c0
        L_0x002c:
            r1.A05 = r7
            r1.A04 = r6
            X.1EU r0 = r3.A0C
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r0 = r0.A05
            java.util.ArrayList r5 = r0.A0Q(r1)
        L_0x003b:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.ArrayList r2 = r9.A02
            if (r2 == 0) goto L_0x00a9
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00a9
            java.util.Iterator r8 = r5.iterator()
        L_0x004d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r7 = r8.next()
            X.9lY r7 = (X.C202319lY) r7
            X.1VZ r0 = r3.A07
            X.3T1 r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x00a7
            java.lang.String r1 = r0.A0b()
        L_0x0065:
            X.0ts r0 = r3.A04
            r6 = 1
            boolean r0 = X.C202859mm.A04(r0, r1, r2, r6)
            if (r0 != 0) goto L_0x008a
            X.1FR r0 = r3.A0H
            java.lang.String r1 = r0.A0Q(r7)
            X.0ts r0 = r3.A04
            boolean r0 = X.C202859mm.A04(r0, r1, r2, r6)
            if (r0 != 0) goto L_0x008a
            X.1FR r0 = r3.A0H
            java.lang.String r1 = r0.A0P(r7)
            X.0ts r0 = r3.A04
            boolean r0 = X.C202859mm.A04(r0, r1, r2, r6)
            if (r0 == 0) goto L_0x008d
        L_0x008a:
            r4.add(r7)
        L_0x008d:
            X.4c6 r0 = r9.A02
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x004d
            r4.clear()
            r4.addAll(r5)
        L_0x009b:
            X.68y r0 = r9.A01
            java.util.ArrayList r1 = r0.A02(r4)
            X.00I r0 = new X.00I
            r0.<init>(r4, r1)
            return r0
        L_0x00a7:
            r1 = 0
            goto L_0x0065
        L_0x00a9:
            r4.addAll(r5)
            X.AXc r0 = X.C21706AXc.A00
            java.util.Collections.sort(r4, r0)
            boolean r0 = r3.A0R
            if (r0 != 0) goto L_0x009b
            boolean r0 = r3.A0N
            if (r0 != 0) goto L_0x009b
            X.0wU r1 = r3.A04
            r0 = 5
            X.C36391kE.A1S(r1, r9, r5, r0)
            goto L_0x009b
        L_0x00c0:
            boolean r0 = r3.A0P
            r4 = -1
            if (r0 == 0) goto L_0x00f2
            java.lang.Integer[] r5 = new java.lang.Integer[r6]
            r0 = 40
            X.AnonymousClass000.A1L(r5, r0, r7)
            boolean r2 = r3.A0O
            r0 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            if (r2 == 0) goto L_0x00ea
            r0 = 20
            X.AnonymousClass000.A1L(r1, r0, r7)
            r0 = 401(0x191, float:5.62E-43)
        L_0x00da:
            X.AnonymousClass000.A1L(r1, r0, r6)
            X.1EU r0 = r3.A0C
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r0 = r0.A05
            java.util.List r5 = r0.A0U(r1, r5, r4)
            goto L_0x003b
        L_0x00ea:
            r0 = 417(0x1a1, float:5.84E-43)
            X.AnonymousClass000.A1L(r1, r0, r7)
            r0 = 418(0x1a2, float:5.86E-43)
            goto L_0x00da
        L_0x00f2:
            boolean r2 = r3.A0Q
            X.1EU r0 = r3.A0C
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r1 = r0.A05
            if (r2 == 0) goto L_0x0103
            java.util.ArrayList r5 = r1.A0P(r4)
            goto L_0x003b
        L_0x0103:
            r0 = 0
            java.util.ArrayList r5 = X.C24881Ed.A0C(r1, r0, r4)
            goto L_0x003b
        L_0x010a:
            X.1EU r0 = r3.A0C
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r2 = r0.A05
            X.11F r1 = r3.A08
            r0 = -1
            java.util.ArrayList r5 = X.C24881Ed.A0C(r2, r1, r0)
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183658r9.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass00I r6 = (AnonymousClass00I) obj;
        AnonymousClass9Q0 r4 = this.A00;
        PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = this.A03;
        String str = paymentTransactionHistoryActivity.A0L;
        if (str == null) {
            str = "";
        }
        C193889Nh r2 = paymentTransactionHistoryActivity.A0X;
        Object obj2 = r6.A00;
        C18740tg.A06(obj2);
        Object obj3 = r6.A01;
        C18740tg.A06(obj3);
        r4.A00(r2, str, (List) obj2, (List) obj3);
    }
}
