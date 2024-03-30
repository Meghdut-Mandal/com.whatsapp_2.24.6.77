package X;

import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.9g7  reason: invalid class name and case insensitive filesystem */
public final class C199849g7 {
    public final C19630wG A00;
    public final AnonymousClass1EU A01;
    public final C18820ts A02;
    public final AnonymousClass1EV A03;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A02(X.C207249un r11, boolean r12) {
        /*
            r10 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r11, r0)
            boolean r0 = r11 instanceof X.C175798b4
            if (r0 == 0) goto L_0x006e
            X.8b4 r11 = (X.C175798b4) r11
            r7 = 0
            X.AnonymousClass00C.A0D(r11, r7)
            X.0wG r6 = r10.A00
            r0 = 2131895200(0x7f1223a0, float:1.9425226E38)
            java.lang.String r3 = X.C36371kC.A0v(r6, r0)
            int r0 = r11.A01
            java.lang.String r9 = X.C175798b4.A03(r0)
            java.lang.String r5 = ""
            if (r9 != 0) goto L_0x0022
            r9 = r5
        L_0x0022:
            android.content.Context r8 = r6.A00
            X.AnonymousClass00C.A08(r8)
            int r2 = r11.A00
            r4 = 1
            r1 = 2131892165(0x7f1217c5, float:1.941907E38)
            if (r2 == r4) goto L_0x0069
            r0 = 4
            r1 = 2131892164(0x7f1217c4, float:1.9419069E38)
            if (r2 == r0) goto L_0x0069
            r0 = 6
            if (r2 == r0) goto L_0x0066
            java.lang.String r0 = X.C207249un.A07(r2)
        L_0x003c:
            if (r0 == 0) goto L_0x003f
            r5 = r0
        L_0x003f:
            X.6c7 r1 = r11.A09
            boolean r0 = X.C202349ld.A03(r1)
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = X.C165577te.A0k(r1)
            java.lang.String r2 = X.C203449o2.A04(r0)
            X.AnonymousClass00C.A08(r2)
            r1 = 2131892254(0x7f12181e, float:1.9419251E38)
            java.lang.Object[] r0 = X.C36441kJ.A1Q()
            r0[r7] = r9
            X.C36411kG.A1Q(r5, r2, r0, r4)
            java.lang.String r3 = r6.A02(r1, r0)
            X.AnonymousClass00C.A08(r3)
        L_0x0065:
            return r3
        L_0x0066:
            r1 = 2131892163(0x7f1217c3, float:1.9419067E38)
        L_0x0069:
            java.lang.String r0 = r8.getString(r1)
            goto L_0x003c
        L_0x006e:
            boolean r0 = r11 instanceof X.C175778b2
            if (r0 != 0) goto L_0x00da
            boolean r0 = r11 instanceof X.C175768b1
            if (r0 != 0) goto L_0x00da
            boolean r0 = r11 instanceof X.C175788b3
            if (r0 != 0) goto L_0x00fd
            boolean r0 = r11 instanceof X.C175758b0
            if (r0 != 0) goto L_0x00fd
            X.0wG r5 = r10.A00
            r0 = 2131895200(0x7f1223a0, float:1.9425226E38)
            java.lang.String r3 = X.C36371kC.A0v(r5, r0)
            X.1EU r0 = r10.A01
            X.B66 r6 = r0.A05()
            X.AnonymousClass00C.A08(r6)
            java.lang.String r1 = r6.BDo(r11)
            int r0 = X.C165607th.A08(r1)
            r4 = 1
            if (r0 <= 0) goto L_0x00b7
            r3 = r1
        L_0x009c:
            if (r12 == 0) goto L_0x0065
            r2 = 2131895006(0x7f1222de, float:1.9424833E38)
            java.lang.Object[] r1 = X.C36411kG.A1b(r3)
            int r0 = r6.BFR()
            java.lang.String r0 = r5.A01(r0)
            r1[r4] = r0
            java.lang.String r3 = r5.A02(r2, r1)
            X.AnonymousClass00C.A0B(r3)
            return r3
        L_0x00b7:
            java.lang.String r1 = r11.A0B
            if (r1 == 0) goto L_0x009c
            X.6c7 r0 = r11.A09
            java.lang.String r3 = A00(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r1)
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x00d5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 32
            java.lang.String r3 = X.C90464aC.A0f(r3, r1, r0)
        L_0x00d5:
            java.lang.String r3 = X.AnonymousClass000.A0q(r3, r2)
            goto L_0x009c
        L_0x00da:
            X.0wG r1 = r10.A00
            r0 = 2131895200(0x7f1223a0, float:1.9425226E38)
            java.lang.String r3 = X.C36371kC.A0v(r1, r0)
            java.lang.Object r2 = X.C207249un.A06(r11)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = r11.A0B
            if (r2 == 0) goto L_0x00f4
            int r0 = r2.length()
            if (r0 == 0) goto L_0x00f4
            return r2
        L_0x00f4:
            if (r1 == 0) goto L_0x0065
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0065
            return r1
        L_0x00fd:
            X.6c7 r0 = r11.A09
            X.C18740tg.A06(r0)
            java.lang.Object r3 = X.C135086c7.A00(r0)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199849g7.A02(X.9un, boolean):java.lang.String");
    }

    public C199849g7(C19630wG r1, C18820ts r2, AnonymousClass1EV r3, AnonymousClass1EU r4) {
        C36321k7.A18(r1, r2, r4, r3);
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r4;
        this.A03 = r3;
    }

    public static final String A00(C135086c7 r2) {
        if (C202349ld.A03(r2)) {
            return "";
        }
        C18740tg.A06(r2);
        Object obj = r2.A00;
        C18740tg.A06(obj);
        String A04 = C203449o2.A04((String) obj);
        AnonymousClass00C.A08(A04);
        return AnonymousClass000.A0p("••", A04, AnonymousClass000.A0u());
    }

    public final String A01(C207249un r6) {
        int i;
        AnonymousClass00C.A0D(r6, 0);
        C175898bF r0 = r6.A08;
        C18740tg.A06(r0);
        if (!r0.A09()) {
            return this.A00.A01(R.string.f12nameremoved);
        }
        AnonymousClass1EV r1 = this.A03;
        if (r1.A0E() || r1.A0B()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            if (r6.A01 == 2) {
                A0u.append(this.A00.A01(R.string.f12nameremoved));
            }
            if (r6.A03 == 2) {
                if (A0u.length() > 0) {
                    A0u.append("\n");
                }
                A0u.append(this.A00.A01(R.string.f12nameremoved));
            }
            return A0u.toString();
        }
        C175898bF r02 = r6.A08;
        if (r02 != null && !r02.A09()) {
            i = R.string.f12nameremoved;
        } else if (r6.A01 != 2) {
            return null;
        } else {
            i = R.string.f12nameremoved;
        }
        return this.A00.A01(i);
    }

    public final void A03(C207249un r3, B6J b6j, PaymentMethodRow paymentMethodRow) {
        WaImageView waImageView;
        int i;
        C36321k7.A0x(paymentMethodRow, b6j);
        String BED = b6j.BED(r3);
        if (b6j.BtO()) {
            b6j.Bti(r3, paymentMethodRow);
        } else {
            C203449o2.A07(r3, paymentMethodRow);
        }
        if (BED == null || BED.length() == 0) {
            BED = A02(r3, true);
        }
        paymentMethodRow.A02.setText(BED);
        paymentMethodRow.A03(b6j.BEC(r3));
        paymentMethodRow.A04(!b6j.Bt7(r3));
        int BEA = b6j.BEA(r3);
        if (BEA == 0) {
            waImageView = paymentMethodRow.A04;
            i = 8;
        } else {
            paymentMethodRow.A04.setImageResource(BEA);
            waImageView = paymentMethodRow.A04;
            i = 0;
        }
        waImageView.setVisibility(i);
        paymentMethodRow.A05(b6j.BtK());
    }
}
