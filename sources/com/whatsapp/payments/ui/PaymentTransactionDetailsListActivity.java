package com.whatsapp.payments.ui;

import X.A8P;
import X.AF8;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass0D3;
import X.AnonymousClass13E;
import X.AnonymousClass16D;
import X.AnonymousClass16S;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass190;
import X.AnonymousClass1DR;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass1FR;
import X.AnonymousClass1HA;
import X.AnonymousClass1Pp;
import X.AnonymousClass1ST;
import X.AnonymousClass1SV;
import X.AnonymousClass1X4;
import X.AnonymousClass1XY;
import X.AnonymousClass1Y4;
import X.AnonymousClass2Zw;
import X.AnonymousClass336;
import X.AnonymousClass39O;
import X.AnonymousClass3DY;
import X.AnonymousClass3EU;
import X.AnonymousClass3T1;
import X.AnonymousClass3UJ;
import X.AnonymousClass9SI;
import X.AnonymousClass9UH;
import X.B2Z;
import X.B66;
import X.C165607th;
import X.C167797yq;
import X.C179188jN;
import X.C179688kX;
import X.C179768kf;
import X.C179778kg;
import X.C179788kh;
import X.C179808kj;
import X.C179818kk;
import X.C179828kl;
import X.C179838km;
import X.C179848kn;
import X.C179858ko;
import X.C179868kp;
import X.C179878kq;
import X.C179888kr;
import X.C179898ks;
import X.C179908kt;
import X.C179918ku;
import X.C183808rO;
import X.C18740tg;
import X.C18820ts;
import X.C193689Ml;
import X.C194199Om;
import X.C19770wU;
import X.C20050ww;
import X.C202629mK;
import X.C20380xT;
import X.C20810yC;
import X.C20830yE;
import X.C23981Ap;
import X.C24611Dc;
import X.C24631De;
import X.C24801Dv;
import X.C27731Pn;
import X.C28371Sj;
import X.C29931Yo;
import X.C32681e1;
import X.C32691e2;
import X.C36331k8;
import X.C36361kB;
import X.C36431kI;
import X.C36441kJ;
import X.C46652Zx;
import X.C61673Cz;
import X.C64933Qa;
import X.C65633Sw;
import X.C66013Ui;
import android.content.Intent;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.payments.GlobalPaymentTransactionDetailActivity;

public class PaymentTransactionDetailsListActivity extends C179188jN {
    public C32691e2 A00;
    public AnonymousClass3DY A01;
    public AnonymousClass1XY A02;
    public C20050ww A03;
    public AnonymousClass1X4 A04;
    public AnonymousClass1Pp A05;
    public AnonymousClass16D A06;
    public AnonymousClass185 A07;
    public C27731Pn A08;
    public C20830yE A09;
    public C18820ts A0A;
    public AnonymousClass16S A0B;
    public AnonymousClass13E A0C;
    public AnonymousClass1Y4 A0D;
    public AnonymousClass1ST A0E;
    public C28371Sj A0F;
    public A8P A0G;
    public C202629mK A0H;
    public AnonymousClass3EU A0I;
    public C24631De A0J;
    public AnonymousClass1EV A0K;
    public AnonymousClass1EU A0L;
    public C29931Yo A0M;
    public AnonymousClass39O A0N;
    public C167797yq A0O;
    public C194199Om A0P;
    public AnonymousClass9UH A0Q;
    public AnonymousClass1FR A0R;
    public C23981Ap A0S;
    public AnonymousClass1HA A0T;
    public AnonymousClass336 A0U;
    public C20380xT A0V;
    public C32681e1 A0W;
    public AnonymousClass1SV A0X;
    public C61673Cz A0Y;
    public AnonymousClass005 A0Z;
    public String A0a;
    public AnonymousClass9SI A0b;
    public final C24611Dc A0c = C165607th.A0c("PaymentTransactionDetailsListActivity", "payment-settings");

    public AnonymousClass0D3 A3i(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (i2 != 306) {
            switch (i) {
                case 200:
                    return new C179878kq(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved), this.A0D, this.A0M);
                case 201:
                    return new C179858ko(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved), this.A0H);
                case 202:
                    C20810yC r4 = this.A0D;
                    return new C179908kt(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved), this.A08, r4);
                case 203:
                    C20810yC r11 = this.A0D;
                    C32681e1 r12 = this.A0W;
                    C27731Pn r9 = this.A08;
                    return new C179918ku(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved), this.A04, this.A05, r9, this.A08, r11, r12);
                case 204:
                    return new C179818kk(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved));
                case 205:
                    AnonymousClass17Y r7 = this.A05;
                    C28371Sj r112 = this.A0F;
                    return new C46652Zx(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved), r7, this.A00, this.A0b, this.A08, r112);
                case 206:
                    return new C179788kh(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved));
                case 207:
                    return new C179688kX(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved));
                case 208:
                    return new C179778kg(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved));
                case 209:
                    C20810yC r8 = this.A0D;
                    AnonymousClass17Y r3 = this.A05;
                    C19770wU r15 = this.A04;
                    AnonymousClass1XY r42 = this.A02;
                    AnonymousClass1X4 r5 = this.A04;
                    C23981Ap r113 = this.A0S;
                    C18820ts r72 = this.A0A;
                    AnonymousClass1SV r14 = this.A0X;
                    C20830yE r6 = this.A09;
                    AnonymousClass1ST r10 = this.A0E;
                    AnonymousClass1HA r122 = this.A0T;
                    AnonymousClass1Y4 r92 = this.A0D;
                    AnonymousClass336 r13 = this.A0U;
                    View A0E2 = C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved);
                    return new AnonymousClass2Zw(A0E2, new C65633Sw(A0E2, r3, r42, r5, r6, r72, r8, r92, r10, r113, r122, r13, r14, r15));
                case 210:
                    return new C179768kf(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved));
                case 211:
                    return new C179808kj(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved));
                case 212:
                    return new C179868kp(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved), A3j().BBn());
                case 213:
                    return new C179828kl(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved));
                case 214:
                    return new C179898ks(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved));
                case 215:
                    return new C179838km(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved));
                case 216:
                    C20810yC r102 = this.A0D;
                    AnonymousClass17Y r82 = this.A05;
                    return new C179888kr(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved), this.A01, r82, this.A08, r102, this.A0V);
                default:
                    return super.A3i(viewGroup2, i2);
            }
        } else {
            return new C179848kn(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved), this.A0D);
        }
    }

    public B66 A3j() {
        AnonymousClass1EU r1;
        String str;
        if (this instanceof P2mLitePaymentTransactionDetailActivity) {
            r1 = this.A0L;
            str = "P2M_LITE";
        } else if (!(this instanceof GlobalPaymentTransactionDetailActivity)) {
            return this.A0L.A05();
        } else {
            r1 = this.A0L;
            str = "GLOBAL_ORDER";
        }
        AF8 A042 = r1.A04(str);
        C18740tg.A06(A042);
        AnonymousClass00C.A08(A042);
        return A042;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.whatsapp.payments.GlobalPaymentTransactionDetailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.whatsapp.payments.ui.P2mLitePaymentTransactionDetailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.whatsapp.payments.GlobalPaymentTransactionDetailActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.whatsapp.payments.GlobalPaymentTransactionDetailActivity} */
    /* JADX WARNING: type inference failed for: r3v7, types: [X.7yq] */
    /* JADX WARNING: type inference failed for: r15v4, types: [X.8lX] */
    /* JADX WARNING: type inference failed for: r14v3, types: [X.8lZ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C167797yq A3k(android.os.Bundle r52) {
        /*
            r51 = this;
            r2 = r52
            r1 = r51
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.P2mLitePaymentTransactionDetailActivity
            if (r0 == 0) goto L_0x00b0
            com.whatsapp.payments.ui.P2mLitePaymentTransactionDetailActivity r1 = (com.whatsapp.payments.ui.P2mLitePaymentTransactionDetailActivity) r1
            X.9On r3 = r1.A02
            if (r3 == 0) goto L_0x01ad
            if (r52 != 0) goto L_0x0014
            android.os.Bundle r2 = X.C36371kC.A0H(r1)
        L_0x0014:
            X.0wo r0 = r3.A06
            r49 = r0
            X.17Y r0 = r3.A00
            r48 = r0
            X.0wQ r0 = r3.A01
            r47 = r0
            X.0wG r0 = r3.A07
            r46 = r0
            X.0wU r0 = r3.A0W
            r45 = r0
            X.16S r0 = r3.A0E
            r30 = r0
            X.1FR r0 = r3.A0V
            r26 = r0
            X.16D r0 = r3.A04
            r23 = r0
            X.0yb r0 = r3.A05
            r22 = r0
            X.0ts r0 = r3.A08
            r24 = r0
            X.1EU r0 = r3.A0M
            r21 = r0
            X.1NG r0 = r3.A03
            r20 = r0
            X.0xM r0 = r3.A09
            r25 = r0
            X.39O r0 = r3.A0S
            r19 = r0
            X.1Db r0 = r3.A0J
            r18 = r0
            X.9iR r0 = r3.A0U
            r17 = r0
            X.1VZ r0 = r3.A0B
            r16 = r0
            X.1EZ r14 = r3.A0I
            X.1FF r13 = r3.A0A
            X.1EV r12 = r3.A0L
            X.16T r11 = r3.A0D
            X.9g7 r10 = r3.A0T
            X.1KK r9 = r3.A02
            X.6PS r8 = r3.A0O
            X.B3f r7 = r3.A0Q
            X.1YQ r6 = r3.A0R
            X.1Ed r5 = r3.A0C
            X.1XC r4 = r3.A0N
            X.1DR r0 = r3.A0K
            X.1Fo r15 = r3.A0H
            X.8lZ r3 = new X.8lZ
            r27 = r16
            r28 = r5
            r29 = r11
            r31 = r15
            r32 = r14
            r33 = r18
            r34 = r0
            r35 = r12
            r36 = r21
            r37 = r4
            r38 = r8
            r39 = r7
            r40 = r6
            r41 = r19
            r42 = r10
            r43 = r17
            r44 = r26
            r14 = r3
            r15 = r2
            r16 = r48
            r17 = r47
            r18 = r9
            r19 = r20
            r20 = r23
            r21 = r22
            r22 = r49
            r23 = r46
            r26 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
        L_0x00ad:
            r1.A0O = r3
            return r3
        L_0x00b0:
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity
            if (r0 == 0) goto L_0x00e6
            com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity r1 = (com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity) r1
            if (r52 != 0) goto L_0x00bc
            android.os.Bundle r2 = X.C36371kC.A0H(r1)
        L_0x00bc:
            X.1EV r0 = r1.A0K
            boolean r0 = r0.A01()
            X.9Op r4 = r1.A03
            if (r0 == 0) goto L_0x00d9
            r3 = 2
            X.B6r r0 = new X.B6r
            r0.<init>(r2, r4, r3)
            X.04H r1 = X.C165617ti.A0A(r0, r1)
            java.lang.Class<X.8lY> r0 = X.C180308lY.class
        L_0x00d2:
            X.04R r3 = r1.A00(r0)
            X.7yq r3 = (X.C167797yq) r3
            return r3
        L_0x00d9:
            r3 = 1
            X.B6r r0 = new X.B6r
            r0.<init>(r2, r4, r3)
            X.04H r1 = X.C165617ti.A0A(r0, r1)
            java.lang.Class<X.8la> r0 = X.C180328la.class
            goto L_0x00d2
        L_0x00e6:
            boolean r0 = r1 instanceof com.whatsapp.payments.GlobalPaymentTransactionDetailActivity
            if (r0 == 0) goto L_0x0190
            com.whatsapp.payments.GlobalPaymentTransactionDetailActivity r1 = (com.whatsapp.payments.GlobalPaymentTransactionDetailActivity) r1
            X.9Ol r3 = r1.A00
            if (r3 == 0) goto L_0x01b4
            if (r52 != 0) goto L_0x00f6
            android.os.Bundle r2 = X.C36371kC.A0H(r1)
        L_0x00f6:
            X.0wo r0 = r3.A06
            r50 = r0
            X.17Y r0 = r3.A00
            r49 = r0
            X.0wQ r0 = r3.A01
            r48 = r0
            X.0wG r0 = r3.A07
            r47 = r0
            X.0wU r0 = r3.A0T
            r46 = r0
            X.16S r0 = r3.A0E
            r27 = r0
            X.1FR r0 = r3.A0S
            r24 = r0
            X.16D r0 = r3.A04
            r23 = r0
            X.0yb r0 = r3.A05
            r22 = r0
            X.0ts r0 = r3.A08
            r25 = r0
            X.1EU r0 = r3.A0K
            r21 = r0
            X.1NG r0 = r3.A03
            r20 = r0
            X.0xM r0 = r3.A09
            r26 = r0
            X.39O r0 = r3.A0P
            r19 = r0
            X.1Db r0 = r3.A0H
            r18 = r0
            X.9iR r0 = r3.A0R
            r17 = r0
            X.1EZ r0 = r3.A0G
            r16 = r0
            X.1VZ r15 = r3.A0B
            X.1FF r14 = r3.A0A
            X.1EV r13 = r3.A0J
            X.16T r12 = r3.A0D
            X.9g7 r11 = r3.A0Q
            X.1KK r10 = r3.A02
            X.6PS r9 = r3.A0M
            X.B3f r8 = r3.A0N
            X.1YQ r7 = r3.A0O
            X.1Ed r6 = r3.A0C
            X.1XC r5 = r3.A0L
            X.1DR r4 = r3.A0I
            X.1Fo r0 = r3.A0F
            X.8lX r3 = new X.8lX
            r28 = r15
            r29 = r6
            r30 = r12
            r31 = r27
            r32 = r0
            r33 = r16
            r34 = r18
            r35 = r4
            r36 = r13
            r37 = r21
            r38 = r5
            r39 = r9
            r40 = r8
            r41 = r7
            r42 = r19
            r43 = r11
            r44 = r17
            r45 = r24
            r15 = r3
            r16 = r2
            r17 = r49
            r18 = r48
            r19 = r10
            r21 = r23
            r23 = r50
            r24 = r47
            r27 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            goto L_0x00ad
        L_0x0190:
            X.9Om r4 = r1.A0P
            X.B66 r0 = r1.A3j()
            X.B3f r3 = r0.BBn()
            if (r52 != 0) goto L_0x01a0
            android.os.Bundle r2 = X.C36371kC.A0H(r1)
        L_0x01a0:
            X.7yr r0 = new X.7yr
            r0.<init>(r2, r3, r4)
            X.04H r1 = X.C165617ti.A0A(r0, r1)
            java.lang.Class<X.7yq> r0 = X.C167797yq.class
            goto L_0x00d2
        L_0x01ad:
            java.lang.String r0 = "viewModelCreationDelegate"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01b4:
            java.lang.String r0 = "viewModelCreationDelegate"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity.A3k(android.os.Bundle):X.7yq");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02ad, code lost:
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02b0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x032e, code lost:
        startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0331, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04fb, code lost:
        r2 = r0.A05;
        X.C18740tg.A06(r2);
        r1 = new X.AnonymousClass9S7();
        r1.A04 = r3;
        r1.A01 = r9.A0A;
        r1.A02 = r2;
        r1.A03 = r9.A0R;
        r1.A00 = r9.A06;
        r1.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0518, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013f, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0142, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3l(X.C194139Og r23) {
        /*
            r22 = this;
            r0 = r23
            int r2 = r0.A00
            java.lang.String r5 = "extra_bank_account"
            java.lang.String r4 = "extra_merchant_code"
            java.lang.String r6 = "paymentHandle"
            java.lang.String r7 = "payment_transaction_details"
            r1 = 1
            r13 = 0
            r3 = 0
            r9 = r22
            switch(r2) {
                case 0: goto L_0x00eb;
                case 1: goto L_0x0278;
                case 2: goto L_0x013f;
                case 3: goto L_0x0287;
                case 4: goto L_0x0299;
                case 5: goto L_0x02b1;
                case 6: goto L_0x02ed;
                case 7: goto L_0x0319;
                case 8: goto L_0x0332;
                case 9: goto L_0x0304;
                case 10: goto L_0x0338;
                case 11: goto L_0x028b;
                case 12: goto L_0x0015;
                case 13: goto L_0x0441;
                case 14: goto L_0x0014;
                case 15: goto L_0x0014;
                case 16: goto L_0x045d;
                case 17: goto L_0x0121;
                case 18: goto L_0x012f;
                case 19: goto L_0x049a;
                case 20: goto L_0x049e;
                case 21: goto L_0x0155;
                case 22: goto L_0x04ce;
                case 23: goto L_0x04f9;
                case 24: goto L_0x0014;
                case 25: goto L_0x01fc;
                case 26: goto L_0x0229;
                case 27: goto L_0x0014;
                case 28: goto L_0x04cb;
                default: goto L_0x0014;
            }
        L_0x0014:
            return
        L_0x0015:
            X.7yq r2 = r9.A0O
            X.9Ml r2 = r2.A06
            if (r2 == 0) goto L_0x00e8
            X.3T1 r5 = r2.A02
        L_0x001d:
            X.A8P r2 = r9.A0G
            android.content.Intent r3 = r2.A01(r9, r1, r3)
            X.1De r2 = r9.A0J
            X.16U r7 = r2.A01()
            X.0ts r6 = r9.A0A
            X.9lY r2 = r5.A0M
            X.16X r2 = r2.A08
            java.lang.String r6 = r7.B7c(r6, r2)
            java.lang.String r2 = "extra_payment_preset_amount"
            r3.putExtra(r2, r6)
            X.1FR r8 = r9.A0R
            X.9lY r7 = r5.A0M
            int r6 = r7.A02
            r2 = 405(0x195, float:5.68E-43)
            if (r6 != r2) goto L_0x0057
            int r2 = r7.A03
            if (r2 != r1) goto L_0x0057
            X.1EV r2 = r8.A08
            X.0yC r6 = r2.A02
            r2 = 2381(0x94d, float:3.336E-42)
            boolean r2 = r6.A0E(r2)
            if (r2 == 0) goto L_0x0057
            X.9UH r2 = r9.A0Q
            r2.A01(r3)
        L_0x0057:
            X.3Qa r2 = r5.A1J
            X.11F r7 = r2.A00
            boolean r2 = r7 instanceof com.whatsapp.jid.GroupJid
            java.lang.String r6 = "extra_jid"
            if (r2 == 0) goto L_0x00df
            java.lang.String r2 = r7.getRawString()
            r3.putExtra(r6, r2)
            X.9lY r2 = r5.A0M
            com.whatsapp.jid.UserJid r2 = r2.A0D
            java.lang.String r2 = X.AnonymousClass143.A03(r2)
            java.lang.String r6 = "extra_receiver_jid"
        L_0x0072:
            r3.putExtra(r6, r2)
            java.lang.String r6 = r5.A0b()
            java.lang.String r2 = "extra_payment_note"
            r3.putExtra(r2, r6)
            java.lang.String r2 = "extra_conversation_message_type"
            r3.putExtra(r2, r1)
            boolean r1 = r5.A1H()
            if (r1 == 0) goto L_0x0094
            java.util.List r1 = r5.A0w
            java.lang.String r2 = X.C65713Te.A01(r1)
            java.lang.String r1 = "extra_mentioned_jids"
            r3.putExtra(r1, r2)
        L_0x0094:
            X.9lY r1 = r5.A0M
            if (r1 == 0) goto L_0x00a3
            X.6c9 r2 = r1.A05()
            if (r2 == 0) goto L_0x00a3
            java.lang.String r1 = "extra_payment_background"
            r3.putExtra(r1, r2)
        L_0x00a3:
            X.0yC r2 = r9.A0D
            r1 = 812(0x32c, float:1.138E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 != 0) goto L_0x00b7
            X.0yC r2 = r9.A0D
            r1 = 811(0x32b, float:1.136E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x00cf
        L_0x00b7:
            boolean r1 = r5 instanceof X.C46962bx
            if (r1 == 0) goto L_0x00cf
            X.2bx r5 = (X.C46962bx) r5
            X.1Ap r1 = r9.A0S
            X.6c4 r2 = r1.A00(r5)
            java.lang.String r1 = "extra_payment_sticker"
            r3.putExtra(r1, r2)
            java.lang.Integer r2 = r5.A06
            java.lang.String r1 = "extra_payment_sticker_send_origin"
            r3.putExtra(r1, r2)
        L_0x00cf:
            java.lang.String r2 = "referral_screen"
            java.lang.String r1 = "send_again_button"
            r3.putExtra(r2, r1)
            java.lang.String r0 = r0.A0B
            r3.putExtra(r4, r0)
            r9.startActivity(r3)
            goto L_0x013f
        L_0x00df:
            X.9lY r2 = r5.A0M
            com.whatsapp.jid.UserJid r2 = r2.A0D
            java.lang.String r2 = X.AnonymousClass143.A03(r2)
            goto L_0x0072
        L_0x00e8:
            r5 = 0
            goto L_0x001d
        L_0x00eb:
            android.os.Bundle r2 = r0.A02
            java.lang.String r0 = "action_bar_on_configuration_change"
            boolean r0 = r2.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x00fc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r9.A3m(r0, r13)
        L_0x00fc:
            java.lang.String r0 = "action_bar_title_res_id"
            int r0 = r2.getInt(r0)
            X.07B r2 = r9.getSupportActionBar()
            if (r2 == 0) goto L_0x0014
            r2.A0U(r1)
            r2.A0I(r0)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "extra_action_bar_display_close"
            boolean r0 = r1.getBooleanExtra(r0, r3)
            if (r0 == 0) goto L_0x0014
            r0 = 2131232567(0x7f080737, float:1.8081247E38)
            r2.A0G(r0)
            return
        L_0x0121:
            X.9lY r1 = r0.A05
            if (r1 == 0) goto L_0x0014
            X.B66 r1 = r9.A3j()
            X.9lY r0 = r0.A05
            X.AnonymousClass97N.A00(r9, r0, r1, r7, r3)
            return
        L_0x012f:
            boolean r0 = r9 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity
            if (r0 == 0) goto L_0x0143
            X.17Y r1 = r9.A05
            r0 = 2131892306(0x7f121852, float:1.9419357E38)
            java.lang.String r0 = r9.getString(r0)
            r1.A0E(r0, r3)
        L_0x013f:
            r9.finish()
            return
        L_0x0143:
            boolean r0 = r9 instanceof com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity
            if (r0 == 0) goto L_0x013f
            X.7yq r2 = r9.A0O
            boolean r0 = r2 instanceof X.C180328la
            if (r0 == 0) goto L_0x0014
            X.0wU r1 = r2.A0h
            r0 = 43
            X.AVY.A00(r1, r2, r0)
            return
        L_0x0155:
            X.7yq r4 = r9.A0O
            java.lang.String r3 = r9.A0a
            r2 = 87
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            X.B3f r12 = r4.A0b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            r19 = r13
            r20 = 0
            r21 = 1
            r16 = r7
            r17 = r3
            r18 = r13
            r12.BOq(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.2bZ r2 = r0.A08
            if (r2 != 0) goto L_0x01cd
            java.lang.String r2 = "PAY : PaymentTransactionDetailsListActivity/EVENT_OPEN_ORDER_DETAILS_PAGE : orderMessageKey is null"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            X.9lY r3 = r0.A05
            if (r3 == 0) goto L_0x01cb
            com.whatsapp.jid.UserJid r2 = r3.A0D
            if (r2 == 0) goto L_0x01cb
            java.lang.Boolean r4 = r3.A06()
            if (r4 == 0) goto L_0x01cb
            X.16D r3 = r9.A06
            X.9lY r2 = r0.A05
            com.whatsapp.jid.UserJid r2 = r2.A0D
            X.141 r3 = r3.A0D(r2)
            boolean r2 = r4.booleanValue()
            if (r2 == 0) goto L_0x01c8
            java.lang.String r5 = r3.A0J()
        L_0x019f:
            r2 = 2131891856(0x7f121690, float:1.9418444E38)
            java.lang.String r4 = r9.getString(r2)
            r3 = 2131891855(0x7f12168f, float:1.9418442E38)
            java.lang.Object[] r2 = X.C36411kG.A1b(r5)
            java.lang.String r0 = r0.A0D
            java.lang.String r1 = X.C36391kE.A0v(r9, r0, r2, r1, r3)
            X.1qm r0 = X.AnonymousClass3LW.A00(r9)
            r0.A0q(r4)
            X.C39001qm.A0A(r0, r1)
            X.0FM r0 = r0.create()
            r0.setOnDismissListener(r13)
            r0.show()
            return
        L_0x01c8:
            java.lang.String r5 = r3.A0a
            goto L_0x019f
        L_0x01cb:
            r5 = r13
            goto L_0x019f
        L_0x01cd:
            X.C18740tg.A06(r2)
            X.3Qa r14 = r2.A1J
            boolean r1 = r14.A02
            if (r1 == 0) goto L_0x0519
            X.39O r1 = r9.A0N
            X.0yC r1 = r1.A01
            r2 = 1107(0x453, float:1.551E-42)
            r1.A0E(r2)
            X.39O r1 = r9.A0N
            X.0yC r1 = r1.A01
            boolean r1 = r1.A0E(r2)
            if (r1 == 0) goto L_0x0014
            X.39O r1 = r9.A0N
            X.2bZ r0 = r0.A08
            X.C18740tg.A06(r0)
            X.0v5 r0 = r1.A00
            r0.A02()
            java.lang.String r0 = "getOrderDetailsActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x01fc:
            X.7yq r3 = r9.A0O
            java.lang.String r2 = r9.A0a
            r0 = 142(0x8e, float:1.99E-43)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r20 = 0
            X.B3f r12 = r3.A0b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            r19 = r13
            r21 = 1
            r16 = r7
            r17 = r2
            r18 = r13
            r12.BOq(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.B66 r0 = r9.A3j()
            X.9jA r0 = r0.BE1()
            if (r0 == 0) goto L_0x0014
            r0.A00(r9, r7)
            return
        L_0x0229:
            X.7yq r4 = r9.A0O
            java.lang.String r3 = r9.A0a
            r2 = 143(0x8f, float:2.0E-43)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            r20 = 0
            X.B3f r12 = r4.A0b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            r19 = r13
            r21 = 1
            r16 = r7
            r17 = r3
            r18 = r13
            r12.BOq(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.39O r3 = r9.A0N
            X.0wQ r2 = r9.A02
            X.9lY r1 = r0.A05
            X.C18740tg.A06(r1)
            com.whatsapp.jid.UserJid r1 = r1.A0E
            boolean r1 = r2.A0M(r1)
            X.9lY r0 = r0.A05
            if (r1 != 0) goto L_0x0275
            com.whatsapp.jid.UserJid r0 = r0.A0E
        L_0x025d:
            X.C18740tg.A06(r0)
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r2)
            if (r0 == 0) goto L_0x0014
            X.0v5 r0 = r3.A00
            r0.A02()
            r2.A0G()
            java.lang.String r0 = "getCreateOrderActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0275:
            com.whatsapp.jid.UserJid r0 = r0.A0D
            goto L_0x025d
        L_0x0278:
            boolean r0 = r0.A0H
            if (r0 == 0) goto L_0x0283
            r0 = 2131892453(0x7f1218e5, float:1.9419655E38)
            r9.Bu1(r0)
            return
        L_0x0283:
            r9.Bnv()
            return
        L_0x0287:
            r9.invalidateOptionsMenu()
            return
        L_0x028b:
            android.content.Context r1 = r9.getApplicationContext()
            java.lang.String r0 = r0.A0G
            X.C18740tg.A06(r0)
            android.content.Intent r0 = X.AnonymousClass190.A1L(r1, r0, r13, r3, r3)
            goto L_0x02ad
        L_0x0299:
            X.141 r2 = r0.A03
            X.C18740tg.A06(r2)
            X.190 r1 = new X.190
            r1.<init>()
            r0 = 18
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.content.Intent r0 = r1.A1X(r9, r2, r0)
        L_0x02ad:
            r9.startActivity(r0)
            return
        L_0x02b1:
            X.B66 r1 = r9.A3j()
            java.lang.Class r1 = r1.BFf()
            android.content.Intent r3 = X.C36441kJ.A0H(r9, r1)
            X.6vT r5 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r1 = r0.A0F
            X.6c7 r2 = X.C165617ti.A0P(r5, r2, r1, r6)
            java.lang.String r1 = "extra_payment_handle"
            r3.putExtra(r1, r2)
            java.lang.String r2 = "extra_referral_screen"
            java.lang.String r1 = "payment_transaction_history"
            r3.putExtra(r2, r1)
            java.lang.String r2 = r0.A0E
            java.lang.String r1 = "extra_payment_handle_id"
            r3.putExtra(r1, r2)
            X.6c7 r2 = r0.A07
            java.lang.String r1 = "extra_payee_name"
            r3.putExtra(r1, r2)
            java.lang.String r0 = r0.A0B
            r3.putExtra(r4, r0)
            r0 = 0
            r9.A33(r3, r0)
            return
        L_0x02ed:
            r2 = 2131892185(0x7f1217d9, float:1.9419111E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.B66 r0 = r9.A3j()
            int r0 = r0.BFX()
            java.lang.String r0 = r9.getString(r0)
            r1[r3] = r0
            r9.BO9(r1, r3, r2)
            return
        L_0x0304:
            X.B66 r1 = r9.A3j()
            java.lang.Class r1 = r1.B89()
            android.content.Intent r2 = X.C36441kJ.A0H(r9, r1)
            X.9un r0 = r0.A04
            X.C18740tg.A06(r0)
            r2.putExtra(r5, r0)
            goto L_0x032e
        L_0x0319:
            java.lang.Class r1 = r0.A09
            android.content.Intent r2 = X.C36441kJ.A0H(r9, r1)
            X.9un r0 = r0.A04
            X.C18740tg.A06(r0)
            r2.putExtra(r5, r0)
            java.lang.String r1 = "event_screen"
            java.lang.String r0 = "forgot_pin"
            r2.putExtra(r1, r0)
        L_0x032e:
            r9.startActivity(r2)
            return
        L_0x0332:
            java.lang.String r0 = r0.A0C
            r9.BO7(r13, r0)
            return
        L_0x0338:
            X.9lY r15 = r0.A05
            X.C18740tg.A06(r15)
            X.9un r14 = r0.A04
            boolean r0 = r15.A0K()
            if (r0 == 0) goto L_0x0348
            java.lang.String r2 = "payments:request"
            goto L_0x034a
        L_0x0348:
            java.lang.String r2 = "payments:transaction"
        L_0x034a:
            org.json.JSONObject r3 = X.C36441kJ.A1B()     // Catch:{ Exception -> 0x0397 }
            java.lang.String r1 = "lg"
            X.0ts r0 = r9.A0A     // Catch:{ Exception -> 0x0397 }
            java.lang.String r0 = r0.A06()     // Catch:{ Exception -> 0x0397 }
            org.json.JSONObject r3 = r3.put(r1, r0)     // Catch:{ Exception -> 0x0397 }
            java.lang.String r1 = "lc"
            X.0ts r0 = r9.A0A     // Catch:{ Exception -> 0x0397 }
            java.lang.String r0 = r0.A05()     // Catch:{ Exception -> 0x0397 }
            org.json.JSONObject r3 = r3.put(r1, r0)     // Catch:{ Exception -> 0x0397 }
            java.lang.String r1 = "platform"
            java.lang.String r0 = "android"
            org.json.JSONObject r1 = r3.put(r1, r0)     // Catch:{ Exception -> 0x0397 }
            java.lang.String r0 = "context"
            org.json.JSONObject r3 = r1.put(r0, r2)     // Catch:{ Exception -> 0x0397 }
            java.lang.String r1 = "type"
            java.lang.String r0 = "p2p"
            org.json.JSONObject r3 = r3.put(r1, r0)     // Catch:{ Exception -> 0x0397 }
            java.lang.String r1 = r15.A0J     // Catch:{ Exception -> 0x0397 }
            if (r1 == 0) goto L_0x0385
            java.lang.String r0 = "error_code"
            r3.put(r0, r1)     // Catch:{ Exception -> 0x0397 }
        L_0x0385:
            if (r14 == 0) goto L_0x039f
            java.lang.String r0 = r14.A0B     // Catch:{ Exception -> 0x0397 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0397 }
            if (r0 != 0) goto L_0x039f
            java.lang.String r1 = "bank_name"
            java.lang.String r0 = r14.A0B     // Catch:{ Exception -> 0x0397 }
            r3.put(r1, r0)     // Catch:{ Exception -> 0x0397 }
            goto L_0x039f
        L_0x0397:
            r3 = move-exception
            X.1Dc r1 = r9.A0c
            java.lang.String r0 = "debugInfoData fields"
            r1.A0A(r0, r3)
        L_0x039f:
            android.os.Bundle r8 = X.AnonymousClass001.A07()
            boolean r0 = r15.A0K()
            if (r0 != 0) goto L_0x03b0
            java.lang.String r1 = r15.A0K
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId"
            r8.putString(r0, r1)
        L_0x03b0:
            java.lang.String r1 = r15.A0F
            if (r1 == 0) goto L_0x03b9
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentBankTxnId"
            r8.putString(r0, r1)
        L_0x03b9:
            if (r14 == 0) goto L_0x03d9
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentMethod"
            r8.putParcelable(r0, r14)
            X.8bF r1 = r14.A08
            if (r1 == 0) goto L_0x0439
            boolean r0 = r1 instanceof X.C175738ay
            if (r0 != 0) goto L_0x0437
            boolean r0 = r1 instanceof X.C175888bE
            if (r0 != 0) goto L_0x0437
            boolean r0 = r1 instanceof X.C175858bB
            if (r0 == 0) goto L_0x0432
            X.8bB r1 = (X.C175858bB) r1
            java.lang.String r1 = r1.A0B
        L_0x03d4:
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentBankPhone"
            r8.putString(r0, r1)
        L_0x03d9:
            java.lang.String r1 = r15.A0J
            if (r1 == 0) goto L_0x03e2
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentErrorCode"
            r8.putString(r0, r1)
        L_0x03e2:
            int r1 = r15.A02
            r0 = 409(0x199, float:5.73E-43)
            if (r1 != r0) goto L_0x03f5
            r1 = 2
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.type"
            r8.putInt(r0, r1)
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.paymentStatus"
            java.lang.String r0 = "RF"
            r8.putString(r1, r0)
        L_0x03f5:
            X.B66 r0 = r9.A3j()
            X.3Kk r0 = r0.BFU()
            if (r0 == 0) goto L_0x0410
            boolean r0 = r0 instanceof X.AnonymousClass2ZV
            if (r0 != 0) goto L_0x0410
            android.net.Uri r0 = r9.A2j()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.uri"
            r8.putString(r0, r1)
        L_0x0410:
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.from"
            r8.putString(r0, r2)
            X.0wU r3 = r9.A04
            X.0ww r12 = r9.A03
            X.0yf r11 = r9.A06
            X.3DY r10 = r9.A01
            X.0ts r13 = r9.A0A
            X.13E r1 = r9.A0C
            X.1De r0 = r9.A0J
            X.2kV r7 = new X.2kV
            r17 = r0
            r18 = r2
            r16 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.C36391kE.A1Q(r7, r3)
            return
        L_0x0432:
            X.8bA r1 = (X.C175848bA) r1
            java.lang.String r1 = r1.A04
            goto L_0x03d4
        L_0x0437:
            r1 = 0
            goto L_0x03d4
        L_0x0439:
            X.1Dc r1 = r9.A0c
            java.lang.String r0 = "payment method missing country fields"
            r1.A05(r0)
            goto L_0x03d9
        L_0x0441:
            X.3EU r8 = r9.A0I
            com.whatsapp.jid.UserJid r11 = r0.A06
            X.6vT r3 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r1 = r0.A0F
            X.6c7 r12 = X.C165617ti.A0P(r3, r2, r1, r6)
            r1 = 2
            X.B7n r10 = new X.B7n
            r10.<init>(r0, r9, r1)
            r13 = 0
            r14 = 0
            r8.A00(r9, r10, r11, r12, r13, r14)
            return
        L_0x045d:
            X.9un r1 = r0.A04
            X.C18740tg.A06(r1)
            java.lang.String r1 = r0.A0A
            X.C18740tg.A06(r1)
            X.6Be r6 = new X.6Be
            r6.<init>(r1, r13, r13)
            java.util.HashMap r8 = X.AnonymousClass001.A0J()
            X.9un r0 = r0.A04
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "credential_id"
            r8.put(r0, r1)
            X.17Y r1 = r9.A05
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r1.A05(r3, r0)
            X.005 r0 = r9.A0Z
            java.lang.Object r3 = r0.get()
            X.627 r3 = (X.AnonymousClass627) r3
            r0 = 8
            X.BAa r4 = new X.BAa
            r4.<init>(r9, r0)
            r0 = 4
            X.9oK r5 = new X.9oK
            r5.<init>(r9, r0)
            r3.A00(r4, r5, r6, r7, r8)
            return
        L_0x049a:
            super.onBackPressed()
            return
        L_0x049e:
            X.7yq r3 = r9.A0O
            java.lang.String r2 = r9.A0a
            r0 = 141(0x8d, float:1.98E-43)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r20 = 0
            X.B3f r12 = r3.A0b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            r19 = r13
            r21 = 1
            r16 = r7
            r17 = r2
            r18 = r13
            r12.BOq(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.1Dv r2 = r9.A01
            X.3Cz r1 = r9.A0Y
            java.lang.String r0 = "smb_transaction_details"
            android.content.Intent r0 = r1.A00(r0)
            r2.A06(r9, r0)
            return
        L_0x04cb:
            java.lang.String r3 = "wa_p2m_lite_receipt_support"
            goto L_0x04fb
        L_0x04ce:
            X.7yq r1 = r9.A0O
            X.9Ml r1 = r1.A06
            if (r1 == 0) goto L_0x04ef
            X.3T1 r1 = r1.A02
        L_0x04d6:
            X.185 r2 = r9.A07
            X.9lY r1 = r1.A0M
            com.whatsapp.jid.UserJid r1 = r1.A0D
            X.3L0 r1 = r2.A01(r1)
            boolean r3 = r1.A01()
            X.9lY r1 = r0.A05
            int r2 = r1.A03
            r1 = 200(0xc8, float:2.8E-43)
            if (r2 != r1) goto L_0x04f1
            java.lang.String r3 = "wa_smb_p2m_payment_details"
            goto L_0x04fb
        L_0x04ef:
            r1 = 0
            goto L_0x04d6
        L_0x04f1:
            if (r3 == 0) goto L_0x04f6
            java.lang.String r3 = "wa_api_p2m_receipt_support"
            goto L_0x04fb
        L_0x04f6:
            java.lang.String r3 = "wa_p2m_receipt_support"
            goto L_0x04fb
        L_0x04f9:
            java.lang.String r3 = "wa_p2m_receipt_report_transaction"
        L_0x04fb:
            X.9lY r2 = r0.A05
            X.C18740tg.A06(r2)
            X.9S7 r1 = new X.9S7
            r1.<init>()
            r1.A04 = r3
            X.0ts r0 = r9.A0A
            r1.A01 = r0
            r1.A02 = r2
            X.1FR r0 = r9.A0R
            r1.A03 = r0
            X.16D r0 = r9.A06
            r1.A00 = r0
            r1.A00(r9)
            return
        L_0x0519:
            X.1EV r12 = r9.A0K
            X.A8P r11 = r9.A0G
            X.C18740tg.A06(r2)
            X.11F r10 = r14.A00
            X.C18740tg.A06(r10)
            X.C18740tg.A06(r2)
            java.lang.String r1 = r0.A0D
            X.C18740tg.A06(r1)
            int r0 = r0.A01
            java.lang.String r18 = "order_details"
            r20 = -1
            r16 = r13
            r15 = r13
            r17 = r1
            r19 = r0
            X.C1901296z.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity.A3l(X.9Og):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bf, code lost:
        if (r2.A03 != 40) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c2, code lost:
        if (r2 != null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c4, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        if (X.C200899iR.A01(r2) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cc, code lost:
        r5.BOq(r6, r16, r17, "payment_transaction_details", r10, (java.lang.String) null, (java.lang.String) null, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3m(java.lang.Integer r16, java.lang.Integer r17) {
        /*
            r15 = this;
            X.7yq r0 = r15.A0O
            X.9Ml r0 = r0.A06
            r6 = 0
            if (r0 != 0) goto L_0x0116
            r2 = r6
        L_0x0008:
            X.B66 r0 = r15.A3j()
            X.B3f r5 = r0.BBn()
            if (r5 == 0) goto L_0x00d7
            if (r2 == 0) goto L_0x0080
            X.1FR r3 = r15.A0R
            int r1 = r2.A03
            r0 = 9
            if (r1 != r0) goto L_0x00ec
            java.lang.String r1 = "cashback"
        L_0x001e:
            java.lang.String r0 = "cashback"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = "incentive"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = "purchase"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            X.6Ps r6 = X.C165567td.A0F()
        L_0x003a:
            java.lang.String r0 = "transaction_type"
            r6.A03(r0, r1)
            X.7yq r0 = r15.A0O
            X.9Ml r0 = r0.A06
            if (r0 == 0) goto L_0x0069
            X.9un r4 = r0.A00
            if (r4 == 0) goto L_0x0069
            boolean r0 = r4 instanceof X.C175788b3
            if (r0 == 0) goto L_0x00d8
            r0 = r4
            X.8b3 r0 = (X.C175788b3) r0
            java.lang.String r3 = r0.A00
            java.lang.String r1 = "confirm"
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "payment_instruction"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00d8
            java.lang.String r1 = "cpi"
        L_0x0064:
            java.lang.String r0 = "payment_type"
            r6.A03(r0, r1)
        L_0x0069:
            boolean r0 = r15 instanceof com.whatsapp.payments.ui.P2mLitePaymentTransactionDetailActivity
            if (r0 == 0) goto L_0x0080
            X.0ts r3 = r15.A0A
            X.1FR r0 = r15.A0R
            int r1 = r0.A0C(r2)
            android.content.Context r0 = r3.A00
            java.lang.String r1 = X.C36401kF.A0o(r0, r1)
            java.lang.String r0 = "transaction_status_name"
            r6.A03(r0, r1)
        L_0x0080:
            boolean r0 = r15 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity
            if (r0 == 0) goto L_0x00b6
            android.content.Intent r3 = r15.getIntent()
            java.lang.String r0 = "extra_mapper_alias_resolved"
            r1 = 0
            boolean r0 = r3.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x00b6
            if (r6 != 0) goto L_0x009b
            X.6Ps[] r1 = new X.C131606Ps[r1]
            r0 = 0
            X.6Ps r6 = new X.6Ps
            r6.<init>(r0, r1)
        L_0x009b:
            r1 = 1
            java.lang.String r0 = "is_alias_resolved"
            r6.A02(r0, r1)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "extra_receiver_platform"
            java.lang.String r1 = r1.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "receiver_platform"
            r6.A03(r0, r1)
        L_0x00b6:
            java.lang.String r10 = r15.A0a
            if (r2 == 0) goto L_0x00c1
            int r1 = r2.A03
            r0 = 40
            r13 = 1
            if (r1 == r0) goto L_0x00c4
        L_0x00c1:
            r13 = 0
            if (r2 == 0) goto L_0x00cb
        L_0x00c4:
            boolean r0 = X.C200899iR.A01(r2)
            r14 = 1
            if (r0 != 0) goto L_0x00cc
        L_0x00cb:
            r14 = 0
        L_0x00cc:
            r11 = 0
            java.lang.String r9 = "payment_transaction_details"
            r7 = r16
            r8 = r17
            r12 = r11
            r5.BOq(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x00d7:
            return
        L_0x00d8:
            boolean r0 = r4 instanceof X.C175768b1
            if (r0 != 0) goto L_0x00e2
            boolean r0 = r4 instanceof X.C175798b4
            if (r0 != 0) goto L_0x00e2
            r1 = 0
            goto L_0x0064
        L_0x00e2:
            java.lang.String r1 = "native"
            goto L_0x0064
        L_0x00e5:
            X.8gj r6 = new X.8gj
            r6.<init>()
            goto L_0x003a
        L_0x00ec:
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00f4
            r0 = 100
            if (r1 != r0) goto L_0x0106
        L_0x00f4:
            X.1EV r1 = r3.A08
            boolean r0 = r1.A0B()
            if (r0 != 0) goto L_0x0102
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0106
        L_0x0102:
            java.lang.String r1 = "purchase"
            goto L_0x001e
        L_0x0106:
            X.8av r0 = r2.A0A
            if (r0 == 0) goto L_0x0112
            X.9ue r0 = r0.A00
            if (r0 == 0) goto L_0x0112
            java.lang.String r1 = "incentive"
            goto L_0x001e
        L_0x0112:
            java.lang.String r1 = "none"
            goto L_0x001e
        L_0x0116:
            X.9lY r2 = r0.A01
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity.A3m(java.lang.Integer, java.lang.Integer):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C193689Ml r0 = this.A0O.A06;
        if (!(r0 == null || r0.A02 == null)) {
            menu.add(0, R.id.menuitem_view_in_chat, 0, R.string.f12nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        AnonymousClass3T1 r4;
        Intent A0D2;
        long j;
        Class cls;
        C193689Ml r0 = this.A0O.A06;
        if (r0 != null) {
            r4 = r0.A02;
        } else {
            r4 = null;
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
            if (isTaskRoot()) {
                if (this instanceof IndiaUpiPaymentTransactionDetailsActivity) {
                    cls = IndiaPaymentTransactionHistoryActivity.class;
                } else {
                    cls = PaymentTransactionHistoryActivity.class;
                }
                A0D2 = C36441kJ.A0H(this, cls);
                A0D2.putExtra("extra_show_requests", this.A0O.A09);
                finishAndRemoveTask();
            }
            return true;
        }
        if (r4 != null) {
            if (menuItem.getItemId() == R.id.menuitem_view_in_chat) {
                if (r4.A1N == 0) {
                    j = 1;
                } else {
                    j = r4.A1N;
                }
                long A022 = C66013Ui.A02(r4);
                C24801Dv r7 = this.A01;
                AnonymousClass190 r8 = new AnonymousClass190();
                C18740tg.A06(r4);
                C64933Qa r42 = r4.A1J;
                r7.A07(this, AnonymousClass3UJ.A00(r8.A1Z(this, r42.A00, 0).putExtra("row_id", j).putExtra("sort_id", A022), r42));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_debug) {
                C18740tg.A0C(this.A0K.A04(0));
                A0D2 = C36431kI.A0D();
                String BFO = A3j().BFO();
                if (TextUtils.isEmpty(BFO)) {
                    return false;
                }
                A0D2.setClassName(this, BFO);
                A0D2.putExtra("extra_transaction_id", r4.A0t);
                C64933Qa r02 = r4.A1J;
                if (r02 != null) {
                    AnonymousClass3UJ.A00(A0D2, r02);
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
        startActivity(A0D2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (X.C36371kC.A0H(r4) != null) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.P2mLitePaymentTransactionDetailActivity
            if (r0 == 0) goto L_0x0040
            X.1EV r0 = r4.A0K
            boolean r0 = r0.A02()
        L_0x000d:
            X.C18740tg.A0C(r0)
            java.lang.String r0 = X.C165597tg.A0j(r4)
            r4.A0a = r0
            X.16S r0 = r4.A0B
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0024
            if (r5 != 0) goto L_0x004e
            android.os.Bundle r0 = X.C36371kC.A0H(r4)
            if (r0 != 0) goto L_0x004e
        L_0x0024:
            X.1Dc r3 = r4.A0c
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PaymentStore uninitialized or no valid bundle: "
            r2.append(r0)
            if (r5 != 0) goto L_0x0038
            android.os.Bundle r1 = X.C36371kC.A0H(r4)
            r0 = 1
            if (r1 == 0) goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            X.C165577te.A1E(r3, r2, r0)
            r4.finish()
            return
        L_0x0040:
            boolean r0 = r4 instanceof com.whatsapp.payments.GlobalPaymentTransactionDetailActivity
            if (r0 == 0) goto L_0x0046
            r0 = 1
            goto L_0x000d
        L_0x0046:
            X.1EV r1 = r4.A0K
            r0 = 0
            boolean r0 = r1.A04(r0)
            goto L_0x000d
        L_0x004e:
            X.7yq r2 = r4.A3k(r5)
            r4.A0O = r2
            r0 = 8
            X.BAA r1 = new X.BAA
            r1.<init>(r4, r0)
            X.00s r0 = r2.A01
            r0.A08(r4, r1)
            r0 = 7
            X.BAA r1 = new X.BAA
            r1.<init>(r4, r0)
            X.1Rs r0 = r2.A08
            r0.A08(r4, r1)
            X.7yq r2 = r4.A0O
            r1 = 2
            X.9FZ r0 = new X.9FZ
            r0.<init>(r1)
            r2.A0d(r0)
            X.17Y r3 = r4.A05
            X.1e1 r2 = r4.A0W
            X.0v0 r1 = r4.A09
            X.9SI r0 = new X.9SI
            r0.<init>(r3, r1, r2)
            r4.A0b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C183808rO r1;
        AnonymousClass1DR r12;
        B2Z b2z;
        super.onDestroy();
        C167797yq r0 = this.A0O;
        if (!(r0 == null || (r12 = r0.A0W) == null || (b2z = r0.A0V) == null)) {
            r12.unregisterObserver(b2z);
        }
        AnonymousClass9SI r2 = this.A0b;
        if (r2 != null && (r1 = r2.A00) != null) {
            r1.A02 = true;
            r1.interrupt();
            r2.A00 = null;
        }
    }
}
