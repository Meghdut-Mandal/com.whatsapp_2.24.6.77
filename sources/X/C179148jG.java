package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilSmbPaymentActivity;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import java.util.List;

/* renamed from: X.8jG  reason: invalid class name and case insensitive filesystem */
public abstract class C179148jG extends C173858Tk implements C162077nz {
    public int A00;
    public int A01 = 6;
    public long A02;
    public C1033354w A03;
    public C20430xY A04;
    public C19630wG A05;
    public AnonymousClass1A5 A06;
    public C20310xM A07;
    public AnonymousClass1VZ A08;
    public AnonymousClass141 A09;
    public C175728ax A0A;
    public C135106c9 A0B;
    public AnonymousClass1EW A0C;
    public AnonymousClass11F A0D;
    public AnonymousClass11F A0E;
    public UserJid A0F;
    public UserJid A0G;
    public AnonymousClass19A A0H;
    public AnonymousClass1EZ A0I;
    public C106865Lq A0J;
    public C29221Vu A0K;
    public C24651Dg A0L;
    public C29121Vk A0M;
    public C24631De A0N;
    public AnonymousClass1EV A0O;
    public AnonymousClass1EU A0P;
    public AnonymousClass9SJ A0Q;
    public C198009ck A0R;
    public C29951Yq A0S;
    public AnonymousClass1YQ A0T;
    public AnonymousClass6O3 A0U;
    public AnonymousClass9UZ A0V;
    public C203269nh A0W;
    public AnonymousClass64L A0X;
    public PaymentIncentiveViewModel A0Y;
    public C28441Sr A0Z;
    public C78053rU A0a;
    public C29551Xb A0b;
    public C135066c4 A0c;
    public AnonymousClass1HA A0d;
    public AnonymousClass1A1 A0e;
    public Integer A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public List A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public Bundle A0x;
    public boolean A0y;

    public static boolean A1P(C179148jG r1) {
        return "p2m".equals(r1.A0p);
    }

    public PaymentView A3i() {
        if (!(this instanceof C179128jE)) {
            return ((BrazilPaymentActivity) this).A0U;
        }
        C179128jE r1 = (C179128jE) this;
        if (r1 instanceof C178848hw) {
            return ((C178848hw) r1).A0M;
        }
        return null;
    }

    public AnonymousClass2bV A3j(String str, List list) {
        AnonymousClass3T1 r5;
        UserJid userJid;
        C29551Xb r3 = this.A0b;
        AnonymousClass11F r4 = this.A0E;
        C18740tg.A06(r4);
        C79963uZ r6 = C79963uZ.A00;
        long j = this.A02;
        if (j != 0) {
            r5 = C36421kH.A0R(this.A0e, j);
        } else {
            r5 = null;
        }
        AnonymousClass2bV A002 = r3.A00(r4, r5, r6, str, list, 0);
        if (AnonymousClass143.A0G(this.A0E) && (userJid = this.A0G) != null) {
            A002.A0q(userJid);
        }
        return A002;
    }

    public void A3k() {
        Intent A1W;
        String str;
        boolean z = this instanceof BrazilSmbPaymentActivity;
        AnonymousClass11F r1 = this.A0E;
        if (z) {
            if (r1 != null) {
                A1W = new AnonymousClass190().A1W(this, this.A06.A01(r1));
                str = "BrazilSmbPaymentActivity";
            }
            finish();
        }
        if (r1 != null) {
            A1W = new AnonymousClass190().A1W(this, this.A06.A01(r1));
            str = "BasePaymentsActivity";
        }
        finish();
        AnonymousClass3M9.A01(A1W, str);
        A1W.putExtra("show_keyboard", false);
        A1W.putExtra("start_t", SystemClock.uptimeMillis());
        this.A0Z.A00();
        A33(A1W, false);
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x011c, code lost:
        if (r0.A0R.contains(r0.A0N) != false) goto L_0x011e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3l(android.os.Bundle r22) {
        /*
            r21 = this;
            r0 = r21
            boolean r1 = r0 instanceof X.C179128jE
            if (r1 != 0) goto L_0x0151
            com.whatsapp.payments.ui.BrazilPaymentActivity r0 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r0
            boolean r1 = r0 instanceof com.whatsapp.payments.ui.BrazilOrderDetailsActivity
            if (r1 == 0) goto L_0x0178
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r0 = (com.whatsapp.payments.ui.BrazilOrderDetailsActivity) r0
            java.lang.String r1 = X.C165597tg.A0j(r0)
            r0.A0b = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "extra_is_quick_buy"
            r4 = 0
            boolean r1 = r2.getBooleanExtra(r1, r4)
            r0.A0P = r1
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "extra_quick_launch_option"
            r1 = -2
            int r1 = r3.getIntExtra(r2, r1)
            r0.A00 = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "extra_quick_launch_action"
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.A0N = r1
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131624391(0x7f0e01c7, float:1.887596E38)
            r8 = 0
            android.view.View r1 = r2.inflate(r1, r8, r4)
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r1 = (com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2) r1
            r0.A0A = r1
            X.07B r4 = r0.getSupportActionBar()
            boolean r1 = r0.A0P
            r3 = 1
            if (r1 != 0) goto L_0x016b
            java.util.Set r2 = r0.A0S
            int r1 = r0.A00
            boolean r1 = X.AnonymousClass000.A1Z(r2, r1)
            if (r1 != 0) goto L_0x016b
            java.util.Set r2 = r0.A0R
            java.lang.String r1 = r0.A0N
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x016b
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r1 = r0.A0A
            r0.setContentView((android.view.View) r1)
            if (r4 == 0) goto L_0x0071
            r4.A0U(r3)
        L_0x0071:
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "extra_order_id"
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.A0L = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "extra_payment_config_id"
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.A0M = r1
            android.content.Intent r4 = r0.getIntent()
            r2 = 0
            java.lang.String r1 = "extra_order_expiry_ts_in_sec"
            long r1 = r4.getLongExtra(r1, r2)
            r0.A01 = r1
            android.content.Intent r1 = r0.getIntent()
            X.3Qa r1 = X.AnonymousClass3UJ.A02(r1)
            X.C18740tg.A06(r1)
            r0.A0H = r1
            X.0wo r12 = r0.A07
            X.0yC r15 = r0.A0D
            X.1e1 r5 = r0.A0Z
            android.content.res.Resources r10 = r0.getResources()
            X.1FR r4 = r0.A0G
            X.0xT r3 = r0.A0K
            X.0ts r13 = r0.A05
            X.1EU r2 = r0.A0P
            X.185 r11 = r0.A03
            X.1EV r1 = r0.A0O
            X.1A5 r14 = r0.A06
            X.8lm r9 = new X.8lm
            r16 = r1
            r17 = r2
            r18 = r4
            r19 = r3
            r20 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.A08 = r9
            r9.A00 = r0
            X.0wU r2 = r0.A04
            X.1Ed r1 = r0.A05
            X.9SA r3 = new X.9SA
            r3.<init>(r1, r0, r2)
            r0.A09 = r3
            X.01N r2 = r0.A06
            com.whatsapp.payments.ui.PaymentCheckoutOrderDetailsPresenter$$ExternalSyntheticLambda0 r1 = new com.whatsapp.payments.ui.PaymentCheckoutOrderDetailsPresenter$$ExternalSyntheticLambda0
            r1.<init>(r3)
            r2.A04(r1)
            java.util.Set r2 = r0.A0S
            int r1 = r0.A00
            boolean r1 = X.AnonymousClass000.A1Z(r2, r1)
            if (r1 == 0) goto L_0x0168
            int r3 = r0.A00
            r1 = 6
            if (r3 != r1) goto L_0x0168
        L_0x00f3:
            X.0wo r5 = r0.A07
            X.0yC r7 = r0.A0D
            X.0wU r14 = r0.A04
            X.0yb r4 = r0.A08
            X.16J r6 = r0.A04
            X.185 r3 = r0.A03
            X.1DR r9 = r0.A0D
            X.9UZ r11 = r0.A0V
            X.3Qa r13 = r0.A0H
            r15 = 1
            boolean r1 = r0.A0P
            if (r1 != 0) goto L_0x011e
            int r1 = r0.A00
            boolean r1 = X.AnonymousClass000.A1Z(r2, r1)
            if (r1 != 0) goto L_0x011e
            java.util.Set r2 = r0.A0R
            java.lang.String r1 = r0.A0N
            boolean r1 = r2.contains(r1)
            r16 = 0
            if (r1 == 0) goto L_0x0120
        L_0x011e:
            r16 = 1
        L_0x0120:
            X.1FR r12 = r0.A0G
            X.1EU r10 = r0.A0P
            X.9xO r2 = new X.9xO
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.04H r2 = X.C165617ti.A0A(r2, r0)
            java.lang.Class<X.7yk> r1 = X.C167747yk.class
            X.04R r1 = r2.A00(r1)
            X.7yk r1 = (X.C167747yk) r1
            r0.A0B = r1
            r2 = r22
            if (r22 == 0) goto L_0x0152
            java.lang.String r1 = "save_order_detail_state_key"
            android.os.Bundle r1 = r2.getBundle(r1)
            if (r1 == 0) goto L_0x0152
            X.7yk r1 = r0.A0B
            r1.A0U(r2)
        L_0x0148:
            X.7yk r1 = r0.A0B
            X.00r r2 = r1.A02
            r1 = 49
            X.BA8.A00(r0, r2, r1)
        L_0x0151:
            return
        L_0x0152:
            X.1FR r4 = r0.A0G
            com.whatsapp.jid.PhoneUserJid r3 = X.C36411kG.A0j(r0)
            com.whatsapp.jid.UserJid r2 = r0.A0G
            X.9l8 r1 = X.C202159l8.A0E
            java.lang.String r1 = "55"
            boolean r2 = r4.A0j(r3, r2, r1)
            X.7yk r1 = r0.A0B
            r1.A0Z(r2)
            goto L_0x0148
        L_0x0168:
            com.whatsapp.jid.UserJid r8 = r0.A0G
            goto L_0x00f3
        L_0x016b:
            if (r4 == 0) goto L_0x0071
            r4.A0D()
            r1 = 2131893491(0x7f121cf3, float:1.942176E38)
            r0.Bu1(r1)
            goto L_0x0071
        L_0x0178:
            r1 = 2131626154(0x7f0e08aa, float:1.8879536E38)
            r0.setContentView((int) r1)
            boolean r1 = r0.A0d
            if (r1 == 0) goto L_0x0185
            X.C36341k9.A12(r0)
        L_0x0185:
            X.07B r5 = r0.getSupportActionBar()
            r4 = 1
            if (r5 == 0) goto L_0x01aa
            android.content.Context r3 = r0.A02
            boolean r2 = r0.A0u
            r1 = 2131891306(0x7f12146a, float:1.9417328E38)
            if (r2 == 0) goto L_0x0198
            r1 = 2131892554(0x7f12194a, float:1.941986E38)
        L_0x0198:
            java.lang.String r1 = r3.getString(r1)
            r5.A0Q(r1)
            r5.A0U(r4)
            boolean r1 = r0.A0u
            if (r1 != 0) goto L_0x01aa
            r1 = 0
            r5.A0F(r1)
        L_0x01aa:
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "referral_screen"
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.A0b = r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01c4
            java.lang.String r1 = "extra_referral_screen"
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.A0b = r1
        L_0x01c4:
            java.lang.String r1 = r0.A0b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01d0
            java.lang.String r1 = "new_payment"
            r0.A0b = r1
        L_0x01d0:
            X.1A5 r2 = r0.A06
            com.whatsapp.jid.UserJid r1 = r0.A0G
            X.C18740tg.A06(r1)
            X.141 r1 = r2.A01(r1)
            r0.A09 = r1
            X.1EU r1 = r0.A0P
            X.16S r2 = X.C165617ti.A0O(r1)
            com.whatsapp.jid.UserJid r1 = r0.A0G
            X.8ax r1 = r2.A05(r1)
            r0.A0A = r1
            if (r1 == 0) goto L_0x01f1
            com.whatsapp.jid.UserJid r1 = r1.A04
            if (r1 != 0) goto L_0x01f8
        L_0x01f1:
            X.0wU r2 = r0.A04
            r1 = 15
            X.AVX.A00(r2, r0, r1)
        L_0x01f8:
            X.1EV r1 = r0.A0O
            boolean r1 = r1.A0E()
            if (r1 == 0) goto L_0x0237
            com.whatsapp.jid.UserJid r6 = r0.A0G
            X.1EV r1 = r0.A0O
            boolean r1 = r1.A0D()
            if (r1 == 0) goto L_0x0237
            X.1EU r1 = r0.A0P
            X.16S r1 = X.C165617ti.A0O(r1)
            X.8ax r1 = r1.A05(r6)
            if (r1 == 0) goto L_0x0237
            long r4 = r1.A01
            X.0wo r1 = r0.A07
            long r2 = X.C19970wo.A00(r1)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0237
            X.5Lq r1 = r0.A0J
            X.C36331k8.A1E(r1)
            X.1EU r3 = r0.A0P
            X.0xY r1 = r0.A04
            X.5Lq r2 = new X.5Lq
            r2.<init>(r1, r6, r3)
            r0.A0J = r2
            X.0wU r1 = r0.A04
            X.C36331k8.A1F(r2, r1)
        L_0x0237:
            X.0yC r2 = r0.A0D
            r1 = 842(0x34a, float:1.18E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x0256
            X.0yC r2 = r0.A0D
            r1 = 979(0x3d3, float:1.372E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 != 0) goto L_0x0256
            int r1 = r0.A01
            r1 = r1 | 1
            r0.A01 = r1
            com.whatsapp.jid.UserJid r1 = r0.A0G
            r0.A3p(r1)
        L_0x0256:
            X.1EV r1 = r0.A0O
            boolean r1 = r1.A09()
            if (r1 == 0) goto L_0x0289
            X.141 r1 = r0.A09
            if (r1 == 0) goto L_0x0289
            boolean r1 = r1.A0C()
            if (r1 == 0) goto L_0x0289
            int r1 = r0.A01
            r1 = r1 | 2
            r0.A01 = r1
            r1 = 2131893491(0x7f121cf3, float:1.942176E38)
            r0.Bu1(r1)
            X.9UZ r2 = r0.A0V
            com.whatsapp.jid.UserJid r4 = r0.A0G
            r8 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r1 = 0
            X.BAn r5 = new X.BAn
            r5.<init>(r0, r1)
            r3 = 0
            r7 = r3
            r2.A00(r3, r4, r5, r6, r7, r8)
            return
        L_0x0289:
            r1 = 0
            com.whatsapp.payments.ui.BrazilPaymentActivity.A1B(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179148jG.A3l(android.os.Bundle):void");
    }

    public void A3m(Bundle bundle) {
        Intent A0H2 = C36441kJ.A0H(this, PaymentGroupParticipantPickerActivity.class);
        AnonymousClass11F r0 = this.A0E;
        C18740tg.A06(r0);
        A0H2.putExtra("extra_jid", r0.getRawString());
        if (bundle != null) {
            A0H2.putExtras(bundle);
        }
        startActivity(A0H2);
        finish();
    }

    public void A3o(C175708av r4) {
        PaymentIncentiveViewModel paymentIncentiveViewModel;
        C121835tn r0;
        AnonymousClass6O3 r02;
        C198299dE r03;
        if (this.A0D.A0E(842) && (paymentIncentiveViewModel = this.A0Y) != null && (r0 = (C121835tn) paymentIncentiveViewModel.A02.A04()) != null && (r02 = (AnonymousClass6O3) r0.A01) != null && (r03 = r02.A01) != null) {
            r4.A00 = new C207159ue(String.valueOf(r03.A08.A01), (String) null, (String) null, (String) null);
        }
    }

    public void A3p(UserJid userJid) {
        if (this.A0Y == null) {
            PaymentIncentiveViewModel A0T2 = C165597tg.A0T(this);
            this.A0Y = A0T2;
            if (A0T2 != null) {
                BA8.A00(this, A0T2.A00, 46);
                BA8.A00(this, this.A0Y.A02, 45);
            }
        }
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A0Y;
        if (paymentIncentiveViewModel != null) {
            paymentIncentiveViewModel.A0T(false);
            PaymentIncentiveViewModel paymentIncentiveViewModel2 = this.A0Y;
            C36391kE.A1S(paymentIncentiveViewModel2.A07, paymentIncentiveViewModel2, userJid, 18);
        }
    }

    public void A3q(C23075B3f b3f, AnonymousClass6O3 r10) {
        C23075B3f b3f2 = b3f;
        if (this instanceof BrazilPaymentActivity) {
            BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this;
            C203049nB.A03(C203049nB.A02(brazilPaymentActivity.A07, (AnonymousClass16X) null, r10, brazilPaymentActivity.A0e), b3f2, 50, "new_payment", (String) null, 2);
            return;
        }
        C203049nB.A03(C203049nB.A01(this.A07, (AnonymousClass16X) null, r10, (String) null, true), b3f2, 50, "new_payment", (String) null, 2);
    }

    public void A3r(C23075B3f b3f, AnonymousClass6O3 r10) {
        C23075B3f b3f2 = b3f;
        if (this instanceof BrazilPaymentActivity) {
            BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this;
            C203049nB.A03(C203049nB.A02(brazilPaymentActivity.A07, (AnonymousClass16X) null, r10, brazilPaymentActivity.A0e), b3f2, 47, "new_payment", (String) null, 1);
            return;
        }
        A1O(this, b3f, r10, 47);
    }

    public void Bch(PickerSearchDialogFragment pickerSearchDialogFragment) {
        this.A0a.A02(pickerSearchDialogFragment);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A0G = C36431kI.A0l(intent.getStringExtra("extra_receiver_jid"));
            A3l(this.A0x);
        } else if (i2 == 0 && this.A0G == null) {
            finish();
        }
    }

    public static void A1O(AnonymousClass155 r5, C23075B3f b3f, AnonymousClass6O3 r7, int i) {
        C203049nB.A03(C203049nB.A01(r5.A07, (AnonymousClass16X) null, r7, (String) null, true), b3f, Integer.valueOf(i), "new_payment", (String) null, 1);
    }

    public void A3n(AnonymousClass16X r14) {
        AnonymousClass3T1 r10;
        PaymentView A3i = A3i();
        if (A3i != null) {
            PaymentView A3i2 = A3i();
            if (A3i2 == null || A3i2.getStickerIfSelected() == null) {
                AnonymousClass736.A00(this.A04, this, A3i, r14, 27);
                A3k();
                return;
            }
            Bu1(R.string.f12nameremoved);
            C29951Yq r6 = this.A0S;
            C18740tg.A04(A3i);
            C135066c4 stickerIfSelected = A3i.getStickerIfSelected();
            C18740tg.A06(stickerIfSelected);
            AnonymousClass11F r8 = this.A0E;
            C18740tg.A06(r8);
            UserJid userJid = this.A0G;
            long j = this.A02;
            if (j != 0) {
                r10 = C36421kH.A0R(this.A0e, j);
            } else {
                r10 = null;
            }
            r6.A01(A3i.getPaymentBackground(), r8, userJid, r10, stickerIfSelected, A3i.getStickerSendOrigin()).A0B(new C23206B9o(A3i, r14, this, 0), this.A05.A04);
        }
    }

    public void A3s(String str) {
        PaymentView A3i = A3i();
        if (A3i != null) {
            A3i.A0H(str);
            int i = this.A01;
            A3i.A01 = i;
            A3i.A0E(i);
        }
    }

    public void onCreate(Bundle bundle) {
        C198699e3 r1;
        B66 A012;
        Integer num;
        super.onCreate(bundle);
        this.A0x = bundle;
        if (getIntent() != null) {
            this.A00 = getIntent().getIntExtra("extra_conversation_message_type", 0);
            String stringExtra = getIntent().getStringExtra("extra_jid");
            C222713q r3 = AnonymousClass11F.A00;
            this.A0E = r3.A02(stringExtra);
            this.A0D = r3.A02(getIntent().getStringExtra("extra_chat_jid"));
            String stringExtra2 = getIntent().getStringExtra("extra_receiver_jid");
            C222813r r4 = UserJid.Companion;
            this.A0G = r4.A02(stringExtra2);
            getIntent().getStringExtra("extra_tpp_transaction_request_id");
            this.A02 = getIntent().getLongExtra("extra_quoted_msg_row_id", 0);
            this.A0k = getIntent().getStringExtra("extra_payment_preset_amount");
            this.A0o = getIntent().getStringExtra("extra_transaction_id");
            this.A0m = getIntent().getStringExtra("extra_payment_preset_min_amount");
            this.A0l = getIntent().getStringExtra("extra_payment_preset_max_amount");
            this.A0n = getIntent().getStringExtra("extra_request_message_key");
            this.A0u = getIntent().getBooleanExtra("extra_is_pay_money_only", true);
            this.A0j = getIntent().getStringExtra("extra_payment_note");
            this.A0B = (C135106c9) getIntent().getParcelableExtra("extra_payment_background");
            this.A0c = (C135066c4) getIntent().getParcelableExtra("extra_payment_sticker");
            int intExtra = getIntent().getIntExtra("extra_payment_sticker_send_origin", -1);
            if (intExtra != -1) {
                num = Integer.valueOf(intExtra);
            } else {
                num = null;
            }
            this.A0f = num;
            this.A0r = C65713Te.A03(getIntent().getStringExtra("extra_mentioned_jids"));
            this.A0F = r4.A02(getIntent().getStringExtra("extra_inviter_jid"));
            String stringExtra3 = getIntent().getStringExtra("extra_transaction_type");
            if (stringExtra3 == null) {
                stringExtra3 = "p2p";
            }
            this.A0p = stringExtra3;
            this.A0q = getIntent().getStringExtra("extra_transaction_token");
            this.A0t = getIntent().getBooleanExtra("extra_transaction_is_merchant", false);
            this.A0v = getIntent().getBooleanExtra("extra_transaction_is_valid_merchant", false);
            this.A0i = getIntent().getStringExtra("extra_order_type");
            this.A0h = getIntent().getStringExtra("extra_payment_config_id");
            this.A0g = getIntent().getStringExtra("extra_external_payment_source");
            this.A0s = getIntent().getBooleanExtra("extra_is_interop_add_payment_method", false);
            this.A0y = getIntent().getBooleanExtra("extra_scan_qr_onboarding_only", false);
        }
        String str = null;
        if (this.A0N.A02() != null) {
            r1 = this.A0P.A03(this.A0N.A02().A03);
        } else {
            r1 = null;
        }
        AnonymousClass16U A013 = this.A0N.A01();
        if (A013 != null) {
            str = ((AnonymousClass16V) A013).A02;
        }
        if (r1 != null && (A012 = r1.A01(str)) != null && A012.Bt9()) {
            C1033354w r32 = this.A03;
            if (!r32.A0G() || !r32.A0H()) {
                r32.A0F((C160427kz) null, "payment_view", true);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C106865Lq r1 = this.A0J;
        if (r1 != null) {
            r1.A0D(true);
            this.A0J = null;
        }
    }

    public void Btk(DialogFragment dialogFragment) {
        Btm(dialogFragment);
    }
}
