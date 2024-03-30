package com.whatsapp.payments.ui;

import X.AE9;
import X.AnonymousClass16T;
import X.AnonymousClass19A;
import X.AnonymousClass1EV;
import X.AnonymousClass1XA;
import X.AnonymousClass1YK;
import X.AnonymousClass1YN;
import X.AnonymousClass3SJ;
import X.AnonymousClass646;
import X.AnonymousClass6VG;
import X.AnonymousClass6VM;
import X.AnonymousClass8h4;
import X.AnonymousClass9TJ;
import X.AnonymousClass9UG;
import X.B7Y;
import X.C147166wm;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C165617ti;
import X.C167667yX;
import X.C173888Tn;
import X.C175858bB;
import X.C178868i1;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C196039Xk;
import X.C200049gU;
import X.C200959iX;
import X.C201219j5;
import X.C201269jE;
import X.C201649k3;
import X.C207249un;
import X.C24631De;
import X.C27111My;
import X.C29221Vu;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import android.os.Build;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class BrazilPaymentCardDetailsActivity extends C178868i1 {
    public AnonymousClass16T A00;
    public AnonymousClass19A A01;
    public C147166wm A02;
    public C201269jE A03;
    public AE9 A04;
    public AnonymousClass6VM A05;
    public AnonymousClass1EV A06;
    public C200049gU A07;
    public AnonymousClass6VG A08;
    public C200959iX A09;
    public C196039Xk A0A;
    public C201219j5 A0B;
    public C201649k3 A0C;
    public C167667yX A0D;
    public AnonymousClass9UG A0E;
    public boolean A0F;

    public void A3k(boolean z) {
        FingerprintBottomSheet fingerprintBottomSheet;
        String A0p = C165607th.A0p(this);
        PinBottomSheetDialogFragment A002 = AnonymousClass9TJ.A00();
        if (Build.VERSION.SDK_INT >= 23) {
            fingerprintBottomSheet = FingerprintBottomSheet.A0A.A01();
        } else {
            fingerprintBottomSheet = null;
        }
        AnonymousClass8h4 r8 = new AnonymousClass8h4(this.A02, this.A07, this.A04, this.A08, A0p, this.A04.A0A);
        C167667yX r1 = this.A0D;
        if (r1 != null) {
            r1.A0T(this, fingerprintBottomSheet, r8, A002, A0p, "REMOVEMETHOD", "FB");
        }
    }

    public static void A0G(BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity, String str) {
        if (brazilPaymentCardDetailsActivity.A06.A02.A0E(2984)) {
            brazilPaymentCardDetailsActivity.Bnv();
            C207249un A072 = C165617ti.A0O(brazilPaymentCardDetailsActivity.A09).A07(str);
            C18740tg.A06(A072);
            C175858bB r2 = (C175858bB) A072.A08;
            if (r2 != null) {
                String str2 = r2.A0F;
                if (str2.equals("NEEDS_RETOKENIZATION") || str2.equals("NEEDS_RETOKENIZATION_DELETED")) {
                    brazilPaymentCardDetailsActivity.BuO(C175858bB.A00(brazilPaymentCardDetailsActivity, r2, str), 1);
                }
            }
        }
    }

    public void A2F() {
        if (!this.A0F) {
            this.A0F = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A00 = C36351kA.A0M(r2);
            C173888Tn.A01(r2, this, C36341k9.A0Z(r2));
            this.A03 = C36341k9.A0T(r2);
            this.A09 = C36381kD.A0f(r2);
            this.A0B = C165607th.A0e(r2);
            this.A06 = C165607th.A0Y(r2);
            this.A08 = (C24631De) C165577te.A0f(r2);
            this.A07 = (AnonymousClass1YN) r2.AVo.get();
            this.A0B = C165587tf.A0Z(r2);
            this.A00 = C36371kC.A0Z(r2);
            this.A03 = C165587tf.A0S(r2);
            this.A04 = C165587tf.A0T(r2);
            this.A08 = (AnonymousClass646) r2.ATw.get();
            this.A07 = C165607th.A0Z(r2);
            this.A06 = (AnonymousClass1XA) r2.A6L.get();
            this.A01 = (C29221Vu) r2.A6A.get();
            this.A05 = r1.A7n();
            this.A02 = (AnonymousClass1YK) r2.AVp.get();
            this.A01 = C36361kB.A0c(r2);
            this.A09 = (C200959iX) r1.AAc.get();
            this.A03 = (C201269jE) r1.A5H.get();
            this.A02 = (C147166wm) r1.A5F.get();
            this.A0B = (C201219j5) r1.A5I.get();
            this.A06 = C36371kC.A0h(r2);
            this.A0A = (C196039Xk) r1.AAd.get();
            this.A00 = C165587tf.A0Q(r2);
            this.A0E = (AnonymousClass9UG) r1.A5J.get();
            this.A04 = C27111My.A2m(A0L);
            this.A05 = (AnonymousClass6VM) r2.ACd.get();
            this.A07 = (C200049gU) r2.AW3.get();
            this.A08 = (AnonymousClass6VG) r1.AAa.get();
            this.A0C = (C201649k3) r1.A5T.get();
        }
    }

    public void A3i() {
        AnonymousClass3SJ.A01(this, 201);
    }

    public BrazilPaymentCardDetailsActivity(int i) {
        this.A0F = false;
        B7Y.A00(this, 39);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3j(X.C207249un r9, boolean r10) {
        /*
            r8 = this;
            super.A3j(r9, r10)
            if (r10 == 0) goto L_0x0028
            r0 = 2131432476(0x7f0b141c, float:1.848671E38)
            X.C36331k8.A11(r8, r0)
            X.7ve r1 = new X.7ve
            r1.<init>(r8)
            r8.A0A = r1
            X.9un r0 = r8.A04
            X.8b4 r0 = (X.C175798b4) r0
            r1.setCard(r0)
            r0 = 2131432472(0x7f0b1418, float:1.8486702E38)
            android.view.View r2 = r8.findViewById(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            X.7ve r1 = r8.A0A
            r0 = 0
            r2.addView(r1, r0)
        L_0x0028:
            X.8bF r5 = r9.A08
            X.8bB r5 = (X.C175858bB) r5
            if (r5 == 0) goto L_0x0104
            X.7ve r0 = r8.A0A
            if (r0 == 0) goto L_0x00c4
            X.9j5 r4 = r8.A0B
            X.9un r3 = r8.A04
            r0 = 2131428602(0x7f0b04fa, float:1.8478853E38)
            android.widget.ImageView r2 = X.C36411kG.A0Q(r8, r0)
            android.content.Context r0 = r8.getBaseContext()
            X.4bf r1 = new X.4bf
            r1.<init>(r0)
            r0 = 1
            X.C201219j5.A00(r1, r2, r3, r4, r0)
            X.7ve r0 = r8.A0A
            r1 = 8
            r0.setCardNameTextViewVisibility(r1)
            X.7ve r0 = r8.A0A
            r0.setCardNetworkIconVisibility(r1)
            X.7ve r2 = r8.A0A
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131099996(0x7f06015c, float:1.781236E38)
            int r0 = r1.getColor(r0)
            r2.setCardNumberTextColor(r0)
            java.lang.String r4 = r5.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x00c4
            X.7ve r6 = r8.A0A     // Catch:{ Exception -> 0x00b7 }
            char r1 = X.C165597tg.A00(r4)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r7 = "Unknown color"
            r0 = 48
            if (r1 != r0) goto L_0x00ad
            r2 = 1
            char r1 = r4.charAt(r2)     // Catch:{ Exception -> 0x00b7 }
            r0 = 120(0x78, float:1.68E-43)
            if (r1 == r0) goto L_0x008b
            char r1 = r4.charAt(r2)     // Catch:{ Exception -> 0x00b7 }
            r0 = 88
            if (r1 != r0) goto L_0x00ad
        L_0x008b:
            r0 = 2
            java.lang.String r1 = r4.substring(r0)     // Catch:{ Exception -> 0x00b7 }
            r0 = 16
            long r2 = java.lang.Long.parseLong(r1, r0)     // Catch:{ Exception -> 0x00b7 }
            int r1 = r4.length()     // Catch:{ Exception -> 0x00b7 }
            r0 = 8
            if (r1 != r0) goto L_0x00a3
            r0 = -16777216(0xffffffffff000000, double:NaN)
            long r2 = r2 | r0
            goto L_0x00a8
        L_0x00a3:
            r0 = 10
            if (r1 == r0) goto L_0x00a8
            goto L_0x00b2
        L_0x00a8:
            int r0 = (int) r2     // Catch:{ Exception -> 0x00b7 }
            r6.setCardNumberTextColor(r0)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00c4
        L_0x00ad:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r7)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00b6
        L_0x00b2:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r7)     // Catch:{ Exception -> 0x00b7 }
        L_0x00b6:
            throw r0     // Catch:{ Exception -> 0x00b7 }
        L_0x00b7:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PAY: Could not apply label color: "
            r1.append(r0)
            X.C36351kA.A1P(r4, r1, r2)
        L_0x00c4:
            java.lang.String r1 = r5.A0I
            int r0 = r1.hashCode()
            switch(r0) {
                case -1757659853: goto L_0x0108;
                case -591252731: goto L_0x010b;
                case 1124965819: goto L_0x011e;
                case 1925346054: goto L_0x0139;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            r2 = 0
            X.B6t r0 = new X.B6t
            r0.<init>(r8, r2)
            X.04H r1 = X.C165617ti.A0A(r0, r8)
            java.lang.Class<X.8lc> r0 = X.C180348lc.class
            X.04R r0 = r1.A00(r0)
            X.7yX r0 = (X.C167667yX) r0
            r8.A0D = r0
            X.00s r1 = r0.A03
            r0 = 1
            X.BA9.A00(r8, r1, r0)
            X.7yX r0 = r8.A0D
            X.00s r1 = r0.A00
            r0 = 2
            X.BA9.A00(r8, r1, r0)
            X.7yX r1 = r8.A0D
            boolean r0 = r1 instanceof X.C180358ld
            if (r0 == 0) goto L_0x0105
            X.8ld r1 = (X.C180358ld) r1
            X.00s r0 = r1.A03
        L_0x00f9:
            X.BA9.A00(r8, r0, r2)
            X.7yX r0 = r8.A0D
            X.00s r1 = r0.A02
            r0 = 3
            X.BA9.A00(r8, r1, r0)
        L_0x0104:
            return
        L_0x0105:
            X.00s r0 = r1.A01
            goto L_0x00f9
        L_0x0108:
            java.lang.String r0 = "VOIDED"
            goto L_0x010d
        L_0x010b:
            java.lang.String r0 = "EXPIRED"
        L_0x010d:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00cd
            r0 = 0
            X.C178868i1.A07(r8, r0)
            X.4fb r2 = r8.A09
            if (r2 == 0) goto L_0x00cd
            r1 = 26
            goto L_0x0130
        L_0x011e:
            java.lang.String r0 = "SUSPENDED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00cd
            r0 = 3
            X.C178868i1.A07(r8, r0)
            X.4fb r2 = r8.A09
            if (r2 == 0) goto L_0x00cd
            r1 = 27
        L_0x0130:
            X.9uz r0 = new X.9uz
            r0.<init>(r8, r1)
            r2.setAlertButtonClickListener(r0)
            goto L_0x00cd
        L_0x0139:
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r1 = r5.A0M
            java.lang.String r0 = "REQUIRES_VERIFICATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0171
            r0 = 4
            X.C178868i1.A07(r8, r0)
            X.4fb r0 = r8.A09
            if (r0 == 0) goto L_0x00cd
            X.0yC r1 = r8.A0D
            r0 = 1927(0x787, float:2.7E-42)
            boolean r4 = r1.A0E(r0)
            X.4fb r3 = r8.A09
            X.9un r0 = r8.A04
            java.lang.String r2 = r0.A0A
            r1 = 17
            if (r4 == 0) goto L_0x0167
            r1 = 16
        L_0x0167:
            X.9v1 r0 = new X.9v1
            r0.<init>(r1, r2, r8)
            r3.setAlertButtonClickListener(r0)
            goto L_0x00cd
        L_0x0171:
            boolean r0 = r5.A0a
            if (r0 != 0) goto L_0x017e
            boolean r0 = r5.A0Z
            if (r0 == 0) goto L_0x017e
            r8.A3l()
            goto L_0x00cd
        L_0x017e:
            java.lang.Long r0 = r5.A09
            if (r0 == 0) goto L_0x00cd
            X.0wo r0 = r8.A07
            long r2 = X.C19970wo.A00(r0)
            java.lang.Long r0 = r5.A09
            long r0 = r0.longValue()
            int r1 = X.AnonymousClass6XI.A00(r2, r0)
            r0 = 30
            if (r1 > r0) goto L_0x00cd
            r0 = 2
            X.C178868i1.A07(r8, r0)
            java.lang.Long r0 = X.C36411kG.A0t()
            r5.A09 = r0
            X.1EU r0 = r8.A09
            X.9YB r2 = r0.A01()
            X.9un r1 = r8.A04
            r0 = 0
            r2.A04(r0, r1)
            goto L_0x00cd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity.A3j(X.9un, boolean):void");
    }

    public BrazilPaymentCardDetailsActivity() {
        this(0);
    }
}
