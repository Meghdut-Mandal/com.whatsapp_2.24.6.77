package com.whatsapp.payments.ui;

import X.AE0;
import X.AEA;
import X.AEX;
import X.AF7;
import X.AI1;
import X.AVX;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass07B;
import X.AnonymousClass16T;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1EU;
import X.AnonymousClass1YN;
import X.AnonymousClass3LW;
import X.AnonymousClass3UF;
import X.AnonymousClass3UG;
import X.AnonymousClass3YI;
import X.AnonymousClass627;
import X.AnonymousClass8g8;
import X.AnonymousClass8gQ;
import X.AnonymousClass9FG;
import X.AnonymousClass9IL;
import X.AnonymousClass9Q4;
import X.AnonymousClass9YX;
import X.B5A;
import X.B7Z;
import X.B83;
import X.B87;
import X.C012005e;
import X.C131606Ps;
import X.C135086c7;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C166407vk;
import X.C173888Tn;
import X.C175748az;
import X.C175818b6;
import X.C175898bF;
import X.C178888i4;
import X.C179208jQ;
import X.C183578r1;
import X.C186008vG;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C195479Ul;
import X.C195839Wg;
import X.C198629dt;
import X.C199499fP;
import X.C199799fz;
import X.C199849g7;
import X.C201659k4;
import X.C202269lR;
import X.C202349ld;
import X.C202809mh;
import X.C203049nB;
import X.C203399nx;
import X.C207049uT;
import X.C207249un;
import X.C207359uy;
import X.C21100yf;
import X.C22830Awf;
import X.C24611Dc;
import X.C24631De;
import X.C27111My;
import X.C29121Vk;
import X.C29131Vl;
import X.C29221Vu;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C39001qm;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.CopyableTextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class IndiaUpiBankAccountDetailsActivity extends C178888i4 implements C22830Awf {
    public C175748az A00;
    public AnonymousClass16T A01;
    public AnonymousClass19A A02;
    public C199499fP A03;
    public AEA A04;
    public C202269lR A05;
    public AE0 A06;
    public C201659k4 A07;
    public C29221Vu A08;
    public C29121Vk A09;
    public C195479Ul A0A;
    public AnonymousClass8g8 A0B;
    public AnonymousClass8gQ A0C;
    public AF7 A0D;
    public C199799fz A0E;
    public AnonymousClass627 A0F;
    public C166407vk A0G;
    public C198629dt A0H;
    public C29131Vl A0I;
    public AnonymousClass9Q4 A0J;
    public boolean A0K;
    public final C24611Dc A0L;

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (i4 == -1) {
            if (i == 0) {
                this.A0J.A00(this);
            } else if (i3 == 1012) {
                this.A0G.A00();
            } else {
                if (i3 == 1016) {
                    this.A0G.A00();
                } else if (i3 != 1017) {
                    if (i3 == 1019) {
                        if (intent != null) {
                            this.A0G.setInternationalActivationView((C207049uT) intent2.getParcelableExtra("INTERNATIONAL_ACTIVATION_RESULT_STATE"));
                        }
                    } else if (i3 == 1020 && intent != null) {
                        C175818b6 A0Q = C165597tg.A0Q(this.A0L, this.A00.A08, "IndiaUpiBankAccountDetailsActivity onDeactivate Unable to get IndiaUpiMethodData");
                        this.A0G.setInternationalActivationView(new C207049uT("", "", true));
                        String stringExtra = intent2.getStringExtra("extra_referral_screen");
                        C131606Ps r7 = new C131606Ps((String) null, new C131606Ps[0]);
                        r7.A03("payments_request_name", "deactivate_international_payments");
                        C203049nB.A03(r7, this.A0D, (Integer) null, "international_payment_prompt", stringExtra, 3);
                        AnonymousClass8g8 r5 = this.A0B;
                        C135086c7 r10 = A0Q.A08;
                        String str = A0Q.A0E;
                        C135086c7 r9 = (C135086c7) intent2.getParcelableExtra("DEACTIVATION_MPIN_BLOB");
                        C135086c7 r8 = (C135086c7) intent2.getParcelableExtra("DEACTIVATION_SEQ_NUMBER");
                        C135086c7 r72 = A0Q.A05;
                        String str2 = this.A00.A0A;
                        AnonymousClass9FG r4 = new AnonymousClass9FG(this);
                        C165567td.A1K(r10, str, r9);
                        C36321k7.A17(r8, r72, str2, 3);
                        Log.i("PAY: deactivateInternationalPayments called");
                        AnonymousClass19A r6 = r5.A00;
                        String A092 = r6.A09();
                        C186008vG r102 = new C186008vG(A092, C165577te.A0k(r10), str, str2, r5.A02.A01(), C165577te.A0k(r9), C165577te.A0k(r8), C165577te.A0k(r72));
                        C203399nx r82 = r102.A00;
                        AnonymousClass00C.A08(r82);
                        C165577te.A1A(r6, new AI1(r5, r4, r102, str2), r82, A092);
                    }
                }
                Intent A0I2 = C165577te.A0I(this, this.A00, IndiaUpiPinSetUpCompletedActivity.class);
                A0I2.putExtra("on_settings_page", true);
                startActivity(A0I2);
            }
        }
        super.onActivityResult(i3, i4, intent2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C165567td.A0j(this);
        this.A03.A01(new B5A(this, 0));
        this.A0J = new AnonymousClass9Q4(this.A06);
        this.A00 = (C175748az) C36371kC.A0H(this).get("extra_bank_account");
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            boolean A062 = this.A07.A06(this.A00);
            int i = R.string.f12nameremoved;
            if (A062) {
                i = R.string.f12nameremoved;
            }
            supportActionBar.A0I(i);
            supportActionBar.A0U(true);
        }
        this.A0L.A06("onCreate");
        AnonymousClass9IL.A00(C36401kF.A0G(getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) findViewById(R.id.footer_container), true), R.id.psp_logo), this.A0H, this.A06.A0B(), (String) null);
        AnonymousClass17Y r5 = this.A00;
        AnonymousClass19A r7 = this.A02;
        C29131Vl r12 = this.A0I;
        this.A0C = new AnonymousClass8gQ(this, r5, this.A01, r7, this.A05, this.A08, this.A09, this.A0A, r12);
    }

    public static C207049uT A07(C207249un r6, IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity) {
        String string;
        if (!C202809mh.A02(indiaUpiBankAccountDetailsActivity.A0D, indiaUpiBankAccountDetailsActivity.A06.A0B())) {
            return null;
        }
        C195839Wg A012 = indiaUpiBankAccountDetailsActivity.A0E.A01(r6.A0A);
        if (A012 == null || !A012.A02.equals("activated")) {
            string = indiaUpiBankAccountDetailsActivity.getString(R.string.f12nameremoved);
        } else {
            string = C36391kE.A0v(indiaUpiBankAccountDetailsActivity, C202809mh.A00(indiaUpiBankAccountDetailsActivity.A03, A012.A00), AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
        }
        return new C207049uT(string, "", false);
    }

    public void A2F() {
        if (!this.A0K) {
            this.A0K = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C165567td.A11(r1, this);
            C18830tt r2 = r1.A00;
            C165567td.A0v(r1, r2, this, C36321k7.A05(r1, r2, this));
            this.A00 = C36351kA.A0M(r1);
            C173888Tn.A01(r1, this, C36341k9.A0Z(r1));
            this.A03 = C36341k9.A0T(r1);
            this.A09 = C36381kD.A0f(r1);
            this.A0B = C165607th.A0e(r1);
            this.A06 = C165607th.A0Y(r1);
            this.A08 = (C24631De) C165577te.A0f(r1);
            this.A07 = (AnonymousClass1YN) r1.AVo.get();
            this.A02 = C36361kB.A0c(r1);
            this.A0I = C165587tf.A0Z(r1);
            this.A0H = (C198629dt) r1.APP.get();
            this.A04 = C165607th.A0W(r2);
            this.A07 = (C201659k4) r1.APO.get();
            this.A05 = (C202269lR) r1.A48.get();
            this.A03 = (C199499fP) r2.A5B.get();
            this.A09 = C165587tf.A0T(r1);
            this.A0A = C27111My.A2p(A0L2);
            this.A0F = (AnonymousClass627) r2.AAl.get();
            this.A01 = C165587tf.A0Q(r1);
            this.A0D = C165587tf.A0V(r1);
            this.A08 = (C29221Vu) r1.A6A.get();
            this.A06 = C165607th.A0X(r1);
            this.A0E = (C199799fz) r2.A97.get();
            AnonymousClass19A r22 = (AnonymousClass19A) r1.A4x.get();
            C199799fz r5 = (C199799fz) r1.A00.A97.get();
            this.A0B = new AnonymousClass8g8(r22, (C202269lR) r1.A48.get(), (C29121Vk) r1.A6I.get(), r5, (C29131Vl) r1.A67.get());
        }
    }

    public void A3i() {
        AVX avx = new AVX(this, 33);
        C36331k8.A1F(new C183578r1(this, avx, 103), this.A0D);
    }

    public Dialog onCreateDialog(int i) {
        C39001qm r2;
        int i2;
        int i3;
        boolean z = false;
        if (i != 100) {
            if (i == 101) {
                r2 = AnonymousClass3LW.A00(this);
                C165587tf.A16(r2);
                B83.A01(r2, this, 26, R.string.f12nameremoved);
                i2 = R.string.f12nameremoved;
                i3 = 27;
            } else if (i != 200) {
                switch (i) {
                    case 103:
                        r2 = AnonymousClass3LW.A00(this);
                        r2.A0c(R.string.f12nameremoved);
                        i2 = R.string.f12nameremoved;
                        i3 = 22;
                        break;
                    case 104:
                        r2 = AnonymousClass3LW.A00(this);
                        r2.A0c(R.string.f12nameremoved);
                        i2 = R.string.f12nameremoved;
                        i3 = 23;
                        break;
                    case 105:
                        r2 = AnonymousClass3LW.A00(this);
                        r2.A0d(R.string.f12nameremoved);
                        r2.A0c(R.string.f12nameremoved);
                        B83.A01(r2, this, 24, R.string.f12nameremoved);
                        i2 = R.string.f12nameremoved;
                        i3 = 25;
                        break;
                    default:
                        return super.onCreateDialog(i);
                }
            } else {
                r2 = AnonymousClass3LW.A00(this);
                r2.A0d(R.string.f12nameremoved);
                C199849g7 r3 = this.A0B;
                C207249un r1 = this.A04;
                AnonymousClass00C.A0D(r1, 0);
                C165587tf.A0t(this, r2, new Object[]{r3.A02(r1, true)}, R.string.f12nameremoved);
                B83.A00(r2, this, 28, R.string.f12nameremoved);
                r2.A0i(new B83(this, 29), getString(R.string.f12nameremoved));
            }
            B83.A00(r2, this, i3, i2);
        } else {
            AnonymousClass1EU r0 = this.A09;
            AnonymousClass1EU.A00(r0);
            if (r0.A05.A0S(1).size() > 0) {
                z = true;
            }
            r2 = AnonymousClass3LW.A00(this);
            int i4 = R.string.f12nameremoved;
            if (z) {
                i4 = R.string.f12nameremoved;
            }
            r2.A0p(AnonymousClass3UG.A05(this, this.A0C, getString(i4)));
            r2.A0r(true);
            B83.A00(r2, this, 30, R.string.f12nameremoved);
            B83.A01(r2, this, 21, R.string.f12nameremoved);
            B87.A00(r2, this, 12);
        }
        return r2.create();
    }

    public IndiaUpiBankAccountDetailsActivity(int i) {
        this.A0K = false;
        B7Z.A00(this, 2);
    }

    public void A3j(C207249un r6, boolean z) {
        super.A3j(r6, z);
        C175748az r2 = (C175748az) r6;
        this.A00 = r2;
        this.A0G.setText(this.A07.A03(r2));
        if (z) {
            this.A0G.setText(this.A07.A03(this.A00));
            CopyableTextView copyableTextView = this.A0H;
            Object[] A0L2 = AnonymousClass001.A0L();
            A0L2[0] = this.A06.A08().A00;
            C36341k9.A0s(this, copyableTextView, A0L2, R.string.f12nameremoved);
            this.A0H.A02 = AE0.A00(this.A06);
            this.A0H.A03 = getString(R.string.f12nameremoved);
            C175898bF r22 = this.A00.A08;
            if (r22 instanceof C175818b6) {
                this.A0F.setText(((C175818b6) r22).A0B());
            }
            ((ViewGroup) findViewById(R.id.payment_method_additional_details_container)).addView(LayoutInflater.from(this).inflate(R.layout.f9nameremoved, (ViewGroup) null));
            findViewById(R.id.check_balance_container).setOnClickListener(new AnonymousClass3YI(new C207359uy(this, 7), this.A07));
            AnonymousClass3UF.A0E(C36411kG.A0Q(this, R.id.check_balance_icon), AnonymousClass00F.A00(this, R.color.f6nameremoved));
            C36331k8.A11(this, R.id.default_payment_method_divider);
            this.A0G = new C166407vk(this);
            ((ViewGroup) findViewById(R.id.widget_container)).addView(this.A0G);
            C166407vk r23 = this.A0G;
            C207049uT A072 = A07(r6, this);
            r23.A06 = this;
            C175818b6 r1 = (C175818b6) r6.A08;
            C18740tg.A06(r1);
            r23.findViewById(R.id.reset_upi_pin_container).setOnClickListener(r23);
            r23.A04 = C36391kE.A0O(r23, R.id.reset_upi_pin);
            r23.A00 = C012005e.A02(r23, R.id.change_upi_pin_container);
            r23.A03 = C012005e.A02(r23, R.id.switch_payment_provider_container);
            r23.A02 = r23.findViewById(R.id.upi_international_shimmer);
            r23.A01 = r23.findViewById(R.id.upi_international_container);
            C135086c7 r0 = r1.A04;
            r23.A05 = r0;
            if (r0 == null || !C165577te.A1Z(r0)) {
                r23.A04.setText(R.string.f12nameremoved);
                r23.A00.setVisibility(8);
            } else {
                r23.A00.setVisibility(0);
                if (A072 != null) {
                    r23.setInternationalActivationView(A072);
                }
            }
            r23.A00.setOnClickListener(r23);
            r23.A03.setOnClickListener(r23);
            this.A0G.A03.setVisibility(C36351kA.A00(AnonymousClass000.A1P(this.A06.A09(C21100yf.A0K) ? 1 : 0) ^ true ? 1 : 0));
        }
    }

    public /* synthetic */ void A3l() {
        super.A3i();
    }

    public void onClick(View view) {
        if (view.getId() != R.id.default_payment_method_row || !this.A07.A06(this.A00)) {
            super.onClick(view);
            return;
        }
        Bu1(R.string.f12nameremoved);
        C175818b6 A0Q = C165597tg.A0Q(this.A0L, this.A00.A08, "onMakeDefaultPaymentMethod Unable to get IndiaUpiMethodData");
        AnonymousClass8gQ r4 = this.A0C;
        C135086c7 r5 = A0Q.A08;
        String str = A0Q.A0E;
        C135086c7 r6 = A0Q.A05;
        String str2 = this.A00.A0A;
        boolean z = !A0Q.A0G;
        C179208jQ r7 = new C179208jQ(this.A04, this.A0D, this, this);
        if (C202349ld.A02(r5)) {
            r4.A06.A01(r4.A01, (AnonymousClass9YX) null, new AEX(r6, r7, r4, str2, false, z));
        } else {
            r4.A01(r5, r6, r7, str, str2, false, z);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A03.A02()) {
            C199499fP.A00(this);
        }
    }

    public IndiaUpiBankAccountDetailsActivity() {
        this(0);
        this.A0L = C165587tf.A0X("IndiaUpiBankAccountDetailsActivity");
    }
}
