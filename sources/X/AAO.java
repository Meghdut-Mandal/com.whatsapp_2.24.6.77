package X;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class AAO implements B0z {
    public final C24601Db A00;
    public final AnonymousClass17Y A01;
    public final C20050ww A02;
    public final C19970wo A03;
    public final AnonymousClass2ZN A04;
    public final AnonymousClass1EZ A05;
    public final C29231Vv A06;
    public final AnonymousClass1EU A07;
    public final C201219j5 A08;

    public AAO(AnonymousClass17Y r1, C20050ww r2, C19970wo r3, AnonymousClass2ZN r4, AnonymousClass1EZ r5, C29231Vv r6, C24601Db r7, AnonymousClass1EU r8, C201219j5 r9) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
        this.A07 = r8;
        this.A00 = r7;
        this.A05 = r5;
        this.A08 = r9;
        this.A04 = r4;
        this.A06 = r6;
    }

    public void B0s(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C207249un A0S = C165607th.A0S(it);
            int A09 = A0S.A09();
            if (!(A09 == 1 || A09 == 4)) {
                if (A09 == 5) {
                    AnonymousClass1EY A022 = this.A07.A02("merchant_account_linking_context");
                    A022.A0A(A022.A04("add_business"));
                } else if (!(A09 == 6 || A09 == 7)) {
                    C36321k7.A1L(A0S, "PAY: Not supported method type for Brazil: ", AnonymousClass000.A0u());
                }
            }
            AnonymousClass1EU r2 = this.A07;
            r2.A02("p2p_context").A0B("add_card");
            r2.A02("p2m_context").A0B("add_card");
        }
        AnonymousClass17Y r3 = this.A01;
        AnonymousClass2ZN r22 = this.A04;
        Objects.requireNonNull(r22);
        r3.Bp3(new C81123wV((Object) r22, 45));
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C207249un B1i(X.C207249un r7) {
        /*
            r6 = this;
            int r2 = r7.A09()
            r0 = 1
            if (r2 == r0) goto L_0x0125
            r0 = 4
            if (r2 == r0) goto L_0x0125
            r0 = 5
            if (r2 == r0) goto L_0x0021
            r0 = 6
            if (r2 == r0) goto L_0x0125
            r0 = 7
            if (r2 == r0) goto L_0x0125
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: method type not expected: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)
        L_0x001d:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0020:
            return r7
        L_0x0021:
            X.8bF r4 = r7.A08
            X.8bC r4 = (X.C175868bC) r4
            if (r4 == 0) goto L_0x0121
            X.1EU r0 = r6.A07
            X.16S r1 = X.C165617ti.A0O(r0)
            java.lang.String r0 = r7.A0A
            X.9un r3 = r1.A07(r0)
            if (r3 == 0) goto L_0x0020
            X.8bF r0 = r3.A08
            if (r0 == 0) goto L_0x0020
            r1 = r3
            X.8b1 r1 = (X.C175768b1) r1
            X.54i r0 = new X.54i
            r0.<init>(r1)
            java.lang.String r2 = r0.A00()
            X.1Db r0 = r6.A00
            android.content.SharedPreferences$Editor r1 = X.C90494aF.A0E(r0)
            java.lang.String r0 = "payment_merchant_previous_display_state"
            X.C36341k9.A0x(r1, r0, r2)
            X.8bF r3 = r3.A08
            X.8bC r3 = (X.C175868bC) r3
            java.lang.String r0 = r4.A09
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r3.A09
            r4.A09 = r0
        L_0x0060:
            java.lang.String r0 = r4.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r3.A0C
            r4.A0C = r0
        L_0x006c:
            java.lang.String r0 = r4.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r3.A03
            r4.A03 = r0
        L_0x0078:
            java.lang.String r0 = r4.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = r3.A06
            r4.A06 = r0
        L_0x0084:
            java.lang.String r0 = r4.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = r3.A07
            r4.A07 = r0
        L_0x0090:
            java.lang.String r0 = r4.A0B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = r3.A0B
            r4.A0B = r0
        L_0x009c:
            boolean r0 = r3.A0E
            r4.A0E = r0
            boolean r0 = r3.A0F
            r4.A0F = r0
            int r0 = r3.A00
            r4.A00 = r0
            java.lang.String r5 = r4.A07
            java.lang.String r2 = "ACTIVE"
            boolean r0 = r2.equals(r5)
            if (r0 == 0) goto L_0x00eb
            java.lang.String r1 = r3.A07
            java.lang.String r0 = "INITED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = "MERCHANT_LINKED"
        L_0x00be:
            r4.A04 = r0
        L_0x00c0:
            java.lang.String r0 = r4.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00cc
            java.lang.String r0 = r3.A08
            r4.A08 = r0
        L_0x00cc:
            java.lang.String r0 = r4.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = r3.A05
            r4.A05 = r0
        L_0x00d8:
            int r1 = r4.A01
            r0 = -1
            if (r1 != r0) goto L_0x0020
            int r0 = r3.A01
            r4.A01 = r0
            return r7
        L_0x00e2:
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x00eb
            java.lang.String r0 = "MERCHANT_VERIFIED"
            goto L_0x00be
        L_0x00eb:
            java.lang.String r2 = "PENDING"
            boolean r0 = r2.equals(r5)
            if (r0 != 0) goto L_0x00fb
            java.lang.String r0 = "INITED"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x010e
        L_0x00fb:
            java.lang.String r1 = r3.A07
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "INITED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "MERCHANT_VERIFICATION_FAILURE"
            goto L_0x00be
        L_0x010e:
            java.lang.String r1 = "EXTERNALLY_DISABLED"
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = r3.A07
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00c0
            java.lang.String r0 = "MERCHANT_DISABLED"
            goto L_0x00be
        L_0x0121:
            java.lang.String r0 = "PAY:BrazilPaymentStorageObserver/beforeMethodAdded: methodData is null"
            goto L_0x001d
        L_0x0125:
            X.8bF r2 = r7.A08
            X.8b7 r2 = (X.AnonymousClass8b7) r2
            if (r2 == 0) goto L_0x0020
            java.lang.String r1 = r2.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x013f
            byte[] r0 = r7.A0D
            if (r0 == 0) goto L_0x013f
            X.0ww r0 = r6.A02
            byte[] r0 = X.C203449o2.A09(r0, r1)
            r7.A0D = r0
        L_0x013f:
            X.1EU r0 = r6.A07
            X.16S r1 = X.C165617ti.A0O(r0)
            java.lang.String r0 = r7.A0A
            X.9un r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x0020
            X.8bF r3 = r0.A08
            if (r3 == 0) goto L_0x0020
            X.8b7 r3 = (X.AnonymousClass8b7) r3
            X.0wo r4 = r6.A03
            boolean r0 = r2.A0a
            if (r0 != 0) goto L_0x0161
            boolean r0 = r3.A0Q
            r2.A0Q = r0
            int r0 = r3.A02
            r2.A02 = r0
        L_0x0161:
            java.lang.String r0 = r2.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x016d
            java.lang.String r0 = r3.A05
            r2.A05 = r0
        L_0x016d:
            java.lang.String r0 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0179
            java.lang.String r0 = r3.A02
            r2.A02 = r0
        L_0x0179:
            java.lang.String r0 = r2.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01c7
            java.lang.String r1 = r2.A0C
            java.lang.String r0 = r3.A0C
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01c7
            r0 = 0
            r2.A0E = r0
        L_0x018e:
            r2.A0D = r0
        L_0x0190:
            java.lang.String r0 = r2.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01ac
            java.lang.String r1 = r2.A0J
            java.lang.String r0 = r3.A0J
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01ac
            long r0 = X.C19970wo.A00(r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A09 = r0
        L_0x01ac:
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x01b8
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x01b8
            java.lang.String r0 = "PAYMENT_METHOD_VERIFIED"
            r2.A04 = r0
        L_0x01b8:
            java.lang.String r0 = r2.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0020
            X.9j5 r1 = r6.A08
            r0 = 0
            X.C201219j5.A01(r0, r7, r1)
            return r7
        L_0x01c7:
            java.lang.String r0 = r3.A0C
            r2.A0C = r0
            java.lang.String r0 = r2.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01d7
            java.lang.String r0 = r3.A0E
            r2.A0E = r0
        L_0x01d7:
            java.lang.String r0 = r2.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0190
            java.lang.String r0 = r3.A0D
            goto L_0x018e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AAO.B1i(X.9un):X.9un");
    }
}
