package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass11F;
import X.AnonymousClass16J;
import X.AnonymousClass16S;
import X.AnonymousClass16X;
import X.AnonymousClass185;
import X.AnonymousClass190;
import X.AnonymousClass1FR;
import X.AnonymousClass1X4;
import X.AnonymousClass1XC;
import X.AnonymousClass2bZ;
import X.AnonymousClass3LW;
import X.AnonymousClass9SA;
import X.AnonymousClass9SC;
import X.AnonymousClass9UH;
import X.B5M;
import X.B7Y;
import X.B83;
import X.C121835tn;
import X.C146506vi;
import X.C157447cy;
import X.C165567td;
import X.C165577te;
import X.C165597tg;
import X.C165607th;
import X.C167747yk;
import X.C173858Tk;
import X.C175708av;
import X.C175938bJ;
import X.C180428lm;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C194219Oo;
import X.C19770wU;
import X.C199949gJ;
import X.C199969gL;
import X.C202319lY;
import X.C202449lr;
import X.C20310xM;
import X.C203419nz;
import X.C20380xT;
import X.C206289t2;
import X.C206349tD;
import X.C206369tH;
import X.C206909uC;
import X.C206929uE;
import X.C207079uW;
import X.C207119ua;
import X.C207199ui;
import X.C207219uk;
import X.C207249un;
import X.C21157AAr;
import X.C21314AGs;
import X.C21335AHn;
import X.C22986Azc;
import X.C23031B1c;
import X.C23043B1o;
import X.C23163B7x;
import X.C24611Dc;
import X.C24881Ed;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C64933Qa;
import X.C65443Sb;
import X.C88874Uj;
import X.C90484aE;
import android.content.Intent;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.whatsapp.R;
import com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;
import com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class BrazilOrderDetailsActivity extends BrazilPaymentActivity implements C88874Uj, C23031B1c, C22986Azc, C157447cy {
    public int A00;
    public long A01;
    public AnonymousClass1X4 A02;
    public AnonymousClass185 A03;
    public AnonymousClass16J A04;
    public C24881Ed A05;
    public AnonymousClass16S A06;
    public AnonymousClass1XC A07;
    public C180428lm A08;
    public AnonymousClass9SA A09;
    public PaymentCheckoutOrderDetailsViewV2 A0A;
    public C167747yk A0B;
    public AnonymousClass9SC A0C;
    public C194219Oo A0D;
    public AnonymousClass9UH A0E;
    public C121835tn A0F;
    public AnonymousClass1FR A0G;
    public C64933Qa A0H;
    public AnonymousClass2bZ A0I;
    public C199969gL A0J;
    public C20380xT A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public List A0O;
    public boolean A0P;
    public boolean A0Q;
    public final Set A0R;
    public final Set A0S;

    public void Bbu(String str) {
    }

    public void Bbw(AnonymousClass11F r16, C23043B1o b1o, String str) {
        C64933Qa r11;
        C23043B1o b1o2 = b1o;
        this.A0J.A02(b1o2, A0z(this), (String) null, (List) null, 7, true, false, false);
        C207219uk BA8 = b1o2.BA8();
        C18740tg.A06(BA8);
        C207199ui r10 = BA8.A01;
        AnonymousClass9UH r8 = this.A0E;
        C18740tg.A06(r10);
        if (!TextUtils.isEmpty(r10.A04)) {
            r11 = this.A0H;
        } else {
            r11 = null;
        }
        Intent A002 = r8.A00(this, r10, r11, (String) null, str, (String) null);
        if (A002 == null) {
            Log.e("Pay: BrazilOrderDetailsActivity/onOpenTransactionDetailClicked the transaction details intent is null");
        } else {
            startActivity(A002);
        }
    }

    public void BcU(C207119ua r1, C23043B1o b1o, String str, String str2, List list) {
    }

    public boolean BtR(int i) {
        return i == 405 || i == 401 || i == 403 || i == 420;
    }

    public static Integer A0z(BrazilOrderDetailsActivity brazilOrderDetailsActivity) {
        Integer num;
        C175708av r0;
        C207079uW A0B2;
        C194219Oo r2 = brazilOrderDetailsActivity.A0D;
        C206349tD r02 = r2.A09;
        if (r02 != null) {
            num = Integer.valueOf(r02.A00);
        } else {
            num = null;
        }
        C202319lY r03 = r2.A07;
        if (r03 == null || (r0 = r03.A0A) == null || (A0B2 = r0.A0B()) == null) {
            return num;
        }
        return Integer.valueOf(A0B2.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if ("chat".equals(r11) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A10(X.C207119ua r6, X.AnonymousClass11F r7, com.whatsapp.payments.ui.BrazilOrderDetailsActivity r8, X.C21335AHn r9, java.lang.String r10, java.lang.String r11) {
        /*
            java.util.Set r1 = r8.A0S
            int r0 = r8.A00
            boolean r4 = X.AnonymousClass000.A1Z(r1, r0)
            X.C18740tg.A06(r7)
            X.2bZ r3 = r8.A0I
            if (r4 == 0) goto L_0x0018
            java.lang.String r0 = "chat"
            boolean r0 = r0.equals(r11)
            r1 = 1
            if (r0 != 0) goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            java.lang.String r5 = "merchantJid"
            X.C36321k7.A11(r10, r3, r6)
            r0 = 6
            X.AnonymousClass00C.A0D(r9, r0)
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r0 = "total_amount"
            r2.putString(r0, r10)
            java.lang.String r0 = r7.getRawString()
            r2.putString(r5, r0)
            java.lang.String r0 = "payment_settings"
            r2.putParcelable(r0, r9)
            java.lang.String r0 = "total_amount_money_representation"
            r2.putParcelable(r0, r6)
            java.lang.String r0 = "referral_screen"
            r2.putString(r0, r11)
            java.lang.String r0 = "is_quick_launch_enabled"
            r2.putBoolean(r0, r4)
            java.lang.String r0 = "show_snackbar_on_copy_enabled"
            r2.putBoolean(r0, r1)
            X.9uk r1 = r3.A00
            X.C18740tg.A06(r1)
            java.lang.String r0 = "interactive_message_content"
            r2.putParcelable(r0, r1)
            X.9ui r0 = r1.A01
            X.C18740tg.A06(r0)
            java.lang.String r1 = r0.A0F
            java.lang.String r0 = "referenceId"
            r2.putString(r0, r1)
            com.whatsapp.payments.ui.BrazilPixBottomSheet r1 = new com.whatsapp.payments.ui.BrazilPixBottomSheet
            r1.<init>()
            r1.A17(r2)
            X.6ZA r0 = r1.A05
            r0.A00 = r8
            X.C65443Sb.A00(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilOrderDetailsActivity.A10(X.9ua, X.11F, com.whatsapp.payments.ui.BrazilOrderDetailsActivity, X.AHn, java.lang.String, java.lang.String):void");
    }

    public static void A12(AnonymousClass11F r5, BrazilOrderDetailsActivity brazilOrderDetailsActivity, String str, String str2, String str3) {
        if (brazilOrderDetailsActivity.A0O.A02.A0E(7238)) {
            brazilOrderDetailsActivity.A0B.A0S(brazilOrderDetailsActivity.A0I, (String) null, "pending_buyer_confirmation", 2);
        }
        PaymentCustomInstructionsBottomSheet A0f = C165607th.A0f(r5, str, str2, str3);
        A0f.A04.A00 = brazilOrderDetailsActivity;
        C65443Sb.A00(A0f, brazilOrderDetailsActivity);
    }

    public static void A13(BrazilOrderDetailsActivity brazilOrderDetailsActivity, C23043B1o b1o, int i) {
        C199969gL r1 = brazilOrderDetailsActivity.A0J;
        ArrayList A002 = brazilOrderDetailsActivity.A0C.A00();
        C23043B1o b1o2 = b1o;
        r1.A02(b1o2, A0z(brazilOrderDetailsActivity), AnonymousClass1FR.A03(i), A002, 5, true, true, true);
    }

    public void A2F() {
        if (!this.A0Q) {
            this.A0Q = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C165567td.A11(r1, this);
            C18830tt r2 = r1.A00;
            C165567td.A0v(r1, r2, this, C36321k7.A05(r1, r2, this));
            C173858Tk.A0h(A0L2, r1, r2, this);
            C173858Tk.A0i(A0L2, r1, r2, this, C165577te.A0f(r1));
            C173858Tk.A0n(r1, r2, this);
            C173858Tk.A0o(r1, r2, this);
            C173858Tk.A0j(A0L2, r1, r2, this, C36351kA.A0m(r1));
            this.A02 = C36361kB.A0T(r1);
            this.A06 = (AnonymousClass16S) r1.A6x.get();
            this.A0E = (AnonymousClass9UH) r2.AAb.get();
            this.A0G = C36431kI.A0p(r1);
            this.A0K = C36331k8.A0I(r1);
            this.A04 = C36361kB.A0Z(r1);
            this.A03 = C36371kC.A0U(r1);
            this.A05 = (C24881Ed) r1.A6H.get();
            this.A07 = (AnonymousClass1XC) r1.A6F.get();
            this.A0J = (C199969gL) r1.AUu.get();
        }
    }

    public void A3w(C207079uW r13, AnonymousClass16X r14, C207249un r15, C146506vi r16, String str, String str2, String str3, int i) {
        Integer num;
        C36421kH.A1H(this.A04, this, str2, 8);
        if (r13 != null) {
            num = Integer.valueOf(r13.A01);
        } else {
            num = null;
        }
        this.A0J.A02(this.A0I, num, "native", this.A0C.A00(), 19, false, false, true);
        super.A3w(r13, r14, r15, r16, str, str2, str3, i);
    }

    public void BTU(C207119ua r22, AnonymousClass11F r23, C206349tD r24, AnonymousClass9SC r25, C23043B1o b1o, String str, String str2, String str3, HashMap hashMap) {
        String str4;
        C206909uC r5;
        boolean z = true;
        try {
            C24611Dc.A01("BrazilOrderDetailsActivity", "invalid merchant JID");
            ConditionVariable conditionVariable = C18740tg.A00;
            AnonymousClass9SC r13 = r25;
            C18740tg.A0E(AnonymousClass000.A1V(r13), C24611Dc.A01("BrazilOrderDetailsActivity", "invalid payment method"));
            C23043B1o b1o2 = b1o;
            if (b1o2.BA8() == null) {
                z = false;
            }
            C18740tg.A0E(z, C24611Dc.A01("BrazilOrderDetailsActivity", "invalid message content"));
            AnonymousClass9SC r14 = (AnonymousClass9SC) C90484aE.A0j(hashMap, 6);
            int i = r13.A01;
            C207119ua r9 = r22;
            AnonymousClass11F r10 = r23;
            C206349tD r12 = r24;
            String str5 = str2;
            if (i != -1) {
                String str6 = str3;
                if (i == 0) {
                    A11(r9, this, r12, b1o2, str6);
                } else if (i == 2) {
                    C206929uE r1 = r13.A02;
                    if (r1 == null) {
                        C165577te.A1M("BrazilOrderDetailsActivity", "invalid external payemnt configuration payload");
                        return;
                    }
                    C18740tg.A06(r10);
                    String str7 = r1.A00;
                    C18740tg.A06(str7);
                    A12(r10, this, str7, str6, str5);
                } else if (i == 3) {
                    C207199ui A0T = this.A0B.A0T(b1o2, (String) null, (String) null, 3, C165597tg.A0B());
                    if (this.A0B.A0a()) {
                        this.A02.A0N(r10, getString(R.string.f12nameremoved));
                    } else {
                        C167747yk r15 = this.A0B;
                        C18740tg.A06(r10);
                        r15.A0X(r10, A0T, b1o2);
                    }
                    this.A0V.A01(A0T, b1o2);
                    this.A0J.A02(this.A0I, A0z(this), "confirm", this.A0C.A00(), 19, false, false, true);
                    finish();
                } else if (i != 6) {
                    C165577te.A1M("BrazilOrderDetailsActivity", "onCheckoutCtaButtonClicked : the selected payment method is not supported");
                } else if (!(r14 == null || (r5 = r14.A03) == null)) {
                    String str8 = r5.A01;
                    if ("pix_static_code".equals(str8) || "pix_dynamic_code".equals(str8)) {
                        B5M b5m = r5.A00;
                        if (b5m instanceof C21335AHn) {
                            C18740tg.A06(r10);
                            C18740tg.A06(str5);
                            C18740tg.A06(r9);
                            A10(r9, r10, this, (C21335AHn) b5m, str5, str6);
                        }
                    }
                }
            } else {
                List list = r13.A04;
                C18740tg.A06(list);
                String str9 = ((C206369tH) list.get(0)).A0A;
                C18740tg.A06(list);
                if (!TextUtils.isEmpty(this.A0b)) {
                    str4 = this.A0b;
                } else {
                    str4 = "order_details";
                }
                PaymentOptionsBottomSheet A032 = PaymentOptionsBottomSheet.A03(str9, str4, list, true);
                A032.A03.A00 = this;
                A032.A05 = new C21314AGs(r9, r10, this, r12, r13, r14, b1o2, str5);
                C65443Sb.A00(A032, this);
            }
            A13(this, b1o2, i);
        } catch (IllegalArgumentException e) {
            Log.e((Throwable) e);
        }
    }

    public void BUI(AnonymousClass11F r11, int i) {
        C207199ui A0S2 = this.A0B.A0S(this.A0I, (String) null, "pending", i);
        C167747yk r1 = this.A0B;
        C18740tg.A06(r11);
        r1.A0X(r11, A0S2, this.A0I);
        C199969gL r12 = this.A0J;
        AnonymousClass2bZ r2 = this.A0I;
        ArrayList A002 = this.A0C.A00();
        r12.A02(r2, A0z(this), AnonymousClass1FR.A03(i), A002, 19, false, false, true);
        finish();
    }

    public void Bat(AnonymousClass11F r10, C23043B1o b1o, long j) {
        this.A0J.A02(b1o, A0z(this), (String) null, (List) null, 8, false, false, false);
        Intent A1Z = new AnonymousClass190().A1Z(this, r10, 0);
        A1Z.putExtra("extra_quoted_message_row_id", j);
        startActivity(A1Z);
    }

    public void Bew(int i) {
        this.A0B.A0S(this.A0I, (String) null, "unset", -1);
        C199969gL r1 = this.A0J;
        AnonymousClass2bZ r2 = this.A0I;
        ArrayList A002 = this.A0C.A00();
        r1.A02(r2, A0z(this), AnonymousClass1FR.A03(i), A002, 35, false, false, true);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C199949gJ r4;
        C206289t2 r1;
        C121835tn r0 = this.A0F;
        if (!(r0 == null || (r4 = (C199949gJ) r0.A01) == null)) {
            Bundle A072 = AnonymousClass001.A07();
            Boolean bool = r4.A06;
            if (bool != null) {
                A072.putBoolean("should_show_shimmer_key", bool.booleanValue());
            }
            A072.putParcelable("checkout_error_code_key", r4.A03);
            A072.putParcelable("merchant_jid_key", r4.A02);
            A072.putSerializable("merchant_status_key", r4.A04);
            AnonymousClass2bZ r02 = r4.A05;
            if (r02 != null) {
                C202319lY r2 = r02.A0M;
                C203419nz r03 = C203419nz.$redex_init_class;
                if (r2 == null) {
                    r1 = null;
                } else {
                    r1 = new C206289t2(r2);
                }
                A072.putParcelable("payment_transaction_key", r1);
            }
            List list = r4.A07;
            if (list != null) {
                A072.putParcelableArrayList("installment_option_key", C36441kJ.A15(list));
            }
            bundle.putBundle("save_order_detail_state_key", A072);
        }
        super.onSaveInstanceState(bundle);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A0P && !AnonymousClass000.A1Z(this.A0S, this.A00)) {
            return super.onTouchEvent(motionEvent);
        }
        C36351kA.A11(this);
        return true;
    }

    public BrazilOrderDetailsActivity(int i) {
        this.A0Q = false;
        B7Y.A00(this, 36);
    }

    public static void A11(C207119ua r8, BrazilOrderDetailsActivity brazilOrderDetailsActivity, C206349tD r10, C23043B1o b1o, String str) {
        brazilOrderDetailsActivity.Bu1(R.string.f12nameremoved);
        C19770wU r6 = brazilOrderDetailsActivity.A04;
        C20310xM r1 = brazilOrderDetailsActivity.A07;
        AnonymousClass1XC r4 = brazilOrderDetailsActivity.A07;
        C202449lr.A02(brazilOrderDetailsActivity.A05, r1, brazilOrderDetailsActivity.A05, new C21157AAr(r8, brazilOrderDetailsActivity, r10, b1o, str), r4, b1o, r6);
    }

    public void A3z(C175938bJ r2, int i) {
        super.A3z(r2, i);
        r2.A02 = A3t();
    }

    public void BUE(AnonymousClass11F r11) {
        C207199ui A0T = this.A0B.A0T(this.A0I, (String) null, (String) null, 2, C165597tg.A0B());
        if (this.A0B.A0a()) {
            this.A02.A0N(r11, getString(R.string.f12nameremoved));
        } else {
            C167747yk r1 = this.A0B;
            C18740tg.A06(r11);
            r1.A0X(r11, A0T, this.A0I);
        }
        this.A0V.A01(A0T, this.A0I);
        this.A0J.A02(this.A0I, A0z(this), "cpi", this.A0C.A00(), 19, false, false, true);
        finish();
    }

    public void Bts(C202319lY r10, AnonymousClass11F r11, long j) {
        int i = R.string.f12nameremoved;
        int i2 = R.string.f12nameremoved;
        int i3 = r10.A02;
        if (i3 == 401 || i3 == 403 || i3 == 420) {
            i = R.string.f12nameremoved;
            i2 = R.string.f12nameremoved;
        }
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0r(false);
        A002.A0q(getString(i));
        C39001qm.A02(this, A002, i2);
        B83.A01(A002, this, 18, R.string.f12nameremoved);
        A002.A0f(new C23163B7x(r11, this, 0, j), R.string.f12nameremoved);
        C36341k9.A11(A002);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if ((this.A0P || AnonymousClass000.A1Z(this.A0S, this.A00)) && i2 == 0) {
            C36351kA.A11(this);
        }
    }

    public void onStart() {
        super.onStart();
        if (this.A0P || AnonymousClass000.A1Z(this.A0S, this.A00)) {
            overridePendingTransition(0, 0);
        }
    }

    public BrazilOrderDetailsActivity() {
        this(0);
        Integer[] numArr = new Integer[4];
        AnonymousClass000.A1L(numArr, -1, 0);
        AnonymousClass000.A1K(numArr, 6);
        numArr[2] = 2;
        C36341k9.A1T(numArr, 0);
        this.A0S = C36421kH.A0g(numArr);
        this.A0R = C36421kH.A0g(new String[]{"canceled", "completed"});
    }
}
