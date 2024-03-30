package com.whatsapp.payments.phoenix.flowconfigurationservice.activities;

import X.AE0;
import X.AEA;
import X.AF7;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass04S;
import X.AnonymousClass0FM;
import X.AnonymousClass16W;
import X.AnonymousClass16X;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass3LW;
import X.AnonymousClass3SJ;
import X.AnonymousClass61B;
import X.AnonymousClass70D;
import X.AnonymousClass8gR;
import X.AnonymousClass9DT;
import X.AnonymousClass9DU;
import X.AnonymousClass9Pr;
import X.B7Y;
import X.B87;
import X.BA8;
import X.C108355Te;
import X.C117655mc;
import X.C121825tm;
import X.C135086c7;
import X.C146356vT;
import X.C162097o1;
import X.C163227pr;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165617ti;
import X.C173858Tk;
import X.C175748az;
import X.C175818b6;
import X.C175898bF;
import X.C179108jC;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C195479Ul;
import X.C199449fK;
import X.C202059ky;
import X.C202269lR;
import X.C203619oP;
import X.C203639oR;
import X.C207249un;
import X.C207789x7;
import X.C24611Dc;
import X.C27111My;
import X.C29121Vk;
import X.C29131Vl;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36391kE;
import X.C39001qm;
import X.C90464aC;
import X.C90484aE;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.R;

public final class IndiaUpiFcsPinHandlerActivity extends C179108jC {
    public AnonymousClass9DT A00;
    public AnonymousClass9DU A01;
    public C175748az A02;
    public C135086c7 A03;
    public AnonymousClass61B A04;
    public AnonymousClass005 A05;
    public String A06;
    public String A07;
    public boolean A08;
    public AnonymousClass9Pr A09;
    public C121825tm A0A;
    public String A0B;
    public boolean A0C;
    public final C24611Dc A0D;
    public final C117655mc A0E;

    public void BZk(C202059ky r22, String str) {
        String str2 = str;
        if (str == null || str2.length() == 0) {
            C202059ky r0 = r22;
            if (r22 != null && !AEA.A02(this, "upi-list-keys", r0.A00, false)) {
                if (this.A04.A05("upi-list-keys")) {
                    C173858Tk.A0w(this);
                    return;
                }
                C24611Dc r2 = this.A0D;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(C173858Tk.A0I(str2, A0u));
                C165567td.A18(r2, " failed; ; showErrorAndFinish", A0u);
                A4D();
                return;
            }
            return;
        }
        this.A0D.A06("onListKeys called");
        C175818b6 r5 = null;
        if (AnonymousClass00C.A0J(A4K(), "pay") || AnonymousClass00C.A0J(A4K(), "collect")) {
            C175748az r02 = this.A02;
            if (r02 == null) {
                throw C36331k8.A0d("paymentBankAccount");
            }
            C175898bF r6 = r02.A08;
            AnonymousClass00C.A0E(r6, "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData");
            C18740tg.A06(r6);
            C175818b6 r62 = (C175818b6) r6;
            long longExtra = getIntent().getLongExtra("extra_payment_preset_amount", 0);
            int intExtra = getIntent().getIntExtra("extra_payment_offset", 100);
            C199449fK r1 = new C199449fK();
            r1.A01 = longExtra;
            r1.A00 = intExtra;
            r1.A02 = AnonymousClass16W.A05;
            AnonymousClass16X r10 = r1.A01().A02;
            AnonymousClass00C.A08(r10);
            C175748az r03 = this.A02;
            if (r03 == null) {
                throw C36331k8.A0d("paymentBankAccount");
            }
            String str3 = r03.A0B;
            C135086c7 r11 = r62.A07;
            String A002 = AE0.A00(this.A0M);
            String stringExtra = getIntent().getStringExtra("extra_receiver_vpa");
            C135086c7 r04 = this.A03;
            if (r04 == null) {
                throw C36331k8.A0d("seqNumber");
            }
            String str4 = (String) r04.A00;
            C175748az r05 = this.A02;
            if (r05 == null) {
                throw C36331k8.A0d("paymentBankAccount");
            }
            String str5 = (String) C207249un.A06(r05);
            String stringExtra2 = getIntent().getStringExtra("extra_payee_name");
            int i = 5;
            if (AnonymousClass00C.A0J(A4K(), "pay")) {
                i = 6;
            }
            A4G(r10, r11, str2, str3, A002, stringExtra, str4, str5, stringExtra2, (String) null, i);
            return;
        }
        C175748az r12 = this.A02;
        if (r12 == null) {
            throw C36331k8.A0d("paymentBankAccount");
        }
        String str6 = r12.A0B;
        C135086c7 r06 = this.A03;
        if (r06 == null) {
            throw C36331k8.A0d("seqNumber");
        }
        String str7 = (String) r06.A00;
        C175898bF r13 = r12.A08;
        if (r13 instanceof C175818b6) {
            r5 = (C175818b6) r13;
        }
        int A0z = A0z(A4K());
        C175748az r07 = this.A02;
        if (r07 == null) {
            throw C36331k8.A0d("paymentBankAccount");
        }
        A4H(r5, str2, str6, str7, (String) C207249un.A06(r07), A0z);
    }

    public static final C162097o1 A10(IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity) {
        C203619oP r1;
        AnonymousClass61B r12 = indiaUpiFcsPinHandlerActivity.A04;
        if (r12 != null) {
            String str = indiaUpiFcsPinHandlerActivity.A06;
            if (str != null) {
                C203639oR A002 = r12.A00(str);
                if (A002 == null || (r1 = A002.A00) == null) {
                    return null;
                }
                return (C162097o1) r1.A0A("native_flow_npci_common_library");
            }
            throw C36331k8.A0d("fdsManagerId");
        }
        throw C36331k8.A0d("phoenixManagerRegistry");
    }

    public static final void A11(IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity) {
        if (indiaUpiFcsPinHandlerActivity.A08) {
            A13(indiaUpiFcsPinHandlerActivity, "finish_after_error");
            return;
        }
        indiaUpiFcsPinHandlerActivity.A3v();
        indiaUpiFcsPinHandlerActivity.finish();
    }

    public void A2F() {
        if (!this.A0C) {
            this.A0C = true;
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
            this.A05 = C18840tu.A00(r1.AAl);
            this.A04 = C165587tf.A0Y(r2);
            this.A00 = (AnonymousClass9DT) A0L.A1d.get();
            this.A01 = (AnonymousClass9DU) A0L.A1e.get();
        }
    }

    public final String A4K() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        throw C36331k8.A0d("pinOp");
    }

    public void BeH(int i, Bundle bundle) {
        if (this.A08 && i == 1 && bundle != null && AnonymousClass00C.A0J(bundle.getSerializable("error"), "USER_ABORTED")) {
            A13(this, "cancel");
        }
        super.BeH(i, bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.A08 && i == 200 && i2 == 252) {
            A13(this, "cancel");
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        if (this.A00 != null) {
            AnonymousClass9Pr r0 = new AnonymousClass9Pr(this);
            this.A09 = r0;
            if (r0.A00(bundle2)) {
                Parcelable A072 = C173858Tk.A07(this);
                AnonymousClass00C.A0B(A072);
                this.A02 = (C175748az) A072;
                String stringExtra = getIntent().getStringExtra("extra_india_upi_pin_op");
                AnonymousClass00C.A0B(stringExtra);
                AnonymousClass00C.A0D(stringExtra, 0);
                this.A07 = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("extra_fds_manager_id");
                AnonymousClass00C.A0B(stringExtra2);
                AnonymousClass00C.A0D(stringExtra2, 0);
                this.A06 = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("extra_fcs_observer_id");
                AnonymousClass00C.A0B(stringExtra3);
                this.A0B = stringExtra3;
                this.A08 = getIntent().getBooleanExtra("is_asynchronous", false);
                C146356vT A002 = C146356vT.A00();
                Class<String> cls = String.class;
                String stringExtra4 = getIntent().getStringExtra("extra_seq_number");
                if (stringExtra4 == null) {
                    stringExtra4 = C173858Tk.A0J(this);
                }
                this.A03 = C165617ti.A0P(A002, cls, stringExtra4, "upiSequenceNumber");
                if (!this.A08) {
                    AnonymousClass9DU r02 = this.A01;
                    if (r02 != null) {
                        String str = this.A0B;
                        if (str == null) {
                            throw C36331k8.A0d("observerId");
                        }
                        C121825tm r4 = new C121825tm(this.A0E, C90484aE.A0a(r02.A00.A01), str);
                        this.A0A = r4;
                        r4.A01.A02(r4.A02).A01(new C163227pr(r4, 7), AnonymousClass70D.class, r4);
                    } else {
                        throw C36331k8.A0d("fcsResourceExecutionCallbackHandlerFactory");
                    }
                }
                int intExtra = getIntent().getIntExtra(C108355Te.ERROR_CODE.key, 0);
                if (intExtra == 0) {
                    A3G(getString(R.string.f12nameremoved));
                    AnonymousClass17Y r7 = this.A05;
                    AnonymousClass19A r8 = this.A0H;
                    C29131Vl r1 = this.A0D;
                    C202269lR r9 = this.A0L;
                    C29121Vk r12 = this.A0M;
                    C195479Ul r13 = this.A06;
                    AF7 af7 = this.A0S;
                    AnonymousClass8gR r5 = new AnonymousClass8gR(this, r7, r8, r9, this.A0M, this.A0K, r12, r13, this, af7, this.A0V, r1);
                    this.A08 = r5;
                    r5.A02();
                    return;
                }
                A12(this, intExtra);
                return;
            }
            return;
        }
        throw C36331k8.A0d("fcsActivityLifecycleManagerFactory");
    }

    public Dialog onCreateDialog(int i) {
        C39001qm r3;
        int i2;
        int i3;
        AnonymousClass04S ba8;
        if (i != 19) {
            r3 = AnonymousClass3LW.A00(this);
            if (i != 27) {
                switch (i) {
                    case 10:
                        r3.A0d(R.string.f12nameremoved);
                        r3.A0c(R.string.f12nameremoved);
                        BA8.A02(this, r3, 38, R.string.f12nameremoved);
                        r3.A0l(this, new BA8(this, 39), R.string.f12nameremoved);
                        r3.A0r(true);
                        i2 = 11;
                        break;
                    case 11:
                        r3.A0c(R.string.f12nameremoved);
                        BA8.A02(this, r3, 36, R.string.f12nameremoved);
                        r3.A0l(this, new BA8(this, 34), R.string.f12nameremoved);
                        r3.A0r(true);
                        i2 = 9;
                        break;
                    case 12:
                        C165587tf.A16(r3);
                        BA8.A02(this, r3, 35, R.string.f12nameremoved);
                        r3.A0l(this, new BA8(this, 42), R.string.f12nameremoved);
                        r3.A0r(true);
                        i2 = 10;
                        break;
                    default:
                        r3.A0c(R.string.f12nameremoved);
                        i3 = R.string.f12nameremoved;
                        ba8 = new C207789x7(this, i);
                        break;
                }
            } else {
                r3.A0d(R.string.f12nameremoved);
                r3.A0c(R.string.f12nameremoved);
                i3 = R.string.f12nameremoved;
                ba8 = new BA8(this, 37);
            }
            r3.A0m(this, ba8, i3);
        } else {
            r3 = AnonymousClass3LW.A00(this);
            r3.A0c(R.string.f12nameremoved);
            BA8.A02(this, r3, 41, R.string.f12nameremoved);
            r3.A0l(this, new BA8(this, 43), R.string.f12nameremoved);
            r3.A0r(true);
            i2 = 8;
            B87.A00(r3, this, i2);
        }
        AnonymousClass0FM create = r3.create();
        AnonymousClass00C.A0B(create);
        return create;
    }

    public IndiaUpiFcsPinHandlerActivity(int i) {
        this.A0C = false;
        B7Y.A00(this, 27);
    }

    public static final int A0z(String str) {
        String str2;
        switch (str.hashCode()) {
            case -2131583866:
                if (str.equals("change_pin")) {
                    return 2;
                }
                break;
            case 110760:
                str2 = "pay";
                break;
            case 74085029:
                str2 = "check_balance";
                break;
            case 398918110:
                str2 = "check_pin";
                break;
            case 949444906:
                if (str.equals("collect")) {
                    return 5;
                }
                break;
            case 1985322040:
                if (str.equals("set_pin")) {
                    return 1;
                }
                break;
        }
        if (str.equals(str2)) {
            return 4;
        }
        throw AnonymousClass001.A08("Unexpected pin operation");
    }

    public static final void A12(IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity, int i) {
        Bundle A072 = AnonymousClass001.A07();
        A072.putInt("error_code", i);
        if (AnonymousClass00C.A0J(indiaUpiFcsPinHandlerActivity.A4K(), "check_balance")) {
            indiaUpiFcsPinHandlerActivity.A0S.A07(new C202059ky(i), 29, 1);
        }
        int i2 = 12;
        if (i != 11454) {
            i2 = 10;
            if (i != 11459) {
                i2 = 11;
                if (i != 11468) {
                    if (i == 11487 || i == 20682 || i == 20697) {
                        i2 = 27;
                    } else if (AnonymousClass00C.A0J(indiaUpiFcsPinHandlerActivity.A4K(), "pay") || AnonymousClass00C.A0J(indiaUpiFcsPinHandlerActivity.A4K(), "collect")) {
                        indiaUpiFcsPinHandlerActivity.A3v();
                        indiaUpiFcsPinHandlerActivity.finish();
                        return;
                    } else {
                        indiaUpiFcsPinHandlerActivity.A4D();
                        return;
                    }
                }
            }
        }
        AnonymousClass3SJ.A02(indiaUpiFcsPinHandlerActivity, A072, i2);
    }

    public static final void A13(IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity, String str) {
        C162097o1 A10 = A10(indiaUpiFcsPinHandlerActivity);
        if (A10 != null) {
            A10.B7N(C36391kE.A11("action", str));
        }
        indiaUpiFcsPinHandlerActivity.A3v();
        indiaUpiFcsPinHandlerActivity.finish();
    }

    public void BgO(C202059ky r2) {
        throw C90464aC.A0o();
    }

    public void onDestroy() {
        super.onDestroy();
        C121825tm r2 = this.A0A;
        if (r2 != null) {
            r2.A01.A02(r2.A02).A03(AnonymousClass70D.class, r2);
        }
    }

    public IndiaUpiFcsPinHandlerActivity() {
        this(0);
        this.A0D = C165587tf.A0X("IndiaUpiFcsPinHandlerActivity");
        this.A0E = new C117655mc(this);
    }
}
