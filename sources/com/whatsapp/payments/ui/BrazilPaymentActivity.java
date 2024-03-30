package com.whatsapp.payments.ui;

import X.AE9;
import X.AGL;
import X.ATF;
import X.ATJ;
import X.ATL;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass01L;
import X.AnonymousClass0FM;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass16T;
import X.AnonymousClass16U;
import X.AnonymousClass16W;
import X.AnonymousClass16X;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass1DR;
import X.AnonymousClass1EU;
import X.AnonymousClass1H2;
import X.AnonymousClass1HA;
import X.AnonymousClass1YQ;
import X.AnonymousClass2ZN;
import X.AnonymousClass2bV;
import X.AnonymousClass3LW;
import X.AnonymousClass3RH;
import X.AnonymousClass5GL;
import X.AnonymousClass646;
import X.AnonymousClass6O3;
import X.AnonymousClass6PS;
import X.AnonymousClass6VG;
import X.AnonymousClass6VM;
import X.AnonymousClass7hD;
import X.AnonymousClass7hJ;
import X.AnonymousClass8UX;
import X.AnonymousClass9SJ;
import X.AnonymousClass9TJ;
import X.AnonymousClass9UG;
import X.AnonymousClass9YB;
import X.B2Z;
import X.B7G;
import X.B8F;
import X.C117675me;
import X.C117695mg;
import X.C120005qo;
import X.C120015qp;
import X.C120025qq;
import X.C120035qr;
import X.C122755vN;
import X.C124885yx;
import X.C124965z5;
import X.C1262363c;
import X.C135066c4;
import X.C144316rz;
import X.C144326s0;
import X.C146506vi;
import X.C147166wm;
import X.C160477l4;
import X.C162067ny;
import X.C165617ti;
import X.C175858bB;
import X.C175898bF;
import X.C175938bJ;
import X.C178768hI;
import X.C179148jG;
import X.C180468lr;
import X.C183698rD;
import X.C18740tg;
import X.C18820ts;
import X.C195219Sy;
import X.C196039Xk;
import X.C19730wQ;
import X.C19770wU;
import X.C198299dE;
import X.C19890wg;
import X.C199109ei;
import X.C199359fB;
import X.C199449fK;
import X.C19970wo;
import X.C199849g7;
import X.C200049gU;
import X.C201009id;
import X.C201219j5;
import X.C201269jE;
import X.C201649k3;
import X.C202199lE;
import X.C203049nB;
import X.C203349np;
import X.C203449o2;
import X.C206349tD;
import X.C207079uW;
import X.C207119ua;
import X.C207249un;
import X.C207259uo;
import X.C20810yC;
import X.C21060yb;
import X.C21253AEj;
import X.C21320AGy;
import X.C23075B3f;
import X.C23186B8u;
import X.C23209B9r;
import X.C24601Db;
import X.C29121Vk;
import X.C29131Vl;
import X.C29221Vu;
import X.C29931Yo;
import X.C29971Ys;
import X.C32681e1;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36441kJ;
import X.C39001qm;
import X.C54962tq;
import X.C61233Bb;
import X.C64813Pn;
import X.C79593ty;
import X.C81193wc;
import X.C88704Ts;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.jid.UserJid;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.CheckFirstTransaction;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.payments.ui.widget.PaymentView$$ExternalSyntheticLambda8;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BrazilPaymentActivity extends C178768hI implements C160477l4, C162067ny, AnonymousClass7hJ, AnonymousClass7hD {
    public int A00;
    public int A01 = 0;
    public Context A02;
    public C79593ty A03;
    public AnonymousClass171 A04;
    public C18820ts A05;
    public AnonymousClass16T A06;
    public C147166wm A07;
    public C201269jE A08;
    public AE9 A09;
    public AnonymousClass6VM A0A;
    public AnonymousClass2ZN A0B;
    public C24601Db A0C;
    public AnonymousClass1DR A0D;
    public C1262363c A0E;
    public C29971Ys A0F;
    public C29931Yo A0G;
    public C200049gU A0H;
    public AnonymousClass6PS A0I;
    public C23075B3f A0J;
    public C195219Sy A0K;
    public AnonymousClass646 A0L;
    public AnonymousClass5GL A0M;
    public AnonymousClass6VG A0N;
    public C196039Xk A0O;
    public C201219j5 A0P;
    public C201649k3 A0Q;
    public ConfirmPaymentFragment A0R;
    public C199849g7 A0S;
    public C199109ei A0T;
    public PaymentView A0U;
    public C202199lE A0V;
    public AnonymousClass9UG A0W;
    public C29131Vl A0X;
    public C19890wg A0Y;
    public C32681e1 A0Z;
    public C64813Pn A0a;
    public String A0b;
    public String A0c;
    public boolean A0d;
    public boolean A0e = false;
    public boolean A0f = false;
    public BottomSheetBehavior A0g;
    public CheckFirstTransaction A0h;
    public final B2Z A0i = new C203349np(this, 1);
    public final C61233Bb A0j = new B7G(this, 0);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r11.A0O.A02.A0E(2928) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A17(X.AnonymousClass16X r10, com.whatsapp.payments.ui.BrazilPaymentActivity r11, X.C206349tD r12, java.lang.String r13, java.lang.String r14) {
        /*
            r5 = r11
            X.9k3 r4 = r11.A0Q
            java.lang.String r0 = "p2m_context"
            r7 = r13
            boolean r0 = r0.equals(r13)
            java.lang.String r3 = "p2p_context"
            if (r0 == 0) goto L_0x001b
            X.1EV r0 = r11.A0O
            X.0yC r1 = r0.A02
            r0 = 2928(0xb70, float:4.103E-42)
            boolean r0 = r1.A0E(r0)
            r1 = r13
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r1 = r3
        L_0x001c:
            r2 = 0
            java.lang.String r0 = "merchant_account_linking_context"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0053
            java.lang.String r1 = X.C201649k3.A00(r4)
        L_0x0029:
            r8 = r14
            if (r1 != 0) goto L_0x0062
            X.0yC r2 = r11.A0D
            X.0v0 r1 = r11.A09
            X.1Db r0 = r11.A0C
            boolean r0 = X.AnonymousClass3RH.A01(r1, r2, r0)
            r4 = r10
            r6 = r12
            if (r0 == 0) goto L_0x0058
            boolean r0 = r3.equals(r13)
            if (r0 == 0) goto L_0x0058
            java.util.ArrayList r0 = com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet.A05
            X.AH0 r3 = new X.AH0
            r3.<init>(r4, r5, r6, r7, r8)
            X.B3f r0 = r11.A0J
            com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet r1 = X.C54962tq.A00(r0, r3, r14)
            java.lang.String r0 = "BrazilPaymentIncomeCollectionBottomSheet"
            r11.Btn(r1, r0)
            return
        L_0x0053:
            java.lang.String r1 = X.C201649k3.A01(r4, r1, r2)
            goto L_0x0029
        L_0x0058:
            boolean r14 = r11.A0e
            r9 = r11
            r11 = r12
            r12 = r13
            r13 = r8
            r9.A3y(r10, r11, r12, r13, r14)
            return
        L_0x0062:
            java.lang.String r0 = "brpay_p_account_recovery_eligibility_screen"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
            X.9lE r0 = r11.A0V
            r0.A02(r11, r13, r14)
            return
        L_0x0070:
            A1A(r11, r1, r13, r14, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPaymentActivity.A17(X.16X, com.whatsapp.payments.ui.BrazilPaymentActivity, X.9tD, java.lang.String, java.lang.String):void");
    }

    public C199359fB A3v(AnonymousClass16X r5, int i) {
        C198299dE r2;
        if (i == 0 && (r2 = this.A0T.A01().A01) != null) {
            if (r5.A00.compareTo(r2.A09.A00.A02.A00) >= 0) {
                return r2.A08;
            }
        }
        return null;
    }

    public void A3w(C207079uW r12, AnonymousClass16X r13, C207249un r14, C146506vi r15, String str, String str2, String str3, int i) {
        String paymentNote;
        List mentionedJids;
        PaymentView paymentView = this.A0U;
        if (paymentView == null) {
            mentionedJids = AnonymousClass001.A0I();
            paymentNote = "";
        } else {
            paymentNote = paymentView.getPaymentNote();
            mentionedJids = this.A0U.getMentionedJids();
        }
        AnonymousClass2bV A3j = A3j(paymentNote, mentionedJids);
        C175938bJ r6 = new C175938bJ();
        r6.A03 = str;
        r6.A05 = A3j.A1J.A01;
        r6.A04 = this.A0X.A01();
        A3z(r6, i);
        r6.A01 = r12;
        CheckFirstTransaction checkFirstTransaction = this.A0h;
        AnonymousClass16X r3 = r13;
        C207249un r4 = r14;
        C146506vi r5 = r15;
        String str4 = str2;
        String str5 = str3;
        if (checkFirstTransaction != null) {
            checkFirstTransaction.A00.A0A(new ATL(r3, r4, r5, r6, this, A3j, str4, str5));
            return;
        }
        AnonymousClass16U A012 = this.A06.A01("BRL");
        C36331k8.A1F(new C183698rD(A012, r3, r4, r5, r6, this, A3j, str4, str5), this.A04);
    }

    public void A3y(AnonymousClass16X r10, C206349tD r11, String str, String str2, boolean z) {
        this.A03.A0E();
        C79593ty A002 = AnonymousClass9YB.A00(this.A0P);
        this.A03 = A002;
        A002.A0B(new ATJ(r10, this, r11, str, str2, z), this.A05.A04);
    }

    public void A3z(C175938bJ r2, int i) {
        if (i == 1) {
            A3o(r2);
        }
    }

    public AnonymousClass01L B8E() {
        return this;
    }

    public String BFW() {
        return null;
    }

    public boolean BND() {
        return false;
    }

    public void BQq() {
    }

    public void BR5(String str) {
    }

    public void BcN() {
    }

    public /* synthetic */ void BcT() {
    }

    public void BgI() {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        this.A03.A0E();
        C79593ty A002 = AnonymousClass9YB.A00(this.A0P);
        this.A03 = A002;
        if (i2 == -1) {
            A002.A0B(new C23209B9r(intent, this, 6), this.A05.A04);
        }
    }

    public static void A15(C207079uW r16, AnonymousClass16X r17, C207249un r18, C146506vi r19, BrazilPaymentActivity brazilPaymentActivity, String str, String str2) {
        FingerprintBottomSheet A012 = FingerprintBottomSheet.A0A.A01();
        AnonymousClass16X r6 = r17;
        int intValue = r6.A00.scaleByPowerOfTen(3).intValue();
        AnonymousClass16U r3 = AnonymousClass16W.A04;
        C199449fK r2 = new C199449fK();
        r2.A01 = (long) intValue;
        r2.A00 = 1000;
        r2.A02 = r3;
        BrazilPaymentActivity brazilPaymentActivity2 = brazilPaymentActivity;
        C207079uW r5 = r16;
        C207249un r7 = r18;
        String str3 = str2;
        C201009id A3u = brazilPaymentActivity2.A3u(r5, r7, r2.A01(), str3, "fingerprint", brazilPaymentActivity2.A0c);
        A012.A02 = new AnonymousClass8UX(brazilPaymentActivity2, A012, brazilPaymentActivity2.A07, A3u, brazilPaymentActivity2.A0O, new C21253AEj(A012, r5, r6, r7, r19, brazilPaymentActivity2, str, str3));
        brazilPaymentActivity2.A0M.A05("enter_fingerprint", brazilPaymentActivity2.A00);
        brazilPaymentActivity2.Btm(A012);
    }

    public static void A18(BrazilPaymentActivity brazilPaymentActivity) {
        if (brazilPaymentActivity.A01 == 0) {
            C203049nB.A04(C203049nB.A02(brazilPaymentActivity.A07, (AnonymousClass16X) null, brazilPaymentActivity.A0U, brazilPaymentActivity.A0e), brazilPaymentActivity.A0J, "new_payment", brazilPaymentActivity.A0b);
        }
    }

    public static void A19(BrazilPaymentActivity brazilPaymentActivity, String str) {
        if (brazilPaymentActivity.A0O.A02.A0E(2984)) {
            brazilPaymentActivity.Bnv();
            C207249un A072 = C165617ti.A0O(brazilPaymentActivity.A0P).A07(str);
            C18740tg.A06(A072);
            C175858bB r2 = (C175858bB) A072.A08;
            if (r2 != null) {
                String str2 = r2.A0F;
                if (str2.equals("NEEDS_RETOKENIZATION") || str2.equals("NEEDS_RETOKENIZATION_DELETED")) {
                    brazilPaymentActivity.BuO(C175858bB.A00(brazilPaymentActivity, r2, str), 1);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0073, code lost:
        if (r0 != false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1A(com.whatsapp.payments.ui.BrazilPaymentActivity r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            X.AGk r6 = new X.AGk
            r7 = r8
            r8 = r10
            r10 = r11
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            X.9k3 r0 = r7.A0Q
            boolean r0 = r0.A08(r8)
            if (r0 == 0) goto L_0x0027
            com.whatsapp.payments.ui.PaymentsWarmWelcomeBottomSheet r5 = X.AnonymousClass9ZZ.A00(r10)
            r1 = 1
            X.B94 r0 = new X.B94
            r0.<init>(r7, r1)
            r5.A02 = r0
        L_0x001d:
            X.6ZA r0 = r5.A03
            r0.A00 = r7
            r5.A01 = r6
        L_0x0023:
            r7.Btm(r5)
            return
        L_0x0027:
            X.0yC r1 = r7.A0D
            r0 = 3013(0xbc5, float:4.222E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "p2p_context"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x003e
            com.whatsapp.payments.ui.PaymentsWarmWelcomeBottomSheet r5 = X.AnonymousClass9ZZ.A01(r10)
            goto L_0x001d
        L_0x003e:
            if (r12 == 0) goto L_0x0064
            r4 = 2131886392(0x7f120138, float:1.9407362E38)
            r3 = 2131886391(0x7f120137, float:1.940736E38)
            r2 = 2131886390(0x7f120136, float:1.9407357E38)
            com.whatsapp.payments.ui.AddPaymentMethodBottomSheet r5 = new com.whatsapp.payments.ui.AddPaymentMethodBottomSheet
            r5.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "referral_screen"
            r1.putString(r0, r10)
            r5.A17(r1)
            X.9Kb r0 = new X.9Kb
            r0.<init>(r4, r3, r2)
            r5.A03 = r0
        L_0x0061:
            r5.A04 = r6
            goto L_0x0023
        L_0x0064:
            X.1EV r0 = r7.A0O
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x0075
            boolean r0 = X.C179148jG.A1P(r7)
            r3 = 2131886146(0x7f120042, float:1.9406863E38)
            if (r0 == 0) goto L_0x0078
        L_0x0075:
            r3 = 2131894037(0x7f121f15, float:1.9422867E38)
        L_0x0078:
            r2 = 0
            com.whatsapp.payments.ui.AddPaymentMethodBottomSheet r5 = new com.whatsapp.payments.ui.AddPaymentMethodBottomSheet
            r5.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "referral_screen"
            r1.putString(r0, r10)
            r5.A17(r1)
            X.9Kb r0 = new X.9Kb
            r0.<init>(r2, r3, r2)
            r5.A03 = r0
            X.6ZA r0 = r5.A05
            r0.A00 = r7
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPaymentActivity.A1A(com.whatsapp.payments.ui.BrazilPaymentActivity, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static boolean A1C(C207249un r4, int i) {
        String str;
        C175858bB r3 = (C175858bB) r4.A08;
        if (r3 != null && C203449o2.A08(r4)) {
            if (i == 1) {
                String str2 = r3.A0N;
                if (str2 == null || !(!"DISABLED".equals(str2))) {
                    return true;
                }
            } else if (i != 0 || ((str = r3.A0L) != null && (!"DISABLED".equals(str)))) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public C207259uo A3t() {
        String str;
        if (!(this instanceof BrazilOrderDetailsActivity)) {
            return null;
        }
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = (BrazilOrderDetailsActivity) this;
        String str2 = brazilOrderDetailsActivity.A0L;
        C18740tg.A06(str2);
        String str3 = brazilOrderDetailsActivity.A0H.A01;
        long j = brazilOrderDetailsActivity.A01;
        if (brazilOrderDetailsActivity.A0O.A02.A0E(2178)) {
            str = brazilOrderDetailsActivity.A0M;
        } else {
            str = null;
        }
        return new C207259uo(str2, str3, str, brazilOrderDetailsActivity.A0i, brazilOrderDetailsActivity.A0O, j);
    }

    public C201009id A3u(C207079uW r44, C207249un r45, C207119ua r46, String str, String str2, String str3) {
        String str4;
        C175898bF r12;
        C19970wo r42 = this.A07;
        C20810yC r21 = this.A0D;
        AnonymousClass17Y r41 = this.A05;
        C19730wQ r40 = this.A02;
        C19770wU r16 = this.A04;
        AnonymousClass9SJ r14 = this.A0Q;
        AnonymousClass1EU r10 = this.A0P;
        C29131Vl r9 = this.A0X;
        C195219Sy r8 = this.A0K;
        C196039Xk r7 = this.A0O;
        C29121Vk r6 = this.A0M;
        AnonymousClass1YQ r5 = this.A0T;
        C29221Vu r4 = this.A0K;
        AnonymousClass6VG r3 = this.A0N;
        C200049gU r2 = this.A0H;
        C207249un r15 = r45;
        String str5 = r15.A0A;
        UserJid userJid = this.A0G;
        C18740tg.A06(userJid);
        if (r15.A09() != 6 || (r12 = r15.A08) == null) {
            str4 = null;
        } else if (((C175858bB) r12).A03 == 1) {
            str4 = "debit";
        } else {
            str4 = "credit";
        }
        C207119ua r152 = r46;
        C207119ua r18 = r152;
        C19770wU r34 = r16;
        C207119ua r19 = r152;
        AnonymousClass9SJ r26 = r14;
        return new C201009id(this, r41, r40, r42, r44, r18, r19, A3t(), r21, userJid, r4, r6, r10, r26, r2, r8, r5, A3v(r152.A02, this.A01), r3, r7, r9, r34, str5, str3, str4, str, str2);
    }

    public void A3x(AnonymousClass16X r4) {
        if (AnonymousClass3RH.A01(this.A09, this.A0D, this.A0C)) {
            ArrayList arrayList = BrazilPaymentIncomeCollectionBottomSheet.A05;
            Btn(C54962tq.A00(this.A0J, new C21320AGy(r4, this), this.A0b), "BrazilPaymentIncomeCollectionBottomSheet");
            return;
        }
        A3n(r4);
    }

    public boolean BMe() {
        return TextUtils.isEmpty(this.A0n);
    }

    public void BVe() {
        if (this instanceof BrazilOrderDetailsActivity) {
            BrazilOrderDetailsActivity brazilOrderDetailsActivity = (BrazilOrderDetailsActivity) this;
            if (brazilOrderDetailsActivity.A0P || AnonymousClass000.A1Z(brazilOrderDetailsActivity.A0S, brazilOrderDetailsActivity.A00)) {
                C36351kA.A11(brazilOrderDetailsActivity);
            }
        }
    }

    public void BWo(String str) {
        this.A0M.A07("error_message", str, this.A00);
        C203049nB.A03(C203049nB.A02(this.A07, (AnonymousClass16X) null, this.A0U, this.A0e), this.A0J, 51, "new_payment", this.A0b, 4);
    }

    public void BYe() {
        AnonymousClass6O3 r3 = this.A0U;
        if (r3 != null && r3.A01 != null) {
            C23075B3f b3f = this.A0J;
            Bundle A072 = AnonymousClass001.A07();
            PaymentIncentiveViewFragment paymentIncentiveViewFragment = new PaymentIncentiveViewFragment(b3f, r3);
            paymentIncentiveViewFragment.A17(A072);
            Objects.requireNonNull(paymentIncentiveViewFragment);
            paymentIncentiveViewFragment.A04 = new C117675me(paymentIncentiveViewFragment);
            Btm(paymentIncentiveViewFragment);
        }
    }

    public void BcM() {
        AnonymousClass11F r0 = this.A0E;
        C18740tg.A06(r0);
        if (AnonymousClass143.A0G(r0) && this.A00 == 0) {
            A3m(C36371kC.A0H(this));
        }
    }

    public void Bet(AnonymousClass16X r6, String str) {
        String A012 = C201649k3.A01(this.A0Q, "p2p_context", false);
        AnonymousClass9YB A013 = this.A0P.A01();
        C79593ty r2 = new C79593ty();
        C81193wc.A01(A013.A03, A013, r2, 20);
        r2.A0A(new ATF(r6, this, A012));
    }

    public void BgF(AnonymousClass16X r4) {
        String str;
        if (this.A0e) {
            str = "p2m_context";
        } else {
            str = "p2p_context";
        }
        A17(r4, this, (C206349tD) null, str, this.A0b);
    }

    public void BgG() {
        A3r(this.A0J, this.A0U);
    }

    public void Biw(boolean z) {
        AnonymousClass6O3 r2 = this.A0U;
        C23075B3f b3f = this.A0J;
        if (z) {
            C179148jG.A1O(this, b3f, r2, 49);
        } else {
            C179148jG.A1O(this, b3f, r2, 48);
        }
    }

    public /* bridge */ /* synthetic */ C124965z5 BmR() {
        AnonymousClass16U A012 = this.A06.A01("BRL");
        AnonymousClass11F r17 = this.A0E;
        String str = this.A0j;
        C135066c4 r14 = this.A0c;
        Integer num = this.A0f;
        String str2 = this.A0o;
        int i = 2;
        if (this.A0u) {
            i = 0;
        }
        C120035qr r3 = new C120035qr(i, 0);
        C117695mg r1 = new C117695mg(false);
        C120015qp r0 = new C120015qp(NumberEntryKeyboard.A00(this.A05), this.A0r);
        String str3 = this.A0n;
        String str4 = this.A0k;
        String str5 = this.A0m;
        C120005qo r4 = new C120005qo(A012, 0);
        C18820ts r11 = this.A05;
        AnonymousClass16W r9 = (AnonymousClass16W) A012;
        C124885yx r21 = new C124885yx(C36441kJ.A0Q(Integer.valueOf(R.style.f13nameremoved), new int[]{0, 0, 0, 0}), C36441kJ.A0Q(Integer.valueOf(R.style.f13nameremoved), new int[]{0, 0, 0, 0}), (C88704Ts) null, r4, new C180468lr(this, r11, A012, r9.A00, r9.A01, this), str3, str4, str5, R.style.f13nameremoved, true, true, true);
        C20810yC r12 = this.A0D;
        AnonymousClass1H2 r112 = this.A0C;
        C21060yb r10 = this.A08;
        C18820ts r92 = this.A05;
        AnonymousClass1HA r7 = this.A0d;
        C19890wg r6 = this.A0Y;
        C144326s0 r22 = new C144326s0(this, r10, r92, this.A0B, r112, r12, new C144316rz(), r6, r7);
        C120025qq r72 = new C120025qq(this, r12.A0E(811));
        C29931Yo r102 = this.A0G;
        return new C124965z5(r17, r22, this, this, r21, new C122755vN(this.A0B, this.A0F, r102, false), r0, r1, r72, r3, r14, num, str, str2, false);
    }

    public void onBackPressed() {
        PaymentView paymentView = this.A0U;
        if (paymentView == null || !paymentView.A0J()) {
            AnonymousClass11F r0 = this.A0E;
            C18740tg.A06(r0);
            if (!AnonymousClass143.A0G(r0) || this.A00 != 0) {
                C203049nB.A03(C203049nB.A02(this.A07, (AnonymousClass16X) null, this.A0U, this.A0e), this.A0J, 1, "new_payment", (String) null, 1);
                finish();
                return;
            }
            this.A0G = null;
            A3m(C36371kC.A0H(this));
        }
    }

    public Dialog onCreateDialog(int i) {
        AnonymousClass0FM A012 = this.A0T.A01((Bundle) null, this, i);
        if (A012 == null) {
            return super.onCreateDialog(i);
        }
        return A012;
    }

    public static void A14(BottomSheetDialogFragment bottomSheetDialogFragment, BrazilPaymentActivity brazilPaymentActivity) {
        C39001qm A002 = AnonymousClass3LW.A00(brazilPaymentActivity);
        C39001qm.A02(brazilPaymentActivity.A02, A002, R.string.f12nameremoved);
        A002.A0i(new B8F(bottomSheetDialogFragment, brazilPaymentActivity, 9), brazilPaymentActivity.A02.getString(R.string.f12nameremoved));
        AnonymousClass0FM create = A002.create();
        create.setOnDismissListener(new C23186B8u(bottomSheetDialogFragment, 1));
        create.show();
    }

    public static void A16(C207079uW r7, AnonymousClass16X r8, C207249un r9, C146506vi r10, BrazilPaymentActivity brazilPaymentActivity, String str, String str2) {
        PinBottomSheetDialogFragment A002 = AnonymousClass9TJ.A00();
        A002.A0E.A00 = brazilPaymentActivity;
        A002.A09 = new AGL(r7, r8, r9, r10, A002, brazilPaymentActivity, str2, str);
        brazilPaymentActivity.A0M.A05("enter_pin", brazilPaymentActivity.A00);
        brazilPaymentActivity.Btm(A002);
    }

    public static void A1B(BrazilPaymentActivity brazilPaymentActivity, boolean z) {
        PaymentView paymentView = (PaymentView) brazilPaymentActivity.findViewById(R.id.payment_view);
        brazilPaymentActivity.A0U = paymentView;
        paymentView.setPaymentTabsVisibility(8);
        PaymentView paymentView2 = brazilPaymentActivity.A0U;
        paymentView2.A0q = brazilPaymentActivity;
        brazilPaymentActivity.getLifecycle().A04(new PaymentView$$ExternalSyntheticLambda8(paymentView2));
        PaymentView paymentView3 = brazilPaymentActivity.A0U;
        if (z) {
            paymentView3.setPaymentTabsVisibility(8);
        } else {
            paymentView3.setPaymentTabsVisibility(0);
        }
        PaymentView paymentView4 = brazilPaymentActivity.A0U;
        AnonymousClass141 r2 = brazilPaymentActivity.A09;
        String A0H2 = brazilPaymentActivity.A04.A0H(r2);
        paymentView4.A1A = A0H2;
        paymentView4.A0E.setText(A0H2);
        paymentView4.A06.setVisibility(8);
        paymentView4.A0S.A08(paymentView4.A0Q, r2);
        A18(brazilPaymentActivity);
    }

    public void BYE(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && !z) {
            A3q(this.A0J, this.A0U);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            X.0yC r0 = r5.A0D
            boolean r0 = X.AnonymousClass3MR.A00(r0)
            r5.A0d = r0
            X.0wG r0 = r5.A05
            android.content.Context r0 = r0.A00
            r5.A02 = r0
            X.1EU r0 = r5.A0P
            X.3ty r0 = X.AnonymousClass9YB.A00(r0)
            r5.A03 = r0
            X.2ZN r1 = r5.A0B
            X.3Bb r0 = r5.A0j
            r1.registerObserver(r0)
            com.whatsapp.jid.UserJid r0 = r5.A0G
            if (r0 != 0) goto L_0x003d
            X.11F r1 = r5.A0E
            X.C18740tg.A06(r1)
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 == 0) goto L_0x0037
            android.os.Bundle r0 = X.C36371kC.A0H(r5)
            r5.A3m(r0)
        L_0x0036:
            return
        L_0x0037:
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r1)
            r5.A0G = r0
        L_0x003d:
            r5.A3l(r6)
            if (r6 != 0) goto L_0x00ed
            X.5GL r2 = r5.A0M
            r1 = 185470254(0xb0e0d2e, float:2.735812E-32)
            java.lang.String r0 = r5.A0b
            java.lang.Integer r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x0055
            int r0 = r0.intValue()
        L_0x0053:
            r5.A00 = r0
        L_0x0055:
            android.content.Intent r0 = r5.getIntent()
            if (r0 == 0) goto L_0x0074
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "extra_request_id"
            java.lang.String r0 = r1.getStringExtra(r0)
            r5.A0c = r0
            android.content.Intent r2 = r5.getIntent()
            r1 = 0
            java.lang.String r0 = "extra_should_open_transaction_detail_after_send_override"
            boolean r0 = r2.getBooleanExtra(r0, r1)
            r5.A0w = r0
        L_0x0074:
            X.0yC r1 = r5.A0D
            r0 = 1482(0x5ca, float:2.077E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0092
            X.0wU r4 = r5.A04
            X.1EU r3 = r5.A0P
            X.1Db r2 = r5.A0C
            X.1EZ r0 = r5.A0I
            com.whatsapp.payments.CheckFirstTransaction r1 = new com.whatsapp.payments.CheckFirstTransaction
            r1.<init>(r0, r2, r3, r4)
            r5.A0h = r1
            X.01N r0 = r5.A06
            r0.A04(r1)
        L_0x0092:
            X.9k3 r0 = r5.A0Q
            X.9Xk r0 = r0.A03
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x00b6
            X.1Db r2 = r5.A0C
            android.content.SharedPreferences r1 = r2.A03()
            java.lang.String r0 = "payment_account_recoverable"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00dd
            android.content.SharedPreferences r1 = r2.A03()
            java.lang.String r0 = "payment_account_recoverable_time_ms"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00dd
        L_0x00b6:
            boolean r0 = r5 instanceof com.whatsapp.payments.ui.BrazilOrderDetailsActivity
            if (r0 != 0) goto L_0x0036
            boolean r0 = r5.A0d
            if (r0 == 0) goto L_0x0036
            android.view.View r1 = r5.A00
            r0 = 2131433874(0x7f0b1992, float:1.8489546E38)
            android.view.View r3 = X.C012005e.A02(r1, r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior
            r2.<init>()
            r5.A0g = r2
            X.3Pn r1 = r5.A0a
            X.1N2 r0 = r5.A0C
            r1.A02(r3, r2, r5, r0)
            X.07B r0 = r5.getSupportActionBar()
            X.C64813Pn.A00(r5, r0)
            return
        L_0x00dd:
            X.0yC r1 = r5.A0D
            r0 = 2000(0x7d0, float:2.803E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00b6
            X.63c r0 = r5.A0E
            r0.A00(r5)
            goto L_0x00b6
        L_0x00ed:
            java.lang.String r0 = "flow_instance_key"
            int r0 = r6.getInt(r0)
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPaymentActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.A0f) {
            this.A0M.A02(this.A00, 4);
            this.A0D.unregisterObserver(this.A0i);
        }
        this.A0J.reset();
        this.A0B.unregisterObserver(this.A0j);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        AnonymousClass11F r0 = this.A0E;
        C18740tg.A06(r0);
        if (!AnonymousClass143.A0G(r0) || this.A00 != 0) {
            finish();
            return true;
        }
        this.A0G = null;
        A3m(C36371kC.A0H(this));
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("flow_instance_key", this.A00);
    }

    public void onStart() {
        super.onStart();
        if (!(this instanceof BrazilOrderDetailsActivity) && this.A0d) {
            this.A0a.A03(this.A0g, this);
        }
    }

    public void Btj(DialogFragment dialogFragment) {
        Btm(dialogFragment);
    }
}
