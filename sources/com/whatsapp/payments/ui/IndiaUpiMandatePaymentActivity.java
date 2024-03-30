package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0FM;
import X.AnonymousClass16S;
import X.AnonymousClass3LW;
import X.AnonymousClass5YM;
import X.AnonymousClass9DX;
import X.B7Z;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C167687yZ;
import X.C173858Tk;
import X.C175728ax;
import X.C179098jA;
import X.C18800tq;
import X.C18830tt;
import X.C202059ky;
import X.C202319lY;
import X.C203419nz;
import X.C206289t2;
import X.C207079uW;
import X.C207249un;
import X.C23186B8u;
import X.C24611Dc;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C39001qm;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class IndiaUpiMandatePaymentActivity extends C179098jA {
    public int A00;
    public AnonymousClass9DX A01;
    public PaymentBottomSheet A02;
    public C167687yZ A03;
    public String A04;
    public boolean A05;
    public final C24611Dc A06;

    public void BUD(View view, View view2, C207079uW r4, C175728ax r5, C207249un r6, PaymentBottomSheet paymentBottomSheet) {
        super.BUD(view, view2, (C207079uW) null, r5, r6, paymentBottomSheet);
        this.A0S.BOn(C36361kB.A0i(), 104, "approve_mandate_prompt", this.A04, true);
    }

    public boolean Btt() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 || (i == 155 && i2 != -1)) {
            finish();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public static Intent A0z(Context context, C202319lY r3, String str, int i) {
        C206289t2 r1;
        Intent A0H = C36441kJ.A0H(context, IndiaUpiMandatePaymentActivity.class);
        C203419nz r0 = C203419nz.$redex_init_class;
        if (r3 == null) {
            r1 = null;
        } else {
            r1 = new C206289t2(r3);
        }
        A0H.putExtra("payment_transaction_info", r1);
        A0H.putExtra("user_action", i);
        A0H.putExtra("extra_referral_screen", str);
        return A0H;
    }

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            C173858Tk.A0k(A0L, r2, r1, this);
            this.A04 = (AnonymousClass16S) r2.A6x.get();
            C173858Tk.A0l(r2, r1, C36361kB.A0V(r2), this);
            this.A01 = (AnonymousClass9DX) A0L.A2p.get();
        }
    }

    /* JADX WARNING: type inference failed for: r9v7, types: [X.8gX] */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x05cd, code lost:
        r47.A0E(r9, r1, r25, r30, r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x05d8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0145, code lost:
        r6 = new X.B7M(r7, r8, r9, r10, r2, r5, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x014d, code lost:
        r0.A0H(r3, r14, "set", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0156, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4M(X.C207249un r49, java.util.HashMap r50) {
        /*
            r48 = this;
            r4 = r49
            r0 = r48
            X.7yZ r0 = r0.A03
            if (r49 != 0) goto L_0x000a
            X.9un r4 = r0.A05
        L_0x000a:
            X.1Dc r2 = r0.A0L
            java.lang.String r1 = "handleCredentialBlob"
            r2.A06(r1)
            X.00s r3 = r0.A01
            X.0wG r1 = r0.A04
            android.content.Context r2 = r1.A00
            r1 = 2131893491(0x7f121cf3, float:1.942176E38)
            X.AnonymousClass9IK.A00(r2, r3, r1)
            X.9lY r3 = r0.A07
            X.8av r6 = r3.A0A
            X.8bI r6 = (X.C175928bI) r6
            X.C18740tg.A06(r6)
            int r2 = r0.A00
            r1 = r50
            switch(r2) {
                case 1: goto L_0x002e;
                case 2: goto L_0x002d;
                case 3: goto L_0x009b;
                case 4: goto L_0x002e;
                case 5: goto L_0x002d;
                case 6: goto L_0x00e9;
                case 7: goto L_0x0157;
                case 8: goto L_0x019f;
                case 9: goto L_0x02d6;
                default: goto L_0x002d;
            }
        L_0x002d:
            return
        L_0x002e:
            X.9jw r2 = r6.A0G
            X.9je r7 = r2.A0C
            X.8gS r9 = r0.A08
            X.AEe r8 = new X.AEe
            r8.<init>(r4, r7, r0)
            java.lang.String r0 = "PAY: acceptPayeeMandate called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "action"
            java.lang.String r6 = "upi-accept-mandate-request"
            X.C36381kD.A1M(r0, r6, r5)
            X.AnonymousClass8gS.A01(r3, r9, r5)
            X.AnonymousClass8gS.A00(r4, r9, r6, r1, r5)
            X.8av r4 = r3.A0A
            X.8bI r4 = (X.C175928bI) r4
            X.9jw r0 = r4.A0G
            X.C18740tg.A06(r0)
            X.6c7 r1 = r0.A06
            boolean r0 = X.C202349ld.A03(r1)
            if (r0 != 0) goto L_0x006b
            java.lang.Object r1 = X.C165577te.A0g(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "mandate-info"
            X.C36381kD.A1M(r0, r1, r5)
        L_0x006b:
            r0 = 0
            r2 = 0
            X.AnonymousClass8gS.A02(r7, r4, r0, r5, r2)
            X.8gJ r1 = r9.A07
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = "U66"
            r1.A00(r0, r5)
        L_0x0079:
            X.9YX r7 = X.AnonymousClass9I1.A04(r9, r6)
            X.9nx[] r3 = X.AnonymousClass8gS.A03(r3, r9)
            X.1Vk r0 = r9.A01
            X.1AL[] r2 = X.C165577te.A1a(r5, r2)
            java.lang.String r1 = "account"
            X.9nx r14 = X.C203399nx.A05(r1, r2, r3)
            android.content.Context r4 = r9.A00
            X.17Y r5 = r9.A02
            X.1Vu r6 = r9.A06
            r10 = 5
            X.B7M r3 = new X.B7M
            r3.<init>((android.content.Context) r4, (X.AnonymousClass17Y) r5, (X.C29221Vu) r6, (X.AnonymousClass9YX) r7, (X.C22963AzF) r8, (X.AnonymousClass8gS) r9, (int) r10)
            goto L_0x014d
        L_0x009b:
            X.8gS r5 = r0.A08
            java.lang.String r10 = r0.A0A
            X.AEd r2 = new X.AEd
            r2.<init>(r0)
            java.lang.String r0 = "PAY: revokePayerMandate called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "action"
            java.lang.String r8 = "upi-revoke-mandate"
            X.C36381kD.A1M(r0, r8, r9)
            X.AnonymousClass8gS.A01(r3, r5, r9)
            X.8av r7 = r3.A0A
            X.8bI r7 = (X.C175928bI) r7
            r6 = 0
            r0 = 1
            X.AnonymousClass8gS.A02(r6, r7, r10, r9, r0)
            X.AnonymousClass8gS.A00(r4, r5, r8, r1, r9)
            X.9YX r10 = X.AnonymousClass9I1.A04(r5, r8)
            X.8gJ r1 = r5.A07
            if (r1 == 0) goto L_0x00d0
            java.lang.String r0 = "U66"
            r1.A00(r0, r9)
        L_0x00d0:
            X.9nx[] r4 = X.AnonymousClass8gS.A03(r3, r5)
            X.1Vk r0 = r5.A01
            r1 = 0
            X.1AL[] r3 = X.C165577te.A1a(r9, r1)
            java.lang.String r1 = "account"
            X.9nx r14 = X.C203399nx.A05(r1, r3, r4)
            android.content.Context r7 = r5.A00
            X.17Y r8 = r5.A02
            X.1Vu r9 = r5.A06
            r13 = 6
            goto L_0x0145
        L_0x00e9:
            X.8gS r5 = r0.A08
            java.lang.String r10 = r0.A0A
            r9 = 1
            X.BAW r2 = new X.BAW
            r2.<init>(r6, r0, r9)
            java.lang.String r0 = "PAY: resumePayeeMandate called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "action"
            java.lang.String r8 = "upi-resume-mandate"
            X.C36381kD.A1M(r0, r8, r7)
            X.AnonymousClass8gS.A01(r3, r5, r7)
            X.8av r6 = r3.A0A
            X.8bI r6 = (X.C175928bI) r6
            X.C18740tg.A06(r6)
            r0 = 0
            X.AnonymousClass8gS.A02(r0, r6, r10, r7, r9)
            X.6c7 r0 = r6.A0A
            java.lang.String r6 = X.C165577te.A0k(r0)
            java.lang.String r0 = "receiver-name"
            X.C36381kD.A1M(r0, r6, r7)
            X.AnonymousClass8gS.A00(r4, r5, r8, r1, r7)
            X.9nx[] r4 = X.AnonymousClass8gS.A03(r3, r5)
            X.8gJ r1 = r5.A07
            if (r1 == 0) goto L_0x012c
            java.lang.String r0 = "U66"
            r1.A00(r0, r7)
        L_0x012c:
            X.9YX r10 = X.AnonymousClass9I1.A04(r5, r8)
            X.1Vk r0 = r5.A01
            r1 = 0
            X.1AL[] r3 = X.C165577te.A1a(r7, r1)
            java.lang.String r1 = "account"
            X.9nx r14 = X.C203399nx.A05(r1, r3, r4)
            android.content.Context r7 = r5.A00
            X.17Y r8 = r5.A02
            X.1Vu r9 = r5.A06
            r13 = 8
        L_0x0145:
            X.B7M r3 = new X.B7M
            r6 = r3
            r11 = r2
            r12 = r5
            r6.<init>((android.content.Context) r7, (X.AnonymousClass17Y) r8, (X.C29221Vu) r9, (X.AnonymousClass9YX) r10, (X.C22963AzF) r11, (X.AnonymousClass8gS) r12, (int) r13)
        L_0x014d:
            r16 = 0
            java.lang.String r15 = "set"
            r13 = r3
            r12 = r0
            r12.A0H(r13, r14, r15, r16)
            return
        L_0x0157:
            X.9lY r2 = r0.A06
            r9 = 0
            if (r2 == 0) goto L_0x019d
            X.8av r2 = r2.A0A
            X.8bI r2 = (X.C175928bI) r2
            X.9jw r2 = r2.A0G
            X.6c7 r2 = r2.A08
            java.lang.Object r5 = X.C165577te.A0g(r2)
            java.lang.String r5 = (java.lang.String) r5
        L_0x016a:
            if (r4 == 0) goto L_0x019b
            X.8bF r2 = r4.A08
            X.8b6 r2 = (X.C175818b6) r2
            if (r2 == 0) goto L_0x0174
            X.6c7 r9 = r2.A05
        L_0x0174:
            java.lang.String r4 = r4.A0A
        L_0x0176:
            java.lang.String r13 = r3.A0K
            X.8gO r7 = r0.A0H
            X.16X r8 = r3.A08
            java.lang.String r14 = r6.A0Q
            java.lang.String r15 = r6.A0R
            java.lang.String r3 = r6.A0O
            java.lang.String r2 = r6.A0P
            X.8gJ r11 = r0.A0I
            X.AF7 r12 = r0.A0K
            X.AET r10 = new X.AET
            r10.<init>(r0, r13)
            r19 = r5
            r20 = r1
            r18 = r4
            r17 = r2
            r16 = r3
            r7.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x019b:
            r4 = r9
            goto L_0x0176
        L_0x019d:
            r5 = r9
            goto L_0x016a
        L_0x019f:
            X.0wQ r2 = r0.A02
            X.142 r5 = X.C36381kD.A0T(r2)
            X.C18740tg.A06(r4)
            X.8gS r2 = r0.A08
            X.9Rb r8 = new X.9Rb
            r8.<init>(r5, r3, r0)
            java.lang.String r0 = "PAY: createAndApproveMandate called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r50 == 0) goto L_0x02d2
            X.9lR r6 = r2.A04
            r5 = 8
            java.lang.String r0 = "MPIN"
            java.lang.String r33 = r6.A06(r0, r1, r5)
        L_0x01c0:
            X.8av r5 = r3.A0A
            X.8bI r5 = (X.C175928bI) r5
            X.8bF r0 = r4.A08
            X.8b6 r0 = (X.C175818b6) r0
            if (r0 == 0) goto L_0x02cf
            X.6c7 r1 = r0.A05
        L_0x01cc:
            java.lang.String r4 = r4.A0A
            X.19A r0 = r2.A03
            r47 = r0
            java.lang.String r25 = r47.A09()
            X.C18740tg.A06(r5)
            X.9jw r6 = r5.A0G
            X.C18740tg.A06(r6)
            java.lang.String r0 = r6.A0G
            X.C18740tg.A06(r0)
            java.lang.String r0 = r6.A0E
            X.C18740tg.A06(r0)
            X.16X r0 = r3.A08
            X.C18740tg.A06(r0)
            X.AE0 r0 = r2.A05
            X.6c7 r0 = r0.A08()
            java.lang.String r0 = X.C165607th.A0s(r0)
            r5.A0Q = r0
            X.1Vk r7 = r2.A01
            X.16X r6 = r3.A08
            X.16U r0 = r3.A07
            X.9ua r0 = r7.A02(r0, r6)
            r3.A09 = r0
            r3.A0H = r4
            X.8uf r21 = X.C185708uf.A02(r0)
            java.util.ArrayList r0 = X.C185998vF.A00
            X.1Vl r0 = r2.A08
            java.lang.String r26 = r0.A01()
            java.lang.String r15 = r5.A0S
            java.lang.String r14 = r5.A0Q
            java.lang.String r13 = r5.A0O
            java.lang.String r30 = X.C165577te.A0k(r1)
            X.9jw r1 = r5.A0G
            X.6c7 r0 = r1.A07
            java.lang.Object r3 = X.C165577te.A0g(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r1.A02
            long r0 = r6.toSeconds(r0)
            java.lang.Long r23 = java.lang.Long.valueOf(r0)
            X.9jw r0 = r5.A0G
            long r0 = r0.A01
            long r0 = r6.toSeconds(r0)
            java.lang.Long r24 = java.lang.Long.valueOf(r0)
            X.9jw r0 = r5.A0G
            java.lang.String r12 = r0.A0J
            X.C18740tg.A06(r33)
            X.6c7 r1 = r5.A0A
            java.lang.Object r6 = X.C165577te.A0g(r1)
            X.C18740tg.A06(r6)
            java.lang.String r6 = (java.lang.String) r6
            X.6c7 r1 = r0.A0A
            java.lang.Object r1 = X.C165577te.A0g(r1)
            X.C18740tg.A06(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r11 = r5.A0M
            X.C18740tg.A06(r11)
            java.lang.String r10 = r0.A0L
            java.lang.String r9 = r0.A0F
            boolean r5 = r0.A0N
            java.lang.String r40 = X.C165617ti.A0Y(r5)
            java.lang.String r7 = r0.A0G
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r41 = r7.toUpperCase(r5)
            java.lang.String r7 = r0.A0E
            java.lang.String r42 = r7.toUpperCase(r5)
            java.lang.String r0 = r0.A0K
            if (r0 == 0) goto L_0x02cd
            java.util.ArrayList r7 = X.C185678uc.A00
            java.lang.String r0 = r0.toUpperCase(r5)
            X.8uc r5 = new X.8uc
            r5.<init>(r0)
        L_0x0288:
            X.8vF r0 = new X.8vF
            r27 = r15
            r28 = r14
            r29 = r13
            r31 = r3
            r32 = r12
            r34 = r6
            r35 = r1
            r36 = r11
            r37 = r10
            r38 = r9
            r39 = r4
            r22 = r5
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            X.9YX r6 = r2.A00
            if (r6 == 0) goto L_0x02b0
            java.lang.String r1 = "upi-create-mandate"
            r6.A02(r1)
        L_0x02b0:
            r30 = 204(0xcc, float:2.86E-43)
            X.9nx r1 = r0.A00
            android.content.Context r5 = r2.A00
            X.17Y r4 = r2.A02
            X.0wN r3 = r2.A01
            X.1Vu r2 = r2.A06
            X.8gX r9 = new X.8gX
            r10 = r5
            r11 = r3
            r12 = r4
            r13 = r2
            r14 = r6
            r15 = r8
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r31 = 0
            goto L_0x05cd
        L_0x02cd:
            r5 = 0
            goto L_0x0288
        L_0x02cf:
            r1 = 0
            goto L_0x01cc
        L_0x02d2:
            r33 = 0
            goto L_0x01c0
        L_0x02d6:
            X.C18740tg.A06(r4)
            X.8gS r5 = r0.A08
            r7 = 0
            X.BAW r26 = new X.BAW
            r2 = r26
            r2.<init>(r3, r0, r7)
            java.lang.String r0 = "PAY: updateMandateByIntent called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r50 == 0) goto L_0x05df
            X.9lR r6 = r5.A04
            r2 = 9
            java.lang.String r0 = "MPIN"
            java.lang.String r8 = r6.A06(r0, r1, r2)
        L_0x02f4:
            X.8av r11 = r3.A0A
            X.8bI r11 = (X.C175928bI) r11
            X.8bF r0 = r4.A08
            X.8b6 r0 = (X.C175818b6) r0
            if (r0 == 0) goto L_0x05dc
            X.6c7 r1 = r0.A05
        L_0x0300:
            java.lang.String r0 = r4.A0A
            r46 = r0
            X.19A r0 = r5.A03
            r47 = r0
            java.lang.String r25 = r47.A09()
            X.C18740tg.A06(r11)
            X.9jw r2 = r11.A0G
            X.C18740tg.A06(r2)
            java.lang.String r0 = r2.A0G
            X.C18740tg.A06(r0)
            java.lang.String r0 = r2.A0E
            X.C18740tg.A06(r0)
            X.6c7 r0 = r2.A08
            X.C18740tg.A06(r0)
            X.9je r2 = r2.A0C
            X.C18740tg.A06(r2)
            X.9ua r0 = r2.A01
            X.C18740tg.A06(r0)
            X.6c7 r0 = r2.A04
            X.C18740tg.A06(r0)
            X.C18740tg.A06(r1)
            X.16X r0 = r3.A08
            X.C18740tg.A06(r0)
            java.lang.String r0 = r3.A0K
            X.C18740tg.A06(r0)
            X.AE0 r0 = r5.A05
            X.6c7 r0 = r0.A08()
            java.lang.String r0 = X.C165607th.A0s(r0)
            r11.A0Q = r0
            X.1Vk r4 = r5.A01
            X.16X r2 = r3.A08
            X.16U r0 = r3.A07
            X.9ua r2 = r4.A02(r0, r2)
            r3.A09 = r2
            r0 = r46
            r3.A0H = r0
            int r0 = r2.A01()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            int r0 = r2.A00
            java.lang.String r4 = java.lang.String.valueOf(r0)
            X.16U r0 = r2.A01
            X.16V r0 = (X.AnonymousClass16V) r0
            java.lang.String r2 = r0.A02
            r9 = 14
            X.8uf r24 = new X.8uf
            r0 = r24
            r0.<init>(r6, r4, r2, r9)
            X.9jw r0 = r11.A0G
            X.9je r0 = r0.A0C
            X.9ua r2 = r0.A01
            int r0 = r2.A01()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            int r0 = r2.A00
            java.lang.String r4 = java.lang.String.valueOf(r0)
            X.16U r0 = r2.A01
            X.16V r0 = (X.AnonymousClass16V) r0
            java.lang.String r2 = r0.A02
            X.8uf r23 = new X.8uf
            r0 = r23
            r0.<init>(r6, r4, r2, r9)
            java.util.ArrayList r0 = X.C185918v7.A00
            java.lang.String r10 = r3.A0K
            X.9jw r0 = r11.A0G
            X.6c7 r0 = r0.A08
            java.lang.String r4 = X.C165607th.A0s(r0)
            X.1Vl r0 = r5.A08
            java.lang.String r2 = r0.A01()
            X.9jw r12 = r11.A0G
            X.9je r0 = r12.A0C
            X.6c7 r0 = r0.A04
            java.lang.String r15 = X.C165607th.A0s(r0)
            java.lang.String r0 = r11.A0Q
            r35 = r0
            java.lang.String r0 = r11.A0O
            r34 = r0
            java.lang.String r6 = X.C165607th.A0s(r1)
            X.6c7 r0 = r12.A07
            java.lang.Object r3 = X.C165577te.A0g(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r12.A02
            long r0 = r9.toSeconds(r0)
            java.lang.Long r33 = java.lang.Long.valueOf(r0)
            X.9jw r0 = r11.A0G
            X.9je r0 = r0.A0C
            long r0 = r0.A00
            long r0 = r9.toSeconds(r0)
            java.lang.Long r39 = java.lang.Long.valueOf(r0)
            X.9jw r1 = r11.A0G
            java.lang.String r0 = r1.A0J
            r22 = r0
            X.C18740tg.A06(r8)
            X.6c7 r0 = r11.A0A
            java.lang.Object r9 = X.C165577te.A0g(r0)
            X.C18740tg.A06(r9)
            java.lang.String r9 = (java.lang.String) r9
            X.6c7 r0 = r1.A0A
            java.lang.Object r12 = X.C165577te.A0g(r0)
            X.C18740tg.A06(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r0 = r11.A0M
            r45 = r0
            X.C18740tg.A06(r45)
            java.lang.String r14 = r1.A0L
            boolean r0 = r1.A0N
            java.lang.String r21 = X.C165617ti.A0Y(r0)
            java.lang.String r0 = r1.A0G
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r20 = r0.toUpperCase(r11)
            java.lang.String r0 = r1.A0E
            java.lang.String r19 = r0.toUpperCase(r11)
            java.lang.String r0 = r1.A0K
            if (r0 == 0) goto L_0x05d9
            java.util.ArrayList r1 = X.C185678uc.A00
            java.lang.String r0 = r0.toUpperCase(r11)
            X.8uc r11 = new X.8uc
            r11.<init>(r0)
        L_0x042e:
            java.lang.String r18 = "1"
            X.6QB r17 = X.C36421kH.A0T()
            X.C165567td.A1D(r17)
            r1 = r17
            r0 = r25
            X.C203539oF.A0E(r1, r0)
            X.6QB r0 = X.C165587tf.A0a()
            java.lang.String r13 = "action"
            java.lang.String r16 = "upi-update-mandate-by-url"
            r1 = r16
            X.C36331k8.A1D(r0, r13, r1)
            boolean r1 = X.C203539oF.A0X(r10, r7)
            if (r1 == 0) goto L_0x0456
            java.lang.String r1 = "transaction-id"
            X.C36331k8.A1D(r0, r1, r10)
        L_0x0456:
            r28 = 0
            r30 = 255(0xff, double:1.26E-321)
            r32 = 0
            r27 = r4
            boolean r1 = X.C203539oF.A0P(r27, r28, r30, r32)
            if (r1 == 0) goto L_0x0469
            java.lang.String r1 = "mandate-no"
            X.C36331k8.A1D(r0, r1, r4)
        L_0x0469:
            r28 = 1
            r27 = r2
            boolean r1 = X.C203539oF.A0P(r27, r28, r30, r32)
            if (r1 == 0) goto L_0x0478
            java.lang.String r1 = "device-id"
            X.C36331k8.A1D(r0, r1, r2)
        L_0x0478:
            r28 = 0
            r30 = 35
            r27 = r15
            boolean r1 = X.C203539oF.A0P(r27, r28, r30, r32)
            if (r1 == 0) goto L_0x0489
            java.lang.String r1 = "seq-no"
            X.C36331k8.A1D(r0, r1, r15)
        L_0x0489:
            r28 = 1
            r30 = 100
            r27 = r35
            boolean r1 = X.C203539oF.A0P(r27, r28, r30, r32)
            if (r1 == 0) goto L_0x049c
            java.lang.String r2 = "sender-vpa"
            r1 = r35
            X.C36331k8.A1D(r0, r2, r1)
        L_0x049c:
            r27 = r34
            boolean r1 = X.C203539oF.A0P(r27, r28, r30, r32)
            if (r1 == 0) goto L_0x04ab
            java.lang.String r2 = "receiver-vpa"
            r1 = r34
            X.C36331k8.A1D(r0, r2, r1)
        L_0x04ab:
            r1 = 0
            boolean r4 = X.C203539oF.A0U(r6, r1, r7)
            if (r4 == 0) goto L_0x04b8
            java.lang.String r4 = "upi-bank-info"
            X.C36331k8.A1D(r0, r4, r6)
        L_0x04b8:
            if (r3 == 0) goto L_0x04c6
            r4 = 1
            boolean r4 = X.C203539oF.A0Q(r3, r1, r4)
            if (r4 == 0) goto L_0x04c6
            java.lang.String r4 = "mandate-name"
            X.C36331k8.A1D(r0, r4, r3)
        L_0x04c6:
            r36 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r31 = 0
            r34 = 0
            r38 = 0
            boolean r3 = X.C203539oF.A0L(r33, r34, r36, r38)
            if (r3 == 0) goto L_0x04e0
            long r3 = r33.longValue()
            java.lang.String r6 = "start-ts"
            X.C36411kG.A1K(r0, r6, r3)
        L_0x04e0:
            r40 = 0
            r42 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r44 = 0
            boolean r3 = X.C203539oF.A0L(r39, r40, r42, r44)
            if (r3 == 0) goto L_0x04f8
            long r3 = r39.longValue()
            java.lang.String r6 = "end-ts"
            X.C36411kG.A1K(r0, r6, r3)
        L_0x04f8:
            if (r22 == 0) goto L_0x050f
            r38 = 1
            r34 = 1
            r36 = 2
            r33 = r22
            boolean r3 = X.C203539oF.A0P(r33, r34, r36, r38)
            if (r3 == 0) goto L_0x050f
            java.lang.String r4 = "recurrence-day"
            r3 = r22
            X.C36331k8.A1D(r0, r4, r3)
        L_0x050f:
            boolean r1 = X.C203539oF.A0U(r8, r1, r7)
            if (r1 == 0) goto L_0x051a
            java.lang.String r1 = "mpin"
            X.C36331k8.A1D(r0, r1, r8)
        L_0x051a:
            r1 = 1
            r36 = 100
            r34 = 1
            r38 = 0
            r33 = r9
            boolean r3 = X.C203539oF.A0P(r33, r34, r36, r38)
            if (r3 == 0) goto L_0x052f
            java.lang.String r3 = "receiver-name"
            X.C36331k8.A1D(r0, r3, r9)
        L_0x052f:
            r33 = r12
            boolean r3 = X.C203539oF.A0P(r33, r34, r36, r38)
            if (r3 == 0) goto L_0x053c
            java.lang.String r3 = "purpose-code"
            X.C36331k8.A1D(r0, r3, r12)
        L_0x053c:
            r36 = 4
            r34 = 0
            r33 = r45
            boolean r3 = X.C203539oF.A0P(r33, r34, r36, r38)
            if (r3 == 0) goto L_0x054f
            java.lang.String r4 = "mcc"
            r3 = r45
            X.C36331k8.A1D(r0, r4, r3)
        L_0x054f:
            if (r14 == 0) goto L_0x055d
            r3 = 1
            boolean r3 = X.C203539oF.A0T(r14, r1, r3)
            if (r3 == 0) goto L_0x055d
            java.lang.String r3 = "ref-id"
            X.C36331k8.A1D(r0, r3, r14)
        L_0x055d:
            r3 = r46
            boolean r1 = X.C203539oF.A0S(r3, r1, r7)
            if (r1 == 0) goto L_0x056a
            java.lang.String r2 = "credential-id"
            X.C36331k8.A1D(r0, r2, r3)
        L_0x056a:
            java.util.ArrayList r3 = X.C185918v7.A02
            java.lang.String r2 = "is-revocable"
            r1 = r21
            r0.A09(r1, r2, r3)
            java.util.ArrayList r3 = X.C185918v7.A03
            java.lang.String r2 = "share-to-payee"
            r1 = r18
            r0.A09(r1, r2, r3)
            java.util.ArrayList r3 = X.C185918v7.A00
            java.lang.String r2 = "amount-rule"
            r1 = r20
            r0.A09(r1, r2, r3)
            java.util.ArrayList r3 = X.C185918v7.A01
            java.lang.String r2 = "frequency-rule"
            r1 = r19
            r0.A09(r1, r2, r3)
            java.lang.String r1 = "original-amount"
            X.6QB r2 = X.C36441kJ.A0q(r1)
            r1 = r24
            X.9nx r1 = r1.A00
            r2.A06(r1)
            X.C36361kB.A1H(r2, r0)
            java.lang.String r1 = "amount"
            X.6QB r2 = X.C36441kJ.A0q(r1)
            r1 = r23
            X.9nx r1 = r1.A00
            r2.A06(r1)
            X.C36361kB.A1H(r2, r0)
            X.C165577te.A1G(r0, r11)
            r1 = r17
            X.9nx r1 = X.C165567td.A0I(r0, r1)
            r0 = r16
            X.9YX r6 = X.AnonymousClass9I1.A04(r5, r0)
            r30 = 204(0xcc, float:2.86E-43)
            android.content.Context r3 = r5.A00
            X.17Y r4 = r5.A02
            X.1Vu r5 = r5.A06
            X.8gT r9 = new X.8gT
            r2 = r9
            r7 = r26
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x05cd:
            r26 = r47
            r27 = r9
            r28 = r1
            r29 = r25
            r26.A0E(r27, r28, r29, r30, r31)
            return
        L_0x05d9:
            r11 = 0
            goto L_0x042e
        L_0x05dc:
            r1 = 0
            goto L_0x0300
        L_0x05df:
            r8 = 0
            goto L_0x02f4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A4M(X.9un, java.util.HashMap):void");
    }

    public void BgO(C202059ky r3) {
        throw AnonymousClass001.A0E(this.A06.A03("onSetPin unsupported"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00c4, code lost:
        r2 = new X.AnonymousClass9OX(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0100, code lost:
        r2.A03 = r5;
        r3.A09.A0D(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0107, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x011e, code lost:
        r2 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0121, code lost:
        r3.A0M.Boy(new X.C21705AWz(r3, r2, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x012b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r3 = r23
            r0 = r24
            super.onCreate(r0)
            java.lang.String r0 = X.C165587tf.A0g(r3)
            r3.A04 = r0
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r0.<init>()
            r3.A02 = r0
            android.content.Intent r2 = r3.getIntent()
            java.lang.String r1 = "user_action"
            r0 = 0
            int r0 = r2.getIntExtra(r1, r0)
            r3.A00 = r0
            X.9lR r7 = r3.A0L
            X.17Y r5 = r3.A05
            X.0wN r4 = r3.A03
            X.9YX r10 = r3.A04
            X.19A r6 = r3.A0H
            X.1Vl r13 = r3.A0D
            X.1Vk r11 = r3.A0M
            X.8gJ r12 = r3.A07
            X.1Vu r9 = r3.A0K
            X.AE0 r8 = r3.A0M
            X.8gS r2 = new X.8gS
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.0yC r0 = r3.A0D
            X.8gO r14 = new X.8gO
            r15 = r3
            r16 = r5
            r17 = r0
            r18 = r6
            r19 = r7
            r20 = r9
            r21 = r11
            r22 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            X.9xH r0 = new X.9xH
            r0.<init>(r14, r2, r3)
            X.04H r1 = X.C165617ti.A0A(r0, r3)
            java.lang.Class<X.7yZ> r0 = X.C167687yZ.class
            X.04R r2 = r1.A00(r0)
            X.7yZ r2 = (X.C167687yZ) r2
            r3.A03 = r2
            r0 = 26
            X.BA9 r1 = new X.BA9
            r1.<init>(r3, r0)
            X.00s r0 = r2.A01
            r0.A08(r3, r1)
            X.7yZ r2 = r3.A03
            r0 = 25
            X.BA9 r1 = new X.BA9
            r1.<init>(r3, r0)
            X.1Rs r0 = r2.A09
            r0.A08(r3, r1)
            X.04H r1 = X.C36441kJ.A0b(r3)
            java.lang.Class<X.7yB> r0 = X.C167517yB.class
            X.04R r0 = r1.A00(r0)
            X.7yB r0 = (X.C167517yB) r0
            X.00s r1 = r0.A00
            r0 = 24
            X.BA9.A00(r3, r1, r0)
            X.7yZ r3 = r3.A03
            X.9lY r5 = r3.A07
            X.8av r1 = r5.A0A
            r4 = r1
            X.8bI r4 = (X.C175928bI) r4
            int r0 = r3.A00
            switch(r0) {
                case 1: goto L_0x009f;
                case 2: goto L_0x00a1;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00c2;
                case 6: goto L_0x00ca;
                case 7: goto L_0x00d0;
                case 8: goto L_0x00e0;
                case 9: goto L_0x0108;
                default: goto L_0x009e;
            }
        L_0x009e:
            return
        L_0x009f:
            r0 = 6
            goto L_0x00c4
        L_0x00a1:
            X.9jw r0 = r4.A0G
            X.9je r0 = r0.A0C
            r2 = 2131895445(0x7f122495, float:1.9425723E38)
            if (r0 != 0) goto L_0x00ad
            r2 = 2131895380(0x7f122454, float:1.9425591E38)
        L_0x00ad:
            r0 = 5
            X.9OX r1 = new X.9OX
            r1.<init>(r0)
            r1.A00 = r2
            X.1Rs r0 = r3.A09
            r0.A0D(r1)
            return
        L_0x00bb:
            r4 = 4
            r2 = 2131895433(0x7f122489, float:1.9425699E38)
            goto L_0x0121
        L_0x00c0:
            r4 = 7
            goto L_0x011e
        L_0x00c2:
            r0 = 9
        L_0x00c4:
            X.9OX r2 = new X.9OX
            r2.<init>(r0)
            goto L_0x0100
        L_0x00ca:
            r4 = 10
            r2 = 2131895432(0x7f122488, float:1.9425697E38)
            goto L_0x0121
        L_0x00d0:
            X.C18740tg.A06(r4)
            X.0wU r2 = r3.A0M
            java.lang.String r1 = r4.A0L
            X.8qy r0 = new X.8qy
            r0.<init>(r3, r1)
            X.C36331k8.A1F(r0, r2)
            return
        L_0x00e0:
            r0 = 12
            X.9OX r2 = new X.9OX
            r2.<init>(r0)
            X.C18740tg.A06(r1)
            java.lang.String r0 = r3.A0A
            r4.A0S = r0
            X.AE0 r0 = r3.A0D
            java.lang.String r0 = X.AE0.A00(r0)
            r4.A0Q = r0
            X.0wo r1 = r3.A03
            X.0wQ r0 = r3.A02
            java.lang.String r0 = X.C237919w.A00(r0, r1)
            r4.A0K = r0
        L_0x0100:
            r2.A03 = r5
            X.1Rs r0 = r3.A09
            r0.A0D(r2)
            return
        L_0x0108:
            X.C18740tg.A06(r4)
            X.9jw r0 = r4.A0G
            X.C18740tg.A06(r0)
            X.9je r2 = r0.A0C
            java.lang.String r1 = r3.A0A
            java.lang.String r0 = "upiSequenceNumber"
            X.6c7 r0 = X.C202349ld.A00(r1, r0)
            r2.A04 = r0
            r4 = 14
        L_0x011e:
            r2 = 2131895393(0x7f122461, float:1.9425618E38)
        L_0x0121:
            X.0wU r1 = r3.A0M
            X.AWz r0 = new X.AWz
            r0.<init>(r3, r2, r4)
            r1.Boy(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.onCreate(android.os.Bundle):void");
    }

    public IndiaUpiMandatePaymentActivity(int i) {
        this.A05 = false;
        B7Z.A00(this, 18);
    }

    public void A4N(PaymentBottomSheet paymentBottomSheet) {
        super.A4N(paymentBottomSheet);
        paymentBottomSheet.A01 = new C23186B8u(this, 9);
        this.A0S.BOn(C36381kD.A0m(), (Integer) null, "approve_mandate_prompt", this.A04, true);
    }

    public void A4O(PaymentBottomSheet paymentBottomSheet) {
        super.A4O(paymentBottomSheet);
        paymentBottomSheet.A01 = new C23186B8u(this, 13);
    }

    public void A4P(PaymentBottomSheet paymentBottomSheet) {
        super.A4P(paymentBottomSheet);
        paymentBottomSheet.A01 = new C23186B8u(this, 11);
    }

    public void A4R(int i) {
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0c(i);
        A002.A0r(true);
        A002.A0h((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
        A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
        A002.A00.A0V(new C23186B8u(this, 10));
        AnonymousClass0FM create = A002.create();
        create.setOnShowListener(new AnonymousClass5YM(this, 5));
        create.show();
    }

    public void BRQ(ViewGroup viewGroup) {
        super.BRQ(viewGroup);
        C36391kE.A0O(viewGroup, R.id.text).setText(R.string.f12nameremoved);
    }

    public IndiaUpiMandatePaymentActivity() {
        this(0);
        this.A06 = C165587tf.A0X("IndiaUpiMandatePaymentActivity");
    }
}
