package com.whatsapp.payments.ui;

import X.AE0;
import X.AH4;
import X.AH5;
import X.AVY;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass07B;
import X.AnonymousClass11F;
import X.AnonymousClass14B;
import X.AnonymousClass16I;
import X.AnonymousClass16T;
import X.AnonymousClass16U;
import X.AnonymousClass16V;
import X.AnonymousClass16W;
import X.AnonymousClass16X;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1H2;
import X.AnonymousClass1HA;
import X.AnonymousClass1NG;
import X.AnonymousClass3DI;
import X.AnonymousClass3EU;
import X.AnonymousClass3LW;
import X.AnonymousClass3MR;
import X.AnonymousClass3SJ;
import X.AnonymousClass7hJ;
import X.AnonymousClass8gL;
import X.AnonymousClass9HZ;
import X.AnonymousClass9I3;
import X.AnonymousClass9VE;
import X.AnonymousClass9v0;
import X.B79;
import X.B84;
import X.B9U;
import X.C012005e;
import X.C117695mg;
import X.C120005qo;
import X.C120015qp;
import X.C120025qq;
import X.C120035qr;
import X.C122755vN;
import X.C123415wS;
import X.C124885yx;
import X.C124965z5;
import X.C135066c4;
import X.C135086c7;
import X.C144326s0;
import X.C147386x8;
import X.C1497472p;
import X.C160477l4;
import X.C162067ny;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C165617ti;
import X.C173858Tk;
import X.C175698au;
import X.C176658cT;
import X.C179058iz;
import X.C180438lo;
import X.C180448lp;
import X.C183418ql;
import X.C183428qm;
import X.C183768rK;
import X.C18820ts;
import X.C196129Xv;
import X.C19890wg;
import X.C199729fr;
import X.C202349ld;
import X.C202759mb;
import X.C202809mh;
import X.C206799tz;
import X.C207369uz;
import X.C20810yC;
import X.C21060yb;
import X.C21100yf;
import X.C21129A9p;
import X.C226815j;
import X.C23156B7q;
import X.C23211B9t;
import X.C24601Db;
import X.C24611Dc;
import X.C29011Uz;
import X.C29131Vl;
import X.C29931Yo;
import X.C29971Ys;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36441kJ;
import X.C39001qm;
import X.C64813Pn;
import X.C90524aI;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.payments.ui.widget.PaymentView$$ExternalSyntheticLambda8;
import java.math.BigDecimal;
import java.util.List;

public class IndiaUpiSendPaymentActivity extends C179058iz implements AnonymousClass7hJ {
    public int A00 = 0;
    public AnonymousClass1NG A01;
    public AnonymousClass16I A02;
    public C196129Xv A03;
    public AnonymousClass3DI A04;
    public AnonymousClass3EU A05;
    public C29971Ys A06;
    public C29931Yo A07;
    public AnonymousClass9I3 A08;
    public C183428qm A09;
    public C183768rK A0A;
    public C21129A9p A0B = null;
    public C180448lp A0C;
    public C147386x8 A0D;
    public C19890wg A0E;
    public C29011Uz A0F;
    public C64813Pn A0G;
    public BigDecimal A0H;
    public boolean A0I;
    public boolean A0J = false;
    public boolean A0K = false;
    public BottomSheetBehavior A0L;
    public final C162067ny A0M = new AH4(this);
    public final C160477l4 A0N = new AH5(this);
    public final C226815j A0O = new B79(this, 4);

    public static void A11(C175698au r3, IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        indiaUpiSendPaymentActivity.A0a = false;
        indiaUpiSendPaymentActivity.Bnv();
        if (r3 != null && !indiaUpiSendPaymentActivity.A4g(r3)) {
            C24611Dc r2 = indiaUpiSendPaymentActivity.A0g;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("starting onContactVpa for jid: ");
            A0u.append(indiaUpiSendPaymentActivity.A0E);
            A0u.append(" vpa: ");
            A0u.append(r3.A01);
            A0u.append(" receiverVpaId: ");
            C165567td.A18(r2, r3.A02, A0u);
            indiaUpiSendPaymentActivity.A0I = r3.A01;
            indiaUpiSendPaymentActivity.A0h = r3.A02;
            if (!C202349ld.A02(r3.A00)) {
                indiaUpiSendPaymentActivity.A0G = r3.A00;
            }
            A17(indiaUpiSendPaymentActivity, true);
        }
    }

    public static String A0z(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, String str) {
        if (indiaUpiSendPaymentActivity.A0U == null || TextUtils.isEmpty(str)) {
            return "0";
        }
        return String.format(C36401kF.A0x(indiaUpiSendPaymentActivity.A00), "%.2f", AnonymousClass000.A1b(C202809mh.A01(indiaUpiSendPaymentActivity.A0U, C165617ti.A0b(str))));
    }

    public static void A12(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        if (indiaUpiSendPaymentActivity.A0J) {
            int i = indiaUpiSendPaymentActivity.A00;
            if (i != 0) {
                if (i != 1) {
                    int i2 = 36;
                    if (i != 2) {
                        i2 = 22;
                        if (i != 3) {
                            if (i != 4) {
                                indiaUpiSendPaymentActivity.A0J = false;
                                AnonymousClass3SJ.A00(indiaUpiSendPaymentActivity, 37);
                                PaymentView paymentView = indiaUpiSendPaymentActivity.A0M;
                                if (paymentView != null) {
                                    paymentView.A09();
                                    return;
                                }
                                return;
                            }
                            i2 = 35;
                        }
                    }
                    AnonymousClass3SJ.A00(indiaUpiSendPaymentActivity, 37);
                    AnonymousClass3SJ.A01(indiaUpiSendPaymentActivity, i2);
                    indiaUpiSendPaymentActivity.A00 = 0;
                    return;
                }
                AnonymousClass3SJ.A01(indiaUpiSendPaymentActivity, 37);
            } else if (indiaUpiSendPaymentActivity.A09 == null) {
                AnonymousClass3SJ.A01(indiaUpiSendPaymentActivity, 37);
                C183428qm r1 = new C183428qm(indiaUpiSendPaymentActivity);
                indiaUpiSendPaymentActivity.A09 = r1;
                C36391kE.A1Q(r1, indiaUpiSendPaymentActivity.A04);
            }
        }
    }

    public static void A13(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        C180438lo r3 = new C180438lo();
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity2 = indiaUpiSendPaymentActivity;
        indiaUpiSendPaymentActivity.A0C = r3;
        PaymentView paymentView = indiaUpiSendPaymentActivity.A0M;
        if (paymentView != null) {
            paymentView.A0F(r3, R.id.payment_bottom_button, R.id.payment_bottom_button_inflated);
            indiaUpiSendPaymentActivity.A0C.A00 = new AnonymousClass9v0(indiaUpiSendPaymentActivity.A0M, 46);
        }
        AnonymousClass17Y r5 = indiaUpiSendPaymentActivity.A05;
        AnonymousClass19A r7 = indiaUpiSendPaymentActivity.A0H;
        C29131Vl r13 = indiaUpiSendPaymentActivity.A0D;
        indiaUpiSendPaymentActivity2.A0E = new AnonymousClass8gL(indiaUpiSendPaymentActivity2, r5, indiaUpiSendPaymentActivity2.A07, r7, indiaUpiSendPaymentActivity2.A03, indiaUpiSendPaymentActivity2.A0L, indiaUpiSendPaymentActivity2.A0K, indiaUpiSendPaymentActivity2.A0M, indiaUpiSendPaymentActivity2.A0V, r13);
    }

    public static void A14(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        if (indiaUpiSendPaymentActivity.A0K) {
            A17(indiaUpiSendPaymentActivity, true);
            if (C173858Tk.A0x(indiaUpiSendPaymentActivity) && indiaUpiSendPaymentActivity.A00 != 5) {
                C183428qm r1 = new C183428qm(indiaUpiSendPaymentActivity);
                indiaUpiSendPaymentActivity.A09 = r1;
                C36391kE.A1Q(r1, indiaUpiSendPaymentActivity.A04);
            }
        } else if (!C202349ld.A02(indiaUpiSendPaymentActivity.A0G)) {
            A17(indiaUpiSendPaymentActivity, true);
            if (indiaUpiSendPaymentActivity.A0U != null) {
                C20810yC r12 = indiaUpiSendPaymentActivity.A0D;
                BigDecimal bigDecimal = C202809mh.A00;
                String num = Integer.toString(C165607th.A07(r12));
                indiaUpiSendPaymentActivity.A0l = num;
                indiaUpiSendPaymentActivity.A0D.A00 = indiaUpiSendPaymentActivity.A0N.A02(num, indiaUpiSendPaymentActivity.A0m, indiaUpiSendPaymentActivity.A0k);
            }
        } else if (indiaUpiSendPaymentActivity.A45()) {
            String A002 = AE0.A00(indiaUpiSendPaymentActivity.A0M);
            if (A002 == null || !A002.equals(indiaUpiSendPaymentActivity.A0I.A00)) {
                indiaUpiSendPaymentActivity.Bu1(R.string.f12nameremoved);
                indiaUpiSendPaymentActivity.A0E.A01(indiaUpiSendPaymentActivity.A0I, (C135086c7) null, new B9U(new AVY(indiaUpiSendPaymentActivity, 19), indiaUpiSendPaymentActivity, 1));
                return;
            }
            indiaUpiSendPaymentActivity.A4d(new C199729fr(R.string.f12nameremoved), (String) null, new Object[0]);
        } else if (indiaUpiSendPaymentActivity.A0E != null) {
            C183768rK r13 = new C183768rK(indiaUpiSendPaymentActivity, false);
            indiaUpiSendPaymentActivity.A0A = r13;
            C36391kE.A1Q(r13, indiaUpiSendPaymentActivity.A04);
            A17(indiaUpiSendPaymentActivity, true);
        } else {
            indiaUpiSendPaymentActivity.finish();
        }
    }

    public static void A15(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, String str, String str2) {
        C176658cT A042 = indiaUpiSendPaymentActivity.A0S.A04(C36371kC.A0o(), 51, "new_payment", indiaUpiSendPaymentActivity.A0f);
        A042.A0S = str;
        A042.A0T = str2;
        C173858Tk.A0r(A042, indiaUpiSendPaymentActivity);
    }

    public static void A16(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, String str, boolean z) {
        if (str != null) {
            C24601Db r2 = indiaUpiSendPaymentActivity.A0N.A02;
            r2.A0M(AnonymousClass000.A0p(";", str, C165587tf.A0j(r2)));
            indiaUpiSendPaymentActivity.A0P.A01().A03(str).A0A(new C23211B9t(1, indiaUpiSendPaymentActivity, z));
            return;
        }
        indiaUpiSendPaymentActivity.A05.A02();
        indiaUpiSendPaymentActivity.A4d(new C199729fr(R.string.f12nameremoved), (String) null, C90524aI.A0w());
    }

    public static void A17(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, boolean z) {
        PaymentView paymentView;
        PaymentView paymentView2 = indiaUpiSendPaymentActivity.A0M;
        if (paymentView2 != null && !indiaUpiSendPaymentActivity.A0a) {
            if (indiaUpiSendPaymentActivity.A00 == null) {
                indiaUpiSendPaymentActivity.setContentView((View) paymentView2);
                if (indiaUpiSendPaymentActivity.A0I) {
                    C36341k9.A12(indiaUpiSendPaymentActivity);
                    C64813Pn.A00(indiaUpiSendPaymentActivity, indiaUpiSendPaymentActivity.getSupportActionBar());
                    indiaUpiSendPaymentActivity.A10();
                }
            }
            indiaUpiSendPaymentActivity.A4P();
            if (z) {
                if (!indiaUpiSendPaymentActivity.A0D.A0E(842) || indiaUpiSendPaymentActivity.A0D.A0E(979)) {
                    indiaUpiSendPaymentActivity.A4O();
                } else {
                    indiaUpiSendPaymentActivity.A3p(indiaUpiSendPaymentActivity.A0E);
                }
            }
            String str = indiaUpiSendPaymentActivity.A0f;
            if (!(str == null || (paymentView = indiaUpiSendPaymentActivity.A0M) == null)) {
                paymentView.A1B = str;
            }
            List list = indiaUpiSendPaymentActivity.A0i;
            if (list != null) {
                list.clear();
            }
            if (indiaUpiSendPaymentActivity.A0J == null && (C173858Tk.A0x(indiaUpiSendPaymentActivity) || indiaUpiSendPaymentActivity.A0M.A0N())) {
                C183418ql r1 = new C183418ql(indiaUpiSendPaymentActivity);
                indiaUpiSendPaymentActivity.A0J = r1;
                C36331k8.A1F(r1, indiaUpiSendPaymentActivity.A04);
            }
            indiaUpiSendPaymentActivity.Bnv();
        }
    }

    public /* bridge */ /* synthetic */ C124965z5 BmR() {
        String str;
        AnonymousClass16X r6;
        C144326s0 r18;
        String str2;
        C123415wS r13;
        int A002;
        C120005qo r62;
        C206799tz r0 = this.A0U;
        AnonymousClass16T r1 = this.A07;
        if (r0 == null) {
            str = "INR";
        } else {
            str = r0.A01;
        }
        AnonymousClass16U A012 = r1.A01(str);
        AnonymousClass9I3 r2 = this.A08;
        if (r2.A00) {
            r2.A00 = false;
            if (TextUtils.isEmpty(this.A0j)) {
                this.A0j = getString(R.string.f12nameremoved);
            }
            if (TextUtils.isEmpty(this.A0m)) {
                this.A0m = ((AnonymousClass16W) A012).A01.toString();
            }
        }
        if (!TextUtils.isEmpty(this.A0m)) {
            r6 = new AnonymousClass16X(C165617ti.A0b(this.A0m), ((AnonymousClass16V) A012).A01);
        } else {
            r6 = ((AnonymousClass16W) A012).A01;
        }
        AnonymousClass16X A0P = C165587tf.A0P(C21100yf.A1o, this.A06, A012);
        if (!A45()) {
            C20810yC r10 = this.A0D;
            AnonymousClass1H2 r9 = this.A0C;
            C21060yb r8 = this.A08;
            C18820ts r7 = this.A00;
            AnonymousClass1HA r5 = this.A0d;
            C19890wg r3 = this.A0E;
            r18 = new C144326s0(this, r8, r7, this.A0B, r9, r10, this.A0C, r3, r5);
        } else {
            r18 = null;
        }
        if (!this.A0D.A0E(1955) || !this.A0K || AnonymousClass14B.A0F(this.A0k)) {
            str2 = this.A0l;
        } else {
            str2 = "500500";
        }
        String A0M2 = C173858Tk.A0M(this);
        if (!AnonymousClass14B.A0F(A0M2)) {
            str2 = A0M2;
        }
        AnonymousClass16X A022 = this.A0N.A02(str2, this.A0m, this.A0k);
        C206799tz r52 = this.A0U;
        if (r52 != null) {
            r13 = new C123415wS(this, this.A00, this.A07, r52, this.A0m);
        } else {
            r13 = null;
        }
        this.A0D = new C147386x8(this, this.A00, A012, A022, r6, A0P, r13);
        AnonymousClass11F r19 = this.A0E;
        String str3 = this.A0j;
        C135066c4 r15 = this.A0c;
        Integer num = this.A0f;
        String str4 = this.A0o;
        C162067ny r11 = this.A0M;
        if (this.A0u) {
            A002 = 0;
        } else {
            A002 = C36371kC.A00(this.A0I ? 1 : 0);
        }
        C120035qr r53 = new C120035qr(A002, getIntent().getIntExtra("extra_transfer_direction", 0));
        C117695mg r32 = new C117695mg(!C173858Tk.A0x(this));
        C120015qp r22 = new C120015qp(NumberEntryKeyboard.A00(this.A00), this.A0r);
        C160477l4 r102 = this.A0N;
        String str5 = this.A0n;
        String str6 = this.A0k;
        String str7 = this.A0m;
        C206799tz r63 = this.A0U;
        if (r63 == null) {
            r62 = new C120005qo(A012, 0);
        } else {
            r62 = new C120005qo(this.A07.A01(r63.A01), 2);
        }
        Integer valueOf = Integer.valueOf(R.style.f13nameremoved);
        C124885yx r21 = new C124885yx(C36441kJ.A0Q(valueOf, new int[]{0, 0, 0, 0}), C36441kJ.A0Q(valueOf, new int[]{0, 0, 0, 0}), this.A0B, r62, this.A0D, str5, str6, str7, R.style.f13nameremoved, false, false, false);
        C120025qq r64 = new C120025qq(this, this.A0D.A0E(811));
        C29931Yo r82 = this.A07;
        return new C124965z5(r19, r18, r11, r102, r21, new C122755vN(this.A0B, this.A06, r82, this.A0D.A0E(629)), r22, r32, r64, r53, r15, num, str3, str4, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r4 != 1018) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            r0 = 1008(0x3f0, float:1.413E-42)
            if (r4 == r0) goto L_0x0010
            r0 = 1015(0x3f7, float:1.422E-42)
            if (r4 == r0) goto L_0x0026
            r0 = 1018(0x3fa, float:1.427E-42)
            if (r4 == r0) goto L_0x0010
        L_0x000c:
            super.onActivityResult(r4, r5, r6)
            return
        L_0x0010:
            boolean r0 = A18(r3)
            if (r0 == 0) goto L_0x000c
            X.16X r2 = r3.A09
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r3.Bu1(r0)
            X.0wU r1 = r3.A04
            r0 = 46
            X.AVb.A00(r1, r3, r2, r0)
            return
        L_0x0026:
            r3.A4N()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public Dialog onCreateDialog(int i) {
        C39001qm r5;
        int i2;
        int i3;
        C39001qm A002;
        int i4;
        int i5;
        if (i != 29) {
            switch (i) {
                case 35:
                    A002 = AnonymousClass3LW.A00(this);
                    A002.A0d(R.string.f12nameremoved);
                    A002.A0c(R.string.f12nameremoved);
                    i2 = R.string.f12nameremoved;
                    i3 = 32;
                    break;
                case 36:
                    A002 = AnonymousClass3LW.A00(this);
                    A002.A0d(R.string.f12nameremoved);
                    A002.A0c(R.string.f12nameremoved);
                    i2 = R.string.f12nameremoved;
                    i3 = 33;
                    break;
                case 37:
                    ProgressDialog progressDialog = new ProgressDialog(this);
                    progressDialog.setMessage(getString(R.string.f12nameremoved));
                    progressDialog.setCancelable(false);
                    progressDialog.setButton(-1, getString(R.string.f12nameremoved), new B84(this, 34));
                    return progressDialog;
                default:
                    switch (i) {
                        case 39:
                            A15(this, "-10021", "MAX_AMOUNT_2K_ALERT");
                            r5 = AnonymousClass3LW.A00(this);
                            C165587tf.A0t(this, r5, new Object[]{AnonymousClass16W.A05.B7e(this.A00, this.A0H)}, R.string.f12nameremoved);
                            i4 = R.string.f12nameremoved;
                            i5 = 35;
                            break;
                        case 40:
                            A15(this, "-10021", "MAX_AMOUNT_2K_ALERT");
                            r5 = AnonymousClass3LW.A00(this);
                            C165587tf.A0t(this, r5, new Object[]{AnonymousClass16W.A05.B7e(this.A00, C165617ti.A0b(C173858Tk.A0M(this)))}, R.string.f12nameremoved);
                            i4 = R.string.f12nameremoved;
                            i5 = 36;
                            break;
                        case 41:
                            A15(this, "-10021", "MAX_AMOUNT_2K_ALERT");
                            r5 = AnonymousClass3LW.A00(this);
                            C165587tf.A0t(this, r5, new Object[]{AnonymousClass16W.A05.B7e(this.A00, C165617ti.A0b(C173858Tk.A0M(this)))}, R.string.f12nameremoved);
                            i4 = R.string.f12nameremoved;
                            i5 = 37;
                            break;
                        default:
                            return super.onCreateDialog(i);
                    }
                    B84.A00(r5, this, i5, i4);
                    r5.A0r(false);
                    break;
            }
            B84.A00(r5, this, i3, i2);
            r5.A0r(true);
        } else {
            r5 = AnonymousClass3LW.A00(this);
            C165587tf.A16(r5);
            B84.A00(r5, this, 30, R.string.f12nameremoved);
            B84.A01(r5, this, 31, R.string.f12nameremoved);
        }
        return r5.create();
    }

    private void A10() {
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            boolean z = this.A0u;
            int i = R.string.f12nameremoved;
            if (z) {
                i = R.string.f12nameremoved;
            }
            C165577te.A10(supportActionBar, i);
            if (!this.A0u) {
                supportActionBar.A0F(0.0f);
            }
        }
    }

    public static boolean A18(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        if (indiaUpiSendPaymentActivity.getIntent().getIntExtra("extra_transaction_type", 0) != 20 || !indiaUpiSendPaymentActivity.A0D.A0E(1847) || !indiaUpiSendPaymentActivity.A0I.A0E()) {
            return false;
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0I = AnonymousClass3MR.A00(this.A0D);
        this.A04.A03 = this.A0V;
        if (bundle == null) {
            String A0g = C165587tf.A0g(this);
            if (A0g == null) {
                A0g = this.A0f;
            }
            Integer A002 = this.A0V.A00(A0g, 185472016);
            if (A002 != null) {
                this.A00 = A002.intValue();
            }
            this.A0V.A08("wa_to_wa", !A45(), this.A00);
        }
        this.A02.registerObserver(this.A0O);
        A10();
        PaymentView paymentView = (PaymentView) LayoutInflater.from(this).inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
        this.A0M = paymentView;
        paymentView.A0q = this;
        getLifecycle().A04(new PaymentView$$ExternalSyntheticLambda8(paymentView));
        C206799tz r0 = (C206799tz) getIntent().getParcelableExtra("extra_upi_global_meta_data");
        this.A0U = r0;
        if (r0 != null) {
            C21129A9p a9p = new C21129A9p();
            this.A0B = a9p;
            PaymentView paymentView2 = this.A0M;
            if (paymentView2 != null) {
                paymentView2.A0F(a9p, R.id.send_payment_amount_description_container, R.id.send_payment_amount_description_container_inflated);
            }
            this.A0B.B1n(new AnonymousClass9HZ(2, new AnonymousClass9VE(C36391kE.A0v(this, A0z(this, this.A0U.A08), AnonymousClass001.A0L(), 0, R.string.f12nameremoved))));
            C21129A9p a9p2 = this.A0B;
            C207369uz r1 = new C207369uz(this, 15);
            TextView textView = a9p2.A00;
            if (textView != null) {
                textView.setOnClickListener(r1);
            } else {
                throw C36331k8.A0d("amountConversion");
            }
        }
        this.A0K = getIntent().getBooleanExtra("verify-vpa-in-background", false);
        this.A0V = getIntent().getBooleanExtra("extra_mapper_alias_resolved", false);
        this.A0P = getIntent().getStringExtra("extra_receiver_platform");
        if (this.A0D.A0E(1933) && C202759mb.A05(this.A0f)) {
            int A042 = this.A06.A04(C21100yf.A1m);
            if (this.A0D.A0E(7137)) {
                A042 = this.A06.A04(C21100yf.A1n);
            }
            this.A0H = new BigDecimal(A042);
        }
        this.A0n = getIntent().getBooleanExtra("extra_transaction_is_valid_merchant", false);
        this.A0S = getIntent().getStringExtra("extra_merchant_code");
        this.A0Z = getIntent().getStringExtra("extra_merchant_code");
        String str = this.A0S;
        if (str != null && !str.equals("0000")) {
            this.A0p = "p2m";
        }
        if (A45()) {
            A13(this);
        } else {
            this.A0C = new C180448lp();
        }
        if (this.A0I) {
            View A022 = C012005e.A02(this.A0M, R.id.send_payment_keyboard_popup_layout);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            this.A0L = bottomSheetBehavior;
            this.A0G.A02(A022, bottomSheetBehavior, this, this.A0C);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0V.A02(this.A00, 4);
        this.A02.unregisterObserver(this.A0O);
        boolean A1Z = C36411kG.A1Z(this.A0A);
        C183428qm r0 = this.A09;
        if (r0 != null) {
            r0.A0D(A1Z);
        }
    }

    public void onPause() {
        super.onPause();
        PaymentView paymentView = this.A0M;
        if (paymentView != null) {
            paymentView.A03 = paymentView.A0u.B8E().getCurrentFocus();
        }
    }

    public void onResume() {
        super.onResume();
        if (C173858Tk.A0x(this)) {
            if (!this.A04.A07.contains("upi-get-challenge") && this.A0M.A09().A00 == null) {
                this.A0g.A06("onResume getChallenge");
                Bu1(R.string.f12nameremoved);
                this.A04.A01("upi-get-challenge");
                A4A();
                return;
            } else if (TextUtils.isEmpty((CharSequence) this.A0M.A08().A00)) {
                this.A06.A01(this, this.A04, new C23156B7q(this, 0));
                return;
            }
        }
        A4E();
    }

    public void onStart() {
        super.onStart();
        if (this.A0I) {
            BottomSheetBehavior bottomSheetBehavior = this.A0L;
            PaymentView paymentView = this.A0M;
            if (bottomSheetBehavior != null && bottomSheetBehavior.A0J == 4) {
                paymentView.post(new C1497472p(bottomSheetBehavior, 0));
            }
        }
    }
}
